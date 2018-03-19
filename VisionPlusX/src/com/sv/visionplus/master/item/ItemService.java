package com.sv.visionplus.master.item;

import com.sv.visionplus.channel.channel_register.*;
import com.sv.visionplus.channel.channel_register.model.ChannelModel;
import com.sv.visionplus.channel.channel_register.model.ChannelModelMix;
import com.sv.visionplus.master.item.model.MItem;
import com.sv.visionplus.master.item.model.MItemMix;
import com.sv.visionplus.transaction.grn.dialog.item.model.ItemMix;
import com.sv.visionplus.util.database.DatabaseUtil;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ItemService
{
  private static ItemService INSTANCE;
  private final QueryUtil<MItem> Query;
  private Connection connection;
  
  public static ItemService getInstance()
  {
    if (INSTANCE == null) {
      INSTANCE = new ItemService();
    }
    
    return INSTANCE;
  }
  
  public ItemService() {
    Query = QueryUtil.getInstance(MItem.class);
  }
  
  int saveItem(Connection connection, MItemMix mix) {
      MItem item = new MItem();
    item.setBrand(mix.getBrand());
    item.setCategory(mix.getCategory());
    item.setCode(mix.getCode());
    item.setName(mix.getName());
    item.setCostPrice(mix.getCostPrice());
//    item.setIndexNo(mix.getItem().getIndexNo());
    item.setIsstockItem(mix.getIsstockItem());
    item.setReorderQty(mix.getReorderQty());
    item.setSalePrice(mix.getSalePrice());
    try {
      return Query.executeInsert(connection, item);
    } catch (SQLException ex) {
      Logger.getLogger(ItemService.class.getName()).log(Level.SEVERE, null, ex);
    }
    return 0;
  }
  
//  int updateItem(Connection connection, ChannelModelMix mix) {
//    ChannelModel item = new ChannelModel();
//    item.setAmount(mix.getAmount());
//    item.setChannel_date(mix.getChannelDate());
//    item.setChannel_id(mix.getChannelId());
//    item.setDate(mix.getDate());
//    item.setDoctor_id(mix.getDoctorId());
//    item.setIndex_no(mix.getIndexNo());
//    item.setTime(mix.getTime());
//    item.setPatient_name(mix.getPatientName());
//    item.setMobile(mix.getMobile());
//    try
//    {
//      return Query.executeUpdate(connection, item, "index_no=?", new Object[] { item.getIndex_no() });
//    } catch (SQLException ex) {
//      Logger.getLogger(ItemService.class.getName()).log(Level.SEVERE, null, ex);
//    }
//    return 0;
//  }
//  
//  int deleteItem(Connection connection, ChannelModelMix mix) {
//    ChannelModel item = new ChannelModel();
//    item.setAmount(mix.getAmount());
//    item.setChannel_date(mix.getChannelDate());
//    item.setChannel_id(mix.getChannelId());
//    item.setDate(mix.getDate());
//    item.setDoctor_id(mix.getDoctorId());
//    item.setIndex_no(mix.getIndexNo());
//    item.setTime(mix.getTime());
//    try
//    {
//      return Query.executeDelete(connection, "index_no=?", new Object[] { item.getIndex_no() });
//    } catch (SQLException ex) {
//      Logger.getLogger(ItemService.class.getName()).log(Level.SEVERE, null, ex);
//    }
//    return 0;
//  }
//  
//  List<ChannelModel> searchItem(Connection connection, String text) {
//    text = "%" + text + "%";
//    try {
//      List<ChannelModel> list = Query.executeSelect(connection, "channel_date LIKE ? OR amount LIKE ? ", new Object[] { text,text });
//      System.out.println(list.size() + " size1111");
//      return list;
//    } catch (SQLException ex) {
//      Logger.getLogger(ItemService.class.getName()).log(Level.SEVERE, null, ex);
//    }
//    return null;
//  }
//  
//  List<ChannelModel> searchChannel(String formatDate)
//  {
//    List<ChannelModel> list = new ArrayList();
//    try {
//      Connection connection = DatabaseUtil.getInstance().openConnection();
//      list = Query.executeSelect(connection, "channel_date=?", new Object[] { formatDate });
//        System.out.println(list.size()+" size2");
//    } catch (SQLException ex) {
//      Logger.getLogger(ItemService.class.getName()).log(Level.SEVERE, null, ex);
//    }
//    return list;
//  }
}
