/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.log_file;

import com.sv.visionplus.log_file.model.LogFileModel;
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
public class LogFileDAO {

    public static LogFileDAO INSTANCE;
    private QueryUtil<LogFileModel> queryUtil;
    private Connection connection;

    public static LogFileDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LogFileDAO();
        }
        return INSTANCE;
    }

    public LogFileDAO() {
        this.queryUtil = QueryUtil.getInstance(LogFileModel.class);
        try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(LogFileDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<LogFileModel> AllUser() {
        List<LogFileModel> list = new ArrayList<>();
        try {
            list = queryUtil.executeSelect(connection);
        } catch (SQLException ex) {
            Logger.getLogger(LogFileDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    List<LogFileModel> searchUser(String date, String user, Boolean special) {
        List<LogFileModel> list = new ArrayList();

        if (special) {
            try {
                list = queryUtil.executeSelect(connection, "(date=? or name=?) and type=? ", new Object[]{date, user,"SPECIAL"});
            } catch (SQLException ex) {
                Logger.getLogger(LogFileDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                list = queryUtil.executeSelect(connection, "date=? or name=?", new Object[]{date, user});
            } catch (SQLException ex) {
                Logger.getLogger(LogFileDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }
}
