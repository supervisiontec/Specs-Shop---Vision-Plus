/*
 *  CComboBoxX.java
 * 
 *  @author Channa Mohan
 *     hjchanna@gmail.com
 * 
 *  Created on Jul 18, 2014, 11:20:36 AM
 *  Copyrights channa mohan, All rights reserved.
 * 
 */
package com.sv.visionplus.util.component.combobox;

import com.sv.visionplus.base.master.AbstractMasterFormGUI;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
//import com.mac.af.panel.dialog.cpanel_dialog.CPanelDialog;
//import com.mac.af.panel.dialog.object_creator_dialog.ObjectCreatorDialog;
//import com.mac.af.component.derived.input.ComponentFocusKeyEvent;
//import com.mac.af.component.model.combo.CComboBoxModel;
//import com.mac.af.component.base.button.action.ActionUtil;
//import com.mac.af.component.util.generator.CGenerator;
//import com.mac.af.templates.registration.AbstractRegistrationForm;
import com.sv.visionplus.util.component.table.CTableModel;
import com.sv.visionplus.util.component.textfield.CComponent;
import com.sv.visionplus.util.component.textfield.generator.Generator;
import com.sv.visionplus.util.component.textfield.validator.Validator;

/**
 *
 * @author mohan
 */
public class CComboBox<T> extends javax.swing.JPanel implements CComponent<T> {

    /**
     * Creates new form CComboBoxX
     */
    public CComboBox() {
        initComponents();

        initOthers();

        refreshable = true;
        nullable = true;

        setCValueEditable(true);
    }

    public CComboBox(Object[] items) {
        initComponents();
        this.data = Arrays.asList(items);

        initOthers();

        refreshable = false;
        nullable = false;
        setCValueEditable(true);
    }

    public void addItemListener(ItemListener listener) {
        cboMain.addItemListener(listener);
    }

    public void addActionListener(ActionListener listener) {
        cboMain.addActionListener(listener);
    }

    public void doRefresh() {
        T object = getCValue();
        refreshCombo();
        setCValue(object);
    }

    public void doSetNull() {
        setCValue(null);
    }

    public void doExtend() {
//        if (tableModel != null) {
//            tableModel.setTableData(data);
//
//            T value = objectCreatorDialog.getNewObject();
//            setCValue(value);
//        }
    }

    public void doRegister() {
//        registrationDialog.showCPanel();
//        refreshCombo();
    }

    public void setButtonVisible(boolean state) {
        btnRefresh.setVisible(state);
        btnExtend.setVisible(state);
        btnRegister.setVisible(state);
        btnSetNull.setVisible(state);

        pnl.setVisible(state);
    }

    private void refreshCombo() {
        Runnable r;
        r = new Runnable() {
            @Override
            public void run() {
                while (!isShowing()) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(CComboBox.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                data = getComboData();
                setComboData(data);

                if (data != null && data.size() > 0) {
                    setSelectedIndex(0);
                }
                afterRefresh();
            }
        };

        Thread thread = new Thread(r);
        thread.start();
    }

    public boolean isExpressEditable() {
        return expressEditable;
    }

    public void setExpressEditable(boolean expressEditable) {
        this.expressEditable = expressEditable;
    }

    public List getComboData() {
        return data;
    }

    protected void afterRefresh() {
    }

    @Deprecated
    public JComboBox getComboBox() {
        return cboMain;
    }

    public void setTableModel(CTableModel<T> tableModel) {
//        this.tableModel = tableModel;
//        extendPanel.setTableModel(tableModel);
//
//        resetButtonEnability();
    }

//    public void setRegistration(String title, Class<? extends AbstractRegistrationForm<T>> registrationClass) {
//        this.registrationTitle = title;
//        this.registrationClass = registrationClass;
//
//        initCPanelDialog();
//        resetButtonEnability();
//    }
    private void resetButtonEnability() {
        btnRefresh.setEnabled(isCValueEditable() ? refreshable : false);
        btnSetNull.setEnabled(isCValueEditable() ? nullable : false);
        btnExtend.setEnabled(isCValueEditable() ? tableModel != null : false);
        btnRegister.setEnabled(isCValueEditable() ? registrationClass != null : false);
    }

//    private void initCPanelDialog() {
//        if (registrationDialog == null) {
//            registrationDialog = new CPanelDialog(registrationTitle, registrationClass);
//        }
//    }
    @SuppressWarnings("unchecked")
    private void initOthers() {
        ExpressEditableComboComponent.getInstance(this);
//        ComponentFocusKeyEvent.inject(cboMain);

        //data
        model = new CComboBoxModel();
        setComboBoxModel(model);
        refreshCombo();

        //extend dialog
//        objectCreatorDialog = new ObjectCreatorDialog<>();
//        extendPanel = new ExtendPanel<>(objectCreatorDialog);
//        objectCreatorDialog.setObjectCreator(extendPanel);
//        objectCreatorDialog.setTitle("Find");
//        tableModel = null;
//
//        registrationClass = null;

        resetButtonEnability();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cboMain = new javax.swing.JComboBox();
        pnl = new javax.swing.JPanel();
        btnRefresh = new javax.swing.JButton();
        btnSetNull = new javax.swing.JButton();
        btnExtend = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();

        pnl.setLayout(new java.awt.GridLayout(1, 0));

        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sv/visionplus/util/component/combobox/resources/refresh.png"))); // NOI18N
        btnRefresh.setFocusable(false);
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        pnl.add(btnRefresh);

        btnSetNull.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sv/visionplus/util/component/combobox/resources/set_null.png"))); // NOI18N
        btnSetNull.setFocusable(false);
        btnSetNull.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetNullActionPerformed(evt);
            }
        });
        pnl.add(btnSetNull);

        btnExtend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sv/visionplus/util/component/combobox/resources/extend.png"))); // NOI18N
        btnExtend.setFocusable(false);
        btnExtend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExtendActionPerformed(evt);
            }
        });
        pnl.add(btnExtend);

        btnRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sv/visionplus/util/component/combobox/resources/register.png"))); // NOI18N
        btnRegister.setFocusable(false);
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        pnl.add(btnRegister);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(cboMain, 0, 135, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cboMain)
            .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        doRefresh();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnSetNullActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetNullActionPerformed
        doSetNull();
    }//GEN-LAST:event_btnSetNullActionPerformed

    private void btnExtendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExtendActionPerformed
        doExtend();
    }//GEN-LAST:event_btnExtendActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        doRegister();
    }//GEN-LAST:event_btnRegisterActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExtend;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnSetNull;
    private javax.swing.JComboBox cboMain;
    private javax.swing.JPanel pnl;
    // End of variables declaration//GEN-END:variables
    private boolean expressEditable;
    private CComboBoxModel model;
    private List data;
    //new actions
