package com.sv.visionplus.base.transaction;

import com.sv.visionplus.base.AbstractObjectCreator;
import static com.sv.visionplus.base.master.AbstractMasterFormGUI.IDEAL_MODE;
import com.sv.visionplus.system.exception.VPException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import visionplusx.Home;

/**
 *
 * @author Mohan
 */
public abstract class AbstractTransactionForm<T> extends javax.swing.JPanel {

    public AbstractTransactionForm() {
        initComponents();

        initOthers();
    }

    //abstractions
    protected abstract AbstractTransactionFormService<T> getTransactionFormService();

    protected abstract AbstractObjectCreator<T> getObjectCreator();

    //actions
    public void doNew() {
        setMode(NEW_MODE);
    }

    public void doEdit() {
        setMode(EDIT_MODE);
    }

    public void doDelete() {
        T object = null;
        try {
            object = this.objectCreator.getValue();
        } catch (VPException ex) {
            Logger.getLogger(AbstractTransactionForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(Home.getInstance(), ex.getMessage(), "Delete", JOptionPane.ERROR_MESSAGE);
        }

        if (object != null) {
            int q = JOptionPane.showConfirmDialog(Home.getInstance(), "Do you sure want to delete?", "Delete", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);

            try {
                if (q == JOptionPane.YES_OPTION) {
                    this.transactionFormService.delete(object);

                    JOptionPane.showMessageDialog(Home.getInstance(), "Successfully deleted..!", "Delete", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (VPException dabex) {
                JOptionPane.showMessageDialog(Home.getInstance(), "Delete Failed.\n" + dabex.getMessage(), "Delete", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void doPrint() {

    }

    public void doSave() {
        T object = null;
        try {
            object = this.objectCreator.getValue();
        } catch (VPException ex) {
            Logger.getLogger(AbstractTransactionForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(Home.getInstance(), ex.getMessage(), "Save", JOptionPane.ERROR_MESSAGE);
        }

        if (object != null) {
            int q = JOptionPane.showConfirmDialog(Home.getInstance(), "Do you sure want to save?", "Save", JOptionPane.YES_NO_OPTION);

            try {
                if (q == JOptionPane.YES_OPTION) {
                    if (currentMode.equals(NEW_MODE)) {
                        this.transactionFormService.save(object);
                    }

                    if (currentMode.equals(EDIT_MODE)) {
                        this.transactionFormService.update(object);
                    }

                    JOptionPane.showMessageDialog(Home.getInstance(), "Successfully saved..!", "Save", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (VPException dabex) {
                JOptionPane.showMessageDialog(Home.getInstance(), "Save Failed.\n" + dabex.getMessage(), "Save", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void doDiscard() {
        int q = JOptionPane.showConfirmDialog(Home.getInstance(), "Do you sure want to discard changes ?", "Discard", JOptionPane.YES_NO_OPTION);

        if (q == JOptionPane.YES_OPTION) {
            setMode(IDEAL_MODE);
        }
    }

    //public functions
    public void setValue(Integer indexNo) {
        try {
            T value = this.transactionFormService.select(indexNo);

            this.objectCreator.setValue(value);

            this.isValueNull = value == null;

            resetButtonEnability();
        } catch (VPException ex) {
            Logger.getLogger(AbstractTransactionForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //other functions
    private void resetButtonEnability() {
        btnEdit.setEnabled(!isValueNull);
        btnDelete.setEnabled(!isValueNull);
        btnPrint.setEnabled(!isValueNull);
    }

    private void setMode(String mode) {
        this.currentMode = mode;

        //button visibility
        switch (mode) {
            case IDEAL_MODE:
                btnNew.setVisible(true);
                btnEdit.setVisible(true);
                btnDelete.setVisible(true);
                btnPrint.setVisible(true);
                btnSave.setVisible(false);
                btnDiscard.setVisible(false);

                this.objectCreator.setIdealMode();
                break;
            case NEW_MODE:
                btnNew.setVisible(false);
                btnEdit.setVisible(false);
                btnDelete.setVisible(false);
                btnPrint.setVisible(false);
                btnSave.setVisible(true);
                btnDiscard.setVisible(true);

                this.objectCreator.setNewMode();
                break;
            case EDIT_MODE:
                btnNew.setVisible(false);
                btnEdit.setVisible(false);
                btnDelete.setVisible(false);
                btnPrint.setVisible(false);
                btnSave.setVisible(true);
                btnDiscard.setVisible(true);

                this.objectCreator.setEditMode();
                break;
            default:
                throw new AssertionError();
        }
    }

    @SuppressWarnings("unchecked")
    private void initOthers() {
        //service
        this.transactionFormService = getTransactionFormService();

        //object creator
        this.objectCreator = getObjectCreator();
        this.pnlContent.add(this.objectCreator);
        this.pnlContent.revalidate();

        //ideal mode
        setMode(IDEAL_MODE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContent = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDiscard = new javax.swing.JButton();

        pnlContent.setLayout(new javax.swing.BoxLayout(pnlContent, javax.swing.BoxLayout.LINE_AXIS));

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDiscard.setText("Discard");
        btnDiscard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiscardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrint)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDiscard)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnSave)
                    .addComponent(btnDiscard)
                    .addComponent(btnNew)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete)
                    .addComponent(btnPrint))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        doNew();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        doEdit();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        doDelete();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        doPrint();
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        doSave();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDiscardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiscardActionPerformed
        doDiscard();
    }//GEN-LAST:event_btnDiscardActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDiscard;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnSave;
    private javax.swing.JPanel pnlContent;
    // End of variables declaration//GEN-END:variables

    private AbstractTransactionFormService<T> transactionFormService;
    private AbstractObjectCreator<T> objectCreator;
    //mode
    private String currentMode;
    //
    public static final String IDEAL_MODE = "IDEAL";
    public static final String NEW_MODE = "NEW";
    public static final String EDIT_MODE = "EDIT";
    //
    private boolean isValueNull = true;
}
