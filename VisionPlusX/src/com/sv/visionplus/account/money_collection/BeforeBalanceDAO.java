/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.account.money_collection;

import com.sv.visionplus.account.money_collection.model.BeforeBalance;
import com.sv.visionplus.util.database.DatabaseUtil;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kasun
 */
public class BeforeBalanceDAO {

    private static BeforeBalanceDAO INSTANCE;
    private final QueryUtil<BeforeBalance> Query;
    private Connection connection;

    public static BeforeBalanceDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new BeforeBalanceDAO();
        }

        return INSTANCE;
    }

    public BeforeBalanceDAO() {
        Query = QueryUtil.getInstance(BeforeBalance.class);
        try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(BeforeBalanceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<BeforeBalance> getBeforeBalance(Date date) {
        System.out.println("date");
        System.out.println(date);
        List<BeforeBalance> list = new ArrayList<>();
        try {
            list = Query.executeSelect(connection, "date < ?", date);
        } catch (SQLException ex) {
            Logger.getLogger(BeforeBalanceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
