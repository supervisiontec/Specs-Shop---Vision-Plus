/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.supplier_payment;

import com.sv.visionplus.transaction.grn.model.TGrn;
import com.sv.visionplus.transaction.grn.model.GrnMix;
import com.sv.visionplus.transaction.supplier_payment.model.MSupplier;
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
public class SupplierDAO {
    private static SupplierDAO INSTANCE;
    private final QueryUtil<MSupplier> Query;
    private Connection connection;

    public static SupplierDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SupplierDAO();
        }

        return INSTANCE;
    }

    public SupplierDAO() {
        Query = QueryUtil.getInstance(MSupplier.class);
        try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(SupplierDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    MSupplier getSupplier(int supplierId) {
        try {
            return Query.executeUniqueSelect(connection, "index_no = ?", supplierId);
        } catch (SQLException ex) {
            Logger.getLogger(SupplierDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
   
}
