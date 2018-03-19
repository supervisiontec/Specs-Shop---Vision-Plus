package com.sv.visionplus.messanger;

import com.sv.visionplus.transaction.invoice.dialog.customer.model.MCustomer;
import com.sv.visionplus.util.database.DatabaseUtil;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
  
  public List<MCustomer> getAllCustomer()
  {
    List<MCustomer> customer = new ArrayList<>();
    try {
      customer = queryUtil.executeSelect(connection);
    } catch (SQLException ex) {
      Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return customer;
  }
}
