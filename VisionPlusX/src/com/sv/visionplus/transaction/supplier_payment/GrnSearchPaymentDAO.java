/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.supplier_payment;

import com.sv.visionplus.transaction.supplier_payment.model.GrnSearchPayment;
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
public class GrnSearchPaymentDAO {
    private static GrnSearchPaymentDAO INSTANCE;

    private final QueryUtil<GrnSearchPayment> Query;
    private Connection connection;

    public static GrnSearchPaymentDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new GrnSearchPaymentDAO();
        }

        return INSTANCE;
    }

    public GrnSearchPaymentDAO() {
        Query = QueryUtil.getInstance(GrnSearchPayment.class);
        try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(GrnSearchPaymentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<GrnSearchPayment> searchPayment(int grnId) {
            List<GrnSearchPayment> list=new ArrayList<>();
        try {
            list = Query.executeSelect(connection, "grn_no=?", grnId);
        } catch (SQLException ex) {
            Logger.getLogger(GrnSearchPaymentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

   
}
