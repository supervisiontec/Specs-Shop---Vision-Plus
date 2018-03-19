package com.sv.visionplus.transaction.grn;

import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.base.transaction.AbstractTransactionForm;
import com.sv.visionplus.resource.IdGenerater.IdGenerater;
import com.sv.visionplus.transaction.grn.dialog.item.model.MItem;
import com.sv.visionplus.transaction.grn.dialog.supplier.model.MSupplier;
import com.sv.visionplus.system.exception.VPException;
import com.sv.visionplus.transaction.grn.dialog.item.ItemService;
import com.sv.visionplus.transaction.grn.dialog.item.PCItem;
import com.sv.visionplus.transaction.grn.dialog.item.model.ItemMix;
import com.sv.visionplus.transaction.grn.dialog.supplier.PCSupplier;
import com.sv.visionplus.transaction.grn.model.GrnDetail;
import com.sv.visionplus.transaction.grn.model.TGrn;
import com.sv.visionplus.transaction.grn.model.TStockLedger;
import com.sv.visionplus.transaction.grn.model.GrnMix;
import com.sv.visionplus.util.formatter.FormatterUtil;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import visionplusx.Home;
import visionplusx.logFile.LogFileModel;
import visionplusx.model.MUser;

/**
 *
 * @author Nidura Prageeth
 */
public class PCGrn extends AbstractObjectCreator<GrnMix> {

    private MUser user;
    public PCGrn(AbstractTransactionForm transactionForm) {
        initComponents();
        this.transactionForm = transactionForm;
        tableModel = ((javax.swing.table.DefaultTableModel) tableItem.getModel());
        txtItemIndex.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSupplierName = new com.sv.visionplus.util.component.textfield.CStringField();
        txtContactNo = new com.sv.visionplus.util.component.textfield.CIntegerField();
        txtEmail = new com.sv.visionplus.util.component.textfield.CStringField();
        jLabel1 = new javax.swing.JLabel();
        txtAddress = new com.sv.visionplus.util.component.textfield.CStringField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableItem = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        txtDescription = new com.sv.visionplus.util.component.textfield.CStringField();
        txtSalesPrice = new com.sv.visionplus.util.component.textfield.CDoubleField();
        txtQty = new com.sv.visionplus.util.component.textfield.CIntegerField();
        txtCode = new javax.swing.JTextField();
        txtCategory = new com.sv.visionplus.util.component.textfield.CStringField();
        txtBrand = new com.sv.visionplus.util.component.textfield.CStringField();
        txtCostPrice = new com.sv.visionplus.util.component.textfield.CDoubleField();
        btnClose = new javax.swing.JButton();
        txtDiscount = new com.sv.visionplus.util.component.textfield.CDoubleField();
        jLabel7 = new javax.swing.JLabel();
        txtTotalNetAmount = new com.sv.visionplus.util.component.textfield.CDoubleField();
        jLabel9 = new javax.swing.JLabel();
        txtTotalDiscount = new com.sv.visionplus.util.component.textfield.CDoubleField();
        jLabel10 = new javax.swing.JLabel();
        txtTotalAmount = new com.sv.visionplus.util.component.textfield.CDoubleField();
        jToggleButton2 = new javax.swing.JToggleButton();
        txtGrnNo = new com.sv.visionplus.util.component.textfield.CIntegerField();
        txtRefrenceNo = new com.sv.visionplus.util.component.textfield.CStringField();
        txtGrnDate = new org.jdesktop.swingx.JXDatePicker();
        txtItemIndex = new com.sv.visionplus.util.component.textfield.CIntegerField();

        jLabel6.setText("Date.:");

        jLabel4.setText("Ref No :");

        jLabel3.setText("Grn No.:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Supplier Details"));

        jLabel2.setText("Name :");

        jButton2.setText("+");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Contact No : ");

        jLabel8.setText("Email :");

        txtContactNo.setText("");

