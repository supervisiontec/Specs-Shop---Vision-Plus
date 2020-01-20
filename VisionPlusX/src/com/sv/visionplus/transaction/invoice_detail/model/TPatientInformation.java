/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.invoice_detail.model;

import com.sv.visionplus.util.database.annotation.VPId;
import com.sv.visionplus.util.database.annotation.VPTable;
import java.util.Date;

/**
 *
 * @author kasun
 */
@VPTable("t_invoice_patient_infomation")
public class TPatientInformation {
    @VPId
    private Integer index_no;
    private Integer invoice;
    private String complains;
    private String hbRxLeft;
    private String hbRxRight;
    private String hbRxSubLeft;
    private String hbRxSubRight;
    private String autoRefLeft;
    private String autoRefRight;
    private String ntcLeft;
    private String ntcRight;
    private String vaWithoutGlassLeft;
    private String vaWithoutGlassRight;
    private String vaWithPhLeft;
    private String vaWithPhRight;
    private String vaWithGlassLeft;
    private String vaWithGlassRight;
    private String distSphLeft;
    private String distSphRight;
    private String distCylLeft;
    private String distCylRight;
    private String distAxisLeft;
    private String distAxisRight;
    private String nearSphLeft;
    private String nearSphRight;
    private String nearCylLeft;
    private String nearCylRight;
    private String nearAxisLeft;
    private String nearAxisRight;
    private String lenseType;
    private String lenseName;
    private String lenseBrand;
    private String refractiveError;
    private String remarks;
    private String customer_name;
    private String mobile_no;
    private Date date;
    private Integer number;

    public TPatientInformation() {
    }

