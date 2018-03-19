/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.customer_payment;

import com.sv.visionplus.transaction.customer_payment.model.CustomerPaymentMix;
import com.sv.visionplus.transaction.customer_payment.model.TInvoice;
import com.sv.visionplus.util.database.DatabaseUtil;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import visionplusx.logFile.LogFileDAO;

/**
 *
 * @author KAZA
 */
public class CustomerPaymentDAO {

    private static CustomerPaymentDAO INSTANCE;
    private final QueryUtil<CustomerPaymentMix> Query;
    private Connection connection;

    public static CustomerPaymentDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CustomerPaymentDAO();
        }

        return INSTANCE;
    }

    public CustomerPaymentDAO() {
        Query = QueryUtil.getInstance(CustomerPaymentMix.class);
        try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerPaymentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    String saveCustomerPayment(CustomerPaymentMix mix) {
        if (mix != null) {
            try {
                connection.setAutoCommit(false);
                int paymentId = TPaymentDAO.getInstance().savePayment(connection, mix.getPayment());
                if (paymentId > 0) {
                    mix.getCustomerPayment().setPayment(paymentId);
                    int id = TCustomerPaymentDAO.getInstance().saveCustomerPayment(connection, mix.getCustomerPayment());
                    if (id > 0) {
                        int saveLog = LogFileDAO.getInstance().saveLog(connection, mix.getLogFile());
                        if (saveLog > 0) {
                            if (mix.getStatus() != null) {
                                if (mix.getGoodIssue()) {
                                    mix.getStatus().setName("Issue To Customer");
                                    mix.getInvoice().setStatus("Issue To Customer");
                                    StatusDAO.getInstance().saveStatus(connection, mix.getStatus());
                                    InvoiceDAO.getInstance().updateStatus(connection, mix.getInvoice());
                                }
                                int accId = MAccountDAO.getInstance().saveAccount(connection, mix.getAccount());
                                if (accId > 0) {
                                    mix.getAccountTransaction().setAccount(accId);
                                    int transactionId = AccountTransactionDAO.getInstance().saveTransaction(connection, mix.getAccountTransaction());
                                    if (transactionId > 0) {
                                        connection.commit();
                                        return mix.getInvoice().getNumber();
                                    } else {
                                        connection.rollback();
                                        return null;
                                    }
                                } else {
                                    connection.rollback();
                                    return null;
                                }

                            } else {
                                int accId = MAccountDAO.getInstance().saveAccount(connection, mix.getAccount());
                                if (accId > 0) {
                                    mix.getAccountTransaction().setAccount(accId);
                                    int transactionId = AccountTransactionDAO.getInstance().saveTransaction(connection, mix.getAccountTransaction());
                                    if (transactionId > 0) {
                                        connection.commit();
                                        return mix.getInvoice().getNumber();
                                    } else {
                                        connection.rollback();
                                        return null;
                                    }
                                } else {
                                    connection.rollback();
                                    return null;
                                }
                            }
                        } else {
                            connection.rollback();
                            return null;
                        }
                    } else {
                        connection.rollback();
                        return null;
                    }

                } else {
                    connection.rollback();
                    return null;
                }
            } catch (SQLException ex) {
                Logger.getLogger(CustomerPaymentDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    connection.setAutoCommit(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CustomerPaymentDAO.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
        return null;
    }
}
