/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.account.payment_voucher;

import com.sv.visionplus.account.payment_voucher.model.PaymentVoucherMix;
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
public class PaymentVoucherDAO {

    private static PaymentVoucherDAO INSTANCE;
    private final QueryUtil<PaymentVoucherMix> Query;
    private Connection connection;

    public static PaymentVoucherDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PaymentVoucherDAO();
        }

        return INSTANCE;
    }

    public PaymentVoucherDAO() {
        Query = QueryUtil.getInstance(PaymentVoucherMix.class);
        try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(PaymentVoucherDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    int savePaymentVoucher(PaymentVoucherMix mix) {
        try {
            connection.setAutoCommit(false);
            int mainCategoryId = 0;
            if (mix.getMainCategory().getIndexNo() > 0) {
                mainCategoryId = mix.getMainCategory().getIndexNo();
            } else {
                mainCategoryId = MainCategoryDAO.getInstance().saveMainCategory(connection, mix.getMainCategory());
            }
            if (mainCategoryId > 0) {
                int subCategoryId;
                if (mix.getSubCategory().getIndexNo() > 0) {
                    subCategoryId = mix.getSubCategory().getIndexNo();
                } else {
                    subCategoryId = SubCategoryDAO.getInstance().saveSubCategory(connection, mix.getSubCategory());
                }
                if (subCategoryId > 0) {
                    mix.getAccount().setMainCategory(mainCategoryId);
                    mix.getAccount().setSubCategory(subCategoryId);
                    int accId = MAccountDAO.getInstance().saveAccount(connection, mix.getAccount());
                    if (accId > 0) {
                        mix.getAccountTransaction().setAccount(accId);
                        int transactionId = AccountTransactionDAO.getInstance().saveTransaction(connection, mix.getAccountTransaction());
                        if (transactionId > 0) {
                            connection.commit();
                            return transactionId;
                        } else {
                            connection.rollback();
                            return -1;
                        }
                    } else {
                        connection.rollback();
                        return -1;
                    }
                } else {
                    connection.rollback();
                    return -1;
                }
            } else {
                connection.rollback();
                return -1;
            }

        } catch (SQLException ex) {
            Logger.getLogger(PaymentVoucherDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(PaymentVoucherDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }
}
