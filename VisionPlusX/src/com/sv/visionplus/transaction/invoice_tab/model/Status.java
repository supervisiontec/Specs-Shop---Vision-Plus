package com.sv.visionplus.transaction.invoice_tab.model;

import com.sv.visionplus.util.database.annotation.VPId;
import com.sv.visionplus.util.database.annotation.VPTable;
import java.util.Date;



@VPTable("status")
public class Status
{
  @VPId
  private Integer indexNo;
  private Integer invoice;
  private String name;
  private Date date;
  
  public Status() {}
  
  public Integer getIndexNo()
  {
    return indexNo;
  }
  
  public void setIndexNo(Integer indexNo) {
    this.indexNo = indexNo;
  }
  
  public Integer getInvoice() {
    return invoice;
  }
  
  public void setInvoice(Integer invoice) {
    this.invoice = invoice;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public Date getDate() {
    return date;
  }
  
  public void setDate(Date date) {
    this.date = date;
  }
}
