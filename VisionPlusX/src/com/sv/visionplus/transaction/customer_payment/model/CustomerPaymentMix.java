/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.customer_payment.model;

import visionplusx.logFile.LogFileModel;

/**
 *
 * @author KAZA
 */
public class CustomerPaymentMix {
   private TPayment payment;
   private CustomerPayment customerPayment;
   private LogFileModel logFile ;
   private Status status;
   private TInvoice invoice;
   private TAccountTransaction accountTransaction;
   private MAccount account;
   private boolean goodIssue;

    public TAccountTransaction getAccountTransaction() {
        return accountTransaction;
    }

    public void setAccountTransaction(TAccountTransaction accountTransaction) {
        this.accountTransaction = accountTransaction;
    }

    public MAccount getAccount() {
        return account;
    }

    public void setAccount(MAccount account) {
        this.account = account;
    }

    public TInvoice getInvoice() {
        return invoice;
    }

    public void setInvoice(TInvoice invoice) {
        this.invoice = invoice;
    }

    public TPayment getPayment() {
        return payment;
    }

    public void setPayment(TPayment payment) {
        this.payment = payment;
    }

    public CustomerPayment getCustomerPayment() {
        return customerPayment;
    }

    public void setCustomerPayment(CustomerPayment customerPayment) {
        this.customerPayment = customerPayment;
    }

    public LogFileModel getLogFile() {
        return logFile;
    }

    public void setLogFile(LogFileModel logFile) {
        this.logFile = logFile;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public boolean getGoodIssue() {
        return goodIssue;
    }

    public void setGoodIssue(boolean goodIssue) {
        this.goodIssue = goodIssue;
    }
   
   
}
