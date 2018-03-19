/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.master.customer;

import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.master.customer.model.MCustomer;
import com.sv.visionplus.system.exception.VPException;

/**
 *
 * @author Mohan
 */
public class PCCustomer extends AbstractObjectCreator<MCustomer> {

    /**
     * Creates new form PCCustomer
     */
    public PCCustomer() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIndexNo = new com.sv.visionplus.util.component.textfield.CIntegerField();
        jLabel2 = new javax.swing.JLabel();
        txtName = new com.sv.visionplus.util.component.textfield.CStringField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAddress = new com.sv.visionplus.util.component.textfield.CStringField();
        jLabel5 = new javax.swing.JLabel();
        txtContactNo = new com.sv.visionplus.util.component.textfield.CStringField();
        txtNic = new com.sv.visionplus.util.component.textfield.CStringField();

        jLabel1.setText("Index No.:");

        jLabel2.setText("Name :");

        jLabel3.setText("NIC No. :");

        jLabel4.setText("Address :");

        jLabel5.setText("Contact No. :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIndexNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(txtContactNo, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(txtNic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void setIdealMode() {
        txtIndexNo.setCValueEditable(false);
        txtName.setCValueEditable(false);
        txtNic.setCValueEditable(false);
        txtAddress.setCValueEditable(false);
        txtContactNo.setCValueEditable(false);
    }

    @Override
    public void setNewMode() {
        this.customer = new MCustomer();

        txtIndexNo.setCValueEditable(false);
        txtName.setCValueEditable(true);
        txtNic.setCValueEditable(true);
        txtAddress.setCValueEditable(true);
        txtContactNo.setCValueEditable(true);
    }

    @Override
    public void setEditMode() {
        txtIndexNo.setCValueEditable(false);
        txtName.setCValueEditable(true);
        txtNic.setCValueEditable(true);
        txtAddress.setCValueEditable(true);
        txtContactNo.setCValueEditable(true);
    }

    @Override
    public void resetFields() {
        txtIndexNo.resetCValue();
        txtName.resetCValue();
        txtNic.resetCValue();
        txtAddress.resetCValue();
        txtContactNo.resetCValue();
    }

    @Override
    public void initObject() throws VPException {
        this.customer.setIndexNo(txtIndexNo.getCValue());
        this.customer.setName(txtName.getCValue());
        System.out.println(txtNic.getCValue());
        this.customer.setNic("".equals(txtNic.getCValue())?"000000000V":txtNic.getCValue());
//        this.customer.setNic(txtNIC.getCValue());
        this.customer.setAddress(txtAddress.getCValue());
        this.customer.setContactNo(txtContactNo.getCValue());
    }

    @Override
    public void initInterface() throws VPException {
        txtIndexNo.setCValue(this.customer.getIndexNo());
        txtName.setCValue(this.customer.getName());
        txtNic.setCValue(this.customer.getNic());
        txtAddress.setCValue(this.customer.getAddress());
        txtContactNo.setCValue(this.customer.getContactNo());
    }

    @Override
    protected void setValueAbstract(MCustomer customer) {
        this.customer = customer;
    }

    @Override
    protected MCustomer getValueAbstract() {
        return this.customer;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private com.sv.visionplus.util.component.textfield.CStringField txtAddress;
    private com.sv.visionplus.util.component.textfield.CStringField txtContactNo;
    private com.sv.visionplus.util.component.textfield.CIntegerField txtIndexNo;
    private com.sv.visionplus.util.component.textfield.CStringField txtName;
    private com.sv.visionplus.util.component.textfield.CStringField txtNic;
    // End of variables declaration//GEN-END:variables
    private MCustomer customer;
}
