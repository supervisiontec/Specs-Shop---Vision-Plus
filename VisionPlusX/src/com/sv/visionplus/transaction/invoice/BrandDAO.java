package com.sv.visionplus.transaction.invoice;

import com.sv.visionplus.transaction.invoice.model.MBrand;
import com.sv.visionplus.util.database.DatabaseUtil;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;






public class BrandDAO
{
  public static BrandDAO INSTANCE;
  private QueryUtil<MBrand> queryUtil;
  private Connection connection;
  
  public static BrandDAO getInstance()
  {
    if (INSTANCE == null) {
      INSTANCE = new BrandDAO();
    }
    return INSTANCE;
  }
  
  public BrandDAO() {
    queryUtil = QueryUtil.getInstance(MBrand.class);
    try {
      connection = DatabaseUtil.getInstance().openConnection();
    } catch (SQLException ex) {
      Logger.getLogger(BrandDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  
  MBrand searchBrand(Integer brand) {
    try {
      return (MBrand)queryUtil.executeUniqueSelect(connection, "index_no=?", new Object[] { brand });
    } catch (SQLException ex) {
      Logger.getLogger(BrandDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
  }
}
