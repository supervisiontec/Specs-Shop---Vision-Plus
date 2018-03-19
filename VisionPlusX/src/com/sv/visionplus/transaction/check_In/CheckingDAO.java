/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.check_In;

import com.sv.visionplus.transaction.check_In.model.TInvoice;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author KAZA
 */
public class CheckingDAO {

    public static CheckingDAO INSTANCE;
    private QueryUtil<TInvoice> queryUtil;

    public static CheckingDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CheckingDAO();
        }
        return INSTANCE;
    }

    public CheckingDAO() {
        this.queryUtil = QueryUtil.getInstance(TInvoice.class);
    }

    public int update(Connection connection, TInvoice object) throws SQLException {
        return queryUtil.executeUpdate(connection, object, "index_no=?", object.getIndexNo());
    }
    
    public TInvoice select(Connection connection, Integer indexNo) throws SQLException {
        return queryUtil.executeSelect(connection).get(0);
    }
}