        jLabel1.setText("Address :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jButton2)
                    .addComponent(jLabel8)
                    .addComponent(txtSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "itemId", "Item Code", "Description", "Category", "Brand", "Sale Price", "Cost Price", "Qty", "Amount", "Unit Discount", "Discount Amount", "Net Value"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableItem.setRowHeight(23);
        tableItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableItemMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableItem);
        if (tableItem.getColumnModel().getColumnCount() > 0) {
            tableItem.getColumnModel().getColumn(0).setMinWidth(0);
            tableItem.getColumnModel().getColumn(0).setPreferredWidth(0);
            tableItem.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jButton4.setText("+");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txtDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescriptionActionPerformed(evt);
            }
        });

        txtQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtyActionPerformed(evt);
            }
        });

        txtCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeActionPerformed(evt);
            }
        });

        txtCostPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostPriceActionPerformed(evt);
            }
        });

        btnClose.setText("X");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBrand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSalesPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCostPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(127, 127, 127)
                .addComponent(txtDiscount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(95, 95, 95)
                .addComponent(btnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClose)
                .addGap(11, 11, 11))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(btnAdd)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSalesPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCostPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClose)
                    .addComponent(txtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setText("Total NetAmount : ");

        jLabel9.setText("Total Discount : ");

        jLabel10.setText("Total Amount: ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 904, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(155, 155, 155)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txtTotalDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtTotalNetAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalNetAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jToggleButton2.setText("Search");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtGrnNo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRefrenceNo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGrnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtItemIndex, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel4)
                        .addComponent(jToggleButton2)
                        .addComponent(txtRefrenceNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtGrnDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtItemIndex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtGrnNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PCSupplier supplier = new PCSupplier(null, true);
        supplier.setFrame(this);
        supplier.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        PCItem item = new PCItem(null, true);
        item.setFrame(this);
        item.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        Integer qtyText = txtQty.getCValue();
        String itemCode = txtCode.getText();
        boolean itemIsNotExists = true;
        int row = 0;

        for (int i = 0; i < tableItem.getRowCount(); i++) {
            String code = (String) tableItem.getValueAt(i, 1);
            if (code.equals(itemCode)) {
                itemIsNotExists = false;
                row = i;
            }
        }

        if (qtyText.intValue() > 0) {
            if (itemIsNotExists) {
                Double unitPrice = txtCostPrice.getCValue();
                Integer qty = qtyText;

                Object[] rd = {
                    txtItemIndex.getText(),
                    txtCode.getText(),
                    txtDescription.getCValue(),
                    txtCategory.getCValue(),
                    txtBrand.getCValue(),
                    txtSalesPrice.getCValue(),
                    unitPrice,
                    qty,
                    Double.valueOf(qty.intValue() * unitPrice.doubleValue()),
                    txtDiscount.getCValue(),
                    Double.valueOf(txtDiscount.getCValue().doubleValue() * qty.intValue()),
                    Double.valueOf((unitPrice.doubleValue() - txtDiscount.getCValue().doubleValue()) * qty.intValue())
                };

                tableModel.addRow(rd);

                getTotalAmount();
                txtCode.setText("");
                txtDescription.setText("");
                txtCategory.setText("");
                txtBrand.setText("");
                txtCostPrice.setCValue(Double.valueOf(0.0D));
                txtSalesPrice.setCValue(Double.valueOf(0.0D));
                txtDiscount.setCValue(Double.valueOf(0.0D));
                txtQty.setCValue(Integer.valueOf(0));
                txtItemIndex.setCValue(Integer.valueOf(0));
            } else {
                int showConfirmDialog = javax.swing.JOptionPane.showConfirmDialog(this, "Item is already exists ! Do you want to Change Details ?");
                if (showConfirmDialog == 0) {
                    Double unitPrice = txtCostPrice.getCValue();
                    Integer qty = qtyText;

                    Double amount = Double.valueOf(unitPrice.doubleValue() * qty.intValue());

                    tableItem.setValueAt(qty, row, 7);
                    tableItem.setValueAt(amount, row, 8);
                    getTotalAmount();
                }
            }
        }
        txtCode.requestFocus();
    }//GEN-LAST:event_btnAddActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed

    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void txtQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtyActionPerformed
        btnAdd.doClick();
    }//GEN-LAST:event_txtQtyActionPerformed

    private void txtCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeActionPerformed
        String itemCode = txtCode.getText();

        item = new ItemMix();
        item.setCode(itemCode);
        item.setItem_name("");
        item.setCategory_name("");
        item.setBrand_name("");

        java.util.List<ItemMix> searchResult = ItemService.getInstance().getSearchResult(item);

        if (searchResult.size() > 1) {
            PCItem items = new PCItem(null, true);
            items.setFrame(this);
            items.setVisible(true);
            items.addData(searchResult);
        } else {
            for (ItemMix result : searchResult) {
                txtItemIndex.setCValue(result.getIndex_no());
                txtCode.setText(result.getCode());
                txtDescription.setCValue(result.getItem_name());
                txtBrand.setCValue(result.getBrand_name());
                txtCategory.setCValue(result.getCategory_name());
                txtSalesPrice.setCValue(result.getSale_price());
                txtCostPrice.setCValue(result.getCost_price());
                txtDiscount.requestFocus();
            }
        }
    }//GEN-LAST:event_txtCodeActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
       if (tableItem.getSelectedRowCount() == 1) {
            tableModel.removeRow(tableItem.getSelectedRow());
        }
        getTotalAmount();
        txtCode.setText("");
        txtDescription.setText("");
        txtCategory.setText("");
        txtBrand.setText("");
        txtCostPrice.setCValue(Double.valueOf(0.0D));
        txtSalesPrice.setCValue(Double.valueOf(0.0D));
        txtDiscount.setCValue(Double.valueOf(0.0D));
        txtQty.setCValue(Integer.valueOf(0));
        txtItemIndex.setCValue(Integer.valueOf(0));
    }//GEN-LAST:event_btnCloseActionPerformed

    private void tableItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableItemMouseClicked
       txtItemIndex.setText(tableModel.getValueAt(tableItem.getSelectedRow(), 0).toString());
        txtCode.setText(tableModel.getValueAt(tableItem.getSelectedRow(), 1).toString());
        txtDescription.setCValue(tableModel.getValueAt(tableItem.getSelectedRow(), 2).toString());
        txtCategory.setCValue(tableModel.getValueAt(tableItem.getSelectedRow(), 3).toString());
        txtBrand.setCValue(tableModel.getValueAt(tableItem.getSelectedRow(), 4).toString());
        txtSalesPrice.setCValue((Double) tableModel.getValueAt(tableItem.getSelectedRow(), 5));
        txtCostPrice.setCValue((Double) tableModel.getValueAt(tableItem.getSelectedRow(), 6));
        txtQty.setCValue(Integer.valueOf(((Integer) tableModel.getValueAt(tableItem.getSelectedRow(), 7)).intValue()));
        txtDiscount.setCValue(Double.valueOf(((Double) tableModel.getValueAt(tableItem.getSelectedRow(), 9)).doubleValue()));

    }//GEN-LAST:event_tableItemMouseClicked

    private void txtCostPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostPriceActionPerformed

    private void txtDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescriptionActionPerformed

    @Override
    public void setIdealMode() {
        txtGrnNo.setCValueEditable(false);
        txtRefrenceNo.setCValueEditable(false);
        txtGrnDate.setEditable(false);
        txtGrnDate.setDate(new java.util.Date());
        txtSupplierName.setCValueEditable(false);
        txtContactNo.setCValueEditable(false);
        txtEmail.setCValueEditable(false);
        txtCode.setEditable(false);
        txtDescription.setCValueEditable(false);
        txtSalesPrice.setCValueEditable(false);
        txtCategory.setCValueEditable(false);
        txtBrand.setCValueEditable(false);
        txtQty.setCValueEditable(false);
        txtAddress.setCValueEditable(false);
    }

    @Override
    public void setNewMode() {
        supplier = null;
        mitem = new com.sv.visionplus.transaction.grn.dialog.item.model.MItem();
        item = new com.sv.visionplus.transaction.grn.dialog.item.model.ItemMix();
        grn = new com.sv.visionplus.transaction.grn.model.TGrn();
        grnMix = new com.sv.visionplus.transaction.grn.model.GrnMix();

        txtGrnNo.setCValueEditable(true);
        txtGrnNo.setCValue(Integer.valueOf(0));
        txtRefrenceNo.setCValueEditable(true);
        txtRefrenceNo.setCValue("");
        txtGrnDate.setEditable(true);
        txtGrnDate.setDate(new java.util.Date());
        txtSupplierName.setCValueEditable(true);
        txtSupplierName.setCValue("");
        txtContactNo.setCValueEditable(false);
        txtContactNo.setCValue(Integer.valueOf(0));
        txtEmail.setCValueEditable(false);
        txtEmail.setCValue("");
        txtAddress.setCValueEditable(false);
        txtAddress.setCValue("");
        txtCode.setEditable(true);
        txtCode.setText("");
        txtDescription.setCValueEditable(false);
        txtDescription.setCValue("");
        txtCategory.setCValueEditable(false);
        txtCategory.setCValue("");
        txtBrand.setCValueEditable(false);
        txtBrand.setCValue("");
        txtSalesPrice.setCValueEditable(true);
        txtSalesPrice.setCValue(Double.valueOf(0.0D));
        txtQty.setCValueEditable(true);
        txtQty.setCValue(Integer.valueOf(0));
        txtGrnNo.setCValue(Integer.valueOf(com.sv.visionplus.resource.IdGenerater.IdGenerater.getInstance().getLastId("t_grn", "index_no")));

    }

    @Override
    public void setEditMode() {
        txtGrnNo.setCValueEditable(false);
        txtRefrenceNo.setCValueEditable(true);
        txtGrnDate.setEditable(true);
        txtSupplierName.setCValueEditable(true);
        txtContactNo.setCValueEditable(false);
        txtEmail.setCValueEditable(false);
        txtAddress.setCValueEditable(false);
        txtCode.setEditable(true);
        txtDescription.setCValueEditable(true);
        txtSalesPrice.setCValueEditable(true);
        txtQty.setCValueEditable(true);
    }

    @Override
    public void resetFields() {
        txtGrnNo.resetCValue();
        txtRefrenceNo.resetCValue();
        txtGrnDate.setDate(new Date());
        txtSupplierName.resetCValue();
        txtContactNo.resetCValue();
        txtAddress.resetCValue();
        txtEmail.resetCValue();
        txtCode.setText("");
        txtDescription.resetCValue();
        txtQty.resetCValue();
        txtSalesPrice.resetCValue();
        txtCostPrice.resetCValue();
        tableModel.setRowCount(0);
        txtTotalAmount.resetCValue();
        txtTotalDiscount.resetCValue();
        txtTotalNetAmount.resetCValue();
        txtGrnNo.setCValue(IdGenerater.getInstance().getLastId("t_grn", "index_no"));

    }

    @Override
    public void initObject() throws VPException {
         com.sv.visionplus.transaction.grn.dialog.confirm.Confirm_Password passwordform = new com.sv.visionplus.transaction.grn.dialog.confirm.Confirm_Password(null, true);
        passwordform.setFrame(this);
        passwordform.setLocationRelativeTo(null);
        passwordform.setVisible(true);
        grnMix = null;
        if (user != null) {
            grnMix = new com.sv.visionplus.transaction.grn.model.GrnMix();
            com.sv.visionplus.transaction.grn.model.TGrn grn = new com.sv.visionplus.transaction.grn.model.TGrn();
            if (null == supplier) {
                supplier = new com.sv.visionplus.transaction.grn.dialog.supplier.model.MSupplier();
                grn.setSupplier(Integer.valueOf(1));
            } else {
                grn.setSupplier(supplier.getIndexNo());
            }
            grn.setAmount(txtTotalNetAmount.getCValue().doubleValue());
            grn.setDate(txtGrnDate.getDate());

            grn.setRef_no(txtRefrenceNo.getCValue());
            if (txtRefrenceNo.getCValue().isEmpty()) {
                grn.setRef_no("N/N");
            }

            grnMix.setGrn(grn);

            java.util.List<com.sv.visionplus.transaction.grn.model.GrnDetail> grnItems = new java.util.ArrayList();
            for (int i = 0; i < tableModel.getRowCount(); i++) {
                com.sv.visionplus.transaction.grn.model.GrnDetail grnDetail = new com.sv.visionplus.transaction.grn.model.GrnDetail();
                grnDetail.setDiscount(Double.parseDouble(tableModel.getValueAt(i, 10).toString()));

                grnDetail.setItem(Integer.valueOf(Integer.parseInt(tableModel.getValueAt(i, 0).toString())));
                grnDetail.setQty(Double.parseDouble(tableModel.getValueAt(i, 7).toString()));
                grnDetail.setUnitPrice(Double.parseDouble(tableModel.getValueAt(i, 6).toString()));
                grnDetail.setValue(Double.parseDouble(tableModel.getValueAt(i, 8).toString()));
                grnDetail.setNetValue(Double.parseDouble(tableModel.getValueAt(i, 11).toString()));

                grnItems.add(grnDetail);
            }
            grnMix.setGrnDetail(grnItems);

            visionplusx.logFile.LogFileModel logFile = new visionplusx.logFile.LogFileModel();
            logFile.setDate(new java.util.Date());
            logFile.setFormName("GRN");

            logFile.setRemarks("Save GRN");
            logFile.setTime(com.sv.visionplus.util.formatter.FormatterUtil.getInstance().getTime());
            logFile.setTransactionType("Save");
            logFile.setUser(visionplusx.Home.getInstance().getUser().getIndexNo());
            logFile.setUserName(visionplusx.Home.getInstance().getUser().getName());
            logFile.setValue(txtTotalNetAmount.getCValue());

            grnMix.setLogFileModel(logFile);

            java.util.List<com.sv.visionplus.transaction.grn.model.TStockLedger> ledgers = new java.util.ArrayList();
            for (int i = 0; i < tableModel.getRowCount(); i++) {
                com.sv.visionplus.transaction.grn.model.TStockLedger ledger = new com.sv.visionplus.transaction.grn.model.TStockLedger();
                ledger.setDate(new java.util.Date());
                ledger.setForm("GRN");

                ledger.setItem(Integer.valueOf(Integer.parseInt(tableModel.getValueAt(i, 0).toString())));
                ledger.setQty(Double.parseDouble(tableModel.getValueAt(i, 7).toString()));
                ledger.setStore(Integer.valueOf(2));

                ledgers.add(ledger);
            }
            grnMix.setLedger(ledgers);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Transaction Password is wrong...");
        }
    }

    @Override
    public void initInterface() throws VPException {

    }

    @Override
    protected void setValueAbstract(GrnMix mix) {
        grnMix = mix;
    }

    @Override
    protected GrnMix getValueAbstract() {
        return this.grnMix;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JTable tableItem;
    private com.sv.visionplus.util.component.textfield.CStringField txtAddress;
    private com.sv.visionplus.util.component.textfield.CStringField txtBrand;
    private com.sv.visionplus.util.component.textfield.CStringField txtCategory;
    private javax.swing.JTextField txtCode;
    private com.sv.visionplus.util.component.textfield.CIntegerField txtContactNo;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtCostPrice;
    private com.sv.visionplus.util.component.textfield.CStringField txtDescription;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtDiscount;
    private com.sv.visionplus.util.component.textfield.CStringField txtEmail;
    private org.jdesktop.swingx.JXDatePicker txtGrnDate;
    private com.sv.visionplus.util.component.textfield.CIntegerField txtGrnNo;
    private com.sv.visionplus.util.component.textfield.CIntegerField txtItemIndex;
    private com.sv.visionplus.util.component.textfield.CIntegerField txtQty;
    private com.sv.visionplus.util.component.textfield.CStringField txtRefrenceNo;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtSalesPrice;
    private com.sv.visionplus.util.component.textfield.CStringField txtSupplierName;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtTotalAmount;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtTotalDiscount;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtTotalNetAmount;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel tableModel;
    private TGrn grn;
    private final AbstractTransactionForm transactionForm;
    private MSupplier supplier;
    private ItemMix item;
    private MItem mitem;
    private GrnMix grnMix;

    public void setSupplier(com.sv.visionplus.transaction.grn.dialog.supplier.model.MSupplier supplier) {
        this.supplier = supplier;
        txtSupplierName.setCValue(supplier.getName());
        txtContactNo.setCValue(Integer.valueOf(Integer.parseInt(supplier.getContactNo())));
        txtEmail.setCValue(supplier.getEmail());
        txtAddress.setCValue(supplier.getAddress());
    }

    public void setItem(com.sv.visionplus.transaction.grn.dialog.item.model.ItemMix item) {
        txtCode.setText(item.getCode());
        txtItemIndex.setCValue(item.getIndex_no());
        txtDescription.setCValue(item.getItem_name());
        txtBrand.setCValue(item.getBrand_name());
        txtCategory.setCValue(item.getCategory_name());
        txtCostPrice.setCValue(item.getCost_price());
        txtSalesPrice.setCValue(item.getSale_price());
        txtQty.requestFocus();
    }

    public void getTotalAmount() {
        double totalCashAmount = 0.0D;
        double discount = 0.0D;
        double totalValue = 0.0D;

        for (int i = 0; i < tableItem.getRowCount(); i++) {
            String netAmount = tableModel.getValueAt(i, 11).toString();
            String discountAmount = tableModel.getValueAt(i, 10).toString();
            String value = tableModel.getValueAt(i, 8).toString();

            totalCashAmount += Double.parseDouble(netAmount);
            discount += Double.parseDouble(discountAmount);
            totalValue += Double.parseDouble(value);
        }
        txtTotalNetAmount.setCValue(Double.valueOf(totalCashAmount));
        txtTotalDiscount.setCValue(Double.valueOf(discount));
        txtTotalAmount.setCValue(Double.valueOf(totalValue));
    }

    public void setUser(MUser user) {
        this.user = user;
    }

}
