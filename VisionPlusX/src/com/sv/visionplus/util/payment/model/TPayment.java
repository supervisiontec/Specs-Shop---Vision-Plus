package com.sv.visionplus.util.payment.model;

/**
 *
 * @author Mohan
 */
//XXX:KASUN
public class TPayment {

    private Integer indexNo;
    private Integer transaction;
    private double totalAmount;
    private double cashAmount;
    private double cardAmount;
    private double chequeAmount;

    public TPayment() {
    }

    public TPayment(Integer indexNo, Integer transaction, double totalAmount, double cashAmount, double cardAmount, double chequeAmount) {
        this.indexNo = indexNo;
        this.transaction = transaction;
        this.totalAmount = totalAmount;
        this.cashAmount = cashAmount;
        this.cardAmount = cardAmount;
        this.chequeAmount = chequeAmount;
    }

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

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(double cashAmount) {
        this.cashAmount = cashAmount;
    }

    public double getCardAmount() {
        return cardAmount;
    }

    public void setCardAmount(double cardAmount) {
        this.cardAmount = cardAmount;
    }

    public double getChequeAmount() {
        return chequeAmount;
    }

    public void setChequeAmount(double chequeAmount) {
        this.chequeAmount = chequeAmount;
    }

}
