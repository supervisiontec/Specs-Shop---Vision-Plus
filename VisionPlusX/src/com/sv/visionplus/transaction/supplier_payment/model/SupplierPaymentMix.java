/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.supplier_payment.model;

import visionplusx.logFile.LogFileModel;

/**
 *
 * @author KAZA
 */
public class SupplierPaymentMix {
    private TPayment payment;
    private AccountTransaction transaction;
    private MAccount account;
    private SupplierPayment supplierPayment;
    private LogFileModel logFile;

    public TPayment getPayment() {
        return payment;
    }

    public void setPayment(TPayment payment) {
        this.payment = payment;
    }

    public AccountTransaction getTransaction() {
        return transaction;
    }

    public void setTransaction(AccountTransaction transaction) {
        this.transaction = transaction;
    }

    public MAccount getAccount() {
        return account;
    }

    public void setAccount(MAccount account) {
        this.account = account;
    }

    public SupplierPayment getSupplierPayment() {
        return supplierPayment;
    }

    public void setSupplierPayment(SupplierPayment supplierPayment) {
        this.supplierPayment = supplierPayment;
    }

    public LogFileModel getLogFile() {
        return logFile;
    }

    public void setLogFile(LogFileModel logFile) {
        this.logFile = logFile;
    }
    
    
    
            
}
