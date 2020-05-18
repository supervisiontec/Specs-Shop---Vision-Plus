/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.account.money_collection;

import com.sv.visionplus.account.money_collection.model.ViewInvoicePayment;
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
public class ViewInvoicePaymentDAO {
     private static ViewInvoicePaymentDAO INSTANCE;
    private final QueryUtil<ViewInvoicePayment> Query;
    private Connection connection;

    public static ViewInvoicePaymentDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ViewInvoicePaymentDAO();
        }

        return INSTANCE;
    }

    public ViewInvoicePaymentDAO() {
        Query = QueryUtil.getInstance(ViewInvoicePayment.class);
         try {
             connection=DatabaseUtil.getInstance().openConnection();
         } catch (SQLException ex) {
             Logger.getLogger(ViewInvoicePaymentDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

    List<ViewInvoicePayment> searchInvoicePayment(String date) {
             List<ViewInvoicePayment> list=new ArrayList<>();
         try {
             list = Query.executeSelect(connection, "date=?", date);
         } catch (SQLException ex) {
             Logger.getLogger(ViewInvoicePaymentDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
         return list;
    }
    public List<ViewInvoicePayment> searchInvoicePaymentFromInvoice(Integer invoiceNo) {
             List<ViewInvoicePayment> list=new ArrayList<>();
         try {
             list = Query.executeSelect(connection, "invoice_no=?", invoiceNo);
         } catch (SQLException ex) {
             Logger.getLogger(ViewInvoicePaymentDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
         return list;
    }

}
