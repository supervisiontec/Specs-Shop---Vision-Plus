package com.sv.visionplus.transaction.invoice_tab;

import static com.sv.visionplus.report.report_file.ReportFiles.*;
import com.sv.visionplus.report.report_panel;
import com.sv.visionplus.transaction.invoice_tab.InvoiceItemDAO;
import com.sv.visionplus.transaction.invoice_tab.model.AccountTransaction;
import com.sv.visionplus.transaction.invoice_tab.model.InvoiceMix;
import com.sv.visionplus.transaction.invoice_tab.model.MAccount;
import com.sv.visionplus.transaction.invoice_tab.model.MNumberList;
import com.sv.visionplus.transaction.invoice_tab.model.TInvoice;
import com.sv.visionplus.transaction.invoice_tab.model.TInvoiceItem;
import com.sv.visionplus.transaction.invoice_tab.model.TStockLedger;
import com.sv.visionplus.transaction.invoice_tab.model.ViewInvoicePayment;
import com.sv.visionplus.util.database.DatabaseUtil;
import com.sv.visionplus.util.database.QueryUtil;
import com.sv.visionplus.util.formatter.FormatterUtil;
import com.sv.visionplus.util.sms.SmsSender;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import visionplusx.logFile.LogFileDAO;
import visionplusx.logFile.LogFileModel;

public class InvoiceDAO {

    private static InvoiceDAO INSTANCE;
    private final QueryUtil<TInvoice> Query;
    private Connection connection;

