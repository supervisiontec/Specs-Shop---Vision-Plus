package com.sv.visionplus.account.payment_voucher.model;

import com.sv.visionplus.account.money_collection.model.*;
import com.sv.visionplus.util.database.annotation.VPId;
import com.sv.visionplus.util.database.annotation.VPTable;

/**
 * Date : Aug 29, 2016 Time : 3:31:34 PM
 *
 * @copyright : INCOSYZ
 * @author Nidura Prageeth
 */
@VPTable("sub_category")
public class SubCategory {

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
    
    @Override
    public String toString() {
        return getIndexNo()+"-"+getName();
    }

}
