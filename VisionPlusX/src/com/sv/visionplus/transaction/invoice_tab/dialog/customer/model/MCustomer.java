package com.sv.visionplus.transaction.invoice_tab.dialog.customer.model;

import com.sv.visionplus.util.database.annotation.VPId;
import com.sv.visionplus.util.database.annotation.VPTable;


@VPTable("m_customer")
public class MCustomer
{
  @VPId
  private Integer indexNo;
  private String name;
  private String nic;
  private String address;
  private String contactNo;
  
  public MCustomer() {}
  
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
  
  public String getNic() {
    return nic;
  }
  
  public void setNic(String nic) {
    this.nic = nic;
  }
  
  public String getAddress() {
    return address;
  }
  
  public void setAddress(String address) {
    this.address = address;
  }
  
  public String getContactNo() {
    return contactNo;
  }
  
  public void setContactNo(String contactNo) {
    this.contactNo = contactNo;
  }
}
