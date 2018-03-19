/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.supplier_payment;

import com.sv.visionplus.transaction.grn.*;
import com.sv.visionplus.transaction.grn.model.TGrn;
import com.sv.visionplus.transaction.grn.model.GrnMix;
import com.sv.visionplus.transaction.supplier_payment.model.GrnItemMix;
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
public class SearchGrnItemDAO {
    private static SearchGrnItemDAO INSTANCE;
    private final QueryUtil<GrnItemMix> Query;
    private Connection connection;

    public static SearchGrnItemDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SearchGrnItemDAO();
        }

        return INSTANCE;
    }

    public SearchGrnItemDAO() {
        Query = QueryUtil.getInstance(GrnItemMix.class);
        try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(SearchGrnItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    List<GrnItemMix> searchItem(int grnNo) {
            List<GrnItemMix> list=new ArrayList<>();
        try {
            list = Query.executeSelect(connection, "grn_no=?", grnNo);
        } catch (SQLException ex) {
            Logger.getLogger(SearchGrnItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    

}
