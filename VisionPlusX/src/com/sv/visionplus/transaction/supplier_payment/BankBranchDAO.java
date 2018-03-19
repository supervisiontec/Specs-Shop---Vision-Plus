/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.supplier_payment;

import com.sv.visionplus.transaction.customer_payment.CustomerPaymentViewDAO;
import com.sv.visionplus.transaction.customer_payment.model.CustomerPaymentView;
import com.sv.visionplus.transaction.supplier_payment.model.MBankBranch;
import com.sv.visionplus.util.database.DatabaseUtil;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KAZA
 */
public class BankBranchDAO {
    private static BankBranchDAO INSTANCE;

    private final QueryUtil<MBankBranch> Query;
    private Connection connection;

    public static BankBranchDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new BankBranchDAO();
        }

        return INSTANCE;
    }

    public BankBranchDAO() {
        Query = QueryUtil.getInstance(MBankBranch.class);
        try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(BankBranchDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    List<MBankBranch> allBankBranch() {
            List<MBankBranch> list=new ArrayList<>();
        try {
            list = Query.executeSelect(connection);
        } catch (SQLException ex) {
            Logger.getLogger(BankBranchDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
