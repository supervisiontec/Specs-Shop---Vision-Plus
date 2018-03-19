/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.supplier_payment;

import com.sv.visionplus.transaction.supplier_payment.model.MAccount;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KAZA
 */
class MAccountDAO {
     private static MAccountDAO INSTANCE;
    private final QueryUtil<MAccount> Query;

    public static MAccountDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new MAccountDAO();
        }

        return INSTANCE;
    }

    public MAccountDAO() {
        Query = QueryUtil.getInstance(MAccount.class);
    
    }

     int saveAccount(Connection connection, MAccount account) {
         try {
             return Query.executeInsert(connection, account);
         } catch (SQLException ex) {
             Logger.getLogger(MAccountDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
         return 0;
    }
}
