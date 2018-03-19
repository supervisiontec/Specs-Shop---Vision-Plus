/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.customer_payment;

import com.sv.visionplus.transaction.customer_payment.model.CustomerPayment;
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
public class TCustomerPaymentDAO {

    private static TCustomerPaymentDAO INSTANCE;
    private final QueryUtil<CustomerPayment> Query;
    private Connection connection;

    public static TCustomerPaymentDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new TCustomerPaymentDAO();
        }

        return INSTANCE;
    }

    public TCustomerPaymentDAO() {
        Query = QueryUtil.getInstance(CustomerPayment.class);
        try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(TCustomerPaymentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    int saveCustomerPayment(Connection connection, CustomerPayment customerPayment) {
        int id = 0;
        try {
            id = Query.executeInsert(connection, customerPayment);
        } catch (SQLException ex) {
            Logger.getLogger(TCustomerPaymentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
}
