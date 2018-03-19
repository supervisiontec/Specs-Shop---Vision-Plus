/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.stock.stock_transfer;

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
public class StockLedgerDAO {

    private static StockLedgerDAO INSTANCE;
    private final QueryUtil<TStockLedger> storeQuery;
    private Connection connection;

    public static StockLedgerDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new StockLedgerDAO();
        }

        return INSTANCE;
    }

    public StockLedgerDAO() {
        storeQuery = QueryUtil.getInstance(TStockLedger.class);
        try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(StockLedgerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public List<TStockLedger> searchItem(int id) {
        List<TStockLedger> selectList = null;
        try {
            selectList = storeQuery.executeSelect(connection, "store=?", id);
        } catch (SQLException ex) {
            Logger.getLogger(StockLedgerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (selectList.size() == 0) {
            return null;
        }
        return selectList;

    }

    public boolean stockTransfer(TStockLedger ledger) throws SQLException {

        try {

            Integer res = storeQuery.executeInsert(connection, ledger);
            if (res > 0) {
                ledger.setQty((ledger.getQty() - ledger.getQty()) - ledger.getQty());
                Integer res2 = storeQuery.executeInsert(connection, ledger);
                if (res2 > 0) {
                    return true;
                } else {
                    connection.rollback();
                    return false;
                }
            } else {
                connection.rollback();
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(StockLedgerDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            connection.setAutoCommit(true);
        }
        return false;

    }

    public int saveStock(Connection connection, List<TStockLedger> ledger) {
        int count = 0;
        try {
            for (TStockLedger ledger1 : ledger) {

                int indexNo = storeQuery.executeInsert(connection, ledger1);
                if (indexNo>0) {
                    count+=1;
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(StockLedgerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (count==ledger.size()) {
            return count;
        }
        return 0;
    }

}
