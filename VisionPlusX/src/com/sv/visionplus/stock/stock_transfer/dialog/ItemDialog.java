/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.stock.stock_transfer.dialog;

import com.sv.visionplus.stock.stock_transfer.PCStockTransfer;
import com.sv.visionplus.transaction.invoice.dialog.Item.*;
import com.sv.visionplus.stock.stock_transfer.model.MBrand;
import com.sv.visionplus.stock.stock_transfer.model.MCategory;
import com.sv.visionplus.stock.stock_transfer.model.StockTransferMix;
import com.sv.visionplus.transaction.invoice.SearchItemBulkDAO;
import com.sv.visionplus.transaction.invoice.SearchItemFrontDAO;
import com.sv.visionplus.transaction.invoice.model.SearchItemBulk;
import com.sv.visionplus.transaction.invoice.model.SearchItemFront;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KAZA
 */
public final class ItemDialog extends javax.swing.JDialog {

    private DefaultTableModel model;
    private Integer val;
    private PCStockTransfer transfer;
    private int store;

    /**
     * Creates new form ItemDialog
     */
    public ItemDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        val = 0;
        initComponents();
        setLocationRelativeTo(null);
        model = (DefaultTableModel) tblItem.getModel();
        setComboValue();
        val = 2;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblItem = new javax.swing.JTable();
        txtItemCode = new com.sv.visionplus.util.component.textfield.CStringField();
        txtItemName = new com.sv.visionplus.util.component.textfield.CStringField();
        cmboCategory = new javax.swing.JComboBox();
        cmboBrand = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item No", "Item Code", "Item Name", "Brand", "Category", "Sales Price", "Qty on Hand", "isStock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblItem.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblItem.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblItemMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblItem);
        if (tblItem.getColumnModel().getColumnCount() > 0) {
            tblItem.getColumnModel().getColumn(0).setMinWidth(0);
            tblItem.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblItem.getColumnModel().getColumn(0).setMaxWidth(0);
            tblItem.getColumnModel().getColumn(7).setMinWidth(0);
            tblItem.getColumnModel().getColumn(7).setPreferredWidth(0);
            tblItem.getColumnModel().getColumn(7).setMaxWidth(0);
        }

        cmboCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmboCategory.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmboCategoryItemStateChanged(evt);
            }
        });

        cmboBrand.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmboBrand.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmboBrandItemStateChanged(evt);
            }
        });

        jButton1.setText("Select");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtItemCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtItemName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmboBrand, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmboCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(86, 86, 86)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmboCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmboBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (tblItem.getSelectedRowCount() == 1) {
            StockTransferMix mix = new StockTransferMix();
            mix.setBrand(model.getValueAt(tblItem.getSelectedRow(), 3).toString());
            mix.setCategory(model.getValueAt(tblItem.getSelectedRow(), 4).toString());
            mix.setCode(model.getValueAt(tblItem.getSelectedRow(), 1).toString());
            mix.setItemNo(Integer.parseInt(model.getValueAt(tblItem.getSelectedRow(), 0).toString()));
            mix.setName(model.getValueAt(tblItem.getSelectedRow(), 2).toString());
            mix.setStoreId(store);
            mix.setQtyOnHand(Double.parseDouble(model.getValueAt(tblItem.getSelectedRow(), 6).toString()));
            
            transfer.setItem(mix);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(this, "Select a Row","Error Message",JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String name = txtItemName.getCValue();
        String code = txtItemCode.getCValue();
        model.setRowCount(0);
        if (store == 1) {
            List<SearchItemFront> items = SearchItemFrontDAO.getInstance().searchIiem(code, name);
            addItemFront(items);
        }
        if (store == 2) {
            List<SearchItemBulk> items = SearchItemBulkDAO.getInstance().searchItem(code, name);
            addItemBulk(items);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cmboBrandItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmboBrandItemStateChanged
        if (val == 2) {
            String name = cmboBrand.getSelectedItem().toString().split("-")[1];
            model.setRowCount(0);
            if (store == 1) {
                List<SearchItemFront> items = SearchItemFrontDAO.getInstance().getItem();
                for (SearchItemFront item : items) {
                    if (item.getBrand().equals(name)) {
                        addItemFront(item);
                    }
                }
            }
            if (store == 2) {
                List<SearchItemBulk> items = SearchItemBulkDAO.getInstance().getItem();
                for (SearchItemBulk item : items) {
                    if (item.getBrand().equals(name)) {
                        addItemBulk(item);
                    }
                }

            }
        }
    }//GEN-LAST:event_cmboBrandItemStateChanged

    private void cmboCategoryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmboCategoryItemStateChanged
        if (val == 2) {
            String name = cmboCategory.getSelectedItem().toString().split("-")[1];
            model.setRowCount(0);
            if (store == 1) {
                List<SearchItemFront> items = SearchItemFrontDAO.getInstance().getItem();
                for (SearchItemFront item : items) {
                    if (item.getCategory().equals(name)) {
                        addItemFront(item);
                    }
                }
            } else if (store == 2) {
                List<SearchItemBulk> items = SearchItemBulkDAO.getInstance().getItem();
                for (SearchItemBulk item : items) {
                    if (item.getCategory().equals(name)) {
                        addItemBulk(item);
                    }
                }

            }
        }
    }//GEN-LAST:event_cmboCategoryItemStateChanged

    private void tblItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblItemMouseClicked

    }//GEN-LAST:event_tblItemMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ItemDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ItemDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ItemDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ItemDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ItemDialog dialog = new ItemDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmboBrand;
    private javax.swing.JComboBox cmboCategory;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblItem;
    private com.sv.visionplus.util.component.textfield.CStringField txtItemCode;
    private com.sv.visionplus.util.component.textfield.CStringField txtItemName;
    // End of variables declaration//GEN-END:variables

    private void addItemFront(List<SearchItemFront> items) {
        model.setRowCount(0);
        for (SearchItemFront item : items) {
            addItemFront(item);
        }
    }

    private void setComboValue() {
        cmboBrand.removeAllItems();
        cmboCategory.removeAllItems();
        List<MBrand> allBrand = BrandDAO.getInstance().allBrand();
        for (MBrand brand : allBrand) {
            cmboBrand.addItem(brand.getIndexNo() + "-" + brand.getName());
        }
        List<MCategory> categorys = CategoryDAO.getInstance().allCategory();
        for (MCategory category : categorys) {
            cmboCategory.addItem(category.getIndexNo() + "-" + category.getName());
        }

    }

    private void setDataToRadio() {

        if (store == 1) {
            List<SearchItemFront> item = SearchItemFrontDAO.getInstance().getItem();
            addItemFront(item);

        } else if (store == 2) {
            List<SearchItemBulk> item = SearchItemBulkDAO.getInstance().getItem();
            addItemBulk(item);

        }
    }

    private void addItemFront(SearchItemFront item) {
        if (item.getBal_qty() > 0) {
            if (item.isIsstock_item()) {
                Object[] rowdata = {
                    item.getIndex_no(),
                    item.getCode(),
                    item.getName(),
                    item.getBrand(),
                    item.getCategory(),
                    item.getSales_price(),
                    item.getBal_qty(),};
                model.addRow(rowdata);
            }
        }
    }

    private void addItemBulk(List<SearchItemBulk> items) {
        model.setRowCount(0);
        for (SearchItemBulk item : items) {
            addItemBulk(item);
        }
    }

    private void addItemBulk(SearchItemBulk item) {
        if (item.getBal_qty() > 0) {
            if (item.isIsstock_item()) {
                Object[] rowdata = {
                    item.getIndex_no(),
                    item.getCode(),
                    item.getName(),
                    item.getBrand(),
                    item.getCategory(),
                    item.getSales_price(),
                    item.getBal_qty(),};
                model.addRow(rowdata);
            }
        }
    }

    private void addItemNon(SearchItemBulk item) {
        if (!item.isIsstock_item()) {
            Object[] rowdata = {
                item.getIndex_no(),
                item.getCode(),
                item.getName(),
                item.getBrand(),
                item.getCategory(),
                item.getSales_price(),
                1
            };
            model.addRow(rowdata);
        }

    }

    public void setFrame(PCStockTransfer transfer, int store) {
        this.transfer = transfer;
        this.store = store;
        setDataToRadio();

    }

}
