package com.sv.visionplus.channel.channel_register.model;

import java.util.Date;

public class ChannelModelMix {

    private Integer indexNo;
    private Integer doctorId;
    private String doctorName;
    private Date date;
    private Date channelDate;
    private String channelId;
    private String time;
    private String patientName;
    private String mobile;
    private double amount;
    private double payAmount;

    public ChannelModelMix() {
    }

    public ChannelModelMix(Integer indexNo, Integer doctorId, String doctorName, Date date, Date channelDate, String channelId, String time, String patientName, String mobile, double amount, double payAmount) {
        this.indexNo = indexNo;
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.date = date;
        this.channelDate = channelDate;
        this.channelId = channelId;
        this.time = time;
        this.patientName = patientName;
        this.mobile = mobile;
        this.amount = amount;
        this.payAmount = payAmount;
    }

    public double getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(double payAmount) {
        this.payAmount = payAmount;
    }

    public Integer getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getChannelDate() {
        return channelDate;
    }

    public void setChannelDate(Date channelDate) {
        this.channelDate = channelDate;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    
   
}
