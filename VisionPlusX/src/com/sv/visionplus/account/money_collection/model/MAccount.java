package com.sv.visionplus.account.money_collection.model;

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
    private Integer mainCategroy;
    private Integer subCategory;

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

    public Integer getMainCategroy() {
        return mainCategroy;
    }

    public void setMainCategroy(Integer mainCategroy) {
        this.mainCategroy = mainCategroy;
    }

    public Integer getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(Integer subCategory) {
        this.subCategory = subCategory;
    }
}
