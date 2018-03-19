package com.sv.visionplus.transaction.invoice;

import com.sv.visionplus.transaction.invoice.model.TStockLedger;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.util.List;








public class StockLedgerService
{
  private static StockLedgerService INSTANCE;
  private final QueryUtil<TStockLedger> Query;
  
  public static StockLedgerService getInstance()
  {
    if (INSTANCE == null) {
      INSTANCE = new StockLedgerService();
    }
    
    return INSTANCE;
  }
  
  public StockLedgerService() {
    Query = QueryUtil.getInstance(TStockLedger.class);
  }
  
  boolean saveStockLedger(Connection connection, List<TStockLedger> stockLedgerList) {
    return StockLedgerDAO.getInstance().saveStockLedger(connection, stockLedgerList);
  }
}
