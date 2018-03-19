/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.check_In;

import com.sv.visionplus.transaction.customer_payment.*;
import com.sv.visionplus.transaction.customer_payment.model.CustomerPayment;
import com.sv.visionplus.transaction.customer_payment.model.CustomerPaymentMix;
import com.sv.visionplus.transaction.customer_payment.model.TInvoice;
import com.sv.visionplus.util.database.DatabaseUtil;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import visionplusx.logFile.LogFileDAO;

/**
 *
 * @author KAZA
 */
public class CustomerPaymentDAO {

    private static CustomerPaymentDAO INSTANCE;
    private final QueryUtil<CustomerPayment> Query;
    private Connection connection;

    public static CustomerPaymentDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CustomerPaymentDAO();
        }

        return INSTANCE;
    }

    public CustomerPaymentDAO() {
        Query = QueryUtil.getInstance(CustomerPayment.class);
        try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerPaymentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public List<CustomerPayment> getPayment(Integer InvoiceNo){
            List<CustomerPayment> list=new ArrayList<>();
        try {
            list = Query.executeSelect(connection, "invoice=?", InvoiceNo);
            
        } catch (SQLException ex) {
            Logger.getLogger(CustomerPaymentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            return list;
    };
}
