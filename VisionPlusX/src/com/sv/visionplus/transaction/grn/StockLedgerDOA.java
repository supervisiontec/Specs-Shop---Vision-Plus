package com.sv.visionplus.transaction.grn;

import com.sv.visionplus.transaction.grn.model.TStockLedger;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;









public class StockLedgerDOA
{
  private static StockLedgerDOA INSTANCE;
  private final QueryUtil<TStockLedger> Query;
  
  public static StockLedgerDOA getInstance()
  {
    if (INSTANCE == null) {
      INSTANCE = new StockLedgerDOA();
    }
    
    return INSTANCE;
  }
  
  public StockLedgerDOA() {
    Query = QueryUtil.getInstance(TStockLedger.class);
  }
  
  int saveStockLedgres(Connection connection, List<TStockLedger> ledgers)
  {
    int count = 0;
    for (TStockLedger ledger : ledgers) {
      try {
        int ledgerId = Query.executeInsert(connection, ledger);
        if (ledgerId > 0) {
          count++;
        }
      } catch (SQLException ex) {
        Logger.getLogger(StockLedgerDOA.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    if (count == ledgers.size()) {
      return count;
    }
    
    return -1;
  }
}
