package com.sv.visionplus.transaction.grn;

import com.sv.visionplus.transaction.grn.model.GrnDetail;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;








public class GrnItemDAO
{
  private static GrnItemDAO INSTANCE;
  private final QueryUtil<GrnDetail> Query;
  
  public static GrnItemDAO getInstance()
  {
    if (INSTANCE == null) {
      INSTANCE = new GrnItemDAO();
    }
    
    return INSTANCE;
  }
  
  public GrnItemDAO() {
    Query = QueryUtil.getInstance(GrnDetail.class);
  }
  
  int saveGrnItem(Connection connection, List<GrnDetail> grnDetail, Integer grnId)
  {
    int count = 0;
    for (GrnDetail grnitem : grnDetail) {
      grnitem.setGrn(grnId);
      try {
        int res = Query.executeInsert(connection, grnitem);
        if (res > 0) {
          count++;
        }
      } catch (SQLException ex) {
        Logger.getLogger(GrnItemDAO.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    if (count == grnDetail.size()) {
      return count;
    }
    return -1;
  }
}
