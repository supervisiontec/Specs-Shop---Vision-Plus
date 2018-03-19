/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.master.user;

import com.sv.visionplus.master.customer.*;
import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.master.customer.model.MCustomer;
import com.sv.visionplus.system.exception.VPException;
import visionplusx.model.MUser;

/**
 *
 * @author Mohan
 */
public class PCUser extends AbstractObjectCreator<MUser> {

    /**
     * Creates new form PCCustomer
     */
    public PCUser() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIndexNo = new com.sv.visionplus.util.component.textfield.CIntegerField();
        jLabel2 = new javax.swing.JLabel();
        txtName = new com.sv.visionplus.util.component.textfield.CStringField();
        txtUserName = new com.sv.visionplus.util.component.textfield.CStringField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new com.sv.visionplus.util.component.textfield.CStringField();
        jLabel5 = new javax.swing.JLabel();
        typeCombo = new javax.swing.JComboBox();

        jLabel1.setText("Index No.:");

        jLabel2.setText("Name :");

        jLabel3.setText("User Name :");

        jLabel4.setText("Password :");

        jLabel5.setText("Type :");

        typeCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "User", "Admin" }));

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
                    .addComponent(txtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(typeCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(typeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void setIdealMode() {
        txtIndexNo.setCValueEditable(false);
        txtName.setCValueEditable(false);
        txtUserName.setCValueEditable(false);
        txtPassword.setCValueEditable(false);
        typeCombo.setEditable(false);
    }

    @Override
    public void setNewMode() {
        this.user = new MUser();

        txtIndexNo.setCValueEditable(false);
        txtName.setCValueEditable(true);
        txtUserName.setCValueEditable(true);
        txtPassword.setCValueEditable(true);
        typeCombo.setEditable(true);
    }

    @Override
    public void setEditMode() {
        txtIndexNo.setCValueEditable(false);
        txtName.setCValueEditable(true);
        txtUserName.setCValueEditable(true);
        txtPassword.setCValueEditable(true);
        typeCombo.setEditable(true);
    }

    @Override
    public void resetFields() {
        txtIndexNo.resetCValue();
        txtName.resetCValue();
        txtUserName.resetCValue();
        txtPassword.resetCValue();
        typeCombo.setSelectedIndex(0);
    }

    @Override
    public void initObject() throws VPException {
        this.user.setIndexNo(txtIndexNo.getCValue());
        this.user.setName(txtName.getCValue());
        this.user.setUserName(txtUserName.getCValue());
        this.user.setPassword(txtPassword.getCValue());
        this.user.setType(typeCombo.getSelectedItem().toString());
    }

    @Override
    public void initInterface() throws VPException {
        txtIndexNo.setCValue(this.user.getIndexNo());
        txtName.setCValue(this.user.getName());
        txtUserName.setCValue(this.user.getUserName());
        txtPassword.setCValue(this.user.getPassword());
        typeCombo.setSelectedItem(this.user.getType());
    }

    @Override
    protected void setValueAbstract(MUser object) {
        this.user = object;
    }

    @Override
    protected MUser getValueAbstract() {
        return this.user;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private com.sv.visionplus.util.component.textfield.CIntegerField txtIndexNo;
    private com.sv.visionplus.util.component.textfield.CStringField txtName;
    private com.sv.visionplus.util.component.textfield.CStringField txtPassword;
    private com.sv.visionplus.util.component.textfield.CStringField txtUserName;
    private javax.swing.JComboBox typeCombo;
    // End of variables declaration//GEN-END:variables
    private MUser user;

   
}
