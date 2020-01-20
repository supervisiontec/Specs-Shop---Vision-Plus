package com.sv.visionplus.channel.channel_register.model;

import com.sv.visionplus.util.database.annotation.VPId;
import com.sv.visionplus.util.database.annotation.VPTable;
import java.util.Date;

@VPTable("channel")
public class ChannelModel
{
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
  private double payAmount;
  
  public ChannelModel() {}

    public ChannelModel(Integer index_no, Integer doctor_id, Date date, Date channel_date, String channel_id, String time, String patient_name, String mobile, double amount, double payAmount) {
        this.index_no = index_no;
        this.doctor_id = doctor_id;
        this.date = date;
        this.channel_date = channel_date;
        this.channel_id = channel_id;
        this.time = time;
        this.patient_name = patient_name;
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
  
 
  
  
}
