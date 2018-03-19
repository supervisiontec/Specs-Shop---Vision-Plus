/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.master.customer;

import com.sv.visionplus.base.master.AbstractMasterFormDAO;
import com.sv.visionplus.master.customer.model.MCustomer;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Mohan
 */
public class CustomerFormDAO extends AbstractMasterFormDAO<MCustomer> {

    private QueryUtil<MCustomer> queryUtil;

    public CustomerFormDAO() {
        this.queryUtil = QueryUtil.getInstance(MCustomer.class);
    }

    @Override
    public void save(Connection connection, MCustomer object) throws SQLException {
        queryUtil.executeInsert(connection, object);
    }

    @Override
    public void update(Connection connection, MCustomer object) throws SQLException {
        queryUtil.executeUpdate(connection, object, "index_no=?", object.getIndexNo());
    }

    @Override
    public void delete(Connection connection, MCustomer object) throws SQLException {
        queryUtil.executeDelete(connection, "index_no=?", object.getIndexNo());
    }

    @Override
    public List<MCustomer> getSearchResult(Connection connection, String text) throws SQLException {
        text = "%" + text + "%";
        return queryUtil.executeSelect(connection, "name LIKE ? OR nic LIKE ? OR address LIKE ? OR contact_no LIKE ?", text, text, text, text);
    }

}