//    private ExtendPanel<T> extendPanel;
    private CTableModel<T> tableModel;
//    private ObjectCreatorDialog<T> objectCreatorDialog;
    //
    private Class<? extends AbstractMasterFormGUI<T>> registrationClass;
//    private CPanelDialog registrationDialog;
    private String registrationTitle;
//    private CGenerator generator;
    private boolean refreshable = false;
    private boolean nullable = false;

    private void setSelectedItem(final T item) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                cboMain.setSelectedItem(item);
            }
        };

        runnable.run();
    }

    private void setSelectedIndex(final int index) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                cboMain.setSelectedIndex(index);
            }
        };
        runnable.run();
    }

    private void setComboData(final List<T> data) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                model.setComboData(data);
            }
        };
        runnable.run();
    }

    private void setComboBoxModel(final CComboBoxModel<T> comboModel) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                model = comboModel;
                cboMain.setModel(comboModel);
            }
        };
        runnable.run();
    }


    /*
    @Override
    public void resetValue() {
        if (cboMain.getItemCount() > 0) {
            setSelectedIndex(0);
        }
    }

    @Override
    public boolean isValueValid() {
        return cboMain.getSelectedItem() != null;
    }

    @Override
    public void setValueEditable(boolean value) {
        cboMain.setEnabled(value);
        resetButtonEnability();
    }

    @Override
    public boolean isValueEditable() {
        return cboMain.isEnabled();
    }

    @Override
    public void setCValue(T value) {
        setSelectedItem(value);
        repaint();
    }

    @Override
    public T getCValue() {
        return (T) cboMain.getSelectedItem();
    }

    private void setSelectedItem(final T item) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                cboMain.setSelectedItem(item);
            }
        };
        CApplication.invokeEventDispatch(runnable);

    }

    private void setComboBoxModel(final CComboBoxModel<T> comboModel) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                model = comboModel;
                cboMain.setModel(comboModel);
            }
        };
        CApplication.invokeEventDispatch(runnable);
    }

    private void setComboData(final List<T> data) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                model.setComboData(data);
            }
        };
        CApplication.invokeEventDispatch(runnable);
    }

    private void setSelectedIndex(final int index) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                cboMain.setSelectedIndex(index);
            }
        };
        CApplication.invokeEventDispatch(runnable);
    }

    @Override
    public void setGenerator(CGenerator generator) {
        this.generator = generator;
    }

    @Override
    public CGenerator getGenerator() {
        return this.generator;
    }

    @Override
    public void setPermission(boolean permission) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     */
    @Override
    public void setDefaultValueGenerator(Generator<T> generator) {
    }

    @Override
    public Generator<T> getDefaultValueGenerator() {
        return null;
    }

    @Override
    public T getCValue() {
        return (T) cboMain.getSelectedItem();
    }

    @Override
    public void setCValue(T value) {
        setSelectedItem(value);
        repaint();
    }

    @Override
    public void resetCValue() {
        if (cboMain.getItemCount() > 0) {
            setSelectedIndex(0);
        }
    }

    @Override
    public void setCValueEditable(boolean status) {
        cboMain.setEnabled(status);
        resetButtonEnability();
    }

    @Override
    public boolean isCValueEditable() {
        return cboMain.isEnabled();
    }

    @Override
    public Validator<T> getValidator() {
        return null;
    }

    @Override
    public void setValidator(Validator<T> validator) {
    }

    @Override
    public boolean isCValueValid() {
        return cboMain.getSelectedItem() != null;
    }

    @Override
    public void setEssential(boolean status) {
        
    }

    @Override
    public boolean isEssential() {
        return false;
    }
}
