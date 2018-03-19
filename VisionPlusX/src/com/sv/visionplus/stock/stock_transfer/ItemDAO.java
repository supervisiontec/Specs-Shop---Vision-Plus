/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.stock.stock_transfer;

import com.sv.visionplus.stock.stock_transfer.model.MItem;
import com.sv.visionplus.stock.stock_transfer.model.TStockLedger;
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
    private final QueryUtil<MItem> Query;
    private Connection connection;

    public static ItemDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ItemDAO();
        }

        return INSTANCE;
    }

    public ItemDAO() {
        Query = QueryUtil.getInstance(MItem.class);
        try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public MItem searchItem(int itemId) {
        MItem item = null;
        try {
            item = Query.executeUniqueSelect(connection, "index_no= ?", itemId);
        } catch (SQLException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return item;

    }

}
