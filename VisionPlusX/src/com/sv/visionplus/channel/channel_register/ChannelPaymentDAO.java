/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.channel.channel_register;

import com.sv.visionplus.channel.channel_register.model.ChannelPayment;
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
 * @author kasun
 */
public class ChannelPaymentDAO {
    
    private static ChannelPaymentDAO INSTANCE;
    private final QueryUtil<ChannelPayment> Query;
    private Connection connection;

    public static ChannelPaymentDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ChannelPaymentDAO();
        }
        

        return INSTANCE;
    }

    public ChannelPaymentDAO() {
        Query = QueryUtil.getInstance(ChannelPayment.class);
         try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ChannelPaymentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<ChannelPayment> getChannelPayment(Date date) {
        List<ChannelPayment> list = new ArrayList();
        try {
            list=Query.executeSelect(connection, "date = ?", new Object[]{date});
        } catch (SQLException ex) {
            Logger.getLogger(ChannelPaymentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
