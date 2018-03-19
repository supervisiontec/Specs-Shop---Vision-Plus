package com.sv.visionplus.transaction.customer_payment;

import com.sv.visionplus.transaction.customer_payment.model.TInvoice;
import com.sv.visionplus.util.database.DatabaseUtil;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mohan
 */
public class InvoiceDAO {

    private static InvoiceDAO INSTANCE;
    private final QueryUtil<TInvoice> Query;
    private Connection connection;

    public static InvoiceDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new InvoiceDAO();
        }

        return INSTANCE;
    }

    public InvoiceDAO() {
        Query = QueryUtil.getInstance(TInvoice.class);
        try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public TInvoice searchInvoice(int id) {
        TInvoice invoice = null;
        try {
            invoice = Query.executeUniqueSelect(connection, "index_no = ?", id);
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return invoice;

    }

    public TInvoice searchInvoice(String id) {
        TInvoice invoice = null;
        try {
            invoice = Query.executeUniqueSelect(connection, "number = ?", id);
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return invoice;

    }

    int updateStatus(Connection connection, TInvoice invoice) {
        int InvoiceId = 0;
        TInvoice searchInvoice = searchInvoice(invoice.getIndexNo());        
        searchInvoice.setStatus(invoice.getStatus());
        try {
            InvoiceId = Query.executeUpdate(connection, searchInvoice, "index_no=?", invoice.getIndexNo());
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return InvoiceId;
    }

}
