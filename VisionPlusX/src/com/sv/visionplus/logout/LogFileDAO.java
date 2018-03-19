package com.sv.visionplus.logout;

import com.sv.visionplus.logout.model.LogFileModel;
import com.sv.visionplus.util.database.DatabaseUtil;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;









public class LogFileDAO
{
  public static LogFileDAO INSTANCE;
  private QueryUtil<LogFileModel> queryUtil;
  private Connection connection;
  
  public static LogFileDAO getInstance()
  {
    if (INSTANCE == null) {
      INSTANCE = new LogFileDAO();
    }
    return INSTANCE;
  }
  
  public LogFileDAO() {
    queryUtil = QueryUtil.getInstance(LogFileModel.class);
    try {
      connection = DatabaseUtil.getInstance().openConnection();
    } catch (SQLException ex) {
      Logger.getLogger(LogFileDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  
  int saveLog(LogFileModel model) {
    try {
      int logId = queryUtil.executeInsert(connection, model);
      if (logId > 0) {
        return 1;
      }
    }
    catch (SQLException ex)
    {
      Logger.getLogger(LogFileDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return 0;
  }
}
