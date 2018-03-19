/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visionplusx.controller;

import com.sv.visionplus.master.item.brand.model.MBrand;
import com.sv.visionplus.util.database.DatabaseUtil;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import visionplusx.model.MUser;

/**
 *
 * @author Mohan
 */
public class SystemDAO {

    private static SystemDAO INSTANCE;
    private Connection connection;

    public SystemDAO() {
        try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(SystemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static SystemDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SystemDAO();
        }

        return INSTANCE;
    }

    public MUser login(Connection connection, String username, String password) throws SQLException {
        QueryUtil<MUser> loginQueryUtil = QueryUtil.getInstance(MUser.class);
        return loginQueryUtil.executeUniqueSelect(connection, "user_name=? AND password=?", username, password);
    }

    public List<MUser> listUsers(Connection connection) throws SQLException {
        QueryUtil<MUser> queryUtil = QueryUtil.getInstance(MUser.class);
        return queryUtil.executeSelect(connection);
    }

    public MUser login(String password) throws SQLException {
        QueryUtil<MUser> loginQueryUtil = QueryUtil.getInstance(MUser.class);
        return (MUser) loginQueryUtil.executeUniqueSelect(connection, "password=?", new Object[]{password});
    }
}
