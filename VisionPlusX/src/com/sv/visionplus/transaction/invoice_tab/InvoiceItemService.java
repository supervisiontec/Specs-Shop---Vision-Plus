package com.sv.visionplus.transaction.invoice_tab;

import com.sv.visionplus.transaction.invoice_tab.model.TInvoiceItem;
import java.sql.Connection;
import java.util.List;

public class InvoiceItemService
{
  private static InvoiceItemService INSTANCE;
  
  public InvoiceItemService() {}
  
  public static InvoiceItemService getInstance()
  {
    if (INSTANCE == null) {
      INSTANCE = new InvoiceItemService();
    }
    
    return INSTANCE;
  }
  
  public boolean saveItem(Connection connection, List<TInvoiceItem> list, int invoiceId) {
    boolean saveItems = InvoiceItemDAO.getInstance().saveItems(connection, list, invoiceId);
    return saveItems;
  }
}
