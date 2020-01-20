package com.sv.visionplus.transaction.invoice_detail;

import com.sv.visionplus.transaction.invoice_detail.model.TPatientInformation;
import com.sv.visionplus.util.database.DatabaseUtil;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class InvoiceDetailDAO {

    private static InvoiceDetailDAO INSTANCE;
    private final QueryUtil<TPatientInformation> Query;
    private Connection connection;

    public static InvoiceDetailDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new InvoiceDetailDAO();
        }

        return INSTANCE;
    }

    public InvoiceDetailDAO() {
        Query = QueryUtil.getInstance(TPatientInformation.class);
        try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceDetailDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Integer saveInvoice(TPatientInformation detail) {
        detail.setDate(new Date());
        int indexNo = 0;
        try {
            if (detail.getIndex_no() > 0) {
                //update
                indexNo = Query.executeUpdate(connection, detail,"index_no=?",detail.getIndex_no());
                
                JOptionPane.showMessageDialog(null, "Patient Information Update Successfully - " + (detail.getNumber()));
            } else {
                //SAVE
                Integer number = PatientNumberDAO.getInstance().searchLastNumber();
                detail.setNumber(number + 1);
                indexNo = Query.executeInsert(connection, detail);
                JOptionPane.showMessageDialog(null, "Patient Information Save Successfully - " + (number + 1));
            }

        } catch (SQLException ex) {
            Logger.getLogger(InvoiceDetailDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return indexNo;
    }

    public List<TPatientInformation> allDetailInvoiceNull() {
        List<TPatientInformation> list = new ArrayList<>();
        try {
            list = Query.executeSelect(connection, "number>? order by index_no desc limit 50", new Object[]{0});
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceDetailDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public TPatientInformation findById(Integer indexNo) {
        TPatientInformation info = new TPatientInformation();
        try {
            info = (TPatientInformation) Query.executeUniqueSelect(connection, "index_no=?", new Object[]{indexNo});
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceDetailDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return info;
    }

}
