package com.sv.visionplus.transaction.invoice_tab.dialog.customer;

import com.sv.visionplus.transaction.invoice_tab.dialog.customer.model.MCustomer;
import com.sv.visionplus.util.database.DatabaseUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomerService
{
  public static CustomerService INSTANCE;
  
  public CustomerService() {}
  
  public static CustomerService getInstance()
  {
    if (INSTANCE == null) {
      INSTANCE = new CustomerService();
    }
    return INSTANCE;
  }
  
  public List<MCustomer> allCustomer() {
    List<MCustomer> allCustomer = null;
    try {
      Connection connection = DatabaseUtil.getInstance().openConnection();
      allCustomer = CustomerDAO.getInstance().allCustomer(connection);
    } catch (SQLException ex) {
      Logger.getLogger(CustomerService.class.getName()).log(Level.SEVERE, null, ex);
    }
    return allCustomer;
  }
  
  public int saveCustomer(MCustomer customer)
  {
    try {
      Connection connection = DatabaseUtil.getInstance().openConnection();
      return CustomerDAO.getInstance().saveCustomer(connection, customer);
    } catch (SQLException ex) {
      Logger.getLogger(CustomerService.class.getName()).log(Level.SEVERE, null, ex);
    }
    return -1;
  }
  
  public List<MCustomer> searchCustomer(MCustomer customer)
  {
    try
    {
      Connection connection = DatabaseUtil.getInstance().openConnection();
      return CustomerDAO.getInstance().searchCustomer(connection, customer);
    } catch (SQLException ex) {
      Logger.getLogger(CustomerService.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
  }
}
