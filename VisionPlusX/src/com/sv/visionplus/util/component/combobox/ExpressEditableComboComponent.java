/*
 *  ExpressEditableComboComponent.java
 *  
 *  @author channa mohan
 *     hjchanna@gmail.com
 *  
 *  Created on Jun 14, 2014, 10:04:37 AM
 *  Copyrights Channa Mohan, All rights reserved.
 *  
 */
package com.sv.visionplus.util.component.combobox;

import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;
import javax.swing.text.PlainDocument;

/**
 *
 * @author mohan
 */
public class ExpressEditableComboComponent extends PlainDocument {

    public static void getInstance(CComboBox combo) {
        new ExpressEditableComboComponent(combo);
    }

    public ExpressEditableComboComponent(CComboBox combo) {
        this.comboBox = combo.getComboBox();
        this.comboBoxContainer = combo;

        init();
    }

    private void init() {
        model = comboBox.getModel();
        comboBox.setEditor(new CComboBoxEditor());

        comboBox.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if (e.getActionCommand().equals("comboBoxEdited")) {
//                    if (comboBoxContainer.isExpressEditable()) {

//                        if (comboBox.isEditable()) {
                    comboBox.setEditable(false);
//                        }
//                    }
                } else {
                    if (comboBox.getSelectedItem() != null) {
                        setSelectedItem(comboBox.getSelectedItem());
                    }
                    highlightCompletedText(0);
                }
            }
        });

        comboBox.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
//                super.focusGained(e);

                if (comboBoxContainer.isExpressEditable()) {
                    if (!comboBox.isEditable()) {
                        comboBox.setEditable(true);
                    }
                }
            }
        });

        comboBox.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            @Override
            public void propertyChange(java.beans.PropertyChangeEvent e) {
                if (e.getPropertyName().equals("editor")) {
                    configureEditor((javax.swing.ComboBoxEditor) e.getNewValue());
                }
                if (e.getPropertyName().equals("model")) {
                    model = (javax.swing.ComboBoxModel) e.getNewValue();
                }
            }
        });

        editorKeyListener = new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent e) {
                if (comboBox.isDisplayable()) {
                    comboBox.setPopupVisible(true);
                }
                hitBackspace = false;
                switch (e.getKeyCode()) {
                    // determine if the pressed key is backspace (needed by the remove method)
                    case java.awt.event.KeyEvent.VK_BACK_SPACE:
                        hitBackspace = true;
                        hitBackspaceOnSelection = editor.getSelectionStart() != editor.getSelectionEnd();
                        break;
                    // ignore delete key
                    case java.awt.event.KeyEvent.VK_DELETE:
                        e.consume();
                        comboBox.getToolkit().beep();
                        break;
                }
            }
        };

        // Bug 5100422 on Java 1.5: Editable JComboBox won't hide popup when tabbing out
        hidePopupOnFocusLoss = System.getProperty("java.version").startsWith("1.5");

        // Highlight whole text when gaining focus
        editorFocusListener = new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                highlightCompletedText(0);
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                // Workaround for Bug 5100422 - Hide Popup on focus loss
                if (hidePopupOnFocusLoss) {
                    comboBox.setPopupVisible(false);
                }

                if (comboBoxContainer.isExpressEditable()) {
                    comboBox.setEditable(false);
                }
            }
        };

        configureEditor(comboBox.getEditor());

        // Handle initially selected object
        Object selected = comboBox.getSelectedItem();
        if (selected != null) {
            setText(getText(selected));
        }

        highlightCompletedText(0);
    }

    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        // return immediately when selecting an item
        if (selecting) {
            return;
        }
        // insert the string into the document
        super.insertString(offs, str, a);
        // lookup and select a matching item
        Object item = lookupItem(getText(0, getLength()));
        if (item != null) {
            setSelectedItem(item);
        } else {
            // keep old item selected if there is no match
            item = comboBox.getSelectedItem();
            // imitate no insert (later on offs will be incremented by str.length(): selection won't move forward)
            offs = offs - str.length();
            // provide feedback to the user that his input has been received but can not be accepted
            comboBox.getToolkit().beep(); // when available use: UIManager.getLookAndFeel().provideErrorFeedback(comboBox);
        }
        setText(getText(item));
        // select the completed part
        highlightCompletedText(offs + str.length());
    }

    @Override
    public void remove(int offs, int len) throws BadLocationException {
        // return immediately when selecting an item
        if (selecting) {
            return;
        }
        if (hitBackspace) {
            // user hit backspace => move the selection backwards
            // old item keeps being selected
            if (offs > 0) {
                if (hitBackspaceOnSelection) {
                    offs--;
                }
            } else {
                // User hit backspace with the cursor positioned on the start => beep
                comboBox.getToolkit().beep(); // when available use: UIManager.getLookAndFeel().provideErrorFeedback(comboBox);
            }
            highlightCompletedText(offs);
        } else {
            super.remove(offs, len);
        }
    }

    private void setText(String text) {
        try {
            // remove all text and insert the completed string
            super.remove(0, getLength());
            super.insertString(0, text, null);
        } catch (BadLocationException e) {
            throw new RuntimeException(e.toString());
        }
    }

    private void highlightCompletedText(int start) {
        editor.setCaretPosition(getLength());
        editor.moveCaretPosition(start);
    }

    private void setSelectedItem(Object item) {
        selecting = true;
        comboBox.getEditor().setItem(item);
//        model.setSelectedItem(item);
        comboBox.setSelectedItem(item);
        selecting = false;
        setText(getText(item));
    }

    private Object lookupItem(String pattern) {
        Object selectedItem = model.getSelectedItem();
        // only search for a different item if the currently selected does not match
        if (selectedItem != null && startsWithIgnoreCase(getText(selectedItem), pattern)) {
            return selectedItem;
        } else {
            // iterate over all items
            for (int i = 0, n = model.getSize(); i < n; i++) {
                Object currentItem = model.getElementAt(i);
                // current item starts with the pattern?
                if (currentItem != null && startsWithIgnoreCase(getText(currentItem), pattern)) {
                    return currentItem;
                }
            }
        }
        // no item starts with the pattern => return null
        return null;
    }

    private void configureEditor(javax.swing.ComboBoxEditor newEditor) {
        if (editor != null) {
            editor.removeKeyListener(editorKeyListener);
            editor.removeFocusListener(editorFocusListener);
        }

        if (newEditor != null) {
            editor = (javax.swing.text.JTextComponent) newEditor.getEditorComponent();
            editor.addKeyListener(editorKeyListener);
            editor.addFocusListener(editorFocusListener);
            editor.setDocument(this);
        }
    }
    // checks if str1 starts with str2 - ignores case

    private boolean startsWithIgnoreCase(String str1, String str2) {
        return str1.toUpperCase().startsWith(str2.toUpperCase());
    }

    private String getText(Object item) {
        if (item == null) {
            return "";
        }
        return item.toString();
    }
    //
    private JComboBox comboBox;
    private CComboBox comboBoxContainer;
    private ComboBoxModel model;
    private JTextComponent editor;
    // flag to indicate if setSelectedItem has been called
    // subsequent calls to remove/insertString should be ignored
    private boolean selecting = false;
    private boolean hidePopupOnFocusLoss;
    private boolean hitBackspace = false;
    private boolean hitBackspaceOnSelection;
    private java.awt.event.KeyListener editorKeyListener;
    private java.awt.event.FocusListener editorFocusListener;
}
