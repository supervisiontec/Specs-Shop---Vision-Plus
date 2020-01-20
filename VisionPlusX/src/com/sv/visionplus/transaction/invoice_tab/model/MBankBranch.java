package com.sv.visionplus.transaction.invoice_tab.model;

import com.sv.visionplus.util.database.annotation.VPId;
import com.sv.visionplus.util.database.annotation.VPTable;


@VPTable("bank_branch")
public class MBankBranch
{
  @VPId
  private String code;
  private String bank;
  private String branch;
  
  public MBankBranch() {}
  
  public MBankBranch(String code, String bank, String branch)
  {
    this.code = code;
    this.bank = bank;
    this.branch = branch;
  }
  
  public String getCode() {
    return code;
  }
  
  public void setCode(String code) {
    this.code = code;
  }
  
  public String getBank() {
    return bank;
  }
  
  public void setBank(String bank) {
    this.bank = bank;
  }
  
  public String getBranch() {
    return branch;
  }
  
  public void setBranch(String branch) {
    this.branch = branch;
  }
  
  public String toString()
  {
    return code + "-" + bank + "-" + branch;
  }
}
