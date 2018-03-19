/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.customer_payment;

import com.sv.visionplus.transaction.customer_payment.model.CustomerPaymentView;
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
public class CustomerPaymentViewDAO {
    
    private static CustomerPaymentViewDAO INSTANCE;

    private final QueryUtil<CustomerPaymentView> Query;
    private Connection connection;

    public static CustomerPaymentViewDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CustomerPaymentViewDAO();
        }

        return INSTANCE;
    }

    public CustomerPaymentViewDAO() {
        Query = QueryUtil.getInstance(CustomerPaymentView.class);
        try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerPaymentViewDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    List<CustomerPaymentView> searchInvoicePayment(Integer invoice_no) {
            List<CustomerPaymentView> paymentList=new ArrayList<>();
        try {
            paymentList = Query.executeSelect(connection, "invoice=?", invoice_no);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerPaymentViewDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return paymentList;
    }
}
