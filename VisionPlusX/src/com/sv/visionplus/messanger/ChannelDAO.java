package com.sv.visionplus.messanger;

import com.sv.visionplus.channel.channel_register.model.ChannelModel;
import com.sv.visionplus.transaction.invoice.dialog.customer.model.MCustomer;
import com.sv.visionplus.util.database.DatabaseUtil;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ChannelDAO
{
  public static ChannelDAO INSTANCE;
  private QueryUtil<ChannelModel> queryUtil;
  private Connection connection;
  
  public static ChannelDAO getInstance()
  {
    if (INSTANCE == null) {
      INSTANCE = new ChannelDAO();
    }
    return INSTANCE;
  }
  
  public ChannelDAO() {
    queryUtil = QueryUtil.getInstance(ChannelModel.class);
    try {
      connection = DatabaseUtil.getInstance().openConnection();
    } catch (SQLException ex) {
      Logger.getLogger(ChannelDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  
  public List<ChannelModel> getAllChannel()
  {
    List<ChannelModel> list = new ArrayList<>();
    try {
      list= queryUtil.executeSelect(connection);
    } catch (SQLException ex) {
      Logger.getLogger(ChannelDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return list;
  }
}
