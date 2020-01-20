package com.sv.visionplus.transaction.invoice.model;

import com.sv.visionplus.transaction.invoice.dialog.customer.model.MCustomer;
import java.util.List;
import visionplusx.logFile.LogFileModel;

public class InvoiceMix {

    private TInvoice invoice;
    private TPatientInformation patientInformation;
    private MCustomer customer;
    private List<TInvoiceItem> invoiceItem;
    private List<TStockLedger> stockLedgerList;
    private Status status;
    private LogFileModel logFile;
    private LogFileModel paymentLog;
    private TPayment payment;
    private TCustomerPayment customerPayment;
    private AccountTransaction accountTransaction;
    private MAccount account;
    private boolean printBill;
    private boolean issueGoods;
    private String mobile;
    private boolean isCashRefund;

    public InvoiceMix() {
    }

    public AccountTransaction getAccountTransaction() {
        return accountTransaction;
    }

    public void setAccountTransaction(AccountTransaction accountTransaction) {
        this.accountTransaction = accountTransaction;
    }

    public MAccount getAccount() {
        return account;
    }

    public void setAccount(MAccount account) {
        this.account = account;
    }

    public LogFileModel getPaymentLog() {
        return paymentLog;
    }

    public void setPaymentLog(LogFileModel paymentLog) {
        this.paymentLog = paymentLog;
    }

    public TPayment getPayment() {
        return payment;
    }

    public void setPayment(TPayment payment) {
        this.payment = payment;
    }

    public TCustomerPayment getCustomerPayment() {
        return customerPayment;
    }

    public void setCustomerPayment(TCustomerPayment customerPayment) {
        this.customerPayment = customerPayment;
    }

    public List<TStockLedger> getStockLedgerList() {
        return stockLedgerList;
    }

    public void setStockLedgerList(List<TStockLedger> stockLedgerList) {
        this.stockLedgerList = stockLedgerList;
    }

    public TInvoice getInvoice() {
        return invoice;
    }

    public void setInvoice(TInvoice invoice) {
        this.invoice = invoice;
    }

    public TPatientInformation getPatientInformation() {
        return patientInformation;
    }

    public void setPatientInformation(TPatientInformation patientInformation) {
        this.patientInformation = patientInformation;
    }

    public MCustomer getCustomer() {
        return customer;
    }

    public void setCustomer(MCustomer customer) {
        this.customer = customer;
    }

    public List<TInvoiceItem> getInvoiceItem() {
        return invoiceItem;
    }

    public void setInvoiceItem(List<TInvoiceItem> invoiceItem) {
        this.invoiceItem = invoiceItem;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LogFileModel getLogFile() {
        return logFile;
    }

    public void setLogFile(LogFileModel logFile) {
        this.logFile = logFile;
    }

    public boolean isPrintBill() {
        return printBill;
    }

    public void setPrintBill(boolean printBill) {
        this.printBill = printBill;
    }

    public boolean isIssueGoods() {
        return issueGoods;
    }

    public void setIssueGoods(boolean issueGoods) {
        this.issueGoods = issueGoods;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public boolean getIsCashRefund() {
        return isCashRefund;
    }

    public void setIsCashRefund(boolean isCashRefund) {
        this.isCashRefund = isCashRefund;
    }
}
