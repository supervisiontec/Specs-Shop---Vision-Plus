/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.stock.stock_adjustment;

import com.sv.visionplus.stock.stock_adjustment.model.TStockLedger;
import com.sv.visionplus.transaction.invoice.StockLedgerDAO;
import com.sv.visionplus.util.database.DatabaseUtil;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KAZA
 */
public class StockAdjustmentDAO {

    private static StockLedgerDAO INSTANCE;
    private final QueryUtil<TStockLedger> Query;
    
    private Connection connection;

    public static StockLedgerDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new StockLedgerDAO();
        }

        return INSTANCE;
    }

    public StockAdjustmentDAO() {
        Query = QueryUtil.getInstance(TStockLedger.class);
        try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(StockAdjustmentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public int saveStockAdjustment(TStockLedger ledger) {
        try {
           return Query.executeInsert(connection, ledger);
        } catch (SQLException ex) {
            Logger.getLogger(StockAdjustmentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
}
