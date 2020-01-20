package com.sv.visionplus.transaction.invoice;

import com.sv.visionplus.transaction.invoice.model.AccountTransaction;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            System.out.println(accountTransaction.getAccount());
            System.out.println(accountTransaction.getCredit());
            System.out.println(accountTransaction.getDate());
            System.out.println(accountTransaction.getDebit());
            System.out.println(accountTransaction.getDescription());
            System.out.println(accountTransaction.getIndex_no());
            return Query.executeInsert(connection, accountTransaction);
        } catch (SQLException ex) {
            Logger.getLogger(AccountTransactionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}
