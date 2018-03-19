package com.sv.visionplus.base.master;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Mohan
 */
public abstract class AbstractMasterFormDAO<T> {

    public abstract void save(Connection connection, T object) throws SQLException;

    public abstract void update(Connection connection, T object) throws SQLException;

    public abstract void delete(Connection connection, T object) throws SQLException;

    public abstract List<T> getSearchResult(Connection connection, String text) throws SQLException;
   
}
