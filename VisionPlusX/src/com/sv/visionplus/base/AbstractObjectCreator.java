/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.base;

import com.sv.visionplus.system.exception.VPException;
import javax.swing.JPanel;

/**
 *
 * @author Mohan
 */
public abstract class AbstractObjectCreator<T> extends JPanel {

    public abstract void setIdealMode();

    public abstract void setNewMode();

    public abstract void setEditMode();
    
    public abstract void resetFields();

    public abstract void initObject() throws VPException;

    public abstract void initInterface() throws VPException;

    protected abstract void setValueAbstract(T object);

    protected abstract T getValueAbstract();

    public T getValue() throws VPException {
        initObject();

        return getValueAbstract();
    }

    public void setValue(T value) throws VPException {
        setValueAbstract(value);

        initInterface();
    }

}