    public static InvoiceDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new InvoiceDAO();
        }

        return INSTANCE;
    }

    public InvoiceDAO() {
        Query = QueryUtil.getInstance(TInvoice.class);
        try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String saveInvoice(InvoiceMix mix) {
        if (mix.getInvoice().getStatus2().equals("EDITED INVOICE")) {
            TInvoice invoice = getInstance().searchInvoiceFromNumber(mix.getInvoice().getNumber());
            if (invoice != null) {
                mix.getPatientInformation().setInvoice(invoice.getIndexNo());
                int editPatientInformation = PatientInformationDAO.getInstance().editPatientInformation(connection, mix.getPatientInformation(), invoice.getIndexNo());
                if (editPatientInformation > 0) {
                    LogFileModel fileModel = new LogFileModel();
                    fileModel.setDate(new Date());
                    fileModel.setFormName("Invoice Form");
                    fileModel.setRemarks("Update Invoice");
                    fileModel.setTime(FormatterUtil.getInstance().getTime());
                    fileModel.setTransactionType("Update");
                    fileModel.setUser(mix.getLogFile().getUser());
                    fileModel.setUserId(mix.getLogFile().getUserId());
                    fileModel.setUserName(mix.getLogFile().getUserName());
                    fileModel.setValue(invoice.getAmount());
                    LogFileDAO.getInstance().saveLog(connection, fileModel);

                    List<TInvoiceItem> invoiceItemList = InvoiceItemDAO.getInstance().searchItems(mix.getInvoice().getIndexNo());
                    ArrayList<TStockLedger> stockLedgerList = new ArrayList<>();
                    for (TInvoiceItem tInvoiceItem : invoiceItemList) {
                        TStockLedger stockLedger = new TStockLedger();
                        stockLedger.setDate(new Date());
                        stockLedger.setForm("Invoice");
                        stockLedger.setItem(tInvoiceItem.getItem());
                        stockLedger.setQty(tInvoiceItem.getQty());
                        stockLedger.setStore(2);
                        stockLedgerList.add(stockLedger);
                    }
                    StockLedgerDAO.getInstance().saveStockLedger(connection, stockLedgerList);

                    InvoiceItemDAO.getInstance().delete(connection, mix.getInvoice().getIndexNo());

                    InvoiceItemDAO.getInstance().saveItems(connection, mix.getInvoiceItem(), mix.getInvoice().getIndexNo());
                    double val = 0;
                    StockLedgerDAO.getInstance().saveStockLedger(connection, mix.getStockLedgerList());
                    for (TInvoiceItem item : mix.getInvoiceItem()) {
                        val += item.getNetValue();
                    }
                    InvoiceDAO.getInstance().editInvoiceAmount(connection, mix.getInvoice().getIndexNo(), val);

                    return mix.getInvoice().getNumber();
                }
            }
            return null;
        } else if (mix.getInvoice().getStatus2().equals("FACTORY INVOICE")) {
            try {
                connection.setAutoCommit(false);
                if (mix.isIssueGoods()) {
                    mix.getInvoice().setStatus("Issue To Customer");
                    mix.getStatus().setName("Issue To Customer");

                }
                MNumberList LastNumber = NumberListDAO.getInstance().searchLastNumber(1);
                int newNo = LastNumber.getLastNo() + 1;
                mix.getInvoice().setNumber(newNo + "");
                int invoiceId = getInstance().saveOnlyInvoice(connection, mix.getInvoice());
                mix.getPatientInformation().setInvoice(invoiceId);
                int infoId;
                if (invoiceId > 0) {
                    infoId = PatientInformationDAO.getInstance().savePatientInformation(connection, mix.getPatientInformation());
                    mix.getStatus().setInvoice(invoiceId);
                    int statusId;
                    if (infoId > 0) {
                        statusId = StatusDAO.getInstance().saveStatus(connection, mix.getStatus());
                        int logId;
                        if (statusId > 0) {
                            logId = LogFileDAO.getInstance().saveLog(connection, mix.getLogFile());
                            boolean items;
                            if (logId > 0) {
                                items = InvoiceItemService.getInstance().saveItem(connection, mix.getInvoiceItem(), invoiceId);
                                boolean saveStockLedger;
                                if (items) {
                                    saveStockLedger = StockLedgerService.getInstance().saveStockLedger(connection, mix.getStockLedgerList());
                                    int paymentId;
                                    if (saveStockLedger) {
                                        paymentId = TPaymentDAO.getInstance().savePayment(connection, mix.getPayment());
                                        int customerDetail;
                                        if (paymentId > 0) {
                                            mix.getCustomerPayment().setInvoice(invoiceId);
                                            mix.getCustomerPayment().setPayment(paymentId);
                                            customerDetail = TCustomerPaymentDAO.getInstance().savePaymentDetail(connection, mix.getCustomerPayment());
                                            int paymentLog;
                                            if (customerDetail > 0) {
                                                paymentLog = LogFileDAO.getInstance().saveLog(connection, mix.getPaymentLog());
                                                int accId;
                                                if (paymentLog > 0) {
                                                    accId = MAccountDAO.getInstance().saveAccount(connection, mix.getAccount());
                                                    int transactionId;
                                                    if (accId > 0) {
                                                        mix.getAccountTransaction().setAccount(accId);
                                                        transactionId = AccountTransactionDAO.getInstance().saveTransaction(connection, mix.getAccountTransaction());
                                                        if (transactionId > 0) {
                                                            LastNumber.setLastNo(newNo);
                                                            int saveNewNumber = NumberListDAO.getInstance().saveNewNumber(connection, LastNumber);
                                                            if (saveNewNumber > 0) {
                                                                connection.commit();
                                                                if (mix.isPrintBill()) {
                                                                    try {
                                                                        JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getReportUrl(INVOICE_RECEIPT));
                                                                        HashMap<String, Object> dataMap = new HashMap<>();
                                                                        dataMap.put("index", mix.getInvoice().getNumber());
                                                                        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, dataMap, connection);
                                                                        JasperPrintManager.printReport(jasperPrint, true);

                                                                        JasperReport jasperReport1 = (JasperReport) JRLoader.loadObject(getReportUrl(FACTORY_REPORT));
                                                                        HashMap<String, Object> dataMapFactory = new HashMap<>();
                                                                        dataMapFactory.put("index", mix.getInvoice().getNumber());
                                                                        JasperPrint jasperPrint1 = JasperFillManager.fillReport(jasperReport1, dataMapFactory, connection);
                                                                        JasperPrintManager.printReport(jasperPrint1, true);

                                                                    } catch (JRException ex) {
                                                                        Logger.getLogger(report_panel.class.getName()).log(Level.SEVERE, null, ex);
                                                                    }
                                                                }
                                                                //sms sender
                                                                int code = SmsSender.messageSendForInvoice(mix.getCustomer().getName(), mix.getMobile());

                                                                if (code == 200) {
                                                                    JOptionPane.showMessageDialog(null, mix.getMobile() + " Message Send Successfully.");
                                                                }
                                                                return newNo + "";
                                                            }

                                                        }
                                                        connection.rollback();
                                                        return null;
                                                    }

                                                    connection.rollback();
                                                    return null;
                                                }

                                                connection.rollback();
                                                return null;
                                            }

                                            connection.rollback();
                                            return null;
                                        }

                                        connection.rollback();
                                        return null;
                                    }

                                    connection.rollback();
                                    return null;
                                }

                                connection.rollback();
                                return null;
                            }

                            connection.rollback();
                            return null;
                        }

                        connection.rollback();
                        return null;
                    }

                    connection.rollback();
                    return null;
                }
                connection.rollback();
                return null;
            } catch (SQLException ex) {
                Logger.getLogger(InvoiceDAO.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }

        } else if (mix.getInvoice().getStatus2().equals("NORMAL INVOICE")) {
            try {
                connection.setAutoCommit(false);
                try {
                    if (mix.isIssueGoods()) {
                        mix.getInvoice().setStatus("Issue To Customer");
                        mix.getStatus().setName("Issue To Customer");

                    }
                    //TODO:
//                    MNumber List last number...
                    MNumberList LastNumber = NumberListDAO.getInstance().searchLastNumber(2);
                    int newNo = LastNumber.getLastNo() + 1;
                    String firstNo = LastNumber.getFirstNo();
                    mix.getInvoice().setNumber(firstNo + newNo);

                    int invoiceId = getInstance().saveOnlyInvoice(connection, mix.getInvoice());
                    mix.getPatientInformation().setInvoice(invoiceId);
                    int infoId;
                    if (invoiceId > 0) {
                        infoId = PatientInformationDAO.getInstance().savePatientInformation(connection, mix.getPatientInformation());
                        mix.getStatus().setInvoice(invoiceId);
                        int statusId;
                        if (infoId > 0) {
                            statusId = StatusDAO.getInstance().saveStatus(connection, mix.getStatus());
                            int logId;
                            if (statusId > 0) {
                                logId = LogFileDAO.getInstance().saveLog(connection, mix.getLogFile());
                                boolean items;
                                if (logId > 0) {
                                    items = InvoiceItemService.getInstance().saveItem(connection, mix.getInvoiceItem(), invoiceId);
                                    boolean saveStockLedger;
                                    if (items) {
                                        saveStockLedger = StockLedgerService.getInstance().saveStockLedger(connection, mix.getStockLedgerList());
                                        int paymentId;
                                        if (saveStockLedger) {
                                            paymentId = TPaymentDAO.getInstance().savePayment(connection, mix.getPayment());
                                            int customerDetail;
                                            if (paymentId > 0) {
                                                mix.getCustomerPayment().setInvoice(invoiceId);
                                                mix.getCustomerPayment().setPayment(paymentId);
                                                customerDetail = TCustomerPaymentDAO.getInstance().savePaymentDetail(connection, mix.getCustomerPayment());
                                                int paymentLog;
                                                if (customerDetail > 0) {
                                                    paymentLog = LogFileDAO.getInstance().saveLog(connection, mix.getPaymentLog());
                                                    int accId;
                                                    if (paymentLog > 0) {
                                                        accId = MAccountDAO.getInstance().saveAccount(connection, mix.getAccount());
                                                        int transactionId;
                                                        if (accId > 0) {
                                                            mix.getAccountTransaction().setAccount(accId);
                                                            transactionId = AccountTransactionDAO.getInstance().saveTransaction(connection, mix.getAccountTransaction());
                                                            if (transactionId > 0) {
                                                                LastNumber.setLastNo(newNo);
                                                                int saveNewNumber = NumberListDAO.getInstance().saveNewNumber(connection, LastNumber);
                                                                if (saveNewNumber > 0) {
                                                                    connection.commit();
                                                                    if (mix.isPrintBill()) {

                                                                        try {
                                                                            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getReportUrl(INVOICE_RECEIPT));
                                                                            HashMap<String, Object> dataMap = new HashMap<>();
                                                                            dataMap.put("index", mix.getInvoice().getNumber());
                                                                            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, dataMap, connection);
                                                                            JasperPrintManager.printReport(jasperPrint, true);

                                                                        } catch (JRException ex) {
                                                                            Logger.getLogger(report_panel.class.getName()).log(Level.SEVERE, null, ex);
                                                                        }
                                                                    }
                                                                    //sms sender
                                                                    int code = SmsSender.messageSendForInvoice(mix.getCustomer().getName(), mix.getMobile());

                                                                    if (code == 200) {
                                                                        JOptionPane.showMessageDialog(null, mix.getMobile() + " Message Send Successfully.");
                                                                    }
                                                                    return firstNo + newNo;
                                                                }

                                                            }
                                                            connection.rollback();
                                                            return null;
                                                        }

                                                        connection.rollback();
                                                        return null;
                                                    }

                                                    connection.rollback();
                                                    return null;
                                                }

                                                connection.rollback();
                                                return null;
                                            }

                                            connection.rollback();
                                            return null;
                                        }

                                        connection.rollback();
                                        return null;
                                    }

                                    connection.rollback();
                                    return null;
                                }

                                connection.rollback();
                                return null;
                            }

                            connection.rollback();
                            return null;
                        }

                        connection.rollback();
                        return null;
                    }

                    connection.rollback();
                    return null;
                } finally {
                    connection.setAutoCommit(true);
                }
            } catch (SQLException ex) {
                Logger.getLogger(InvoiceDAO.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }

        } else if (mix.getInvoice().getStatus2().equals("OLD INVOICE")) {
            try {
                connection.setAutoCommit(false);
                int invoiceId = 0;
                try {
                    mix.getInvoice().setStatus("Issue To Customer");
                    mix.getStatus().setName("Issue To Customer");

                    invoiceId = getInstance().saveOnlyInvoice(connection, mix.getInvoice());
                    mix.getPatientInformation().setInvoice(invoiceId);
                    if (invoiceId > 0) {
                        PatientInformationDAO.getInstance().savePatientInformation(connection, mix.getPatientInformation());
                        mix.getStatus().setInvoice(invoiceId);
                    }
                    StatusDAO.getInstance().saveStatus(connection, mix.getStatus());
                    LogFileDAO.getInstance().saveLog(connection, mix.getLogFile());
                    InvoiceItemService.getInstance().saveItem(connection, mix.getInvoiceItem(), invoiceId);
                    int paymentId = TPaymentDAO.getInstance().savePayment(connection, mix.getPayment());
                    mix.getCustomerPayment().setInvoice(invoiceId);
                    mix.getCustomerPayment().setPayment(paymentId);
                    TCustomerPaymentDAO.getInstance().savePaymentDetail(connection, mix.getCustomerPayment());
                    LogFileDAO.getInstance().saveLog(connection, mix.getPaymentLog());
                    Integer accId = MAccountDAO.getInstance().saveAccount(connection, mix.getAccount());
                    mix.getAccountTransaction().setAccount(accId);
                    AccountTransactionDAO.getInstance().saveTransaction(connection, mix.getAccountTransaction());

                } finally {
                    JOptionPane.showMessageDialog(null, "Old Invoice Save Success !");
                    connection.setAutoCommit(true);
                    return mix.getInvoice().getNumber();
                }
            } catch (SQLException ex) {
                Logger.getLogger(InvoiceDAO.class.getName()).log(Level.SEVERE, null, ex);
                try {
                    connection.rollback();
                } catch (SQLException ex1) {
                    Logger.getLogger(InvoiceDAO.class.getName()).log(Level.SEVERE, null, ex1);
                }
                return null;
            }

        } else if (mix.getInvoice().getStatus2().equals("DELETED INVOICE")) {
            try {
                connection.setAutoCommit(false);
                try {
                    if (mix.getInvoice() != null) {
                        int deleteInvoice = getInstance().deleteInvoice(connection, mix.getInvoice().getIndexNo());
                        if (deleteInvoice > 0) {
                            if (mix.getIsCashRefund()) {
                                //save cash refund
                                MAccount mAccount = new MAccount();
                                mAccount.setDescription("Cash Refund - invoice number - " + mix.getInvoice().getNumber());
                                mAccount.setMain_category(1);// INVOICE
                                mAccount.setSub_category(4); // CASH REFUND
                                mAccount.setType("VOUCHER");
                                int saveAccount = MAccountDAO.getInstance().saveAccount(connection, mAccount);

                                double val = 0;
                                List<ViewInvoicePayment> list = ViewInvoicePaymentDAO.getInstance().getPaymentByInvoice(connection, mix.getInvoice().getIndexNo());
                                for (ViewInvoicePayment viewInvoicePayment : list) {
                                    val += viewInvoicePayment.getTotal();
                                }

                                AccountTransaction accountTransaction = new AccountTransaction();
                                accountTransaction.setAccount(saveAccount);
                                accountTransaction.setDate(new Date());
                                accountTransaction.setCredit(val);
                                accountTransaction.setDebit(0);
                                accountTransaction.setDescription("Cash Refund - invoice number - " + mix.getInvoice().getNumber());
                                accountTransaction.setIs_expense(1);
                                AccountTransactionDAO.getInstance().saveTransaction(connection, mix.getAccountTransaction());
                            }

                            List<TInvoiceItem> invoiceItemList = InvoiceItemDAO.getInstance().searchItems(mix.getInvoice().getIndexNo());
                            ArrayList<TStockLedger> stockLedgerList = new ArrayList<>();
                            for (TInvoiceItem tInvoiceItem : invoiceItemList) {
                                TStockLedger stockLedger = new TStockLedger();
                                stockLedger.setDate(new Date());
                                stockLedger.setForm("Invoice");
                                stockLedger.setItem(tInvoiceItem.getItem());
                                stockLedger.setQty(tInvoiceItem.getQty());
                                stockLedger.setStore(2);
                                stockLedgerList.add(stockLedger);
                            }
                            StockLedgerDAO.getInstance().saveStockLedger(connection, stockLedgerList);

                            LogFileModel fileModel = new LogFileModel();
                            fileModel.setDate(new Date());
                            fileModel.setFormName("Invoice Form");
                            fileModel.setRemarks("Delete Invoice - indexNo = " + mix.getInvoice().getIndexNo());
                            fileModel.setTime(FormatterUtil.getInstance().getTime());
                            fileModel.setTransactionType("Delete");
                            fileModel.setUser(mix.getLogFile().getUser());
                            fileModel.setUserId(mix.getLogFile().getUserId());
                            fileModel.setUserName(mix.getLogFile().getUserName());
                            fileModel.setValue(mix.getInvoice().getAmount());
                            LogFileDAO.getInstance().saveLog(connection, fileModel);
                        }
                    }
                    return null;
                } finally {
                    JOptionPane.showMessageDialog(null, "Invoice Delete successfully !");
                    connection.setAutoCommit(true);
                    return mix.getInvoice().getNumber();
                }
            } catch (SQLException ex) {
                Logger.getLogger(InvoiceDAO.class.getName()).log(Level.SEVERE, null, ex);
                try {
                    connection.rollback();
                } catch (SQLException ex1) {
                    Logger.getLogger(InvoiceDAO.class.getName()).log(Level.SEVERE, null, ex1);
                }
                return null;
            }
        } else {
            JOptionPane.showMessageDialog(null, "No Invoice Type to Selected  or Wrong Type !");
            return null;
        }
    }

    public int saveOnlyInvoice(Connection connection, TInvoice invoice) {
        int indexNo = 0;
        try {
            indexNo = Query.executeInsert(connection, invoice);
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return indexNo;
    }

    public List<TInvoice> allInvoice(String date) {
        List<TInvoice> list = new ArrayList();
        try {
            list = Query.executeSelect(connection, "invoice_date=?", new Object[]{date});
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List<TInvoice> searchInvoice(int customer) {
        List<TInvoice> list = new ArrayList();
        try {
            list = Query.executeSelect(connection, "customer=?", new Object[]{customer});
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List<TInvoice> searchInvoice(String index, Date invoiceDate) {
        List<TInvoice> list = new ArrayList();
        try {
            list = Query.executeSelect(connection, "number=? or invoice_date=?", new Object[]{index, invoiceDate});
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    private TInvoice searchInvoiceFromNumber(String indexNo) {
        try {
            List<TInvoice> list = Query.executeSelect(connection, "number=?", new Object[]{indexNo});
            if (list.size() > 0) {
                return list.get(0);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    private int deleteInvoice(Connection connection, Integer indexNo) {
        try {
            TInvoice inv = Query.executeUniqueSelect(connection, "index_no=?", indexNo);
            inv.setIsdelete(Boolean.TRUE);
            return Query.executeUpdate(connection, inv, "index_no=?", indexNo);
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    private void editInvoiceAmount(Connection connection, Integer indexNo, double val) {
        try {
            TInvoice inv = Query.executeUniqueSelect(connection, "index_no=?", indexNo);
            inv.setAmount(val);
            Query.executeUpdate(connection, inv, "index_no=?", indexNo);
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
