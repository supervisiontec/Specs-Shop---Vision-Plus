/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.invoice.model;

import com.sv.visionplus.util.database.annotation.VPTable;

/**
 *
 * @author kasun
 */
@VPTable("view_invoice_payment")
public class ViewInvoicePayment {

    private Integer invoice_no;
    private double cash;
    private double cheque;
    private double card;
    private double total;
    private boolean is_advance;
     private String number;

    public ViewInvoicePayment() {
    }

    public ViewInvoicePayment(Integer invoice_no, double cash, double cheque, double card, double total, boolean is_advance) {
        this.invoice_no = invoice_no;
        this.cash = cash;
        this.cheque = cheque;
        this.card = card;
        this.total = total;
        this.is_advance = is_advance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getInvoice_no() {
        return invoice_no;
    }

    public void setInvoice_no(Integer invoice_no) {
        this.invoice_no = invoice_no;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public double getCheque() {
        return cheque;
    }

    public void setCheque(double cheque) {
        this.cheque = cheque;
    }

    public double getCard() {
        return card;
    }

    public void setCard(double card) {
        this.card = card;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public boolean isIs_advance() {
        return is_advance;
    }

    public void setIs_advance(boolean is_advance) {
        this.is_advance = is_advance;
    }
    
}