    public TPatientInformation(Integer index_no, Integer invoice, String complains, String hbRxLeft, String hbRxRight, String hbRxSubLeft, String hbRxSubRight, String autoRefLeft, String autoRefRight, String ntcLeft, String ntcRight, String vaWithoutGlassLeft, String vaWithoutGlassRight, String vaWithPhLeft, String vaWithPhRight, String vaWithGlassLeft, String vaWithGlassRight, String distSphLeft, String distSphRight, String distCylLeft, String distCylRight, String distAxisLeft, String distAxisRight, String nearSphLeft, String nearSphRight, String nearCylLeft, String nearCylRight, String nearAxisLeft, String nearAxisRight, String lenseType, String lenseName, String lenseBrand, String refractiveError, String remarks, String customer_name, String mobile_no, Date date, Integer number) {
        this.index_no = index_no;
        this.invoice = invoice;
        this.complains = complains;
        this.hbRxLeft = hbRxLeft;
        this.hbRxRight = hbRxRight;
        this.hbRxSubLeft = hbRxSubLeft;
        this.hbRxSubRight = hbRxSubRight;
        this.autoRefLeft = autoRefLeft;
        this.autoRefRight = autoRefRight;
        this.ntcLeft = ntcLeft;
        this.ntcRight = ntcRight;
        this.vaWithoutGlassLeft = vaWithoutGlassLeft;
        this.vaWithoutGlassRight = vaWithoutGlassRight;
        this.vaWithPhLeft = vaWithPhLeft;
        this.vaWithPhRight = vaWithPhRight;
        this.vaWithGlassLeft = vaWithGlassLeft;
        this.vaWithGlassRight = vaWithGlassRight;
        this.distSphLeft = distSphLeft;
        this.distSphRight = distSphRight;
        this.distCylLeft = distCylLeft;
        this.distCylRight = distCylRight;
        this.distAxisLeft = distAxisLeft;
        this.distAxisRight = distAxisRight;
        this.nearSphLeft = nearSphLeft;
        this.nearSphRight = nearSphRight;
        this.nearCylLeft = nearCylLeft;
        this.nearCylRight = nearCylRight;
        this.nearAxisLeft = nearAxisLeft;
        this.nearAxisRight = nearAxisRight;
        this.lenseType = lenseType;
        this.lenseName = lenseName;
        this.lenseBrand = lenseBrand;
        this.refractiveError = refractiveError;
        this.remarks = remarks;
        this.customer_name = customer_name;
        this.mobile_no = mobile_no;
        this.date = date;
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getIndex_no() {
        return index_no;
    }

    public void setIndex_no(Integer index_no) {
        this.index_no = index_no;
    }

    public Integer getInvoice() {
        return invoice;
    }

    public void setInvoice(Integer invoice) {
        this.invoice = invoice;
    }

    public String getComplains() {
        return complains;
    }

    public void setComplains(String complains) {
        this.complains = complains;
    }

    public String getHbRxLeft() {
        return hbRxLeft;
    }

    public void setHbRxLeft(String hbRxLeft) {
        this.hbRxLeft = hbRxLeft;
    }

    public String getHbRxRight() {
        return hbRxRight;
    }

    public void setHbRxRight(String hbRxRight) {
        this.hbRxRight = hbRxRight;
    }

    public String getHbRxSubLeft() {
        return hbRxSubLeft;
    }

    public void setHbRxSubLeft(String hbRxSubLeft) {
        this.hbRxSubLeft = hbRxSubLeft;
    }

    public String getHbRxSubRight() {
        return hbRxSubRight;
    }

    public void setHbRxSubRight(String hbRxSubRight) {
        this.hbRxSubRight = hbRxSubRight;
    }

    public String getAutoRefLeft() {
        return autoRefLeft;
    }

    public void setAutoRefLeft(String autoRefLeft) {
        this.autoRefLeft = autoRefLeft;
    }

    public String getAutoRefRight() {
        return autoRefRight;
    }

    public void setAutoRefRight(String autoRefRight) {
        this.autoRefRight = autoRefRight;
    }

    public String getNtcLeft() {
        return ntcLeft;
    }

    public void setNtcLeft(String ntcLeft) {
        this.ntcLeft = ntcLeft;
    }

    public String getNtcRight() {
        return ntcRight;
    }

    public void setNtcRight(String ntcRight) {
        this.ntcRight = ntcRight;
    }

    public String getVaWithoutGlassLeft() {
        return vaWithoutGlassLeft;
    }

    public void setVaWithoutGlassLeft(String vaWithoutGlassLeft) {
        this.vaWithoutGlassLeft = vaWithoutGlassLeft;
    }

    public String getVaWithoutGlassRight() {
        return vaWithoutGlassRight;
    }

    public void setVaWithoutGlassRight(String vaWithoutGlassRight) {
        this.vaWithoutGlassRight = vaWithoutGlassRight;
    }

    public String getVaWithPhLeft() {
        return vaWithPhLeft;
    }

    public void setVaWithPhLeft(String vaWithPhLeft) {
        this.vaWithPhLeft = vaWithPhLeft;
    }

    public String getVaWithPhRight() {
        return vaWithPhRight;
    }

    public void setVaWithPhRight(String vaWithPhRight) {
        this.vaWithPhRight = vaWithPhRight;
    }

    public String getVaWithGlassLeft() {
        return vaWithGlassLeft;
    }

    public void setVaWithGlassLeft(String vaWithGlassLeft) {
        this.vaWithGlassLeft = vaWithGlassLeft;
    }

    public String getVaWithGlassRight() {
        return vaWithGlassRight;
    }

    public void setVaWithGlassRight(String vaWithGlassRight) {
        this.vaWithGlassRight = vaWithGlassRight;
    }

    public String getDistSphLeft() {
        return distSphLeft;
    }

    public void setDistSphLeft(String distSphLeft) {
        this.distSphLeft = distSphLeft;
    }

    public String getDistSphRight() {
        return distSphRight;
    }

    public void setDistSphRight(String distSphRight) {
        this.distSphRight = distSphRight;
    }

    public String getDistCylLeft() {
        return distCylLeft;
    }

    public void setDistCylLeft(String distCylLeft) {
        this.distCylLeft = distCylLeft;
    }

    public String getDistCylRight() {
        return distCylRight;
    }

    public void setDistCylRight(String distCylRight) {
        this.distCylRight = distCylRight;
    }

    public String getDistAxisLeft() {
        return distAxisLeft;
    }

    public void setDistAxisLeft(String distAxisLeft) {
        this.distAxisLeft = distAxisLeft;
    }

    public String getDistAxisRight() {
        return distAxisRight;
    }

    public void setDistAxisRight(String distAxisRight) {
        this.distAxisRight = distAxisRight;
    }

    public String getNearSphLeft() {
        return nearSphLeft;
    }

    public void setNearSphLeft(String nearSphLeft) {
        this.nearSphLeft = nearSphLeft;
    }

    public String getNearSphRight() {
        return nearSphRight;
    }

    public void setNearSphRight(String nearSphRight) {
        this.nearSphRight = nearSphRight;
    }

    public String getNearCylLeft() {
        return nearCylLeft;
    }

    public void setNearCylLeft(String nearCylLeft) {
        this.nearCylLeft = nearCylLeft;
    }

    public String getNearCylRight() {
        return nearCylRight;
    }

    public void setNearCylRight(String nearCylRight) {
        this.nearCylRight = nearCylRight;
    }

    public String getNearAxisLeft() {
        return nearAxisLeft;
    }

    public void setNearAxisLeft(String nearAxisLeft) {
        this.nearAxisLeft = nearAxisLeft;
    }

    public String getNearAxisRight() {
        return nearAxisRight;
    }

    public void setNearAxisRight(String nearAxisRight) {
        this.nearAxisRight = nearAxisRight;
    }

    public String getLenseType() {
        return lenseType;
    }

    public void setLenseType(String lenseType) {
        this.lenseType = lenseType;
    }

    public String getLensName() {
        return lenseName;
    }

    public void setLensName(String lenseName) {
        this.lenseName = lenseName;
    }

    public String getLensBrand() {
        return lenseBrand;
    }

    public void setLensBrand(String lenseBrand) {
        this.lenseBrand = lenseBrand;
    }

    public String getRefractiveError() {
        return refractiveError;
    }

    public void setRefractiveError(String refractiveError) {
        this.refractiveError = refractiveError;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}
