/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.customer_payment.model;

import com.sv.visionplus.util.database.annotation.VPId;
import com.sv.visionplus.util.database.annotation.VPTable;

/**
 *
 * @author KAZA
 */
@VPTable("t_payment")
public class TPayment {

    @VPId
    private Integer indexNo;
    private Integer transaction;
    private double totalAmount;
    private double cashAmount;
    private double cardAmount;
    private double chequeAmount;

    public Integer getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public Integer getTransaction() {
        return transaction;
    }

    public void setTransaction(Integer transaction) {
        this.transaction = transaction;
    }

    public double getTotalAmont() {
        return totalAmount;
    }

    public void setTotalAmont(double totalAmont) {
        this.totalAmount = totalAmont;
    }

    public double getCashAmont() {
        return cashAmount;
    }

    public void setCashAmont(double cashAmont) {
        this.cashAmount = cashAmont;
    }

    public double getCardAmont() {
        return cardAmount;
    }

    public void setCardAmont(double cardAmont) {
        this.cardAmount = cardAmont;
    }

    public double getChequeAmont() {
        return chequeAmount;
    }

    public void setChequeAmont(double chequeAmont) {
        this.chequeAmount = chequeAmont;
    }

}
