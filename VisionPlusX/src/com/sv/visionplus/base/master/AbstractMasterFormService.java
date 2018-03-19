/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.base.master;

import com.sv.visionplus.system.exception.VPException;
import com.sv.visionplus.util.database.DatabaseUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mohan
 */
public abstract class AbstractMasterFormService<T> {

    private final AbstractMasterFormDAO<T> masterFormDAO;

    protected abstract AbstractMasterFormDAO<T> getMasterFormDAO();

    public AbstractMasterFormService() {
        this.masterFormDAO = getMasterFormDAO();
    }

    public void save(T object) throws VPException {
        try {
            Connection connection = DatabaseUtil.getInstance().openConnection();
            connection.setAutoCommit(false);
            this.masterFormDAO.save(connection, object);
            connection.commit();
        } catch (SQLException ex) {
            Logger.getLogger(AbstractMasterFormService.class.getName()).log(Level.SEVERE, null, ex);
            throw new VPException("Failed to save", ex);
        }
    }

    public void update(T object) throws VPException {
        try {
            Connection connection = DatabaseUtil.getInstance().openConnection();
            connection.setAutoCommit(false);
            this.masterFormDAO.update(connection, object);
            connection.commit();
        } catch (SQLException ex) {
            Logger.getLogger(AbstractMasterFormService.class.getName()).log(Level.SEVERE, null, ex);
            throw new VPException("Failed to update", ex);
        }
    }

    public void delete(T object) throws VPException {
        try {
            Connection connection = DatabaseUtil.getInstance().openConnection();
            connection.setAutoCommit(false);
            this.masterFormDAO.delete(connection, object);
            connection.commit();
        } catch (SQLException ex) {
            Logger.getLogger(AbstractMasterFormService.class.getName()).log(Level.SEVERE, null, ex);
            throw new VPException("Failed to delete", ex);
        }
    }

    public List<T> getSearchResult(String text) {
        try {
            Connection connection = DatabaseUtil.getInstance().openConnection();
            return this.masterFormDAO.getSearchResult(connection, text);
        } catch (SQLException ex) {
            Logger.getLogger(AbstractMasterFormService.class.getName()).log(Level.SEVERE, null, ex);
            return Collections.emptyList();
        }
    }
}
