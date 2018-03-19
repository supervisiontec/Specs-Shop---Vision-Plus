/*
 *  CTableColumn.java
 *  
 *  @author channa mohan
 *     hjchanna@gmail.com
 *  
 *  Copyrights Channa Mohan, All rights reserved.
 *  
 */
package com.sv.visionplus.util.component.table;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mohan
 */
public class CTableColumn {

    public CTableColumn(String columnName, String[] valueCriteria, boolean canEdit) {
        this.columnName = columnName;
        this.valueCriteria = valueCriteria;
        this.canEdit = canEdit;
    }

    public CTableColumn(String columnName, String valueCriteria) {
        this.columnName = columnName;
        this.valueCriteria = new String[]{valueCriteria};
        this.canEdit = false;
    }

    public CTableColumn(String columnName, String... valueCriteria) {
        this.columnName = columnName;
        this.valueCriteria = valueCriteria;
        this.canEdit = false;
    }

    public String getColumnName() {
        return columnName;
    }

    public Class getColumnClass() {
        return columnClass;
    }

    public void setColumnClass(Class columnClass) {
        this.columnClass = columnClass;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public Object getValueOf(Object obj) {
        Object tempObj = obj;

        for (String field : valueCriteria) {

            try {
                Method method = getGetterMethod(tempObj, field);
                tempObj = method.invoke(tempObj);

                if (tempObj == null) {
                    return null;
                }
            } catch (NoSuchMethodError | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                Logger.getLogger(CTableColumn.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        return tempObj;
    }

    public void setValueTo(Object obj, Object newValue) {
        Object tempObj = obj;

        String field;
        for (int i = 0; i < valueCriteria.length; i++) {
            field = valueCriteria[i];

            try {
                Method method;
                if (i == valueCriteria.length - 1) {
                    method = getSetterMethod(tempObj, field);
                    method.invoke(tempObj, newValue);
                } else {
                    method = getGetterMethod(tempObj, field);
                    tempObj = method.invoke(tempObj);
                }
            } catch (NoSuchMethodError | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                Logger.getLogger(CTableColumn.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public String[] getValueCriteria() {
        return valueCriteria;
    }

    private Method getGetterMethod(Object obj, String name) throws NoSuchMethodError {
        Method[] methods = obj.getClass().getMethods();

        String methodName;
        for (Method method : methods) {
            methodName = method.getName();

            if ((methodName.startsWith(GET_PROFIX)
                    && methodName.substring(GET_PROFIX.length(), methodName.length()).equalsIgnoreCase(name))
                    || (methodName.startsWith(IS_PROFIX)
                    && methodName.substring(IS_PROFIX.length(), methodName.length()).equalsIgnoreCase(name))) {
                return method;
            }
        }

        throw new NoSuchMethodError(obj.getClass().getCanonicalName() + "." + GET_PROFIX + name);
    }

    private Method getSetterMethod(Object obj, String name) throws NoSuchMethodError {
        Method[] methods = obj.getClass().getMethods();

        String methodName;
        for (Method method : methods) {
            methodName = method.getName();

            if ((methodName.startsWith(SET_PROFIX)
                    && methodName.substring(SET_PROFIX.length(), methodName.length()).equalsIgnoreCase(name))) {
                return method;
            }
        }

        throw new NoSuchMethodError(obj.getClass().getCanonicalName() + "." + GET_PROFIX + name);
    }
    private final String columnName;
    private final String[] valueCriteria;
    private Class columnClass = null;
    private boolean canEdit;
    //
    private static String SET_PROFIX = "set";
    private static String GET_PROFIX = "get";
    private static String IS_PROFIX = "is";
}
