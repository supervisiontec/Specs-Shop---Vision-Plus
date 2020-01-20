package com.sv.visionplus.transaction.invoice_tab;

import com.sv.visionplus.transaction.invoice_tab.model.TStockLedger;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class StockLedgerDAO
{
  private static StockLedgerDAO INSTANCE;
  private final QueryUtil<TStockLedger> Query;
  
  public static StockLedgerDAO getInstance()
  {
    if (INSTANCE == null) {
      INSTANCE = new StockLedgerDAO();
    }
    
    return INSTANCE;
  }
  
  public StockLedgerDAO() {
    Query = QueryUtil.getInstance(TStockLedger.class);
  }
  
  boolean saveStockLedger(Connection connection, List<TStockLedger> stockLedgerList) {
    int count = 0;
    for (TStockLedger stock : stockLedgerList) {
      try {
        int indexNo = Query.executeInsert(connection, stock);
        if (indexNo > 0) {
          count++;
        }
      } catch (SQLException ex) {
        Logger.getLogger(StockLedgerDAO.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    
    if (count == stockLedgerList.size()) {
      return true;
    }
    return false;
  }
}
