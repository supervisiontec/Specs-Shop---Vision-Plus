package com.sv.visionplus.transaction.invoice_tab.model;

import com.sv.visionplus.util.database.annotation.VPId;
import com.sv.visionplus.util.database.annotation.VPTable;
import java.util.Date;









@VPTable("t_transaction")
public class TTransaction
{
  @VPId
  private Integer indexNo;
  private Date Date;
  private String type;
  
  public TTransaction() {}
  
  public Integer getIndexNo()
  {
    return indexNo;
  }
  
  public void setIndexNo(Integer indexNo) {
    this.indexNo = indexNo;
  }
  
  public Date getDate() {
    return Date;
  }
  
  public void setDate(Date Date) {
    this.Date = Date;
  }
  
  public String getType() {
    return type;
  }
  
  public void setType(String type) {
    this.type = type;
  }
}
