package com.sv.visionplus.channel.doctor;

import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.base.master.AbstractMasterFormDAO;
import com.sv.visionplus.base.master.AbstractMasterFormGUI;
import com.sv.visionplus.channel.doctor.model.DoctorModel;
import com.sv.visionplus.util.component.table.CTableColumn;
import com.sv.visionplus.util.component.table.CTableModel;







public class DoctorFormGUI
  extends AbstractMasterFormGUI<DoctorModel>
{
  public DoctorFormGUI() {}
  
  protected CTableModel<DoctorModel> getTableModel()
  {
    return new CTableModel(new CTableColumn[] { new CTableColumn("Doctor Name", "doctor_name") });
  }
  


  protected AbstractMasterFormDAO<DoctorModel> getMasterFormDAO()
  {
    return new DoctorFormDao();
  }
  

  protected AbstractObjectCreator<DoctorModel> getObjectCreator()
  {
    return new PCDoctor();
  }
}
