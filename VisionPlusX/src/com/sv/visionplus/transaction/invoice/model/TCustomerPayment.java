package com.sv.visionplus.transaction.invoice.model;

import com.sv.visionplus.util.database.annotation.VPId;
import com.sv.visionplus.util.database.annotation.VPTable;








@VPTable("customer_payment")
public class TCustomerPayment
{
  @VPId
  private Integer index_no;
  private String date;
  private Integer payment;
  private Integer invoice;
  private boolean is_advance;
  
  public TCustomerPayment() {}
  
  public Integer getIndexNo()
  {
    return index_no;
  }
  
  public void setIndexNo(Integer index_no) {
    this.index_no = index_no;
  }
  
  public String getDate() {
    return date;
  }
  
  public void setDate(String date) {
    this.date = date;
  }
  
  public Integer getPayment() {
    return payment;
  }
  
  public void setPayment(Integer payment) {
    this.payment = payment;
  }
  
  public Integer getInvoice() {
    return invoice;
  }
  
  public void setInvoice(Integer invoice) {
    this.invoice = invoice;
  }
  
  public boolean isIsAdvance() {
    return is_advance;
  }
  
  public void setIsAdvance(boolean isAdvance) {
    is_advance = isAdvance;
  }
}
