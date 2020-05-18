/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.stock.stock_adjustment;

import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.base.transaction.AbstractTransactionForm;
import com.sv.visionplus.channel.doctor.DoctorFormDao;
import com.sv.visionplus.channel.doctor.model.DoctorModel;
import com.sv.visionplus.master.store.StoreDao;
import com.sv.visionplus.master.store.model.MStore;
import com.sv.visionplus.stock.stock_adjustment.dialog.Item.ItemDialog;
import com.sv.visionplus.stock.stock_adjustment.dialog.Item.SearchItemMixModel;
import com.sv.visionplus.stock.stock_adjustment.model.MItem;
import com.sv.visionplus.stock.stock_adjustment.model.TStockLedger;
import com.sv.visionplus.system.exception.VPException;
import com.sv.visionplus.transaction.invoice.StockLedgerDAO;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Mohan
 */
public class PCStockAdujstment extends AbstractObjectCreator<MItem> {

    /**
     * Creates new form PCInvoice
     */
    public PCStockAdujstment(AbstractTransactionForm transactionForm) {
        initComponents();
        txtItemCode.setEditable(false);
        txtItemName.setEditable(false);
        txtDate.setDate(new Date());
        getAllStore();

        this.transactionForm = transactionForm;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txtItemName = new com.sv.visionplus.util.component.textfield.CStringField();
        jLabel1 = new javax.swing.JLabel();
        txtDate = new org.jdesktop.swingx.JXDatePicker();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmboStore = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtItemCode = new com.sv.visionplus.util.component.textfield.CStringField();
        txtQty = new com.sv.visionplus.util.component.textfield.CStringField();

        jButton4.setText("Item Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Save");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setText("Item Code");

        jLabel2.setText("Item Name");

        jLabel3.setText("Date");

        jLabel4.setText("Store");

        jLabel5.setText("Qty ( + / - )");

        txtQty.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(txtItemCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(txtItemName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                .addGap(81, 81, 81)))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                .addGap(8, 8, 8))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(28, 28, 28)))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmboStore, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                .addGap(28, 28, 28)))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(txtQty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                .addComponent(jLabel5))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5)))
                .addGap(30, 30, 30))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton4))
                            .addComponent(txtQty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmboStore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addComponent(jButton5)
                .addContainerGap(305, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ItemDialog dialog = new ItemDialog(null, true);
        dialog.setFrame(this);
        dialog.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        TStockLedger stockAdjust = new TStockLedger();
        stockAdjust.setDate(txtDate.getDate());
        stockAdjust.setItem(selectedItem);
        stockAdjust.setForm("Adjustment");
        stockAdjust.setQty(Double.parseDouble(txtQty.getValue().toString()));
        String[] split = cmboStore.getSelectedItem().toString().split(" ");
        stockAdjust.setStore(Integer.parseInt(split[0]));

        int saveStockAdjustment = new StockAdjustmentDAO().saveStockAdjustment(stockAdjust);
        if (saveStockAdjustment > 0) {
            txtItemCode.setText("");
            txtItemName.setText("");
            txtQty.setText("");
            txtDate.setDate(new Date());
            JOptionPane.showMessageDialog(null, "Stock Adjustment Save Success !");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    @Override
    public void setIdealMode() {

    }

    @Override
    public void setNewMode() {

    }

    @Override
    public void setEditMode() {

    }

    @Override
    public void resetFields() {

    }

    @Override
    public void initObject() throws VPException {

    }

    @Override
    public void initInterface() throws VPException {

    }

    @Override
    protected void setValueAbstract(MItem item) {
    }

    @Override
    protected MItem getValueAbstract() {
        return null;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmboStore;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel7;
    private org.jdesktop.swingx.JXDatePicker txtDate;
    private com.sv.visionplus.util.component.textfield.CStringField txtItemCode;
    private com.sv.visionplus.util.component.textfield.CStringField txtItemName;
    private com.sv.visionplus.util.component.textfield.CStringField txtQty;
    // End of variables declaration//GEN-END:variables
    private AbstractTransactionForm<MItem> transactionForm;
    private int selectedItem;

    public void setItem(SearchItemMixModel mixModel) {
        txtItemCode.setText(mixModel.getCode());
        selectedItem = mixModel.getItem();
        txtItemName.setText(mixModel.getName());
        txtQty.setText(mixModel.getTotal_qty() + "");
    }

    private void getAllStore() {
        try {
            java.sql.Connection connection = com.sv.visionplus.util.database.DatabaseUtil.getInstance().openConnection();
            StoreDao storeDAO = new StoreDao();
            java.util.List<MStore> searchResult = storeDAO.getAll(connection);
            for (MStore store : searchResult) {
                cmboStore.addItem(store.getIndexNo() + " " + store.getName());
            }
        } catch (java.sql.SQLException ex) {
            java.util.logging.Logger.getLogger(PCStockAdujstment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

}
