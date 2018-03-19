/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.supplier_payment;

import com.sv.visionplus.transaction.patient_history.*;
import com.sv.visionplus.transaction.supplier_payment.model.SupplierPaymentMix;
import com.sv.visionplus.util.database.DatabaseUtil;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import visionplusx.logFile.LogFileDAO;
import visionplusx.logFile.LogFileModel;

/**
 *
 * @author KAZA
 */
public class SupplierPaymentDAO {

    private static SupplierPaymentDAO INSTANCE;

    private final QueryUtil<SupplierPaymentMix> Query;
    private Connection connection;

    public static SupplierPaymentDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SupplierPaymentDAO();
        }

        return INSTANCE;
    }

    public SupplierPaymentDAO() {
        Query = QueryUtil.getInstance(SupplierPaymentMix.class);
        try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(SupplierPaymentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    int saveSupplierPayment(SupplierPaymentMix mix) {
        try {
            connection.setAutoCommit(false);
            int receiptNo = TPaymentDAO.getInstance().savePayment(connection, mix.getPayment());
            if (receiptNo > 0) {
                mix.getSupplierPayment().setPayment(receiptNo);
                int pdetailId = SPaymentDetailDAO.getInstance().savePayment(connection, mix.getSupplierPayment());
                if (pdetailId > 0) {
                    int accId = MAccountDAO.getInstance().saveAccount(connection, mix.getAccount());
                    if (accId > 0) {
                        mix.getTransaction().setAccount(accId);
                        int transactionId = AccountTransactionDAO.getInstance().saveTransaction(connection, mix.getTransaction());
                        if (transactionId > 0) {
                            int logId = LogFileDAO.getInstance().saveLog(connection, mix.getLogFile());
                            if (logId > 0) {
                                connection.commit();
                                return receiptNo;
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
            } else {
                connection.rollback();
                return -1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SupplierPaymentDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(SupplierPaymentDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }

}
