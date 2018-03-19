/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.account.payment_voucher.model;

import visionplusx.logFile.LogFileModel;

/**
 *
 * @author KAZA
 */
public class PaymentVoucherMix {
    private MAccount account;
    private MainCategory mainCategory;
    private SubCategory subCategory;
    private TAccountTransaction accountTransaction;
    private LogFileModel fileModel;

    public LogFileModel getFileModel() {
        return fileModel;
    }

    public void setFileModel(LogFileModel fileModel) {
        this.fileModel = fileModel;
    }

    public MAccount getAccount() {
        return account;
    }

    public void setAccount(MAccount account) {
        this.account = account;
    }

    public MainCategory getMainCategory() {
        return mainCategory;
    }

    public void setMainCategory(MainCategory mainCategory) {
        this.mainCategory = mainCategory;
    }

    public SubCategory getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(SubCategory subCategory) {
        this.subCategory = subCategory;
    }

    public TAccountTransaction getAccountTransaction() {
        return accountTransaction;
    }

    public void setAccountTransaction(TAccountTransaction accountTransaction) {
        this.accountTransaction = accountTransaction;
    }
    
    
}
