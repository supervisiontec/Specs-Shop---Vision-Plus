/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.grn.dialog.supplier;

import com.sv.visionplus.transaction.grn.dialog.supplier.model.MSupplier;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author KAZA
 */
public class SupplierDAO {

    public static SupplierDAO INSTANCE;
    private QueryUtil<MSupplier> queryUtil;

    public static SupplierDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SupplierDAO();
        }
        return INSTANCE;
    }

    public SupplierDAO() {
        this.queryUtil = QueryUtil.getInstance(MSupplier.class);
    }

    List<MSupplier> allSupplier(Connection connection) throws SQLException {
        return queryUtil.executeSelect(connection);
    }

    int addSupplier(Connection connection, MSupplier supplier) throws SQLException {
        MSupplier isSupplier = queryUtil.executeUniqueSelect(connection, "contact_name=? or email=? or contact_no=?", supplier.getContactName(), supplier.getEmail(), supplier.getContactNo());
        if (isSupplier != null) {
            return -1;
        }
        int res = queryUtil.executeInsert(connection, supplier);
        if (res > 0) {
            isSupplier = queryUtil.executeUniqueSelect(connection, "contact_name=? or email=? or contact_no=?", supplier.getContactName(), supplier.getEmail(), supplier.getContactNo());
        }
        return isSupplier.getIndexNo();
    }

    List<MSupplier> searchSupplier(Connection connection, MSupplier supplier) throws SQLException {
        return queryUtil.executeSelect(connection, "name LIKE ? AND contact_no LIKE ? AND contact_name LIKE ? AND address LIKE ? AND email LIKE ? " ,"%"+supplier.getName()+"%","%"+supplier.getContactNo()+"%","%"+supplier.getContactName()+"%","%"+supplier.getAddress()+"%","%"+supplier.getEmail()+"%");

//        return queryUtil.executeSelect(connection, "name LIKE ? AND contact_name LIKE ? AND contact_no LIKE ? AND address LIKE ? AND email LIKE ?  ", "'%" + supplier.getName() + "%'", "'%" + supplier.getContactName()+"%'", "'%" + supplier.getContactNo()+"%'", "'%" + supplier.getAddress(), "%'" + supplier.getEmail()+"%'");
//        return queryUtil.executeSelect(connection, "name LIKE ? OR nic LIKE ? OR address LIKE ? OR contact_no LIKE ?", text, text, text, text);
    }

}
