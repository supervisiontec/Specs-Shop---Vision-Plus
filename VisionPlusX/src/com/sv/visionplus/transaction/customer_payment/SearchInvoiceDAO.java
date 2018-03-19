/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.customer_payment;

import com.sv.visionplus.transaction.customer_payment.model.CustomerInvoiceMix;
import com.sv.visionplus.transaction.customer_payment.model.MBankBranch;
import com.sv.visionplus.transaction.customer_payment.model.TInvoice;
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
public class SearchInvoiceDAO {

    private static SearchInvoiceDAO INSTANCE;

    private final QueryUtil<CustomerInvoiceMix> Query;
    private Connection connection;

    public static SearchInvoiceDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SearchInvoiceDAO();
        }

        return INSTANCE;
    }

    public SearchInvoiceDAO() {
        Query = QueryUtil.getInstance(CustomerInvoiceMix.class);
        try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(SearchInvoiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<CustomerInvoiceMix> searchInvoice(String searchText) {
        List<CustomerInvoiceMix> invoiceList = new ArrayList<>();
        try {
            invoiceList = Query.executeSelect(connection, "nic LIKE ? OR name LIKE ? OR contact_no LIKE ?", "%" + searchText + "%", "%" + searchText + "%", "%" + searchText + "%");
        } catch (SQLException ex) {
            Logger.getLogger(SearchInvoiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return invoiceList;
    }
    public List<CustomerInvoiceMix> searchInvoice(CustomerInvoiceMix invoiceMix) {
        List<CustomerInvoiceMix> invoiceList = new ArrayList<>();
        try {
            invoiceList = Query.executeSelect(connection, "nic LIKE ? OR name LIKE ? OR contact_no LIKE ?", "%" + invoiceMix.getNic() + "%", "%" + invoiceMix.getName() + "%", "%" + invoiceMix.getContact_no()+ "%");
        } catch (SQLException ex) {
            Logger.getLogger(SearchInvoiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return invoiceList;
    }

    public CustomerInvoiceMix searchInvoiceById(String invoiceId) {
        if (invoiceId != null) {

            TInvoice invoice1 = InvoiceDAO.getInstance().searchInvoice(invoiceId);
            if (invoice1 != null) {
                try {
                    return Query.executeUniqueSelect(connection, "invoice_no = ? ", invoice1.getIndexNo());
                } catch (SQLException ex) {
                    Logger.getLogger(SearchInvoiceDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return null;
    }

    public List<CustomerInvoiceMix> allInvoice() {
         List<CustomerInvoiceMix> invoiceList = new ArrayList<>();
        try {
            invoiceList = Query.executeSelect(connection);
        } catch (SQLException ex) {
            Logger.getLogger(SearchInvoiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return invoiceList;
    }
}
