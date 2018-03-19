/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.invoice.dialog.Item;

import com.sv.visionplus.stock.stock_transfer.*;
import com.sv.visionplus.stock.stock_transfer.model.MBrand;
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
public class BrandDAO {

    private static BrandDAO INSTANCE;
    private final QueryUtil<MBrand> Query;
    private Connection connection;

    public static BrandDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new BrandDAO();
        }

        return INSTANCE;
    }

    public BrandDAO() {
        Query = QueryUtil.getInstance(MBrand.class);
        try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(BrandDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public List<MBrand> allBrand() {
            List<MBrand> brandList = null;
        try {
            brandList = Query.executeSelect(connection);
        } catch (SQLException ex) {
            Logger.getLogger(BrandDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (brandList.size() == 0) {
            return null;
        }
        return brandList;

    }

}
