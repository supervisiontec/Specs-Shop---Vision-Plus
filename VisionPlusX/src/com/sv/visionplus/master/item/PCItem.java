package com.sv.visionplus.master.item;

import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.master.item.brand.BrandService;
import com.sv.visionplus.master.item.brand.PCBrand;
import com.sv.visionplus.master.item.brand.model.MBrand;
import com.sv.visionplus.master.item.category.CategoryService;
import com.sv.visionplus.master.item.category.PCCategory;
import com.sv.visionplus.master.item.category.model.MCategory;
import com.sv.visionplus.master.item.model.MItem;
import com.sv.visionplus.master.item.model.MItemMix;
import com.sv.visionplus.system.exception.VPException;
import java.util.List;

/**
 *
 * @author Nidura Prageeth
 */
public class PCItem extends AbstractObjectCreator<MItemMix> {

    /**
     * Creates new form PCCustomer
     */
    public PCItem() {
        initComponents();
        getAllBrands();
        getAllCategory();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtIndexNo = new com.sv.visionplus.util.component.textfield.CIntegerField();
        jLabel2 = new javax.swing.JLabel();
        txtCode = new com.sv.visionplus.util.component.textfield.CStringField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtName = new com.sv.visionplus.util.component.textfield.CStringField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cDoubleField1 = new com.sv.visionplus.util.component.textfield.CDoubleField();
        txtCostPrice = new com.sv.visionplus.util.component.textfield.CDoubleField();
        txtReOrderQty = new com.sv.visionplus.util.component.textfield.CIntegerField();
        comboBrand = new javax.swing.JComboBox();
        comboCategory = new javax.swing.JComboBox();
        radioStock = new javax.swing.JRadioButton();
        radioNonStock = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel1.setText("Index No.:");

        jLabel2.setText("Code :");

        jLabel3.setText("Brand :");

        jLabel4.setText("Category :");

        jLabel5.setText("Name :");

        jLabel6.setText("Sale Price :");

        jLabel7.setText("Cost Price :");

        jLabel8.setText("Re-Order Qty:");

        comboBrand.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBrandItemStateChanged(evt);
            }
        });

        buttonGroup1.add(radioStock);
        radioStock.setSelected(true);
        radioStock.setText("Stock Item");
        radioStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioStockActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioNonStock);
        radioNonStock.setText("Non-Stock Item");

        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("+");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(radioStock, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioNonStock, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                    .addComponent(txtCostPrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cDoubleField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboCategory, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboBrand, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCode, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtIndexNo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtReOrderQty, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIndexNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cDoubleField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCostPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtReOrderQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioStock)
                    .addComponent(radioNonStock))
                .addContainerGap(67, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void radioStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioStockActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PCBrand pcBrand = new PCBrand(null, true);
        pcBrand.setFrame(this);
        pcBrand.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboBrandItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBrandItemStateChanged

    }//GEN-LAST:event_comboBrandItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PCCategory pCCategory = new PCCategory(null, true);
        pCCategory.setFrame(this);
        pCCategory.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    @Override
    public void setIdealMode() {
        txtIndexNo.setCValueEditable(false);
        comboBrand.setEditable(false);
        comboCategory.setEditable(false);
        txtCode.setCValueEditable(false);
        txtName.setCValueEditable(false);
        cDoubleField1.setCValueEditable(false);
        txtCostPrice.setCValueEditable(false);
        txtReOrderQty.setCValueEditable(false);
    }

    @Override
    public void setNewMode() {
        this.mix = new MItemMix();

        txtIndexNo.setCValueEditable(false);
        comboBrand.setEditable(true);
        comboCategory.setEditable(true);
        txtCode.setCValueEditable(true);
        txtName.setCValueEditable(true);
        cDoubleField1.setCValueEditable(true);
        txtCostPrice.setCValueEditable(true);
        txtReOrderQty.setCValueEditable(true);
    }

    @Override
    public void setEditMode() {
        txtIndexNo.setCValueEditable(false);
        comboBrand.setEditable(true);
        comboCategory.setEditable(true);
        txtCode.setCValueEditable(true);
        txtName.setCValueEditable(true);
        cDoubleField1.setCValueEditable(true);
        txtCostPrice.setCValueEditable(true);
        txtReOrderQty.setCValueEditable(true);
    }

    @Override
    public void resetFields() {
        txtIndexNo.resetCValue();
        txtCode.resetCValue();
        txtName.resetCValue();
        cDoubleField1.resetCValue();
        txtCostPrice.resetCValue();
        txtReOrderQty.resetCValue();
    }

    @Override
    public void initObject() throws VPException {
        this.mix.setIndexNo(txtIndexNo.getCValue());
        this.mix.setSalePrice(cDoubleField1.getCValue());
        this.mix.setCostPrice(txtCostPrice.getCValue());
        this.mix.setReorderQty(txtReOrderQty.getCValue());
        this.mix.setCode(txtCode.getCValue());
        this.mix.setName(txtName.getCValue());

        //get Brand IndexNo
        String[] split = comboBrand.getSelectedItem().toString().split(" ");
        String brandIndexNo = split[0];
        String brandName = split[1];
        this.mix.setBrand(Integer.parseInt(brandIndexNo));
        this.mix.setBrandName(brandName);

        //get Category IndexNo
        String[] split1 = comboCategory.getSelectedItem().toString().split(" ");
        String categoryIndexNo = split1[0];
        String categoryName = split1[1];
        this.mix.setCategory(Integer.parseInt(categoryIndexNo));
        this.mix.setCategoryName(categoryName);

        // radio selected
        if (radioStock.isSelected()) {
            this.mix.setIsstockItem(true);
        } else {
            this.mix.setIsstockItem(false);
        }
    }

    @Override
    public void initInterface() throws VPException {
        txtIndexNo.setCValue(this.mix.getIndexNo());
        txtCode.setCValue(this.mix.getCode());
        comboBrand.addItem(this.mix.getBrand()+" "+this.mix.getBrandName());
        comboBrand.setSelectedItem(this.mix.getBrand()+" "+this.mix.getBrandName());
        comboCategory.addItem(this.mix.getCategory()+" "+this.mix.getCategoryName());
        comboCategory.setSelectedItem(this.mix.getCategory()+" "+this.mix.getCategoryName());
        txtName.setCValue(this.mix.getName());
        cDoubleField1.setCValue(this.mix.getSalePrice());
        txtCostPrice.setCValue(this.mix.getCostPrice());
        txtReOrderQty.setCValue(this.mix.getReorderQty());

        if (this.mix.getIsstockItem() == true) {
            radioStock.setSelected(true);
        } else {
            radioNonStock.setSelected(true);
        }
    }

    @Override
    protected void setValueAbstract(MItemMix mix) {
        this.mix = mix;
    }

    @Override
    protected MItemMix getValueAbstract() {
        return this.mix;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private com.sv.visionplus.util.component.textfield.CDoubleField cDoubleField1;
    private javax.swing.JComboBox comboBrand;
    private javax.swing.JComboBox comboCategory;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton radioNonStock;
    private javax.swing.JRadioButton radioStock;
    private com.sv.visionplus.util.component.textfield.CStringField txtCode;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtCostPrice;
    private com.sv.visionplus.util.component.textfield.CIntegerField txtIndexNo;
    private com.sv.visionplus.util.component.textfield.CStringField txtName;
    private com.sv.visionplus.util.component.textfield.CIntegerField txtReOrderQty;
    // End of variables declaration//GEN-END:variables
   
    private MItemMix mix;
    private MBrand brand;

    List<MBrand> getAllBrands() {
        return BrandService.getInstance().getAllBrands();
        
    }

    List<MCategory> getAllCategory() {
        return CategoryService.getInstance().getAllCategory();
        
    }

    public void setBrand(MBrand brand) {
        comboBrand.addItem(brand.getIndexNo() + " " + brand.getName());
        comboBrand.setSelectedItem(brand.getIndexNo() + " " + brand.getName());
    }

    public void setCategory(MCategory category) {
        comboCategory.addItem(category.getIndexNo() + " " + category.getName());
        comboCategory.setSelectedItem(category.getIndexNo() + " " + category.getName());
    }

}
