/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.account.payment_voucher;

import com.sv.visionplus.account.payment_voucher.model.MainCategory;
import com.sv.visionplus.util.database.DatabaseUtil;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KAZA
 */
public class MainCategoryDAO {

    private static MainCategoryDAO INSTANCE;
    private final QueryUtil<MainCategory> Query;
    private Connection connection;

    public static MainCategoryDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new MainCategoryDAO();
        }

        return INSTANCE;
    }

    public MainCategoryDAO() {
        Query = QueryUtil.getInstance(MainCategory.class);
        try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(MainCategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    List<MainCategory> allCategory() {
        List<MainCategory> list = new ArrayList<>();
        try {
            list = Query.executeSelect(connection);
            MainCategory category = new MainCategory();
            category.setIndexNo(0);
            category.setName("Other");
            list.add(category);
        } catch (SQLException ex) {
            Logger.getLogger(MainCategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    int saveMainCategory(Connection connection,MainCategory mainCategory) {
            int catId = 0;
        try {
            catId = Query.executeInsert(connection, mainCategory);
        } catch (SQLException ex) {
            Logger.getLogger(MainCategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return catId;
    }
}
