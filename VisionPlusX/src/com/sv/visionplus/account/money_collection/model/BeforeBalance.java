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
 * @author kasun
 */
@VPTable("before_balance")
public class BeforeBalance {

    private Date date;
    private String name;
    private double balance;

    public BeforeBalance() {
    }
   
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getBalance() {
        return balance;
    }

    public void setBealance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
