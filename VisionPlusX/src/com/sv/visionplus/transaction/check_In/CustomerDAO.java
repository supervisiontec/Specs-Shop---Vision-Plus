/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.check_In;

import com.sv.visionplus.transaction.check_In.model.MCustomer;
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
public class CustomerDAO {
    private static CustomerDAO INSTANCE;
    private final QueryUtil<MCustomer> Query;
    private Connection connection;

    public static CustomerDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CustomerDAO();
        }

        return INSTANCE;
    }

    public CustomerDAO() {
        Query = QueryUtil.getInstance(MCustomer.class);
        try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    MCustomer searchCustomer(Integer customer) {
            MCustomer selectCustomer = new MCustomer();
        try {
            selectCustomer = Query.executeUniqueSelect(connection, "index_no=?", customer);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return selectCustomer;
    }
}
