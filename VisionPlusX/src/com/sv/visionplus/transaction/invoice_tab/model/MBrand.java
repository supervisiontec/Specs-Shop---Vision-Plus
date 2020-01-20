package com.sv.visionplus.transaction.invoice_tab.model;

import com.sv.visionplus.util.database.annotation.VPId;
import com.sv.visionplus.util.database.annotation.VPTable;









@VPTable("m_brand")
public class MBrand
{
  @VPId
  private Integer indexNo;
  private String name;
  
  public MBrand() {}
  
  public Integer getIndexNo()
  {
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
