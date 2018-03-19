/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.check_In;

import com.sv.visionplus.transaction.check_In.model.MFactory;
import com.sv.visionplus.util.database.DatabaseUtil;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KAZA
 */
public class FactoryDAO {
    private static FactoryDAO INSTANCE;
    private final QueryUtil<MFactory> Query;
    private Connection connection;

    public static FactoryDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new FactoryDAO();
        }

        return INSTANCE;
    }

    public FactoryDAO() {
        Query = QueryUtil.getInstance(MFactory.class);
        try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(FactoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public List<MFactory> allFactorys(){
        try {
            List<MFactory> factoryList = Query.executeSelect(connection);
            if (factoryList!=null) {
                return factoryList;
            }
        } catch (SQLException ex) {
            Logger.getLogger(FactoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return null;
    
    }
}
