package com.sv.visionplus.master.supplier;

import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.master.supplier.model.MSupplier;
import com.sv.visionplus.system.exception.VPException;

public class PCSupplier extends AbstractObjectCreator<MSupplier> {

    /**
     * Creates new form PCSupplier
     */
    public PCSupplier() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtEmail = new com.sv.visionplus.util.component.textfield.CStringField();
        jLabel1 = new javax.swing.JLabel();
        txtIndexNo = new com.sv.visionplus.util.component.textfield.CIntegerField();
        jLabel2 = new javax.swing.JLabel();
        txtName = new com.sv.visionplus.util.component.textfield.CStringField();
        txtContactNo = new com.sv.visionplus.util.component.textfield.CStringField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtContactName = new com.sv.visionplus.util.component.textfield.CStringField();
        jLabel5 = new javax.swing.JLabel();
        txtAddress = new com.sv.visionplus.util.component.textfield.CStringField();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setText("Index No.:");

        jLabel2.setText("Name :");

        jLabel3.setText("Contact No :");

        jLabel4.setText("Email :");

        jLabel5.setText("Contact Name :");

        jLabel6.setText("Address :");

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
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtContactName, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(txtIndexNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtContactNo, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
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
                    .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtContactName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void setIdealMode() {
        txtIndexNo.setCValueEditable(false);
        txtName.setCValueEditable(false);
        txtContactNo.setCValueEditable(false);
        txtEmail.setCValueEditable(false);
        txtContactName.setCValueEditable(false);
        txtAddress.setCValueEditable(false);
    }

    @Override
    public void setNewMode() {
        this.supplier = new MSupplier();

        txtIndexNo.setCValueEditable(false);
        txtName.setCValueEditable(true);
        txtContactNo.setCValueEditable(true);
        txtEmail.setCValueEditable(true);
        txtContactName.setCValueEditable(true);
        txtAddress.setCValueEditable(true);
    }

    @Override
    public void setEditMode() {
        txtIndexNo.setCValueEditable(false);
        txtName.setCValueEditable(true);
        txtContactNo.setCValueEditable(true);
        txtEmail.setCValueEditable(true);
        txtContactName.setCValueEditable(true);
        txtAddress.setCValueEditable(true);
    }

    @Override
    public void resetFields() {
        txtIndexNo.resetCValue();
        txtName.resetCValue();
        txtContactNo.resetCValue();
        txtEmail.resetCValue();
        txtContactName.resetCValue();
        txtAddress.resetCValue();
    }

    @Override
    public void initObject() throws VPException {
        this.supplier.setIndexNo(txtIndexNo.getCValue());
        this.supplier.setName(txtName.getCValue());
        this.supplier.setContactNo(txtContactNo.getCValue());
        this.supplier.setEmail(txtEmail.getCValue());
        this.supplier.setContactName(txtContactName.getCValue());
        this.supplier.setAddress(txtAddress.getCValue());
    }

    @Override
    public void initInterface() throws VPException {
        txtIndexNo.setCValue(this.supplier.getIndexNo());
        txtName.setCValue(this.supplier.getName());
        txtContactNo.setCValue(this.supplier.getContactNo());
        txtEmail.setCValue(this.supplier.getEmail());
        txtContactName.setCValue(this.supplier.getContactName());
        txtAddress.setCValue(this.supplier.getAddress());
    }

    @Override
    protected void setValueAbstract(MSupplier object) {
        this.supplier = object;
    }

    @Override
    protected MSupplier getValueAbstract() {
        return this.supplier;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private com.sv.visionplus.util.component.textfield.CStringField txtAddress;
    private com.sv.visionplus.util.component.textfield.CStringField txtContactName;
    private com.sv.visionplus.util.component.textfield.CStringField txtContactNo;
    private com.sv.visionplus.util.component.textfield.CStringField txtEmail;
    private com.sv.visionplus.util.component.textfield.CIntegerField txtIndexNo;
    private com.sv.visionplus.util.component.textfield.CStringField txtName;
    // End of variables declaration//GEN-END:variables
    private MSupplier supplier;
}
