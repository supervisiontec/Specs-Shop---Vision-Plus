package com.sv.visionplus.channel.channel_register.model;

import com.sv.visionplus.util.database.annotation.VPId;
import com.sv.visionplus.util.database.annotation.VPTable;
import java.util.Date;

@VPTable("channel")
public class ChannelModel {

    @VPId
    private Integer index_no;
    private Integer doctor_id;
    private Date date;
    private Date channel_date;
    private String channel_id;
    private String time;
    private String patient_name;
    private String mobile;
    private double amount;
    private double pay_amount;
    private double over_pay_amount;
    private String over_pay_remarks;
    private double pay_amount2;
    private Date date2;
    private double refund_amount;
    private Date refund_date;
    private String refund_remarks;
    private int isPresent;

    public ChannelModel() {
    }

    public ChannelModel(Integer index_no, Integer doctor_id, Date date, Date channel_date, String channel_id, String time, String patient_name, String mobile, double amount, double pay_amount, double over_pay_amount, String over_pay_remarks, double pay_amount2, Date date2, double refund_amount, Date refund_date, String refund_remarks, int isPresent) {
        this.index_no = index_no;
        this.doctor_id = doctor_id;
        this.date = date;
        this.channel_date = channel_date;
        this.channel_id = channel_id;
        this.time = time;
        this.patient_name = patient_name;
        this.mobile = mobile;
        this.amount = amount;
        this.pay_amount = pay_amount;
        this.over_pay_amount = over_pay_amount;
        this.over_pay_remarks = over_pay_remarks;
        this.pay_amount2 = pay_amount2;
        this.date2 = date2;
        this.refund_amount = refund_amount;
        this.refund_date = refund_date;
        this.refund_remarks = refund_remarks;
        this.isPresent = isPresent;
    }

    public double getPay_amount() {
        return pay_amount;
    }

    public void setPay_amount(double pay_amount) {
        this.pay_amount = pay_amount;
    }

    public double getOver_pay_amount() {
        return over_pay_amount;
    }

    public void setOver_pay_amount(double over_pay_amount) {
        this.over_pay_amount = over_pay_amount;
    }

    public String getOver_pay_remarks() {
        return over_pay_remarks;
    }

    public void setOver_pay_remarks(String over_pay_remarks) {
        this.over_pay_remarks = over_pay_remarks;
    }

    public double getPay_amount2() {
        return pay_amount2;
    }

    public void setPay_amount2(double pay_amount2) {
        this.pay_amount2 = pay_amount2;
    }

    public double getRefund_amount() {
        return refund_amount;
    }

    public void setRefund_amount(double refund_amount) {
        this.refund_amount = refund_amount;
    }

    public Date getRefund_date() {
        return refund_date;
    }

    public void setRefund_date(Date refund_date) {
        this.refund_date = refund_date;
    }

    public String getRefund_remarks() {
        return refund_remarks;
    }

    public void setRefund_remarks(String refund_remarks) {
        this.refund_remarks = refund_remarks;
    }

    public int isIsPresent() {
        return isPresent;
    }

    public void setIsPresent(int isPresent) {
        this.isPresent = isPresent;
    }

    public Integer getIndex_no() {
        return index_no;
    }

    public void setIndex_no(Integer index_no) {
        this.index_no = index_no;
    }

    public Integer getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(Integer doctor_id) {
        this.doctor_id = doctor_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getChannel_date() {
        return channel_date;
    }

    public void setChannel_date(Date channel_date) {
        this.channel_date = channel_date;
    }

    public String getChannel_id() {
        return channel_id;
    }

    public void setChannel_id(String channel_id) {
        this.channel_id = channel_id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
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
        return pay_amount;
    }

    public void setPayAmount(double pay_amount) {
        this.pay_amount = pay_amount;
    }

    public double getOverPayAmount() {
        return over_pay_amount;
    }

    public void setOverPayAmount(double over_pay_amount) {
        this.over_pay_amount = over_pay_amount;
    }

    public String getOverPayRemarks() {
        return over_pay_remarks;
    }

    public void setOverPayRemarks(String over_pay_remarks) {
        this.over_pay_remarks = over_pay_remarks;
    }

    public double getPayAmount2() {
        return pay_amount2;
    }

    public void setPayAmount2(double pay_amount2) {
        this.pay_amount2 = pay_amount2;
    }

    public Date getDate2() {
        return date2;
    }

    public void setDate2(Date date2) {
        this.date2 = date2;
    }

    public double getRefundAmount() {
        return refund_amount;
    }

    public void setRefundAmount(double refund_amount) {
        this.refund_amount = refund_amount;
    }

    public Date getRefundDate() {
        return refund_date;
    }

    public void setRefundDate(Date refund_date) {
        this.refund_date = refund_date;
    }

    public String getRefundRemarks() {
        return refund_remarks;
    }

    public void setRefundRemarks(String refund_remarks) {
        this.refund_remarks = refund_remarks;
    }

    
}
