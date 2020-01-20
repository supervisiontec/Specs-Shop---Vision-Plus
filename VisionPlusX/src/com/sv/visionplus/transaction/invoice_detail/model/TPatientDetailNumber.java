/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.invoice_detail.model;

import com.sv.visionplus.util.database.annotation.VPId;
import com.sv.visionplus.util.database.annotation.VPTable;

/**
 *
 * @author kasun
 */
@VPTable("patient_detail_number")
public class TPatientDetailNumber {
     @VPId
    private Integer index_no;
    private long number;

    public TPatientDetailNumber() {
    }

    public TPatientDetailNumber(Integer index_no, long number) {
        this.index_no = index_no;
        this.number = number;
    }

    public Integer getIndex_no() {
        return index_no;
    }

    public void setIndex_no(Integer index_no) {
        this.index_no = index_no;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }
    
}
