package com.sv.visionplus.util.database;

import com.sv.visionplus.util.database.annotation.VPColumn;
import com.sv.visionplus.util.database.annotation.VPId;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import com.sv.visionplus.util.database.annotation.VPTable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mohan
 */
public class QueryUtil<T> {

    private final Class<T> entityClass;
    private String tableName;
    private List<Column> columns;
    //
    public static final String REGEX = "([a-z])([A-Z]+)";
    public static final String REPLACEMENT = "$1_$2";

    public static <T> QueryUtil<T> getInstance(Class<T> entityClass) {
        return new QueryUtil<>(entityClass);
    }

    private QueryUtil(Class entityClass) {
        this.entityClass = entityClass;

        initEntity();
    }

    private void initEntity() {
        //columns
        this.columns = new ArrayList<>();

        Field[] fields = entityClass.getDeclaredFields();
        for (Field field : fields) {
            columns.add(new Column(field));
        }

        //table name
        VPTable table = (VPTable) entityClass.getAnnotation(VPTable.class);
        if (table == null) {
            this.tableName = toUnderscore(entityClass.getSimpleName());
        } else {
            this.tableName = table.value();
        }
    }

    //select query
    public T executeUniqueSelect(Connection connection, String criteria, Object... params) throws SQLException {
        List<T> data = executeSelect(connection, criteria, params);

        if (data.isEmpty()) {
            return null;
        } else {
            return data.get(0);
        }
    }

    public List<T> executeSelect(Connection connection) throws SQLException {
        String sql = getSelectQuery();
        //prepare statement
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        //execute
        ResultSet resultSet = preparedStatement.executeQuery();

        //bind to list
        List<T> data = new ArrayList();

        resultSet.beforeFirst();
        while (resultSet.next()) {
            //new object
            T object;
            try {
                object = entityClass.newInstance();
                for (Column column : columns) {
                    column.extractValueFromResultSet(resultSet, object);
                }
                data.add(object);
            } catch (InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(QueryUtil.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return data;
    }

    public List<T> executeSelect(Connection connection, String criteria, Object... params) throws SQLException {
        String sql = getSelectQuery(criteria);
        //prepare statement
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        //parameters
        for (int i = 0; i < params.length; i++) {
            Object param = params[i];

            preparedStatement.setObject(i + 1, param);
        }

        //execute
        ResultSet resultSet = preparedStatement.executeQuery();

        //bind to list
        List<T> data = new ArrayList();

        resultSet.beforeFirst();
        while (resultSet.next()) {
            //new object
            T object;
            try {
                object = entityClass.newInstance();
                for (Column column : columns) {
                    column.extractValueFromResultSet(resultSet, object);
                }
                data.add(object);
            } catch (InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(QueryUtil.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return data;
    }

    private String getSelectQuery() {
        StringBuilder stringBuilder = new StringBuilder("SELECT ");

        for (Column column : columns) {
            stringBuilder.append(column.getColumnDefinition())
                    .append(",");

        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.append(" FROM ")
                .append(this.tableName);

        return stringBuilder.toString();
    }

    private String getSelectQuery(String criteria) {
        StringBuilder stringBuilder = new StringBuilder(getSelectQuery());

        stringBuilder.append(" WHERE ")
                .append(criteria);

        return stringBuilder.toString();
    }

    //insert query
    public int executeInsert(Connection connection, T object) throws SQLException {
        String sql = getInsertQuery();

        //prepare statement
        PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        int i = 1;
        for (Column column : columns) {
            preparedStatement.setObject(i, column.extractValueFromObject(object));
            i++;
        }

        preparedStatement.executeUpdate();

        //get generated id
        ResultSet resultSet = preparedStatement.getGeneratedKeys();

        while (resultSet.next()) {
            return ((Long) resultSet.getObject(1)).intValue();
        }

        return -1;
    }

    private String getInsertQuery() {
        StringBuilder stringBuilder = new StringBuilder("INSERT ");
        stringBuilder.append("INTO ")
                .append(this.tableName)
                .append(" (");

        for (Column column : columns) {
            stringBuilder.append(column.getColumnDefinition())
                    .append(",");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.append(")");

        stringBuilder.append(" VALUES(");
        for (Column column : columns) {
            stringBuilder.append("?")
                    .append(",");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    //update query
    public int executeUpdate(Connection connection, T object, String criteria, Object... params) throws SQLException {
        String sql = getUpdateQuery(criteria);

        //prepare statement
        PreparedStatement preparedStatement = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);

        //updated values
        int i = 1;
        for (Column column : columns) {
            if (!column.isId()) {
                preparedStatement.setObject(i, column.extractValueFromObject(object));
                i++;
            }
        }

        //parameters
        for (int j = 0; j < params.length; j++) {
            Object param = params[j];
            preparedStatement.setObject(i + j, param);
        }

        int executeUpdate = preparedStatement.executeUpdate();
        return executeUpdate;
        //get generated id
//        ResultSet resultSet = preparedStatement.getGeneratedKeys();
//
//        while (resultSet.next()) {
//            return ((Long) resultSet.getObject(1)).intValue();
//        }

//        return -1;
    }

    private String getUpdateQuery(String criteria) {
        StringBuilder stringBuilder = new StringBuilder("UPDATE ")
                .append(this.tableName);
        stringBuilder.append(" SET ");

        for (Column column : columns) {
            if (!column.isId()) {
                stringBuilder.append(column.getColumnDefinition())
                        .append("=")
                        .append("?")
                        .append(",");
            }
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);

        stringBuilder.append(" WHERE ")
                .append(criteria);

        return stringBuilder.toString();
    }

    //delete query
    public int executeDelete(Connection connection, String criteria, Object... params) throws SQLException {
        String sql = getDeleteQuery(criteria);
        //prepare statement
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        //parameters
        for (int i = 0; i < params.length; i++) {
            Object param = params[i];

            preparedStatement.setObject(i + 1, param);
        }

        return preparedStatement.executeUpdate();
    }

    private String getDeleteQuery(String criteria) {
        StringBuilder stringBuilder = new StringBuilder("DELETE ");

        stringBuilder.append("FROM ")
                .append(this.tableName);

        stringBuilder.append(" WHERE ")
                .append(criteria);

        return stringBuilder.toString();
    }

    private static String toUnderscore(String fieldName) {
        return fieldName.replaceAll(REGEX, REPLACEMENT).toLowerCase();
    }

    private class Column {

        private final Field field;
        private String columnName;
        private boolean isId;

        public Column(Field field) {
            this.field = field;

            initColumn();
        }

        public String getColumnDefinition() {
            return "`" + columnName + "`";
        }

        public void extractValueFromResultSet(ResultSet resultSet, Object object) throws SQLException {
            try {
                this.field.set(object, resultSet.getObject(columnName));
            } catch (IllegalArgumentException | IllegalAccessException ex) {
                Logger.getLogger(QueryUtil.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        public Object extractValueFromObject(Object object) {
            try {
                return this.field.get(object);
            } catch (IllegalArgumentException | IllegalAccessException ex) {
                Logger.getLogger(QueryUtil.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }

        private void initColumn() {
            this.field.setAccessible(true);

            //column name
            VPColumn column = (VPColumn) field.getAnnotation(VPColumn.class);
            if (column == null) {
                this.columnName = toUnderscore(field.getName());
            } else {
                this.columnName = column.value();
            }

            //id
            VPId id = field.getAnnotation(VPId.class);
            this.isId = id != null;
        }

        public boolean isId() {
            return isId;
        }
    }
}
