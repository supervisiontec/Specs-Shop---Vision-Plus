/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.grn.dialog.supplier;

import com.sv.visionplus.transaction.grn.dialog.supplier.model.MSupplier;
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
public class SupplierService {

    public static SupplierService INSTANCE;

    public static SupplierService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SupplierService();
        }
        return INSTANCE;
    }

    public List<MSupplier> allSupplier() {
        List<MSupplier> allSupplier = new ArrayList<>();
        try {
            Connection connection = DatabaseUtil.getInstance().openConnection();
            allSupplier = SupplierDAO.getInstance().allSupplier(connection);
        } catch (SQLException ex) {
            Logger.getLogger(SupplierService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return allSupplier;
    }

    public int saveSupplier(MSupplier supplier) throws SQLException {
        Connection connection = null;
        try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(SupplierService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return SupplierDAO.getInstance().addSupplier(connection, supplier);
    }

    public List<MSupplier> searchSupplier(MSupplier supplier) throws SQLException {
        Connection connection = null;
        try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(SupplierService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return SupplierDAO.getInstance().searchSupplier(connection, supplier);

    }

}
