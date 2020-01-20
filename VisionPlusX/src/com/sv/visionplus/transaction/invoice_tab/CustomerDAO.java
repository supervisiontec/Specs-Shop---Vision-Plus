package com.sv.visionplus.transaction.invoice_tab;

import com.sv.visionplus.transaction.invoice_tab.dialog.customer.model.MCustomer;
import com.sv.visionplus.util.database.DatabaseUtil;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomerDAO
{
  public static CustomerDAO INSTANCE;
  private QueryUtil<MCustomer> queryUtil;
  private Connection connection;
  
  public static CustomerDAO getInstance()
  {
    if (INSTANCE == null) {
      INSTANCE = new CustomerDAO();
    }
    return INSTANCE;
  }
  
  public CustomerDAO() {
    queryUtil = QueryUtil.getInstance(MCustomer.class);
    try {
      connection = DatabaseUtil.getInstance().openConnection();
    } catch (SQLException ex) {
      Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  
  public MCustomer searchCustomer(Integer id)
  {
    MCustomer customer = new MCustomer();
    try {
      customer = (MCustomer)queryUtil.executeUniqueSelect(connection, "index_no=?", new Object[] { id });
    } catch (SQLException ex) {
      Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return customer;
  }
}
