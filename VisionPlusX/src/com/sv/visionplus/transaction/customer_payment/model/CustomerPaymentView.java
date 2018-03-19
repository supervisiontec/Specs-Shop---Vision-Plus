/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.customer_payment.model;

import com.sv.visionplus.util.database.annotation.VPTable;
import java.util.Date;

/**
 *
 * @author KAZA
 */
@VPTable("customer_payment_view")
public class CustomerPaymentView {
    private Integer reciept_no;
    private double cash_amount;
    private double cheque_amount;
    private double card_amount;
    private double total_amount;
    private Date date;
    private boolean is_advance;
    private Integer invoice;

    public Integer getRecieptNo() {
        return reciept_no;
    }

    public void setRecieptNo(Integer recieptNo) {
        this.reciept_no = recieptNo;
    }

    public double getCash_amount() {
        return cash_amount;
    }

    public void setCash_amount(double cash_amount) {
        this.cash_amount = cash_amount;
    }

    public double getCheque_amount() {
        return cheque_amount;
    }

    public void setCheque_amount(double cheque_amount) {
        this.cheque_amount = cheque_amount;
    }

    public double getCard_amount() {
        return card_amount;
    }

    public void setCard_amount(double card_amount) {
        this.card_amount = card_amount;
    }

    public double getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(double total_amount) {
        this.total_amount = total_amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isIs_advance() {
        return is_advance;
    }

    public void setIs_advance(boolean is_advance) {
        this.is_advance = is_advance;
    }

    public Integer getInvoice() {
        return invoice;
    }

    public void setInvoice(Integer invoice) {
        this.invoice = invoice;
    }
    
    
}
