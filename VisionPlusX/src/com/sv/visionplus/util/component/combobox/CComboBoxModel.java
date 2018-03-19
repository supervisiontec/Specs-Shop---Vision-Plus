/*
 *  CComboBoxModel.java
 *  
 *  @author channa mohan
 *     hjchanna@gmail.com
 *  
 *  Created on Jun 14, 2014, 9:55:18 AM
 *  Copyrights Channa Mohan, All rights reserved.
 *  
 */
package com.sv.visionplus.util.component.combobox;

import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.MutableComboBoxModel;

/**
 *
 * @author mohan
 */
public class CComboBoxModel<T> extends AbstractListModel implements MutableComboBoxModel {
    public CComboBoxModel() {
    }

    public CComboBoxModel(List<T> comboData) {
        this.comboData = comboData;
    }

    @Override
    public int getSize() {
        return comboData != null ? comboData.size() : 0;
    }

    @Override
    public Object getElementAt(int i) {
        return comboData.get(i);
    }

    @Override
    public void addElement(Object o) {
        comboData.add((T) o);
        fireContentsChanged(this, 0, comboData.size());
    }

    @Override
    public void removeElement(Object o) {
        comboData.remove((T) o);
    }

    @Override
    public void insertElementAt(Object o, int i) {
        comboData.add(i, (T) o);
    }

    @Override
    public void removeElementAt(int i) {
        comboData.remove(i);
    }

    @Override
    public void setSelectedItem(Object o) {
        selectedItem = (T) o;
    }

    @Override
    public T getSelectedItem() {
        return selectedItem;
    }

    public List<T> getComboData() {
        return comboData;
    }

    public void setComboData(List<T> comboData) {
        this.comboData = comboData;
        fireContentsChanged(this, 0, comboData == null ? 0 : comboData.size());
    }
    private List<T> comboData = new ArrayList();
    private T selectedItem;
}
