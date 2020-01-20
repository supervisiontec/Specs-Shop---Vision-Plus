/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.invoice_tab;

import com.sv.visionplus.transaction.invoice_tab.model.MNumberList;
import com.sv.visionplus.util.database.DatabaseUtil;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Supervision
 */
public class NumberListDAO {

    private static NumberListDAO INSTANCE;
    private final QueryUtil<MNumberList> Query;
    private Connection connection;

    public static NumberListDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new NumberListDAO();
        }

        return INSTANCE;
    }

    public NumberListDAO() {
        Query = QueryUtil.getInstance(MNumberList.class);
        try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(NumberListDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public MNumberList searchLastNumber(Integer itemId) {
        MNumberList lastNo = new MNumberList();
        try {
            lastNo = (MNumberList) Query.executeUniqueSelect(connection, "index_no=?", new Object[]{itemId});
        } catch (SQLException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lastNo;
    }
    public int saveNewNumber(Connection connection, MNumberList numberList) {
        int indexNo = 0;
        try {
            indexNo = Query.executeUpdate(connection, numberList, "index_no=?",numberList.getIndexNo() );
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return indexNo;
    }
}
