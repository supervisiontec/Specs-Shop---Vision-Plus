/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visionplusx.controller;

import com.sv.visionplus.master.item.brand.model.MBrand;
import com.sv.visionplus.util.database.DatabaseUtil;
import com.sv.visionplus.util.formatter.FormatterUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import visionplusx.logFile.LogFileDAO;
import visionplusx.logFile.LogFileModel;
import visionplusx.model.MUser;

/**
 *
 * @author Mohan
 */
public class SystemService {

    private SystemDAO systemDAO;

    private static SystemService INSTANCE;

    public static SystemService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SystemService();
        }

        return INSTANCE;
    }

    private SystemService() {
        this.systemDAO = SystemDAO.getInstance();
    }

    //functions
    public MUser login(String username, String password) {
        try {

            Connection connection = DatabaseUtil.getInstance().openConnection();

            MUser user = systemDAO.login(connection, username, password);

            LogFileModel logFileModel = new LogFileModel();
            logFileModel.setDate(new Date());
            logFileModel.setFormName("Login");
//            logFileModel.setIndexNo(1); //Auto incerment
            logFileModel.setRemarks("login User");
            logFileModel.setTime(FormatterUtil.getInstance().getTime());
            logFileModel.setTransactionType("search");
            logFileModel.setValue(0.00);
            if (user == null) {
                logFileModel.setUser(-1);
                logFileModel.setRemarks("login Information Wrong");
            } else {
                logFileModel.setUser(user.getIndexNo());
            }

            LogFileDAO.getInstance().saveLog(connection, logFileModel);
            return user;

        } catch (SQLException ex) {
            Logger.getLogger(SystemService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public List<MUser> listUser() {
        try {
            Connection connection = DatabaseUtil.getInstance().openConnection();
            return systemDAO.listUsers(connection);
        } catch (SQLException e) {
            return Collections.emptyList();
        }
    }
}
