package com.sv.visionplus.stock.stock_adjustment.model;

import com.sv.visionplus.util.database.annotation.VPId;
import com.sv.visionplus.util.database.annotation.VPTable;

/**
 *
 * @author KAZA
 */
@VPTable("store")
public class Store {
    
    @VPId
    private Integer IndexNo;
    private String name;

    public Store() {
    }

    public Store(Integer IndexNo, String name) {
        this.IndexNo = IndexNo;
        this.name = name;
    }

    public Integer getIndexNo() {
        return IndexNo;
    }

    public void setIndexNo(Integer IndexNo) {
        this.IndexNo = IndexNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
