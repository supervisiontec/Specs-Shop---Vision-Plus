/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visionplusx.logFile;

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
public class LogFileDAO {

    public static LogFileDAO INSTANCE;
    private QueryUtil<LogFileModel> queryUtil;

    public static LogFileDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LogFileDAO();
        }
        return INSTANCE;
    }

    public LogFileDAO() {
        this.queryUtil = QueryUtil.getInstance(LogFileModel.class);
    }

    public int saveLog(Connection connection, LogFileModel log) {
        try {
            return  queryUtil.executeInsert(connection, log);
        } catch (SQLException ex) {
            Logger.getLogger(LogFileDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
    
}
