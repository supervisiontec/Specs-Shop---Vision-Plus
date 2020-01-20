package com.sv.visionplus.transaction.invoice;

import com.sv.visionplus.transaction.invoice.model.TPatientInformation;
import com.sv.visionplus.util.database.DatabaseUtil;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PatientInformationDAO {

    private static PatientInformationDAO INSTANCE;
    private final QueryUtil<TPatientInformation> Query;
    private Connection connection;

    public static PatientInformationDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PatientInformationDAO();
        }

        return INSTANCE;
    }

    public PatientInformationDAO() {
        Query = QueryUtil.getInstance(TPatientInformation.class);
        try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(PatientInformationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    int savePatientInformation(Connection connection, TPatientInformation information) {
        int indexNo = 0;
        try {
            indexNo = Query.executeInsert(connection, information);
        } catch (SQLException ex) {
            Logger.getLogger(PatientInformationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return indexNo;
    }

    public TPatientInformation searchInvoicePatientInfo(Integer indexNo) {
        TPatientInformation info = new TPatientInformation();
        try {
            info = (TPatientInformation) Query.executeUniqueSelect(connection, "invoice=?", new Object[]{indexNo});
        } catch (SQLException ex) {
            Logger.getLogger(PatientInformationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return info;
    }
    public TPatientInformation searchInvoiceByIndex(Integer indexNo) {
        TPatientInformation info = new TPatientInformation();
        try {
            info = (TPatientInformation) Query.executeUniqueSelect(connection, "index_no=?", new Object[]{indexNo});
        } catch (SQLException ex) {
            Logger.getLogger(PatientInformationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return info;
    }

    int editPatientInformation(Connection connection,TPatientInformation patientInformation, int invoiceNo) {
        System.out.println("patient info dao"+invoiceNo);
        System.out.println(patientInformation);
        try {
            return Query.executeUpdate(connection, patientInformation, "invoice=?", invoiceNo);
        } catch (SQLException ex) {
            Logger.getLogger(PatientInformationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
}
