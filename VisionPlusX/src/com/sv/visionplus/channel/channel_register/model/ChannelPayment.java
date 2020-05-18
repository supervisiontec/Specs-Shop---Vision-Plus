/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.channel.channel_register.model;

import java.util.Date;

/**
 *
 * @author kasun
 */
public class ChannelPayment {
    private String channel_id;
    private Date channel_date;
    private Date date;
    private String type;
    private double amount;

    public ChannelPayment() {
    }

    public ChannelPayment(String channel_id, Date channel_date, Date date, String type, double amount) {
        this.channel_id = channel_id;
        this.channel_date = channel_date;
        this.date = date;
        this.type = type;
        this.amount = amount;
    }

    public String getChannel_id() {
        return channel_id;
    }

    public void setChannel_id(String channel_id) {
        this.channel_id = channel_id;
    }

    public Date getChannel_date() {
        return channel_date;
    }

    public void setChannel_date(Date channel_date) {
        this.channel_date = channel_date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
}
