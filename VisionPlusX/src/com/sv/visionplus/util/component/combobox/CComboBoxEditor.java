/*
 *  CComboBoxEditor.java
 * 
 *  @author Channa Mohan
 *     hjchanna@gmail.com
 * 
 *  Created on Jul 3, 2014, 12:02:19 PM
 *  Copyrights channa mohan, All rights reserved.
 * 
 */
package com.sv.visionplus.util.component.combobox;

import java.awt.Component;
import java.awt.event.ActionListener;
import javax.swing.ComboBoxEditor;
import javax.swing.JTextField;

/**
 *
 * @author mohan
 */
public class CComboBoxEditor
        implements ComboBoxEditor {

    public CComboBoxEditor() {
        textField = new JTextField();
    }

    @Override
    public Component getEditorComponent() {
        return textField;
    }

    @Override
    public void setItem(Object anObject) {
        this.object = anObject;
        if (object != null) {
            textField.setText(object.toString());
        } else {
            textField.setText("");
        }
    }

    @Override
    public Object getItem() {
        return this.object;
    }

    @Override
    public void selectAll() {
        ((JTextField) textField).selectAll();
    }

    @Override
    public void addActionListener(ActionListener l) {
        textField.addActionListener(l);
    }

    @Override
    public void removeActionListener(ActionListener l) {
        textField.removeActionListener(l);
    }
    private Object object;
    private JTextField textField;
}
