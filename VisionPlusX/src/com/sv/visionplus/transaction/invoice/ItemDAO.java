package com.sv.visionplus.transaction.invoice;

import com.sv.visionplus.transaction.invoice.model.MItem;
import com.sv.visionplus.util.database.DatabaseUtil;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ItemDAO
{
  private static ItemDAO INSTANCE;
  private final QueryUtil<MItem> Query;
  private Connection connection;
  
  public static ItemDAO getInstance()
  {
    if (INSTANCE == null) {
      INSTANCE = new ItemDAO();
    }
    
    return INSTANCE;
  }
  
  public ItemDAO() {
    Query = QueryUtil.getInstance(MItem.class);
    try {
      connection = DatabaseUtil.getInstance().openConnection();
    } catch (SQLException ex) {
      Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  
  MItem search(Integer itemId)
  {
    MItem item = new MItem();
    try {
      item = (MItem)Query.executeUniqueSelect(connection, "index_no=?", new Object[] { itemId });
    } catch (SQLException ex) {
      Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return item;
  }
}
