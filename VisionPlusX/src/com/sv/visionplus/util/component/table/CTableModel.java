/*
 *  CTableModel.java
 *  
 *  @author channa mohan
 *     hjchanna@gmail.com
 *  
 *  Copyrights Channa Mohan, All rights reserved.
 *  
 */
package com.sv.visionplus.util.component.table;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import javax.swing.table.AbstractTableModel;
import java.util.List;

/**
 *
 * @author mohan
 * @param <T>
 */
public class CTableModel<T> extends AbstractTableModel {

    public CTableModel() {
        this.tableData = new ArrayList();
    }

    public CTableModel(CTableColumn... tableColumns) {
        this.tableColumns = tableColumns;
        this.tableData = new ArrayList();
    }

    public CTableModel(Collection<T> tableData, CTableColumn... tableColumns) {
        this.tableData = tableData;
        this.tableColumns = tableColumns;
    }

    @Override
    public int getRowCount() {
        return tableData != null ? tableData.size() : 0;
    }

    @Override
    public int getColumnCount() {
        return tableColumns != null ? tableColumns.length : 0;
    }

    @Override
    public Object getValueAt(int r, int c) {
        Iterator<T> iterator = tableData.iterator();

        for (int i = 0; i < r; i++) {
            iterator.next();
        }

        return tableColumns[c].getValueOf(iterator.next());
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if (tableColumns[columnIndex].isCanEdit()) {
            tableColumns[columnIndex].setValueTo(getValueAt(rowIndex), aValue);
            fireCTableDataChanged(rowIndex, columnIndex);
        } else {
            super.setValueAt(aValue, rowIndex, columnIndex);
            fireCTableDataChanged(rowIndex, columnIndex);
        }
    }

    @Override
    public String getColumnName(int i) {
        return tableColumns[i].getColumnName();
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (tableColumns[columnIndex].getColumnClass() == null) {
            try {
                tableColumns[columnIndex].setColumnClass(getValueAt(0, columnIndex).getClass());
            } catch (Exception e) {
                //cannot find column class, NullPointerException
                tableColumns[columnIndex].setColumnClass(Object.class);
            }
        }

        return tableColumns[columnIndex].getColumnClass();
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return tableColumns[columnIndex].isCanEdit();
    }

    public Collection<T> getTableData() {
        return tableData;
    }

    public CTableColumn[] getColumns() {
        return tableColumns;
    }

    public T getValueAt(int row) {
        if (row >= 0 & row < tableData.size()) {
            Iterator<T> iterator = tableData.iterator();

            for (int i = 0; i < row; i++) {
                iterator.next();
            }

            return iterator.next();
        }

        return null;
    }

    public void setTableData(Collection tableData) {
        this.tableData = tableData;
        fireCTableDataChanged();
    }

    public void addData(T data) {
        tableData.add(data);
        setTableData(tableData);
        fireCTableDataChanged();
    }

    public void removeData(T data) {
        tableData.remove(data);
        fireCTableDataChanged();
    }

    public void removeAll() {
        tableData.clear();
        fireCTableDataChanged();
    }

    public int getObjectIndex(T object) {
        Iterator<T> iterator = tableData.iterator();
        T temp;

        int index = 0;
        for (; !(temp = iterator.next()).equals(object); index++) {
        }

        return temp.equals(object) ? index : NO_ROW_EXISTS;
    }

    //table events
    private void fireCTableDataChanged(final int row, final int column) {
        fireCTableModelChangeListener(row, column);
        fireTableCellUpdated(row, column);
    }

    private void fireCTableDataChanged() {
        fireTableDataChanged();
    }

    //table model contents
    private Collection<T> tableData;
    //table columns
    private CTableColumn[] tableColumns;
    //
    public static final int NO_ROW_EXISTS = -1;

    private final List<CTableModelChangeListener> cTableModelChangeListeners = new ArrayList<>();

    public void addCTableModelChangeListener(CTableModelChangeListener tl) {
        cTableModelChangeListeners.add(tl);
    }

    private void fireCTableModelChangeListener(int row, int col) {
        for (CTableModelChangeListener cTableModelChangeListener : cTableModelChangeListeners) {
            cTableModelChangeListener.cellUpdated(row, col);
        }
    }

}
