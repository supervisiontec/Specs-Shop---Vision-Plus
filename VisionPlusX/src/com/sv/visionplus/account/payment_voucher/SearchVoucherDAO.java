/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.account.payment_voucher;

import com.sv.visionplus.account.payment_voucher.model.MAccount;
import com.sv.visionplus.account.payment_voucher.model.SearchVoucherMix;
import com.sv.visionplus.util.database.DatabaseUtil;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KAZA
 */
public class SearchVoucherDAO {

    private static SearchVoucherDAO INSTANCE;
    private final QueryUtil<SearchVoucherMix> Query;
    private Connection connection;

    public static SearchVoucherDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SearchVoucherDAO();
        }

        return INSTANCE;
    }

    public SearchVoucherDAO() {
        Query = QueryUtil.getInstance(SearchVoucherMix.class);
        try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(SearchVoucherDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<SearchVoucherMix> searchVouchers(String date,String type) {
            List<SearchVoucherMix> voucherList = new ArrayList<>();
        try {
            voucherList = Query.executeSelect(connection, "date=? AND type=?", date,type);
        } catch (SQLException ex) {
            Logger.getLogger(SearchVoucherDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return voucherList;
    }

    
}
