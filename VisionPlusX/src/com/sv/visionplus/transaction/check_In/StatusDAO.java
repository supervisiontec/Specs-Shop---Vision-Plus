/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.check_In;

import com.sv.visionplus.transaction.check_In.model.Status;
import com.sv.visionplus.transaction.check_In.model.TInvoice;
import com.sv.visionplus.transaction.invoice.model.MBankBranch;
import com.sv.visionplus.transaction.invoice.dialog.Invoice_Payment.BankBranchDAO;
import com.sv.visionplus.util.database.DatabaseUtil;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KAZA
 */
public class StatusDAO {

    private static StatusDAO INSTANCE;
    private final QueryUtil<Status> Query;

    public static StatusDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new StatusDAO();
        }

        return INSTANCE;
    }

    public StatusDAO() {
        Query = QueryUtil.getInstance(Status.class);
       

    }

    int addStatus(Connection connection,TInvoice invoice) {
        int statusId = 0;
        Status status=new Status();
        status.setDate(invoice.getInvoiceDate());
        status.setInvoice(invoice.getIndexNo());
        status.setName(invoice.getStatus());
        try {
            statusId = Query.executeInsert(connection, status);
        } catch (SQLException ex) {
            Logger.getLogger(StatusDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return statusId;
    }
}
