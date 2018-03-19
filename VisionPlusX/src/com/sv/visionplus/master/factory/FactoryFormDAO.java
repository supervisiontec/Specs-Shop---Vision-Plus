package com.sv.visionplus.master.factory;

import com.sv.visionplus.base.master.AbstractMasterFormDAO;
import com.sv.visionplus.master.factory.model.Factory;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Nidura Prageeth
 */
public class FactoryFormDAO extends AbstractMasterFormDAO<Factory>  {

    private QueryUtil<Factory> queryUtil;

    public FactoryFormDAO() {
        this.queryUtil = QueryUtil.getInstance(Factory.class);
    }

    
    @Override
    public void save(Connection connection, Factory factory) throws SQLException {
        queryUtil.executeInsert(connection, factory);
    }

    @Override
    public void update(Connection connection, Factory factory) throws SQLException {
        queryUtil.executeUpdate(connection, factory, "index_no=?", factory.getIndexNo());
    }

    @Override
    public void delete(Connection connection, Factory factory) throws SQLException {
       queryUtil.executeDelete(connection, "index_no=?",factory.getIndexNo() );
    }

    @Override
    public List<Factory> getSearchResult(Connection connection, String text) throws SQLException {
        text = "%" + text + "%";
        return queryUtil.executeSelect(connection, "name LIKE ? OR address LIKE ? OR contact_no LIKE ?", text, text, text);
    }

}
