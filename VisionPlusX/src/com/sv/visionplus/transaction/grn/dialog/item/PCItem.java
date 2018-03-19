package com.sv.visionplus.transaction.grn.dialog.item;

import com.sv.visionplus.transaction.grn.PCGrn;
import com.sv.visionplus.transaction.grn.dialog.item.model.ItemMix;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Nidura Prageeth
 */
public class PCItem extends javax.swing.JDialog {

    public PCItem(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        tableModel = (DefaultTableModel) tableItem.getModel();
        getAllItem();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableItem = new javax.swing.JTable();
        btnSelect = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        txtCode = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtBrand = new javax.swing.JTextField();
        txtCategory = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tableItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "itemId", "Code", "Name", "Brand", "Category", "Buying Price", "Sale Price", "Stock Qty"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableItem);
        if (tableItem.getColumnModel().getColumnCount() > 0) {
            tableItem.getColumnModel().getColumn(0).setMinWidth(0);
            tableItem.getColumnModel().getColumn(0).setPreferredWidth(0);
            tableItem.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        btnSelect.setText("select");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeActionPerformed(evt);
            }
        });

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrandActionPerformed(evt);
            }
        });

        txtCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSelect)
                        .addGap(0, 109, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelect))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        if (tableItem.getSelectedRowCount() == 1) {
            setTableValue();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Select a row.");
        }
    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        ItemMix item = new ItemMix();
        item.setCode(txtCode.getText());
        item.setItem_name(txtName.getText());
        item.setCategory_name(txtCategory.getText());
        item.setBrand_name(txtBrand.getText());

        List<ItemMix> searchResult = ItemService.getInstance().getSearchResult(item);
        System.out.println(searchResult.size());
        if (searchResult != null) {
            tableModel.setRowCount(0);
            addData(searchResult);

        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeActionPerformed
        btnSearch.doClick();
    }//GEN-LAST:event_txtCodeActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        btnSearch.doClick();
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrandActionPerformed
        btnSearch.doClick();
    }//GEN-LAST:event_txtBrandActionPerformed

    private void txtCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoryActionPerformed
        btnSearch.doClick();
    }//GEN-LAST:event_txtCategoryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSelect;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableItem;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel tableModel;
    private PCGrn grn;
    private ItemMix item = new ItemMix();

    public void setFrame(PCGrn grn) {
        this.grn = grn;
    }

    private void getAllItem() {
        ItemMix searchItem = new ItemMix();
        searchItem.setBrand_name(txtBrand.getText());
        searchItem.setCategory_name(txtCategory.getText());
        searchItem.setCode(txtCode.getText());
        searchItem.setItem_name(txtName.getText());

        List<ItemMix> allItems = ItemService.getInstance().getSearchResult(searchItem);
        for (ItemMix item : allItems) {
            if (item.isIsstock_item()) {
                Object[] rd = {
                    item.getIndex_no(),
                    item.getCode(),
                    item.getItem_name(),
                    item.getBrand_name(),
                    item.getCategory_name(),
                    item.getCost_price(),
                    item.getSale_price(),
                    item.getBalQty()
                };
                tableModel.addRow(rd);
            }
        }
    }

    private void setTableValue() {
        String itemId = tableModel.getValueAt(tableItem.getSelectedRow(), 0).toString();
        String code = tableModel.getValueAt(tableItem.getSelectedRow(), 1).toString();
        String name = tableModel.getValueAt(tableItem.getSelectedRow(), 2).toString();
        String brand = tableModel.getValueAt(tableItem.getSelectedRow(), 3).toString();
        String category = tableModel.getValueAt(tableItem.getSelectedRow(), 4).toString();
        Double costPrice = (Double) tableModel.getValueAt(tableItem.getSelectedRow(), 5);
        Double salePrice = (Double) tableModel.getValueAt(tableItem.getSelectedRow(), 6);

        item = new ItemMix();
        item.setIndex_no(Integer.parseInt(itemId));
        item.setCode(code);
        item.setItem_name(name);
        item.setBrand_name(brand);
        item.setCategory_name(category);
        item.setCost_price(costPrice);
        item.setSale_price(salePrice);

        grn.setItem(item);
    }

    public void addData(List<ItemMix> searchResult) {
        for (ItemMix item : searchResult) {
            if (item.isIsstock_item()) {
                Object[] rd = {
                    item.getIndex_no(),
                    item.getCode(),
                    item.getItem_name(),
                    item.getBrand_name(),
                    item.getCategory_name(),
                    item.getCost_price(),
                    item.getSale_price(),
                    item.getBalQty()
                };
                tableModel.addRow(rd);
            }
        }
    }
}
