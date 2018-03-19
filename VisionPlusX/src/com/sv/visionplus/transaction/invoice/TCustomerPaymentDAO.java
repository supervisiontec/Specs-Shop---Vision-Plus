package com.sv.visionplus.transaction.invoice;

import com.sv.visionplus.transaction.invoice.model.TCustomerPayment;
import com.sv.visionplus.util.database.DatabaseUtil;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;










public class TCustomerPaymentDAO
{
  private static TCustomerPaymentDAO INSTANCE;
  private final QueryUtil<TCustomerPayment> Query;
  private Connection connection;
  
  public static TCustomerPaymentDAO getInstance()
  {
    if (INSTANCE == null) {
      INSTANCE = new TCustomerPaymentDAO();
    }
    
    return INSTANCE;
  }
  
  public TCustomerPaymentDAO() {
    Query = QueryUtil.getInstance(TCustomerPayment.class);
    try {
      connection = DatabaseUtil.getInstance().openConnection();
    } catch (SQLException ex) {
      Logger.getLogger(TCustomerPaymentDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  
  int savePaymentDetail(Connection connection, TCustomerPayment customerPayment) {
    try {
      return Query.executeInsert(connection, customerPayment);
    } catch (SQLException ex) {
      Logger.getLogger(TCustomerPaymentDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return 0;
  }
}
