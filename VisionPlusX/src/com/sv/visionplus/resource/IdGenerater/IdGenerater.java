/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.resource.IdGenerater;

import com.sv.visionplus.util.database.DatabaseUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KAZA
 */
public class IdGenerater {

    private Connection openConnection;
     public static IdGenerater INSTANCE;

    public static IdGenerater getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new IdGenerater();
        }
        return INSTANCE;
    }

    public IdGenerater() {
        try {
            openConnection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(IdGenerater.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public int getLastId(String tableName, String columnName)  {
        try {
            String sql = "select max(" + columnName + ") as id from " + tableName;
            Connection connection = openConnection;
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                int lastId=resultSet.getInt(1);
                return lastId+1;
            }
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return 0;
    }

}
