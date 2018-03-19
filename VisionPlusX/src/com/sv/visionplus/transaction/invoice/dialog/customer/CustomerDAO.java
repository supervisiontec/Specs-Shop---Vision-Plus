package com.sv.visionplus.transaction.invoice.dialog.customer;

import com.sv.visionplus.transaction.invoice.dialog.customer.model.MCustomer;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;









public class CustomerDAO
{
  public static CustomerDAO INSTANCE;
  private QueryUtil<MCustomer> queryUtil;
  
  public static CustomerDAO getInstance()
  {
    if (INSTANCE == null) {
      INSTANCE = new CustomerDAO();
    }
    return INSTANCE;
  }
  
  public CustomerDAO() {
    queryUtil = QueryUtil.getInstance(MCustomer.class);
  }
  
  List<MCustomer> allCustomer(Connection connection) throws SQLException {
    return queryUtil.executeSelect(connection);
  }
  
  int saveCustomer(Connection connection, MCustomer customer) throws SQLException {
    return queryUtil.executeInsert(connection, customer);
  }
  
  List<MCustomer> searchCustomer(Connection connection, MCustomer customer) throws SQLException {
    return queryUtil.executeSelect(connection, "name LIKE ? AND nic LIKE ? AND contact_no LIKE ? AND address LIKE ? ", new Object[] { "%" + customer.getName() + "%", "%" + customer.getNic() + "%", "%" + customer.getContactNo() + "%", "%" + customer.getAddress() + "%" });
  }
}
