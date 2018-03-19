package com.sv.visionplus.transaction.invoice;

import com.sv.visionplus.transaction.invoice.model.SearchItemFront;
import com.sv.visionplus.util.database.DatabaseUtil;
import com.sv.visionplus.util.database.QueryUtil;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;









public class SearchItemFrontDAO
{
  private static SearchItemFrontDAO INSTANCE;
  private final QueryUtil<SearchItemFront> Query;
  private Connection connection;
  
  public static SearchItemFrontDAO getInstance()
  {
    if (INSTANCE == null) {
      INSTANCE = new SearchItemFrontDAO();
    }
    
    return INSTANCE;
  }
  
  public SearchItemFrontDAO() {
    Query = QueryUtil.getInstance(SearchItemFront.class);
    try {
      connection = DatabaseUtil.getInstance().openConnection();
    } catch (SQLException ex) {
      Logger.getLogger(SearchItemFrontDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  
  public List<SearchItemFront> getItem() {
    List<SearchItemFront> itemList = new ArrayList();
    try {
      itemList = Query.executeSelect(connection);
    } catch (SQLException ex) {
      Logger.getLogger(SearchItemFrontDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return itemList;
  }
  
  public List<SearchItemFront> searchIiem(String code, String name) {
    List<SearchItemFront> itemList = new ArrayList();
    System.out.println(code + "code");
    System.out.println(name + "name");
    try {
      itemList = Query.executeSelect(connection, "code LIKE ? AND item_name LIKE ? ", new Object[] { "%" + code + "%", "%" + name + "%" });
    } catch (SQLException ex) {
      Logger.getLogger(SearchItemFrontDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return itemList;
  }
}
