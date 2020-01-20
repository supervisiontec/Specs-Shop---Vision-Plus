package com.sv.visionplus.transaction.invoice_tab.model;

import com.sv.visionplus.util.database.annotation.VPId;
import com.sv.visionplus.util.database.annotation.VPTable;






@VPTable("t_payment")
public class TPayment
{
  @VPId
  private Integer IndexNo;
  private Integer transaction;
  private double totalAmount;
  private double cashAmount;
  private double cardAmount;
  private double chequeAmount;
  
  public TPayment() {}
  
  public Integer getIndexNo()
  {
    return IndexNo;
  }
  
  public void setIndexNo(Integer IndexNo) {
    this.IndexNo = IndexNo;
  }
  
  public Integer getTransaction() {
    return transaction;
  }
  
  public void setTransaction(Integer transaction) {
    this.transaction = transaction;
  }
  
  public double getTotalAmount() {
    return totalAmount;
  }
  
  public void setTotalAmount(double totalAmount) {
    this.totalAmount = totalAmount;
  }
  
  public double getCashAmount() {
    return cashAmount;
  }
  
  public void setCashAmount(double cashAmount) {
    this.cashAmount = cashAmount;
  }
  
  public double getCardAmount() {
    return cardAmount;
  }
  
  public void setCardAmount(double cardAmount) {
    this.cardAmount = cardAmount;
  }
  
  public double getChequeAmount() {
    return chequeAmount;
  }
  
  public void setChequeAmount(double chequeAmount) {
    this.chequeAmount = chequeAmount;
  }
}
