package com.sv.visionplus.account.payment_voucher.model;

import com.sv.visionplus.account.money_collection.model.*;
import com.sv.visionplus.util.database.annotation.VPId;
import com.sv.visionplus.util.database.annotation.VPTable;

/**
 *
 * @author KAZA
 */
@VPTable("m_account")
public class MAccount {

    @VPId
    private Integer indexNo;
    private String Description;
    private String type;
    private Integer main_category;
    private Integer sub_category;

    public Integer getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getMainCategory() {
        return main_category;
    }

    public void setMainCategory(Integer main_category) {
        this.main_category = main_category;
    }

    public Integer getSubCategory() {
        return sub_category;
    }

    public void setSubCategory(Integer sub_category) {
        this.sub_category = sub_category;
    }

}
