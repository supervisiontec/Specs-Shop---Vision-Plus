/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.stock.stock_transfer.model;

import com.sv.visionplus.stock.stock_adjustment.model.*;
import com.sv.visionplus.master.item.model.*;
import com.sv.visionplus.util.database.annotation.VPId;
import com.sv.visionplus.util.database.annotation.VPTable;

/**
 * Date : Aug 24, 2016 Time : 2:47:44 PM
 *
 * @copyright : INCOSYZ
 * @author Nidura Prageeth
 */
@VPTable("m_brand")
public class MBrand {

    @VPId
    private Integer indexNo;
    private String name;

    public Integer getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
}
