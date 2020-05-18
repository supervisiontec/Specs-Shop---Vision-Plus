/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.master.store;

import com.sv.visionplus.base.master.AbstractMasterFormDAO;
import com.sv.visionplus.master.store.model.MStore;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author kasun
 */
public class StoreDao extends AbstractMasterFormDAO<MStore> {

     private QueryUtil<MStore> queryUtil;

    public StoreDao() {
        this.queryUtil = QueryUtil.getInstance(MStore.class);
    }
    @Override
    public void save(Connection connection, MStore object) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Connection connection, MStore object) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Connection connection, MStore object) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<MStore> getSearchResult(Connection connection, String text) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<MStore> getAll(Connection connection) throws SQLException {
        return queryUtil.executeSelect(connection);
    }
    
}
