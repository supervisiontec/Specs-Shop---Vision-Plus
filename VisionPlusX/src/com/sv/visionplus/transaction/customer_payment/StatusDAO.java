/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.customer_payment;

import com.sv.visionplus.transaction.customer_payment.model.Status;
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
public class StatusDAO {

    private static StatusDAO INSTANCE;

    private final QueryUtil<Status> Query;
    private Connection connection;

    public static StatusDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new StatusDAO();
        }

        return INSTANCE;
    }

    public StatusDAO() {
        Query = QueryUtil.getInstance(Status.class);
        try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(StatusDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    List<Status> getStatus(Integer invoice_no) {
        List<Status> statusList = new ArrayList<>();
        try {
            statusList = Query.executeSelect(connection, "invoice=?", invoice_no);
        } catch (SQLException ex) {
            Logger.getLogger(StatusDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return statusList;
    }

    int saveStatus(Connection connection, Status status) {
        int statusId = 0;
            try {
                statusId = Query.executeInsert(connection, status);
            } catch (SQLException ex) {
                Logger.getLogger(StatusDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        return statusId;
    }
}
