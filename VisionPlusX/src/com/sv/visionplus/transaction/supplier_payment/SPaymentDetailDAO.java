/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.supplier_payment;

import com.sv.visionplus.transaction.supplier_payment.model.SupplierPayment;
import com.sv.visionplus.transaction.supplier_payment.model.TPayment;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KAZA
 */
public class SPaymentDetailDAO {

    private static SPaymentDetailDAO INSTANCE;
    private final QueryUtil<SupplierPayment> Query;

    public static SPaymentDetailDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SPaymentDetailDAO();
        }

        return INSTANCE;
    }

    public SPaymentDetailDAO() {
        Query = QueryUtil.getInstance(SupplierPayment.class);
    }

    int savePayment(Connection connection, SupplierPayment payment) {
        try {
            int paymentId = Query.executeInsert(connection, payment);
            if (paymentId > 0) {
                return paymentId;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SPaymentDetailDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
}
