package com.sv.visionplus.transaction.invoice_detail;

import com.sv.visionplus.transaction.invoice_detail.model.TPatientDetailNumber;
import com.sv.visionplus.util.database.DatabaseUtil;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PatientNumberDAO {

    private static PatientNumberDAO INSTANCE;
    private final QueryUtil<TPatientDetailNumber> Query;
    private Connection connection;

    public static PatientNumberDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PatientNumberDAO();
        }

        return INSTANCE;
    }

    public PatientNumberDAO() {
        Query = QueryUtil.getInstance(TPatientDetailNumber.class);
        try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(PatientNumberDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int searchLastNumber() {
        try {
           return (int) Query.executeUniqueSelect(connection, "index_no=?", new Object[]{1}).getNumber();
        } catch (SQLException ex) {
            Logger.getLogger(PatientNumberDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 123;
    }

}
