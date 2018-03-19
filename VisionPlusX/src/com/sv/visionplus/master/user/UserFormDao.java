/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.master.user;

import com.sv.visionplus.base.master.AbstractMasterFormDAO;
import com.sv.visionplus.master.customer.model.MCustomer;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import visionplusx.model.MUser;

/**
 *
 * @author KAZA
 */
public class UserFormDao extends AbstractMasterFormDAO<MUser> {

    private QueryUtil<MUser> queryUtil;

    public UserFormDao() {
        this.queryUtil = QueryUtil.getInstance(MUser.class);
    }

    @Override
    public void save(Connection connection, MUser user) throws SQLException {
        queryUtil.executeInsert(connection, user);
    }

    @Override
    public void update(Connection connection, MUser user) throws SQLException {
        queryUtil.executeUpdate(connection, user, "index_No=?", user.getIndexNo());
    }

    @Override
    public void delete(Connection connection, MUser user) throws SQLException {
        queryUtil.executeDelete(connection, "index_no=?", user.getIndexNo());
    }

    @Override
    public List<MUser> getSearchResult(Connection connection, String text) throws SQLException {
        text = "%" + text + "%";
        return queryUtil.executeSelect(connection, "name LIKE ? OR user_name LIKE ? OR password LIKE ? OR type LIKE ?", text, text, text, text);
    }

}
