/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.supplier_payment;

import com.sv.visionplus.transaction.supplier_payment.model.searchGrnMix;
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
public class SearchGrnMixDAO {

    private static SearchGrnMixDAO INSTANCE;

    private final QueryUtil<searchGrnMix> Query;
    private Connection connection;

    public static SearchGrnMixDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SearchGrnMixDAO();
        }

        return INSTANCE;
    }

    public SearchGrnMixDAO() {
        Query = QueryUtil.getInstance(searchGrnMix.class);
        try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(SearchGrnMixDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<searchGrnMix> allGRN() {
        List<searchGrnMix> list = new ArrayList<>();
        try {
            list = Query.executeSelect(connection);
        } catch (SQLException ex) {
            Logger.getLogger(SearchGrnMixDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    List<searchGrnMix> searchGrn(Integer grnNo, String refNo) {
        List<searchGrnMix> list = new ArrayList<>();
        try {
            list = Query.executeSelect(connection, "grn_no=? AND ref_no=?", grnNo, refNo);
        } catch (SQLException ex) {
            Logger.getLogger(SearchGrnMixDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }

    public List<searchGrnMix> searchGrnById(searchGrnMix grnMix) {
            List<searchGrnMix> list=new ArrayList<>();
        try {
            System.out.println("id"+grnMix.getGrnNo());
            System.out.println("refNo"+grnMix.getRef_no());
            list = Query.executeSelect(connection, "grn_no = ? OR ref_no = ? ", grnMix.getGrnNo(),grnMix.getRef_no());
        } catch (SQLException ex) {
            Logger.getLogger(SearchGrnMixDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    public List<searchGrnMix> searchGrn(searchGrnMix grnMix) {
            List<searchGrnMix> list=new ArrayList<>();
        try {
            list = Query.executeSelect(connection, "name LIKE ? AND contact_no LIKE ?", "%"+grnMix.getName()+"%","%"+grnMix.getContact_no()+"%");
        } catch (SQLException ex) {
            Logger.getLogger(SearchGrnMixDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
