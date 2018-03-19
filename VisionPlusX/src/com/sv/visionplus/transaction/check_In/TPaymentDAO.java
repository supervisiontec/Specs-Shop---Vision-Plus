/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.check_In;

import com.sv.visionplus.transaction.customer_payment.*;
import com.sv.visionplus.transaction.customer_payment.model.MBankBranch;
import com.sv.visionplus.transaction.customer_payment.model.TPayment;
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
public class TPaymentDAO {

    private static TPaymentDAO INSTANCE;
    private final QueryUtil<TPayment> Query;
    Connection connection=null;

    public static TPaymentDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new TPaymentDAO();
        }

        return INSTANCE;
    }

    public TPaymentDAO() {
        
            Query = QueryUtil.getInstance(TPayment.class);
        try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(TPaymentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public TPayment getPayment( Integer paymentId) {
//        TPayment payment = new TPayment();
        try {
            return Query.executeUniqueSelect(connection, "index_no=?", paymentId);
        } catch (SQLException ex) {
            Logger.getLogger(TPaymentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
