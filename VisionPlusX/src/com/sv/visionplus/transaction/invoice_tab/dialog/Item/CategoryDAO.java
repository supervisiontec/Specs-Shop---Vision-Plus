/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.invoice_tab.dialog.Item;

import com.sv.visionplus.stock.stock_transfer.*;
import com.sv.visionplus.stock.stock_transfer.model.MBrand;
import com.sv.visionplus.stock.stock_transfer.model.MCategory;
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
public class CategoryDAO {

    private static CategoryDAO INSTANCE;
    private final QueryUtil<MCategory> Query;
    private Connection connection;

    public static CategoryDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CategoryDAO();
        }

        return INSTANCE;
    }

    public CategoryDAO() {
        Query = QueryUtil.getInstance(MCategory.class);
        try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public List<MCategory> allCategory() {
            List<MCategory> categoryList = null;
        try {
            categoryList = Query.executeSelect(connection);
        } catch (SQLException ex) {
            Logger.getLogger(BrandDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (categoryList.size() == 0) {
            return null;
        }
        return categoryList;

    }
}