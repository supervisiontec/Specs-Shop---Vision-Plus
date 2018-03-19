package com.sv.visionplus.transaction.invoice;

import com.sv.visionplus.transaction.invoice.model.TPayment;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;









public class TPaymentDAO
{
  private static TPaymentDAO INSTANCE;
  private final QueryUtil<TPayment> Query;
  
  public static TPaymentDAO getInstance()
  {
    if (INSTANCE == null) {
      INSTANCE = new TPaymentDAO();
    }
    
    return INSTANCE;
  }
  
  public TPaymentDAO() {
    Query = QueryUtil.getInstance(TPayment.class);
  }
  
  int savePayment(Connection connection, TPayment payment) {
    try {
      int paymentId = Query.executeInsert(connection, payment);
      if (paymentId > 0) {
        return paymentId;
      }
    } catch (SQLException ex) {
      Logger.getLogger(TPaymentDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return -1;
  }
}
