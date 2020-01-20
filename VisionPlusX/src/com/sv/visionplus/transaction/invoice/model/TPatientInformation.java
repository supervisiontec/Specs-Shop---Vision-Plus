package com.sv.visionplus.transaction.invoice.model;

import com.sv.visionplus.util.database.annotation.VPId;
import com.sv.visionplus.util.database.annotation.VPTable;

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

    public TPatientInformation() {
    }

    public Integer getInvoice() {
        return invoice;
    }

    public void setInvoice(Integer invoice) {
        this.invoice = invoice;
    }

    public Integer getIndexNo() {
        return index_no;
    }

    public void setIndexNo(Integer indexNo) {
        index_no = indexNo;
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

    public void setLensName(String lensName) {
        this.lenseName = lensName;
    }

    public String getLensBrand() {
        return lenseBrand;
    }

    public void setLensBrand(String lensBrand) {
        this.lenseBrand = lensBrand;
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

}
