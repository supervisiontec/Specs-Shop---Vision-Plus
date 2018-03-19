package com.sv.visionplus.channel.doctor;

import com.sv.visionplus.base.master.AbstractMasterFormDAO;
import com.sv.visionplus.channel.doctor.model.DoctorModel;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;








public class DoctorFormDao
  extends AbstractMasterFormDAO<DoctorModel>
{
  private QueryUtil<DoctorModel> queryUtil;
  public static DoctorFormDao INSTANCE;
  
  public static DoctorFormDao getInstance()
  {
    if (INSTANCE == null) {
      INSTANCE = new DoctorFormDao();
    }
    return INSTANCE;
  }
  
  public DoctorFormDao() {
    queryUtil = QueryUtil.getInstance(DoctorModel.class);
  }
  
  public void save(Connection connection, DoctorModel doc) throws SQLException
  {
    queryUtil.executeInsert(connection, doc);
  }
  
  public void update(Connection connection, DoctorModel doc) throws SQLException
  {
    queryUtil.executeUpdate(connection, doc, "index_no=?", new Object[] { doc.getIndexNo() });
  }
  
  public void delete(Connection connection, DoctorModel doc) throws SQLException
  {
    queryUtil.executeDelete(connection, "index_no=?", new Object[] { doc.getIndexNo() });
  }
  
  public List<DoctorModel> getSearchResult(Connection connection, String text) throws SQLException
  {
    text = "%" + text + "%";
    return queryUtil.executeSelect(connection, "doctor_name LIKE ? ", new Object[] { text });
  }
  
  public DoctorModel searchDoctor(Connection connection, Integer id) throws SQLException {
    return (DoctorModel)queryUtil.executeUniqueSelect(connection, "index_no=?", new Object[] { id });
  }
  
  public List<DoctorModel> AllDoctor(Connection connection) throws SQLException {
    return queryUtil.executeSelect(connection);
  }
}
