/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.master.supplier;

import com.sv.visionplus.base.master.AbstractMasterFormDAO;
import com.sv.visionplus.base.master.AbstractMasterFormGUI;
import com.sv.visionplus.master.supplier.model.MSupplier;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Date : Aug 23, 2016 Time : 11:18:07 PM
 *
 * @copyright : INCOSYZ
 * @author Nidura Prageeth
 */
public class SupplierFormDAO extends AbstractMasterFormDAO<MSupplier> {

    private QueryUtil<MSupplier> queryUtil;

    public SupplierFormDAO() {
        this.queryUtil = QueryUtil.getInstance(MSupplier.class);
    }

    @Override
    public void save(Connection connection, MSupplier object) throws SQLException {
        queryUtil.executeInsert(connection, object);
    }

    @Override
    public void update(Connection connection, MSupplier object) throws SQLException {
        queryUtil.executeUpdate(connection, object, "index_no=?", object.getIndexNo());
    }

    @Override
    public void delete(Connection connection, MSupplier object) throws SQLException {
        queryUtil.executeDelete(connection, "index_no=?", object.getIndexNo());
    }

    @Override
    public List<MSupplier> getSearchResult(Connection connection, String text) throws SQLException {
        text = "%" + text + "%";
        return queryUtil.executeSelect(connection, "name LIKE ? OR contact_no LIKE ? OR email LIKE ?", text, text, text);
    }

}
