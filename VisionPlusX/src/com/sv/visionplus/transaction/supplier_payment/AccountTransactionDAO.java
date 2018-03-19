/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.supplier_payment;

import com.sv.visionplus.transaction.supplier_payment.model.AccountTransaction;
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
    private final QueryUtil<AccountTransaction> Query;

    public static AccountTransactionDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new AccountTransactionDAO();
        }

        return INSTANCE;
    }

    public AccountTransactionDAO() {
        Query = QueryUtil.getInstance(AccountTransaction.class);
    
    }

     int saveTransaction(Connection connection, AccountTransaction accountTransaction) {
         try {
             return Query.executeInsert(connection, accountTransaction);
         } catch (SQLException ex) {
             Logger.getLogger(AccountTransactionDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
         return 0;
    }

}
