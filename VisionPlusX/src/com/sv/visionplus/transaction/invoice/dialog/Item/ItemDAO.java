/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.invoice.dialog.Item;

import com.sv.visionplus.transaction.invoice.model.MItem;
import com.sv.visionplus.util.database.DatabaseUtil;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KAZA
 */
public class ItemDAO {
    private static ItemDAO INSTANCE;
    private final QueryUtil<SearchItemMixModel> Query;
    private Connection connection;

    public static ItemDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ItemDAO();
        }

        return INSTANCE;
    }

    public ItemDAO() {
        Query = QueryUtil.getInstance(SearchItemMixModel.class);
        try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public List<SearchItemMixModel> allItem(){
            List<SearchItemMixModel> items = null;
        try {
            items = Query.executeSelect(connection);
        } catch (SQLException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        return items;
    
    }

    List<SearchItemMixModel> searchInvoice(String code, String name) {
         List<SearchItemMixModel> items = null;
        try {
            items = Query.executeSelect(connection, "code LIKE ? AND name LIKE ? ", "%"+code+"%","%"+name+"%");
        } catch (SQLException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        return items;
    }

    List<SearchItemMixModel> searchInvoice(int i) {
         List<SearchItemMixModel> items = null;
        try {
            items = Query.executeSelect(connection, " isstock_item=?", i);
        } catch (SQLException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        return items;
    }

   
}
