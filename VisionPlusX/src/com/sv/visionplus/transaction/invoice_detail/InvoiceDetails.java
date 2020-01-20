/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.invoice_detail;

import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.base.transaction.AbstractTransactionForm;
import com.sv.visionplus.system.exception.VPException;
import com.sv.visionplus.transaction.invoice_detail.dialog.PatientDetail;
import com.sv.visionplus.transaction.invoice_detail.model.TPatientInformation;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mohan
 */
public class InvoiceDetails extends AbstractObjectCreator<TPatientInformation> {

    private final DefaultTableModel model;

    /**
     * Creates new form PCInvoice
     */
    public InvoiceDetails(AbstractTransactionForm transactionForm) {
        initComponents();
        initOthers();
        model = (DefaultTableModel) tblInfo.getModel();
        this.index_no = 0;
        this.number = null;
        this.transactionForm = transactionForm;
    }

    @SuppressWarnings("unchecked")
    private void initOthers() {
        itemListModel = new javax.swing.DefaultListModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtCustomerName = new com.sv.visionplus.util.component.textfield.CStringField();
        jLabel12 = new javax.swing.JLabel();
        txtMobileNumber = new com.sv.visionplus.util.component.textfield.CStringField();
        btnPatientDetail = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        headacheCheckBox = new javax.swing.JCheckBox();
        dischargeCheckBox = new javax.swing.JCheckBox();
        otherChechBox = new javax.swing.JCheckBox();
        irritationCheckBox = new javax.swing.JCheckBox();
        visionNDCheckBox = new javax.swing.JCheckBox();
        tearingCheckBox = new javax.swing.JCheckBox();
        itchingCheckBox = new javax.swing.JCheckBox();
        redCheckBox = new javax.swing.JCheckBox();
        txtOther = new com.sv.visionplus.util.component.textfield.CStringField();
        jPanel10 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtAutoRefLeft = new com.sv.visionplus.util.component.textfield.CStringField();
        txtAutoRefRight = new com.sv.visionplus.util.component.textfield.CStringField();
        txtNtcLeft = new com.sv.visionplus.util.component.textfield.CStringField();
        txtNtcRight = new com.sv.visionplus.util.component.textfield.CStringField();
        txtVaWithoutGlassLeft = new com.sv.visionplus.util.component.textfield.CStringField();
        txtVaWithoutGlassRight = new com.sv.visionplus.util.component.textfield.CStringField();
        txtVaWithPhLeft = new com.sv.visionplus.util.component.textfield.CStringField();
        txtVaWithPhRight = new com.sv.visionplus.util.component.textfield.CStringField();
        txtVaWithGlassLeft = new com.sv.visionplus.util.component.textfield.CStringField();
        txtVaWithGlassRight = new com.sv.visionplus.util.component.textfield.CStringField();
        txtHbRxSubLeft = new com.sv.visionplus.util.component.textfield.CStringField();
        txtHbRxRight = new com.sv.visionplus.util.component.textfield.CStringField();
        txtHbRxSubRight = new com.sv.visionplus.util.component.textfield.CStringField();
        txtHbRxLeft = new com.sv.visionplus.util.component.textfield.CStringField();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblInfo = new javax.swing.JTable();
        myopiaRadio = new javax.swing.JRadioButton();
        presbyopiaRadio = new javax.swing.JRadioButton();
        hypermtropiaRadio = new javax.swing.JRadioButton();
        astimatismRadio = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtRemarks1 = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        txtLenseName = new com.sv.visionplus.util.component.textfield.CStringField();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtLenseBrand = new com.sv.visionplus.util.component.textfield.CStringField();
        jLabel19 = new javax.swing.JLabel();
        txtLenseType = new com.sv.visionplus.util.component.textfield.CStringField();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Customer Details"));

        jLabel11.setText("Customer Name :");

        jLabel12.setText("Mobile Number :");

        txtMobileNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMobileNumberActionPerformed(evt);
            }
        });

        btnPatientDetail.setText("Details");
        btnPatientDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientDetailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCustomerName, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(txtMobileNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPatientDetail))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtMobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnPatientDetail)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Complains"));

        headacheCheckBox.setText("Headache");

        dischargeCheckBox.setText("Discharge");

        otherChechBox.setText("Other");
        otherChechBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherChechBoxActionPerformed(evt);
            }
        });

        irritationCheckBox.setText("Irritation");

        visionNDCheckBox.setText("Vision-N/D");

        tearingCheckBox.setText("Tearing");

        itchingCheckBox.setText("Itching");

        redCheckBox.setText("Red");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtOther, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(visionNDCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(redCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(headacheCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itchingCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dischargeCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(irritationCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tearingCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(otherChechBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dischargeCheckBox)
                        .addComponent(irritationCheckBox)
                        .addComponent(tearingCheckBox)
                        .addComponent(otherChechBox))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(visionNDCheckBox)
                        .addComponent(redCheckBox)
                        .addComponent(headacheCheckBox)
                        .addComponent(itchingCheckBox)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtOther, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel9.setText("VA With P/H ");

        jLabel8.setText("Auto Ref :");

        jLabel10.setText("VA With Glass");

        jLabel13.setText("VA Without Glass");

        jLabel16.setText("Hb Rx :");

        jLabel17.setText("NTC :");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel8)
                    .addComponent(jLabel13)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtVaWithPhLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtVaWithGlassLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAutoRefLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNtcLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtVaWithoutGlassLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtHbRxSubLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtHbRxLeft, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHbRxSubRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtVaWithoutGlassRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtVaWithPhRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAutoRefRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNtcRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtHbRxRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtVaWithGlassRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHbRxRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHbRxLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHbRxSubLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHbRxSubRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAutoRefLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAutoRefRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNtcLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNtcRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVaWithoutGlassLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVaWithoutGlassRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtVaWithPhLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addComponent(txtVaWithPhRight, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtVaWithGlassLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtVaWithGlassRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        tblInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"      DIST", null, null, null, null, null, null},
                {"      NEAR", null, null, null, null, null, null}
            },
            new String [] {
                "", "SPH", "CYL", "AXIS", "SPH", "CYL", "AXIS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblInfo.setRowHeight(25);
        jScrollPane2.setViewportView(tblInfo);

        buttonGroup1.add(myopiaRadio);
        myopiaRadio.setText("Myopia");
        myopiaRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myopiaRadioActionPerformed(evt);
            }
        });

        buttonGroup1.add(presbyopiaRadio);
        presbyopiaRadio.setText("Presbyopia");
        presbyopiaRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presbyopiaRadioActionPerformed(evt);
            }
        });

        buttonGroup1.add(hypermtropiaRadio);
        hypermtropiaRadio.setText("Hypermtropia");
        hypermtropiaRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hypermtropiaRadioActionPerformed(evt);
            }
        });

        buttonGroup1.add(astimatismRadio);
        astimatismRadio.setText("Astimatism");
        astimatismRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                astimatismRadioActionPerformed(evt);
            }
        });

        jLabel14.setText(" Remark :");

        txtRemarks1.setColumns(20);
        txtRemarks1.setRows(5);
        jScrollPane4.setViewportView(txtRemarks1);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(myopiaRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(presbyopiaRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hypermtropiaRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(astimatismRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4)
                                .addContainerGap())))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(myopiaRadio)
                    .addComponent(presbyopiaRadio)
                    .addComponent(hypermtropiaRadio)
                    .addComponent(astimatismRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtLenseName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLenseNameActionPerformed(evt);
            }
        });

        jLabel15.setText("Lens Name :");

        jLabel18.setText("Lens Brand :");

        jLabel19.setText(" Frame Type :");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLenseType, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(txtLenseName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtLenseBrand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLenseType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtLenseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtLenseBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 467, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void otherChechBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherChechBoxActionPerformed
        if (otherChechBox.isSelected()) {
            txtOther.setCValueEditable(true);
        } else {
            txtOther.setCValueEditable(false);
        }
    }//GEN-LAST:event_otherChechBoxActionPerformed

    private void myopiaRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myopiaRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myopiaRadioActionPerformed

    private void presbyopiaRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presbyopiaRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_presbyopiaRadioActionPerformed

    private void hypermtropiaRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hypermtropiaRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hypermtropiaRadioActionPerformed

    private void astimatismRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_astimatismRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_astimatismRadioActionPerformed

    private void txtMobileNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMobileNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMobileNumberActionPerformed

    private void txtLenseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLenseNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLenseNameActionPerformed

    private void btnPatientDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientDetailActionPerformed
        PatientDetail detail = new PatientDetail(null, true);
        detail.setFrame(this);
        detail.setVisible(true);
    }//GEN-LAST:event_btnPatientDetailActionPerformed

    @Override
    public void setIdealMode() {
        txtOther.setCValueEditable(false);
        txtRemarks1.setEditable(false);
        txtCustomerName.setCValueEditable(false);
        txtMobileNumber.setCValueEditable(false);
        txtHbRxRight.setCValueEditable(false);
        txtHbRxSubLeft.setCValueEditable(false);
        txtHbRxLeft.setCValueEditable(false);
        txtHbRxSubRight.setCValueEditable(false);
        txtAutoRefLeft.setCValueEditable(false);
        txtAutoRefRight.setCValueEditable(false);
        txtNtcLeft.setCValueEditable(false);
        txtNtcRight.setCValueEditable(false);
        txtVaWithoutGlassLeft.setCValueEditable(false);
        txtVaWithoutGlassRight.setCValueEditable(false);
        txtVaWithPhLeft.setCValueEditable(false);
        txtVaWithPhRight.setCValueEditable(false);
        txtVaWithGlassLeft.setCValueEditable(false);
        txtVaWithGlassRight.setCValueEditable(false);
        txtLenseType.setCValueEditable(false);
        txtLenseType.resetCValue();
        txtLenseBrand.setCValueEditable(false);
        txtLenseBrand.resetCValue();
        txtLenseName.setCValueEditable(false);
        txtLenseName.resetCValue();
        btnPatientDetail.setEnabled(false);
         this.index_no = 0;
        resetFields();
    }

    @Override
    public void setNewMode() {
        patientInformation = new TPatientInformation();

        txtOther.setCValueEditable(false);
        txtRemarks1.setEditable(true);
        txtCustomerName.setCValueEditable(true);
        txtMobileNumber.setCValueEditable(true);
        txtHbRxRight.setCValueEditable(true);
        txtHbRxSubLeft.setCValueEditable(true);
        txtHbRxLeft.setCValueEditable(true);
        txtHbRxSubRight.setCValueEditable(true);
        txtAutoRefLeft.setCValueEditable(true);
        txtAutoRefRight.setCValueEditable(true);
        txtNtcLeft.setCValueEditable(true);
        txtNtcRight.setCValueEditable(true);
        txtVaWithoutGlassLeft.setCValueEditable(true);
        txtVaWithoutGlassRight.setCValueEditable(true);
        txtVaWithPhLeft.setCValueEditable(true);
        txtVaWithPhRight.setCValueEditable(true);
        txtVaWithGlassLeft.setCValueEditable(true);
        txtVaWithGlassRight.setCValueEditable(true);
        visionNDCheckBox.setSelected(false);
        redCheckBox.setSelected(false);
        headacheCheckBox.setSelected(false);
        itchingCheckBox.setSelected(false);
        dischargeCheckBox.setSelected(false);
        irritationCheckBox.setSelected(false);
        tearingCheckBox.setSelected(false);
        otherChechBox.setSelected(false);
        myopiaRadio.setSelected(false);
        presbyopiaRadio.setSelected(false);
        hypermtropiaRadio.setSelected(false);
        astimatismRadio.setSelected(false);
        txtLenseType.setCValueEditable(true);
        txtLenseType.resetCValue();
        txtLenseBrand.setCValueEditable(true);
        txtLenseBrand.resetCValue();
        txtLenseName.setCValueEditable(true);
        txtLenseName.resetCValue();
         this.index_no = 0;

        model.setRowCount(0);
        Object[] firstRowdata = {"DIST", "", "", "", "", "", ""};

        model.addRow(firstRowdata);
        Object[] secondRowdata = {"NEAR", "", "", "", "", "", ""};

        model.addRow(secondRowdata);
        itemListModel.setSize(0);
        
        btnPatientDetail.setEnabled(true);

    }

    @Override
    public void setEditMode() {
        txtOther.setCValueEditable(true);
        txtRemarks1.setEditable(true);
        txtCustomerName.setCValueEditable(true);
        txtMobileNumber.setCValueEditable(true);
        txtHbRxRight.setCValueEditable(true);
        txtHbRxSubLeft.setCValueEditable(true);
        txtHbRxLeft.setCValueEditable(true);
        txtHbRxSubRight.setCValueEditable(true);
        txtAutoRefLeft.setCValueEditable(true);
        txtAutoRefRight.setCValueEditable(true);
        txtNtcLeft.setCValueEditable(true);
        txtNtcRight.setCValueEditable(true);
        txtVaWithoutGlassLeft.setCValueEditable(true);
        txtVaWithoutGlassRight.setCValueEditable(true);
        txtVaWithPhLeft.setCValueEditable(true);
        txtVaWithPhRight.setCValueEditable(true);
        txtVaWithGlassLeft.setCValueEditable(true);
        txtVaWithGlassRight.setCValueEditable(true);
        txtLenseType.setCValueEditable(true);
        txtLenseBrand.setCValueEditable(true);
        txtLenseName.setCValueEditable(true);
        itemListModel.setSize(0);
    }

    @Override
    public void resetFields() {

        txtOther.resetCValue();
        txtRemarks1.setText("");
        txtCustomerName.resetCValue();
        txtMobileNumber.resetCValue();
        txtHbRxRight.resetCValue();
        txtHbRxSubLeft.resetCValue();
        txtHbRxLeft.resetCValue();
        txtHbRxSubRight.resetCValue();
        txtAutoRefLeft.resetCValue();
        txtAutoRefRight.resetCValue();
        txtNtcLeft.resetCValue();
        txtNtcRight.resetCValue();
        txtVaWithoutGlassLeft.resetCValue();
        txtVaWithoutGlassRight.resetCValue();
        txtVaWithPhLeft.resetCValue();
        txtVaWithPhRight.resetCValue();
        txtVaWithGlassLeft.resetCValue();
        txtVaWithGlassRight.resetCValue();
        txtLenseType.resetCValue();
        txtLenseBrand.resetCValue();
        txtLenseName.resetCValue();
        btnPatientDetail.setEnabled(false);
         this.index_no = 0;

        model.setRowCount(0);
        Object[] firstRowdata = {"DIST", "", "", "", "", "", ""};

        model.addRow(firstRowdata);
        Object[] secondRowdata = {"NEAR", "", "", "", "", "", ""};

        model.addRow(secondRowdata);

        itemListModel.setSize(0);
    }

    public void doClear() {
        resetFields();
    }

    @Override
    public void initObject() throws VPException {
        patientInformation.setIndex_no(index_no);
        patientInformation.setNumber(number);
        patientInformation.setAutoRefLeft(txtAutoRefLeft.getText());
        patientInformation.setAutoRefRight(txtAutoRefRight.getText());
        
        String complains = "";
        if (visionNDCheckBox.isSelected()) {
            complains = complains + "VISION-N/D@@";
        }
        if (redCheckBox.isSelected()) {
            complains = complains + "RED@@";
        }
        if (headacheCheckBox.isSelected()) {
            complains = complains + "HEADACHE@@";
        }
        if (itchingCheckBox.isSelected()) {
            complains = complains + "ITCHING@@";
        }
        if (dischargeCheckBox.isSelected()) {
            complains = complains + "DISCHARGE@@";
        }
        if (irritationCheckBox.isSelected()) {
            complains = complains + "IRRITATION@@";
        }
        if (tearingCheckBox.isSelected()) {
            complains = complains + "TEARING@@";
        }
        if (otherChechBox.isSelected()) {
            String otherComplains = txtOther.getText();
            if ((otherComplains == null) || (otherComplains.isEmpty())) {
                otherComplains = "OTHER COMPLAINS";
            }
            complains = complains + otherComplains + "@@";
        }
        patientInformation.setComplains(complains);
        patientInformation.setCustomer_name(txtCustomerName.getText());
        patientInformation.setMobile_no(txtMobileNumber.getText());
        patientInformation.setHbRxRight(txtHbRxRight.getText());
        patientInformation.setHbRxSubLeft(txtHbRxSubLeft.getText());
        patientInformation.setHbRxLeft(txtHbRxLeft.getText());
        patientInformation.setHbRxSubRight(txtHbRxSubRight.getText());
        patientInformation.setLenseType(txtLenseType.getCValue());
        patientInformation.setNtcLeft(txtNtcLeft.getText());
        patientInformation.setNtcRight(txtNtcRight.getText());

        String refractiveError = "";
        if (myopiaRadio.isSelected()) {
            refractiveError = "MYOPIA";
        } else if (presbyopiaRadio.isSelected()) {
            refractiveError = "PREABYOPIA";
        } else if (hypermtropiaRadio.isSelected()) {
            refractiveError = "HYPERMTROPIA";
        } else if (astimatismRadio.isSelected()) {
            refractiveError = "ASTIMATISM";
        } else {
            refractiveError = "";
        }
        patientInformation.setRefractiveError(refractiveError);
        patientInformation.setRemarks(txtRemarks1.getText());
        patientInformation.setVaWithGlassLeft(txtVaWithGlassLeft.getText());
        patientInformation.setVaWithGlassRight(txtVaWithGlassRight.getText());
        patientInformation.setVaWithPhLeft(txtVaWithPhLeft.getText());
        patientInformation.setVaWithPhRight(txtVaWithPhRight.getText());
        patientInformation.setVaWithoutGlassLeft(txtVaWithoutGlassLeft.getText());
        patientInformation.setVaWithoutGlassRight(txtVaWithGlassRight.getText());

        patientInformation.setDistSphLeft(tblInfo.getValueAt(0, 1) + "");
        patientInformation.setDistCylLeft(tblInfo.getValueAt(0, 2) + "");
        patientInformation.setDistAxisLeft(tblInfo.getValueAt(0, 3) + "");
        patientInformation.setDistSphRight(tblInfo.getValueAt(0, 4) + "");
        patientInformation.setDistCylRight(tblInfo.getValueAt(0, 5) + "");
        patientInformation.setDistAxisRight(tblInfo.getValueAt(0, 6) + "");

        patientInformation.setNearSphLeft(tblInfo.getValueAt(1, 1) + "");
        patientInformation.setNearCylLeft(tblInfo.getValueAt(1, 2) + "");
        patientInformation.setNearAxisLeft(tblInfo.getValueAt(1, 3) + "");
        patientInformation.setNearSphRight(tblInfo.getValueAt(1, 4) + "");
        patientInformation.setNearCylRight(tblInfo.getValueAt(1, 5) + "");
        patientInformation.setNearAxisRight(tblInfo.getValueAt(1, 6) + "");
        patientInformation.setLensBrand(txtLenseBrand.getCValue());
        patientInformation.setLensName(txtLenseName.getCValue());

    }

    @Override
    public void initInterface() throws VPException {

    }

    @Override
    protected void setValueAbstract(TPatientInformation detail) {
        this.patientInformation = detail;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton astimatismRadio;
    private javax.swing.JButton btnPatientDetail;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JCheckBox dischargeCheckBox;
    private javax.swing.JCheckBox headacheCheckBox;
    private javax.swing.JRadioButton hypermtropiaRadio;
    private javax.swing.JCheckBox irritationCheckBox;
    private javax.swing.JCheckBox itchingCheckBox;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JRadioButton myopiaRadio;
    private javax.swing.JCheckBox otherChechBox;
    private javax.swing.JRadioButton presbyopiaRadio;
    private javax.swing.JCheckBox redCheckBox;
    private javax.swing.JTable tblInfo;
    private javax.swing.JCheckBox tearingCheckBox;
    private com.sv.visionplus.util.component.textfield.CStringField txtAutoRefLeft;
    private com.sv.visionplus.util.component.textfield.CStringField txtAutoRefRight;
    private com.sv.visionplus.util.component.textfield.CStringField txtCustomerName;
    private com.sv.visionplus.util.component.textfield.CStringField txtHbRxLeft;
    private com.sv.visionplus.util.component.textfield.CStringField txtHbRxRight;
    private com.sv.visionplus.util.component.textfield.CStringField txtHbRxSubLeft;
    private com.sv.visionplus.util.component.textfield.CStringField txtHbRxSubRight;
    private com.sv.visionplus.util.component.textfield.CStringField txtLenseBrand;
    private com.sv.visionplus.util.component.textfield.CStringField txtLenseName;
    private com.sv.visionplus.util.component.textfield.CStringField txtLenseType;
    private com.sv.visionplus.util.component.textfield.CStringField txtMobileNumber;
    private com.sv.visionplus.util.component.textfield.CStringField txtNtcLeft;
    private com.sv.visionplus.util.component.textfield.CStringField txtNtcRight;
    private com.sv.visionplus.util.component.textfield.CStringField txtOther;
    private javax.swing.JTextArea txtRemarks1;
    private com.sv.visionplus.util.component.textfield.CStringField txtVaWithGlassLeft;
    private com.sv.visionplus.util.component.textfield.CStringField txtVaWithGlassRight;
    private com.sv.visionplus.util.component.textfield.CStringField txtVaWithPhLeft;
    private com.sv.visionplus.util.component.textfield.CStringField txtVaWithPhRight;
    private com.sv.visionplus.util.component.textfield.CStringField txtVaWithoutGlassLeft;
    private com.sv.visionplus.util.component.textfield.CStringField txtVaWithoutGlassRight;
    private javax.swing.JCheckBox visionNDCheckBox;
    // End of variables declaration//GEN-END:variables
    private AbstractTransactionForm<com.sv.visionplus.transaction.invoice_detail.model.TPatientInformation> transactionForm;
    private com.sv.visionplus.transaction.invoice_detail.model.TPatientInformation patientInformation;
    private DefaultListModel itemListModel;
    private Integer index_no;
    private Integer number;

    @Override
    protected TPatientInformation getValueAbstract() {
        return patientInformation;
    }

    public void setValue(Integer index) {
        System.out.println(index);
        TPatientInformation info = InvoiceDetailDAO.getInstance().findById(index);
        setInfo(info);
    }
    private void setInfo(TPatientInformation info) {
        if (info != null) {
            index_no=info.getIndex_no();
            number=info.getNumber();
            
            visionNDCheckBox.setSelected(false);
            redCheckBox.setSelected(false);
            headacheCheckBox.setSelected(false);
            itchingCheckBox.setSelected(false);
            dischargeCheckBox.setSelected(false);
            irritationCheckBox.setSelected(false);
            tearingCheckBox.setSelected(false);
            otherChechBox.setSelected(false);
            txtOther.setText("");

            String[] complains = info.getComplains().split("@@");
            for (String complain : complains) {
                if ("VISION-N/D".equals(complain)) {
                    visionNDCheckBox.setSelected(true);
                } else if ("RED".equals(complain)) {
                    redCheckBox.setSelected(true);
                } else if ("HEADACHE".equals(complain)) {
                    headacheCheckBox.setSelected(true);
                } else if ("ITCHING".equals(complain)) {
                    itchingCheckBox.setSelected(true);
                } else if ("DISCHARGE".equals(complain)) {
                    dischargeCheckBox.setSelected(true);
                } else if ("IRRITATION".equals(complain)) {
                    irritationCheckBox.setSelected(true);
                } else if ("TEARING".equals(complain)) {
                    tearingCheckBox.setSelected(true);
                } else if (!"OTHER COMPLAINS".equals(complain)) {
                    otherChechBox.setSelected(true);
                    txtOther.setText(complain);
                }
            }

            txtHbRxLeft.setText(info.getHbRxLeft());
            txtHbRxRight.setText(info.getHbRxRight());
            txtHbRxSubLeft.setText(info.getHbRxSubLeft());
            txtHbRxSubRight.setText(info.getHbRxSubRight());
            txtAutoRefLeft.setText(info.getAutoRefLeft());
            txtAutoRefRight.setText(info.getAutoRefRight());
            txtNtcLeft.setText(info.getNtcLeft());
            txtNtcRight.setText(info.getNtcRight());
            txtVaWithGlassLeft.setText(info.getVaWithGlassLeft());
            txtVaWithGlassRight.setText(info.getVaWithGlassRight());
            txtVaWithPhLeft.setText(info.getVaWithPhLeft());
            txtVaWithPhRight.setText(info.getVaWithPhRight());
            txtVaWithoutGlassLeft.setText(info.getVaWithoutGlassLeft());
            txtVaWithoutGlassRight.setText(info.getVaWithoutGlassRight());

            if ("null".equals(info.getDistSphLeft())) {
                info.setDistSphLeft("");
            }
            if ("null".equals(info.getDistCylLeft())) {
                info.setDistCylLeft("");
            }
            if ("null".equals(info.getDistAxisLeft())) {
                info.setDistAxisLeft("");
            }
            if ("null".equals(info.getDistSphRight())) {
                info.setDistSphRight("");
            }
            if ("null".equals(info.getDistCylRight())) {
                info.setDistCylRight("");
            }
            if ("null".equals(info.getDistAxisRight())) {
                info.setDistAxisRight("");
            }
            if ("null".equals(info.getDistSphLeft())) {
                info.setDistSphLeft("");
            }
            if ("null".equals(info.getDistCylLeft())) {
                info.setDistCylLeft("");
            }
            if ("null".equals(info.getDistAxisLeft())) {
                info.setDistAxisLeft("");
            }
            if ("null".equals(info.getDistSphRight())) {
                info.setDistSphRight("");
            }
            if ("null".equals(info.getDistCylRight())) {
                info.setDistCylRight("");
            }
            if ("null".equals(info.getDistAxisRight())) {
                info.setDistAxisRight("");
            }
            if ("null".equals(info.getNearSphLeft())) {
                info.setNearSphLeft("");
            }
            if ("null".equals(info.getNearCylLeft())) {
                info.setNearCylLeft("");
            }
            if ("null".equals(info.getNearAxisLeft())) {
                info.setNearAxisLeft("");
            }
            if ("null".equals(info.getNearSphRight())) {
                info.setNearSphRight("");
            }
            if ("null".equals(info.getNearCylRight())) {
                info.setNearCylRight("");
            }
            if ("null".equals(info.getNearAxisRight())) {
                info.setNearAxisRight("");
            }

            model.setRowCount(0);
            Object[] firstRowdata = {
                "DIST",
                info.getDistSphLeft(),
                info.getDistCylLeft(),
                info.getDistAxisLeft(),
                info.getDistSphRight(),
                info.getDistCylRight(),
                info.getDistAxisRight()
            };

            model.addRow(firstRowdata);
            Object[] secondRowdata = {
                "NEAR",
                info.getNearSphLeft(),
                info.getNearCylLeft(),
                info.getNearAxisLeft(),
                info.getNearSphRight(),
                info.getNearCylRight(),
                info.getNearAxisRight()
            };

            model.addRow(secondRowdata);
            myopiaRadio.setSelected(false);
            presbyopiaRadio.setSelected(false);
            hypermtropiaRadio.setSelected(false);
            astimatismRadio.setSelected(false);

            if ("MYOPIA".equals(info.getRefractiveError())) {
                myopiaRadio.setSelected(true);
            } else if ("PREABYOPIA".equals(info.getRefractiveError())) {
                presbyopiaRadio.setSelected(true);
            } else if ("HYPERMTROPIA".equals(info.getRefractiveError())) {
                hypermtropiaRadio.setSelected(true);
            } else if ("ASTIMATISM".equals(info.getRefractiveError())) {
                astimatismRadio.setSelected(true);
            }

            txtLenseType.setText(info.getLenseType());
            txtLenseBrand.setText(info.getLensBrand());
            txtLenseName.setText(info.getLensName());
            txtRemarks1.setText(info.getRemarks());
            
            txtCustomerName.setText(info.getCustomer_name());
            txtMobileNumber.setText(info.getMobile_no());
        }
    }
    
}
