/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.account.money_collection.model;

import com.sv.visionplus.util.database.annotation.VPId;
import com.sv.visionplus.util.database.annotation.VPTable;
import java.util.Date;

/**
 *
 * @author KAZA
 */
@VPTable("view_invoice_payment")
public class ViewInvoicePayment {
    @VPId
    private Integer invoice_no;
    private Date date;
    private double cash;
    private double card;
    private double cheque;
    private double total;
    private boolean is_advance;

    public Integer getInvoiceNo() {
        return invoice_no;
    }

    public void setInvoiceNo(Integer invoiceNo) {
        this.invoice_no = invoiceNo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public double getCard() {
        return card;
    }

    public void setCard(double card) {
        this.card = card;
    }

    public double getCheque() {
        return cheque;
    }

    public void setCheque(double cheque) {
        this.cheque = cheque;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Integer getInvoice_no() {
        return invoice_no;
    }

    public void setInvoice_no(Integer invoice_no) {
        this.invoice_no = invoice_no;
    }

    public boolean getIsAdvance() {
        return is_advance;
    }

    public void setIsAdvance(boolean isAdvance) {
        this.is_advance = isAdvance;
    }
    
    
}
