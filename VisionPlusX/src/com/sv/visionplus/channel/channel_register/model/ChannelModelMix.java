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
    private double overPayAmount;
    private String overPayRemarks;
    private double payAmount2;
    private Date payDate2;
    private double refundAmount;
    private Date refundDate;
    private String refundRemarks;
    private boolean isPresent;

    public ChannelModelMix() {
    }

    public ChannelModelMix(Integer indexNo, Integer doctorId, String doctorName, Date date, Date channelDate, String channelId, String time, String patientName, String mobile, double amount, double payAmount, double overPayAmount, String overPayRemarks, double payAmount2, Date payDate2, double refundAmount, Date refundDate, String refundRemarks, boolean isPresent) {
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
        this.overPayAmount = overPayAmount;
        this.overPayRemarks = overPayRemarks;
        this.payAmount2 = payAmount2;
        this.payDate2 = payDate2;
        this.refundAmount = refundAmount;
        this.refundDate = refundDate;
        this.refundRemarks = refundRemarks;
        this.isPresent = isPresent;
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

    public double getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(double payAmount) {
        this.payAmount = payAmount;
    }

    public double getOverPayAmount() {
        return overPayAmount;
    }

    public void setOverPayAmount(double overPayAmount) {
        this.overPayAmount = overPayAmount;
    }

    public String getOverPayRemarks() {
        return overPayRemarks;
    }

    public void setOverPayRemarks(String overPayRemarks) {
        this.overPayRemarks = overPayRemarks;
    }

    public double getPayAmount2() {
        return payAmount2;
    }

    public void setPayAmount2(double payAmount2) {
        this.payAmount2 = payAmount2;
    }

    public Date getPayDate2() {
        return payDate2;
    }

    public void setPayDate2(Date payDate2) {
        this.payDate2 = payDate2;
    }

    public double getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(double refundAmount) {
        this.refundAmount = refundAmount;
    }

    public Date getRefundDate() {
        return refundDate;
    }

    public void setRefundDate(Date refundDate) {
        this.refundDate = refundDate;
    }

    public String getRefundRemarks() {
        return refundRemarks;
    }

    public void setRefundRemarks(String refundRemarks) {
        this.refundRemarks = refundRemarks;
    }

    public boolean isIsPresent() {
        return isPresent;
    }

    public void setIsPresent(boolean isPresent) {
        this.isPresent = isPresent;
    }

    
}
