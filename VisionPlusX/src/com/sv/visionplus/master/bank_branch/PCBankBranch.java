/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.master.bank_branch;

import com.sv.visionplus.master.customer.*;
import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.master.bank_branch.model.MBankBranch;
import com.sv.visionplus.master.customer.model.MCustomer;
import com.sv.visionplus.system.exception.VPException;

/**
 *
 * @author Mohan
 */
public class PCBankBranch extends AbstractObjectCreator<MBankBranch> {

    /**
     * Creates new form PCCustomer
     */
    public PCBankBranch() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtCode = new com.sv.visionplus.util.component.textfield.CStringField();
        txtBank = new com.sv.visionplus.util.component.textfield.CStringField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtBranch = new com.sv.visionplus.util.component.textfield.CStringField();

        jLabel2.setText("Code :");

        jLabel3.setText("Bank :");

        jLabel4.setText("Branch :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBank, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(txtBranch, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtBank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void setIdealMode() {
        txtCode.setCValueEditable(false);
        txtBank.setCValueEditable(false);
        txtBranch.setCValueEditable(false);
    }

    @Override
    public void setNewMode() {
        this.bankBranch = new MBankBranch();

        txtCode.setCValueEditable(true);
        txtBank.setCValueEditable(true);
        txtBranch.setCValueEditable(true);
    }

    @Override
    public void setEditMode() {
        txtCode.setCValueEditable(true);
        txtBank.setCValueEditable(true);
        txtBranch.setCValueEditable(true);
    }

    @Override
    public void resetFields() {
        txtCode.resetCValue();
        txtBank.resetCValue();
        txtBranch.resetCValue();
    }

    @Override
    public void initObject() throws VPException {
        this.bankBranch.setCode(txtCode.getCValue());
        this.bankBranch.setBank(txtBank.getCValue());
        this.bankBranch.setBranch(txtBranch.getCValue());
    }

    @Override
    public void initInterface() throws VPException {
        txtCode.setCValue(this.bankBranch.getCode());
        txtBank.setCValue(this.bankBranch.getBank());
        txtBranch.setCValue(this.bankBranch.getBranch());
    }

    @Override
    protected void setValueAbstract(MBankBranch object) {
        this.bankBranch = object;
    }

    @Override
    protected MBankBranch getValueAbstract() {
        return this.bankBranch;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private com.sv.visionplus.util.component.textfield.CStringField txtBank;
    private com.sv.visionplus.util.component.textfield.CStringField txtBranch;
    private com.sv.visionplus.util.component.textfield.CStringField txtCode;
    // End of variables declaration//GEN-END:variables
    private MBankBranch bankBranch;
}
