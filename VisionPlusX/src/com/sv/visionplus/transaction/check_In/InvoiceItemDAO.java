/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.check_In;

import com.sv.visionplus.transaction.check_In.model.TInvoiceItem;
import com.sv.visionplus.util.database.DatabaseUtil;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KAZA
 */
public class InvoiceItemDAO {

    private static InvoiceItemDAO INSTANCE;
    private final QueryUtil<TInvoiceItem> Query;
    private Connection connection;

    public static InvoiceItemDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new InvoiceItemDAO();
        }

        return INSTANCE;
    }

    public InvoiceItemDAO() {
        Query = QueryUtil.getInstance(TInvoiceItem.class);
        try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    int searchInvoiceItem(Integer indexNo) {
        try {
            List<TInvoiceItem> list = Query.executeSelect(connection, "invoice=?", indexNo);
            return list.size();
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}
