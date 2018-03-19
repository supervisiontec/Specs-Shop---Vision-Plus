/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.account.payment_voucher;

import com.sv.visionplus.account.payment_voucher.model.SubCategory;
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
public class SubCategoryDAO {

    private static SubCategoryDAO INSTANCE;
    private final QueryUtil<SubCategory> Query;
    private Connection connection;

    public static SubCategoryDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SubCategoryDAO();
        }

        return INSTANCE;
    }

    public SubCategoryDAO() {
        Query = QueryUtil.getInstance(SubCategory.class);
        try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(SubCategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    List<SubCategory> allCategory() {
        List<SubCategory> list = new ArrayList<>();
        try {
            list = Query.executeSelect(connection);
            //add Other value
            SubCategory category = new SubCategory();
            category.setIndexNo(0);
            category.setName("Other");
            list.add(category);
            
        } catch (SQLException ex) {
            Logger.getLogger(SubCategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    int saveSubCategory(Connection connection,SubCategory subCategory) {
            int catId = 0;
        try {
            catId = Query.executeInsert(connection, subCategory);
        } catch (SQLException ex) {
            Logger.getLogger(SubCategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return catId;
    }

   
}
