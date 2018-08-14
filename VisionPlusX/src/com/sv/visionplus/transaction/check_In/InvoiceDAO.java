/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.check_In;

import com.sv.visionplus.transaction.check_In.model.MCustomer;
import com.sv.visionplus.transaction.check_In.model.TInvoice;
import com.sv.visionplus.util.database.DatabaseUtil;
import com.sv.visionplus.util.database.QueryUtil;
import com.sv.visionplus.util.sms.SmsSender;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author KAZA
 */
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
            Logger.getLogger(InvoiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    List<TInvoice> searchInvoice(String status) {
        try {
            List<TInvoice> invoices = Query.executeSelect(connection, "status=?", status);
            return invoices;
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    List<TInvoice> searchInvoice(String status, String factoryId) {
        try {
            List<TInvoice> invoices = Query.executeSelect(connection, "status=? AND factory=?", status, factoryId);
            return invoices;
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    List<TInvoice> searchInvoiceByDate(String status, String date) {
        try {
            List<TInvoice> invoices = Query.executeSelect(connection, "status=? AND invoice_date=?", status, date);
            return invoices;
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    List<TInvoice> searchInvoiceByStatus(String status, String status2) {
        try {
            List<TInvoice> invoices = Query.executeSelect(connection, "status=? AND status2=?", status, status2);
            return invoices;
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    int updateInvoice(TInvoice invoice, List<String> idList) {
        int count = 0;
        try {
            try {
                connection.setAutoCommit(false);
                for (String invoiceNo : idList) {
                    invoice.setIndexNo(Integer.parseInt(invoiceNo));
                    int unicUpdate = updateUniqueInvoice(connection, invoice);
                    if (unicUpdate > 0) {
                        TInvoice searchInvoice = InvoiceDAO.getInstance().searchInvoice(connection, Integer.parseInt(invoiceNo));
                        MCustomer searchCustomer = CustomerDAO.getInstance().searchCustomer(searchInvoice.getCustomer());
                        if ("Reserved From Factory".equals(invoice.getStatus())) {
                            int code = SmsSender.messageSendForChecking(searchCustomer.getName(), searchCustomer.getContactNo());
                            if (code==200) {
                                JOptionPane.showMessageDialog(null,"Msg send successfully. ("+searchCustomer.getName()+" - "+searchCustomer.getContactNo()+")");
                            }
                        }

                        int statusId = StatusDAO.getInstance().addStatus(connection, invoice);
                        if (statusId > 0) {
                            count += 1;
                        } else {
                            connection.rollback();
                            return 0;
                        }
                    } else {
                        connection.rollback();
                        return 0;
                    }

                }
                if (count == idList.size()) {
                    connection.commit();
                    return count;
                }

            } finally {
                connection.setAutoCommit(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    private int updateUniqueInvoice(Connection connection, TInvoice invoice) {
//        TInvoice tInvoice = invoice;
        TInvoice searchInvoice = new TInvoice();
        int id = 0;
        searchInvoice = InvoiceDAO.getInstance().searchInvoice(connection, invoice.getIndexNo());

        System.out.println(invoice.getIndexNo() + " Index");
        System.out.println(invoice.getStatus() + " status");
        System.out.println(invoice.getFactory() + " factory");
        searchInvoice.setStatus(invoice.getStatus());
        searchInvoice.setFactory(invoice.getFactory());

        try {
            id = Query.executeUpdate(connection, searchInvoice, "index_no=?", invoice.getIndexNo());

        } catch (SQLException ex) {
            Logger.getLogger(InvoiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    private TInvoice searchInvoice(Connection connection, int invoiceNo) {
        TInvoice selectInvoice = new TInvoice();
        try {
            selectInvoice = Query.executeUniqueSelect(connection, "index_no=?", invoiceNo);
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return selectInvoice;
    }
}
