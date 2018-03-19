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
public class TCardDetail {

    private Integer indexNo;
    private Integer payment;
    private Integer bankBranch;
    private String cardNo;
    private double amount;

    public TCardDetail() {
    }

    public TCardDetail(Integer indexNo, Integer payment, Integer bankBranch, String cardNo, double amount) {
        this.indexNo = indexNo;
        this.payment = payment;
        this.bankBranch = bankBranch;
        this.cardNo = cardNo;
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

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
