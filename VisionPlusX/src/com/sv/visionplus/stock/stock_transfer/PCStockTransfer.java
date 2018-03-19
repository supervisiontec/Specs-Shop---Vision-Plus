/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.stock.stock_transfer;

import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.base.transaction.AbstractTransactionForm;
import com.sv.visionplus.stock.stock_transfer.dialog.ItemDialog;
import com.sv.visionplus.stock.stock_transfer.model.MItem;
import com.sv.visionplus.stock.stock_transfer.model.StockTransferMix;
import com.sv.visionplus.stock.stock_transfer.model.StockTransferModelMix;
import com.sv.visionplus.stock.stock_transfer.model.Store;
import com.sv.visionplus.stock.stock_transfer.model.TStockLedger;
import com.sv.visionplus.system.exception.VPException;
import com.sv.visionplus.util.formatter.FormatterUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import visionplusx.Home;
import visionplusx.logFile.LogFileModel;

/**
 *
 * @author Mohan
 */
public class PCStockTransfer extends AbstractObjectCreator<StockTransferModelMix> {

    private StockTransferMix mix;
    private StockTransferModelMix mix1;

    /**
     * Creates new form PCInvoice
     */
    public PCStockTransfer(AbstractTransactionForm transactionForm) {
        initComponents();

        this.transactionForm = transactionForm;
        model = (DefaultTableModel) tblItem.getModel();
        addStoreToCombo();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cmboFrom = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        cmboTo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        lblCount = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItem = new javax.swing.JTable();
        txtName = new com.sv.visionplus.util.component.textfield.CStringField();
        btnSearch = new javax.swing.JButton();
        txtBrand = new com.sv.visionplus.util.component.textfield.CStringField();
        txtCategory = new com.sv.visionplus.util.component.textfield.CStringField();
        txtCode = new com.sv.visionplus.util.component.textfield.CStringField();
        jButton1 = new javax.swing.JButton();
        txtQty = new com.sv.visionplus.util.component.textfield.CDoubleField();

        jLabel3.setText("From :");

        cmboFrom.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmboFromItemStateChanged(evt);
            }
        });
        cmboFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboFromActionPerformed(evt);
            }
        });

        jLabel4.setText("To :");

        jLabel1.setText("No of Item :");

        lblCount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCount.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmboFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmboTo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCount)
                .addContainerGap(226, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmboFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cmboTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(lblCount))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        tblItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "", "Item Code", "Name", "Brand", "Catrgory", "Qty"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblItemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblItem);
        if (tblItem.getColumnModel().getColumnCount() > 0) {
            tblItem.getColumnModel().getColumn(0).setMinWidth(0);
            tblItem.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblItem.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBrand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmboFromItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmboFromItemStateChanged
        model.setRowCount(0);
        lblCount.setText("0");
        txtBrand.resetCValue();
        txtCategory.resetCValue();
        txtCode.resetCValue();
        txtName.resetCValue();
        txtQty.resetCValue();
    }//GEN-LAST:event_cmboFromItemStateChanged

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        int storreId = Integer.parseInt(cmboFrom.getSelectedItem().toString().split("-")[0]);
        ItemDialog dialog = new ItemDialog(null, true);
        dialog.setFrame(this, storreId);
        dialog.setVisible(true);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void tblItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblItemMouseClicked

    }//GEN-LAST:event_tblItemMouseClicked

    private void cmboFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboFromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmboFromActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (txtQty.getCValue() > 0) {
            if (mix.getQtyOnHand() >= txtQty.getCValue()) {
                addData(mix);
            }else{
            JOptionPane.showMessageDialog(null, "Out of Range Qty");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Insert Qty..");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    @Override
    public void setIdealMode() {
        cmboFrom.setEnabled(false);
        cmboTo.setEnabled(false);

        txtName.setCValueEditable(false);
        model.setRowCount(0);

        txtQty.setCValueEditable(false);
        btnSearch.setEnabled(false);

    }

    @Override
    public void setNewMode() {
        mix=new StockTransferMix();
        mix1=new StockTransferModelMix();
        
        cmboFrom.setEnabled(true);
        cmboTo.setEnabled(true);

        txtName.setCValueEditable(true);
        model.setRowCount(0);

        txtQty.setCValueEditable(true);
        btnSearch.setEnabled(true);

    }

    @Override
    public void setEditMode() {
        cmboFrom.setEnabled(true);
        cmboTo.setEnabled(true);

        txtName.setCValueEditable(true);
        model.setRowCount(0);

        txtQty.setCValueEditable(true);
        btnSearch.setEnabled(true);

    }

    @Override
    public void resetFields() {
        cmboFrom.setEnabled(false);
        cmboTo.setEnabled(false);

        txtName.setCValueEditable(false);
        model.setRowCount(0);

        txtQty.setCValueEditable(false);
        btnSearch.setEnabled(false);

    }

    @Override
    public void initObject() throws VPException {

        List<TStockLedger> ledgerList = new ArrayList<>();
        for (int i = 0; i < model.getRowCount(); i++) {

            TStockLedger ledger = new TStockLedger();
            ledger.setDate(new Date());
            ledger.setForm("Stock Transfer");
//        ledger.setIndexNo(0);auto
            ledger.setItem(Integer.parseInt(model.getValueAt(i, 0).toString()));
            double qty = Double.parseDouble(model.getValueAt(i, 5).toString());
            ledger.setQty((qty - qty) - qty);//(- Qty)
            ledger.setStore(mix.getStoreId());

            ledgerList.add(ledger);

            TStockLedger ledger2 = new TStockLedger();
            ledger2.setDate(new Date());
            ledger2.setForm("Stock Transfer");
//        ledger2.setIndexNo(0);auto
            ledger2.setItem(Integer.parseInt(model.getValueAt(i, 0).toString()));
//            double qty = Double.parseDouble(model.getValueAt(i, 5).toString());
            ledger2.setQty(qty);//(- Qty)
            int storeId = Integer.parseInt(cmboTo.getSelectedItem().toString().split("-")[0]);
            ledger2.setStore(storeId);

            ledgerList.add(ledger2);
            mix1.setLedger(ledgerList);
        }

        LogFileModel logFile = new LogFileModel();
        logFile.setDate(new Date());
        logFile.setFormName("Stock Transfer");
//        logFile.setIndexNo(0);//auto
        logFile.setRemarks("Stock Transfer");
        logFile.setTime(FormatterUtil.getInstance().getTime());
        logFile.setTransactionType("Save");
        logFile.setUser(Home.getInstance().getUser().getIndexNo());
        logFile.setUserName(Home.getInstance().getUser().getName());
        logFile.setValue(0.00);
        mix1.setLogFile(logFile);
    }

    @Override
    public void initInterface() throws VPException {

    }

    @Override
    protected void setValueAbstract(StockTransferModelMix mix) {
    this.mix1=mix;
    }
    

    @Override
    protected StockTransferModelMix getValueAbstract() {
        return mix1;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox cmboFrom;
    private javax.swing.JComboBox cmboTo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCount;
    private javax.swing.JTable tblItem;
    private com.sv.visionplus.util.component.textfield.CStringField txtBrand;
    private com.sv.visionplus.util.component.textfield.CStringField txtCategory;
    private com.sv.visionplus.util.component.textfield.CStringField txtCode;
    private com.sv.visionplus.util.component.textfield.CStringField txtName;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtQty;
    // End of variables declaration//GEN-END:variables
    private AbstractTransactionForm<MItem> transactionForm;
    DefaultTableModel model;

    private void addStoreToCombo() {
        List<Store> allStore = StoreDAO.getInstance().allStore();
        if (allStore != null) {
            for (Store store : allStore) {
                cmboFrom.addItem(store.getIndexNo() + "-" + store.getName());
                cmboTo.addItem(store.getIndexNo() + "-" + store.getName());
            }
        }
    }

    public void setItem(StockTransferMix mix) {
        this.mix = mix;
        txtCode.setCValue(mix.getCode());
        txtBrand.setCValue(mix.getBrand());
        txtCategory.setCValue(mix.getCategory());
        txtName.setCValue(mix.getName());
        txtQty.setCValue(0.00);

    }

    private void addData(StockTransferMix mix) {
        Object[] rowData = {
            mix.getItemNo(),
            mix.getCode(),
            mix.getName(),
            mix.getBrand(),
            mix.getCategory(),
            txtQty.getCValue()
        };
        model.addRow(rowData);
        lblCount.setText(model.getRowCount() + "");
    }

}
