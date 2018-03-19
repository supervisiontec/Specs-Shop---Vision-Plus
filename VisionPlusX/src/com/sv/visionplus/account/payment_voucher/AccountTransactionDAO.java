/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.account.payment_voucher;

import com.sv.visionplus.account.payment_voucher.model.TAccountTransaction;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KAZA
 */
class AccountTransactionDAO {
     private static AccountTransactionDAO INSTANCE;
    private final QueryUtil<TAccountTransaction> Query;

    public static AccountTransactionDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new AccountTransactionDAO();
        }

        return INSTANCE;
    }

    public AccountTransactionDAO() {
        Query = QueryUtil.getInstance(TAccountTransaction.class);
    
    }

     int saveTransaction(Connection connection, TAccountTransaction accountTransaction) {
             int transactionId = 0;
         try {
             transactionId = Query.executeInsert(connection, accountTransaction);
         } catch (SQLException ex) {
             Logger.getLogger(AccountTransactionDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
         return transactionId;
    }

    

}
