/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.stock.stock_transfer;

import com.sv.visionplus.stock.stock_transfer.model.StockTransferModelMix;
import com.sv.visionplus.stock.stock_transfer.model.TStockLedger;
import com.sv.visionplus.util.database.DatabaseUtil;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import visionplusx.logFile.LogFileDAO;

/**
 *
 * @author KAZA
 */
public class StockTransferDAO {

    private static StockTransferDAO INSTANCE;
    private final QueryUtil<StockTransferModelMix> Query;
    private Connection connection;

    public static StockTransferDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new StockTransferDAO();
        }

        return INSTANCE;
    }

    public StockTransferDAO() {
        Query = QueryUtil.getInstance(StockTransferModelMix.class);
        try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(StockTransferDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    int makeStockTransfer(StockTransferModelMix mix) throws SQLException {
        try {
            connection.setAutoCommit(false);
            int count = StockLedgerDAO.getInstance().saveStock(connection, mix.getLedger());
            if (count > 0) {
                mix.getLogFile().setRemarks(count/2+"Item Transfer");
                int logId = LogFileDAO.getInstance().saveLog(connection, mix.getLogFile());
                if (logId > 0) {
                    connection.commit();
                    return count;
                }
            }
            connection.rollback();
            return 0;

        } finally {
            connection.setAutoCommit(true);
        }
    }

}
