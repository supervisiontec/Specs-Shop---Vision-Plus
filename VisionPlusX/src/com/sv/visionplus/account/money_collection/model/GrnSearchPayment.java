/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.account.money_collection.model;

import com.sv.visionplus.util.database.annotation.VPTable;
import java.util.Date;

/**
 *
 * @author KAZA
 */
@VPTable("search_grn_payment")
public class GrnSearchPayment {
    
    private Integer grn_no;
    private Integer receipt_no;
    private Date date;
    private double cash;
    private double cheque;
    private double total;

    public Integer getGrn_no() {
        return grn_no;
    }

    public void setGrn_no(Integer grn_no) {
        this.grn_no = grn_no;
    }

    public Integer getReceipt_no() {
        return receipt_no;
    }

    public void setReceipt_no(Integer receipt_no) {
        this.receipt_no = receipt_no;
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
    
    
}
