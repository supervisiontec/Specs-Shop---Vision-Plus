/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.invoice.dialog.Item;

import com.sv.visionplus.stock.stock_transfer.*;
import com.sv.visionplus.stock.stock_transfer.model.Store;
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
public class StoreDAO {

    private static StoreDAO INSTANCE;
    private final QueryUtil<Store> storeQuery;
            private Connection connection;

    public static StoreDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new StoreDAO();
        }

        return INSTANCE;
    }

    public StoreDAO() {
        storeQuery = QueryUtil.getInstance(Store.class);
        try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(StoreDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public List<Store> allStore() {
        List<Store> allStore = null;
        try {
            allStore = storeQuery.executeSelect(connection);
        } catch (SQLException ex) {
            Logger.getLogger(StoreDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (allStore.size() == 0) {
            return null;
        }
        return allStore;
    }

    
}
