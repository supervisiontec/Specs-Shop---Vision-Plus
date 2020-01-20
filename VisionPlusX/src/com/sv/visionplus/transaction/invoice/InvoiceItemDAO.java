package com.sv.visionplus.transaction.invoice;

import com.sv.visionplus.transaction.invoice.model.TInvoiceItem;
import com.sv.visionplus.util.database.DatabaseUtil;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InvoiceItemDAO {

    private static InvoiceItemDAO INSTANCE;
    private final QueryUtil<TInvoiceItem> Query;
    private Connection connection;

    public static InvoiceItemDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new InvoiceItemDAO();
        }

        return INSTANCE;
    }

    public InvoiceItemDAO() {
        Query = QueryUtil.getInstance(TInvoiceItem.class);
        try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean saveItems(Connection connection, List<TInvoiceItem> list, int invoiceId) {
        int val = 0;
        for (TInvoiceItem item : list) {
            TInvoiceItem invItem = new TInvoiceItem();
            invItem.setDiscount(item.getDiscount());
            invItem.setItem(item.getItem());
            invItem.setInvoice(invoiceId);
            invItem.setNetValue(item.getNetValue());
            invItem.setQty(item.getQty());
            invItem.setUnitPrice(item.getUnitPrice());
            invItem.setValue(item.getValue());
            
//            item.setInvoice(Integer.valueOf(invoiceId));
            try {
                Query.executeInsert(connection, invItem);
            } catch (SQLException ex) {
                Logger.getLogger(InvoiceItemDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            val++;
        }
        if (val == list.size()) {
            return true;
        }
        return false;
    }

    public List<TInvoiceItem> searchItems(Integer indexNo) {
        List<TInvoiceItem> list = new ArrayList();
        try {
            list = Query.executeSelect(connection, "invoice=?", new Object[]{indexNo});
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public int delete(Connection connection, Integer indexNo) {
        try {
            return Query.executeDelete(connection, "invoice=?", indexNo);
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}
