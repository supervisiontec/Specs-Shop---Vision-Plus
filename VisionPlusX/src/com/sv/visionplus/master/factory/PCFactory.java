package com.sv.visionplus.master.factory;

import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.master.factory.model.Factory;
import com.sv.visionplus.system.exception.VPException;

/**
 * @author Nidura Prageeth
 */
public class PCFactory extends AbstractObjectCreator<Factory> {

    public PCFactory() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtName = new com.sv.visionplus.util.component.textfield.CStringField();
        jLabel4 = new javax.swing.JLabel();
        txtAddress = new com.sv.visionplus.util.component.textfield.CStringField();
        jLabel5 = new javax.swing.JLabel();
        txtContactNo = new com.sv.visionplus.util.component.textfield.CStringField();
        jLabel1 = new javax.swing.JLabel();
        txtIndexNo = new com.sv.visionplus.util.component.textfield.CIntegerField();

        jLabel2.setText("Name :");

        jLabel4.setText("Address :");

        jLabel5.setText("Contact No. :");

        jLabel1.setText("Index No.:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIndexNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(txtContactNo, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
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
                    .addComponent(jLabel4)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void setIdealMode() {
        txtIndexNo.setCValueEditable(false);
        txtName.setCValueEditable(false);
        txtAddress.setCValueEditable(false);
        txtContactNo.setCValueEditable(false);
    }

    @Override
    public void setNewMode() {
        this.factory = new Factory();

        txtIndexNo.setCValueEditable(false);
        txtName.setCValueEditable(true);
        txtAddress.setCValueEditable(true);
        txtContactNo.setCValueEditable(true);
    }

    @Override
    public void setEditMode() {
        txtIndexNo.setCValueEditable(false);
        txtName.setCValueEditable(true);
        txtAddress.setCValueEditable(true);
        txtContactNo.setCValueEditable(true);
    }

    @Override
    public void resetFields() {
        txtIndexNo.resetCValue();
        txtName.resetCValue();
        txtAddress.resetCValue();
        txtContactNo.resetCValue();
    }

    @Override
    public void initObject() throws VPException {
        this.factory.setIndexNo(txtIndexNo.getCValue());
        this.factory.setName(txtName.getCValue());
        this.factory.setAddress(txtAddress.getCValue());
        this.factory.setContactNo(txtContactNo.getCValue());
    }

    @Override
    public void initInterface() throws VPException {
        txtIndexNo.setCValue(this.factory.getIndexNo());
        txtName.setCValue(this.factory.getName());
        txtAddress.setCValue(this.factory.getAddress());
        txtContactNo.setCValue(this.factory.getContactNo());
    }

    @Override
    protected void setValueAbstract(Factory factory) {
        this.factory = factory;
    }

    @Override
    protected Factory getValueAbstract() {
        return this.factory;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private com.sv.visionplus.util.component.textfield.CStringField txtAddress;
    private com.sv.visionplus.util.component.textfield.CStringField txtContactNo;
    private com.sv.visionplus.util.component.textfield.CIntegerField txtIndexNo;
    private com.sv.visionplus.util.component.textfield.CStringField txtName;
    // End of variables declaration//GEN-END:variables
    private Factory factory;

}
