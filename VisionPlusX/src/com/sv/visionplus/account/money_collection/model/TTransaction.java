package com.sv.visionplus.account.money_collection.model;

import com.sv.visionplus.util.database.annotation.VPId;
import com.sv.visionplus.util.database.annotation.VPTable;
import java.util.Date;

/**
 *
 * @author KAZA
 */
@VPTable("t_transaction")
public class TTransaction {
    
    @VPId
    private Integer indexNo;
    private Date date;
    private String type;

    public TTransaction() {
    }

    public TTransaction(Integer indexNo, Date date, String type) {
        this.indexNo = indexNo;
        this.date = date;
        this.type = type;
    }

    public Integer getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}
