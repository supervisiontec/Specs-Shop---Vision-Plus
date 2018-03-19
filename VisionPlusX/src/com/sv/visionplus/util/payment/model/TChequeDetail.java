/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.util.payment.model;

/**
 *
 * @author KAZA
 */
public class TChequeDetail {

    private Integer indexNo;
    private Integer payment;
    private Integer bankBranch;
    private String chequeNo;
    private double amount;

    public TChequeDetail() {
    }

    public TChequeDetail(Integer indexNo, Integer payment, Integer bankBranch, String chequeNo, double amount) {
        this.indexNo = indexNo;
        this.payment = payment;
        this.bankBranch = bankBranch;
        this.chequeNo = chequeNo;
        this.amount = amount;
    }

    public Integer getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    public Integer getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(Integer bankBranch) {
        this.bankBranch = bankBranch;
    }

    public String getChequeNo() {
        return chequeNo;
    }

    public void setChequeNo(String chequeNo) {
        this.chequeNo = chequeNo;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
