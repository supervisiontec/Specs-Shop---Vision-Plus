/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.invoice;

import com.sv.visionplus.transaction.invoice.model.TInvoiceItem;
import com.sv.visionplus.transaction.invoice.model.ViewInvoicePayment;
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
 * @author kasun
 */
public class ViewInvoicePaymentDAO {

    private static ViewInvoicePaymentDAO INSTANCE;
    private final QueryUtil<ViewInvoicePayment> Query;

    public static ViewInvoicePaymentDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ViewInvoicePaymentDAO();
        }

        return INSTANCE;
    }

    public ViewInvoicePaymentDAO() {
        Query = QueryUtil.getInstance(ViewInvoicePayment.class);
    }
    
    public List<ViewInvoicePayment> getPaymentByInvoice(Connection connection,Integer indexNo) {
        List<ViewInvoicePayment> list = new ArrayList();
        try {
            list=Query.executeSelect(connection, "invoice_no=?", new Object[]{indexNo});
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
