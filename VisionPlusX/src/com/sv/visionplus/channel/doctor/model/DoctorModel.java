package com.sv.visionplus.channel.doctor.model;

import com.sv.visionplus.util.database.annotation.VPColumn;
import com.sv.visionplus.util.database.annotation.VPId;
import com.sv.visionplus.util.database.annotation.VPTable;









@VPTable("doctor")
public class DoctorModel
{
  @VPId
  private Integer index_no;
  @VPColumn("doctor_name")
  private String doctor_name;
  
  public DoctorModel() {}
  
  public DoctorModel(Integer index_no, String doctor_name)
  {
    this.index_no = index_no;
    this.doctor_name = doctor_name;
  }
  
  public Integer getIndexNo()
  {
    return index_no;
  }
  
  public void setIndexNo(Integer indexNo) {
    index_no = indexNo;
  }
  
  public String getdoctor_name() {
    return doctor_name;
  }
  
  public void setdoctor_name(String doctorName) {
    doctor_name = doctorName;
  }
}
