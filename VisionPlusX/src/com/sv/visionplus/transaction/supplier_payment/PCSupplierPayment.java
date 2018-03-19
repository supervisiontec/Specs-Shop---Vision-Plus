/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.supplier_payment;

import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.base.transaction.AbstractTransactionForm;
import com.sv.visionplus.resource.accountType.AccountType;
import com.sv.visionplus.transaction.supplier_payment.model.MSupplier;
import com.sv.visionplus.system.exception.VPException;
import com.sv.visionplus.transaction.grn.model.TGrn;
import com.sv.visionplus.transaction.supplier_payment.dialog.SearchGrnDialog;
import com.sv.visionplus.transaction.supplier_payment.model.AccountTransaction;
import com.sv.visionplus.transaction.supplier_payment.model.GrnItemMix;
import com.sv.visionplus.transaction.supplier_payment.model.GrnSearchPayment;
import com.sv.visionplus.transaction.supplier_payment.model.MAccount;
import com.sv.visionplus.transaction.supplier_payment.model.MBankBranch;
import com.sv.visionplus.transaction.supplier_payment.model.SupplierPayment;
import com.sv.visionplus.transaction.supplier_payment.model.SupplierPaymentMix;
import com.sv.visionplus.transaction.supplier_payment.model.TPayment;
import com.sv.visionplus.transaction.supplier_payment.model.searchGrnMix;
import com.sv.visionplus.util.formatter.FormatterUtil;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import visionplusx.Home;
import visionplusx.logFile.LogFileModel;

/**
 *
 * @author Mohan
 */
public class PCSupplierPayment extends AbstractObjectCreator<SupplierPaymentMix> {

    private int supplierId;
    private int grnNo;

    /**
     * Creates new form PCInvoice
     */
    public PCSupplierPayment(AbstractTransactionForm transactionForm) {
        initComponents();
        this.transactionForm = transactionForm;
        modelItem = (DefaultTableModel) tblItem.getModel();
        modelpayment = (DefaultTableModel) tblPayment.getModel();
        rdoSelectedMode(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSupplierName = new com.sv.visionplus.util.component.textfield.CStringField();
        txtContactNo = new com.sv.visionplus.util.component.textfield.CIntegerField();
        txtEmail = new com.sv.visionplus.util.component.textfield.CStringField();
        jToggleButton2 = new javax.swing.JToggleButton();
        txtGrnNo = new com.sv.visionplus.util.component.textfield.CIntegerField();
        txtRefrenceNo = new com.sv.visionplus.util.component.textfield.CStringField();
        txtGrnDate = new com.sv.visionplus.util.component.textfield.CDateField();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblPayment = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtGrnValue = new com.sv.visionplus.util.component.textfield.CDoubleField();
        txtPaidValue = new com.sv.visionplus.util.component.textfield.CDoubleField();
        txtHaveToPay = new com.sv.visionplus.util.component.textfield.CDoubleField();
        txtCashAmount = new com.sv.visionplus.util.component.textfield.CDoubleField();
        txtNewBalance = new com.sv.visionplus.util.component.textfield.CDoubleField();
        jLabel18 = new javax.swing.JLabel();
        txtTotalAmount = new com.sv.visionplus.util.component.textfield.CDoubleField();
        paymentTypePanel = new javax.swing.JPanel();
        chequePanel = new javax.swing.JPanel();
        rdoCheque = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtChequeAmount = new com.sv.visionplus.util.component.textfield.CDoubleField();
        txtChequeNo = new com.sv.visionplus.util.component.textfield.CStringField();
        cmboCheque = new com.sv.visionplus.util.component.combobox.CComboBox(){
            @Override
            public List getComboData(){
                return allBankBranch();
            }
        };
        jPanel12 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblItem = new javax.swing.JTable();

        jLabel6.setText("Date.:");

        jLabel4.setText("Ref No :");

        jLabel3.setText("Grn No.:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Supplier Details"));

        jLabel2.setText("Name :");

        jLabel5.setText("Contact No : ");

        jLabel8.setText("Email :");

        txtContactNo.setText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(txtSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        jToggleButton2.setText("Search");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        txtGrnDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrnDateActionPerformed(evt);
            }
        });

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Payment Details"));

        tblPayment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Receipt No", "DATE", "Cash", "Cheque", "Total Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblPayment);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel11.setText("New Balance :");

        jLabel10.setText("Cash Amount :");

        jLabel7.setText("GRN Value :");

        jLabel9.setText("Have To Pay :");

        jLabel12.setText("Paid Value :");

        txtCashAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCashAmountKeyReleased(evt);
            }
        });

        jLabel18.setText("Total Amount :");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPaidValue, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHaveToPay, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGrnValue, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCashAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNewBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtCashAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(txtNewBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtGrnValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtPaidValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtHaveToPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        chequePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Cheque Payment"));

        rdoCheque.setText("Cheque Payment");
        rdoCheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoChequeActionPerformed(evt);
            }
        });

        jLabel16.setText(" Amount :");

        jLabel17.setText("Bank :");

        jLabel19.setText(" Cheque No :");

        txtChequeAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtChequeAmountKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout chequePanelLayout = new javax.swing.GroupLayout(chequePanel);
        chequePanel.setLayout(chequePanelLayout);
        chequePanelLayout.setHorizontalGroup(
            chequePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chequePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(chequePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(chequePanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(chequePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(chequePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtChequeNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtChequeAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmboCheque, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)))
                    .addGroup(chequePanelLayout.createSequentialGroup()
                        .addComponent(rdoCheque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(93, 93, 93)))
                .addContainerGap())
        );
        chequePanelLayout.setVerticalGroup(
            chequePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chequePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdoCheque)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(chequePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtChequeAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(chequePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(cmboCheque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(chequePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(txtChequeNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout paymentTypePanelLayout = new javax.swing.GroupLayout(paymentTypePanel);
        paymentTypePanel.setLayout(paymentTypePanelLayout);
        paymentTypePanelLayout.setHorizontalGroup(
            paymentTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paymentTypePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chequePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        paymentTypePanelLayout.setVerticalGroup(
            paymentTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentTypePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chequePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("GRN Item Information"));

        tblItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Name", "Brand", "Category", "Cost Price", "Qty", "Value", "Discount", "Net Value"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tblItem);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
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
                                .addComponent(txtGrnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(paymentTypePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel4)
                        .addComponent(jToggleButton2)
                        .addComponent(txtRefrenceNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtGrnDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtGrnNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paymentTypePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        List<searchGrnMix> searchGrn = SearchGrnMixDAO.getInstance().searchGrn(txtGrnNo.getCValue(), txtRefrenceNo.getCValue());
        if (searchGrn.size() == 1) {
            setGrn(searchGrn.get(0));
        } else {
            SearchGrnDialog dialog = new SearchGrnDialog(null, true);
            dialog.setFrame(this);
            dialog.setValue(searchGrn);
            dialog.setVisible(true);
        }
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void txtGrnDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrnDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGrnDateActionPerformed

    private void txtCashAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCashAmountKeyReleased
        setTotalAmountAndBalance();
    }//GEN-LAST:event_txtCashAmountKeyReleased

    private void rdoChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoChequeActionPerformed
        if (rdoCheque.isSelected()) {
            rdoSelectedMode(true);
            txtTotalAmount.setCValue(txtTotalAmount.getCValue() + txtChequeAmount.getCValue());
            txtNewBalance.setCValue(txtHaveToPay.getCValue() - txtTotalAmount.getCValue());

        } else {
            rdoSelectedMode(false);
            txtTotalAmount.setCValue(txtTotalAmount.getCValue() - txtChequeAmount.getCValue());
            txtNewBalance.setCValue(txtHaveToPay.getCValue() - txtTotalAmount.getCValue());

        }
    }//GEN-LAST:event_rdoChequeActionPerformed

    private void txtChequeAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtChequeAmountKeyReleased
        setTotalAmountAndBalance();
    }//GEN-LAST:event_txtChequeAmountKeyReleased

    @Override
    public void setIdealMode() {
        txtGrnNo.resetCValue();
        txtRefrenceNo.resetCValue();
        txtGrnDate.resetCValue();
        txtSupplierName.resetCValue();
        txtSupplierName.setCValueEditable(false);
        txtContactNo.resetCValue();
        txtContactNo.setCValueEditable(false);
        txtEmail.resetCValue();
        txtEmail.setCValueEditable(false);
        modelpayment.setRowCount(0);
        modelItem.setRowCount(0);
        txtGrnValue.resetCValue();
        txtGrnValue.setCValueEditable(false);
        txtPaidValue.resetCValue();
        txtPaidValue.setCValueEditable(false);
        txtHaveToPay.resetCValue();
        txtHaveToPay.setCValueEditable(false);
        txtCashAmount.resetCValue();
        txtCashAmount.setCValueEditable(false);
        txtTotalAmount.resetCValue();
        txtTotalAmount.setCValueEditable(false);
        txtNewBalance.resetCValue();
        txtNewBalance.setCValueEditable(false);
        txtChequeAmount.resetCValue();
        txtChequeAmount.setCValueEditable(false);
        txtChequeNo.resetCValue();
        txtChequeNo.setCValueEditable(false);
        cmboCheque.resetCValue();
        rdoCheque.setSelected(false);
        rdoCheque.setEnabled(false);

    }

    @Override
    public void setNewMode() {
        this.mix = new SupplierPaymentMix();

        txtGrnNo.resetCValue();
        txtRefrenceNo.resetCValue();
        txtGrnDate.resetCValue();
        txtSupplierName.resetCValue();
        txtSupplierName.setCValueEditable(false);
        txtContactNo.resetCValue();
        txtContactNo.setCValueEditable(false);
        txtEmail.resetCValue();
        txtEmail.setCValueEditable(false);
        modelpayment.setRowCount(0);
        modelItem.setRowCount(0);
        txtGrnValue.resetCValue();
        txtGrnValue.setCValueEditable(false);
        txtPaidValue.resetCValue();
        txtPaidValue.setCValueEditable(false);
        txtHaveToPay.resetCValue();
        txtHaveToPay.setCValueEditable(false);
        txtCashAmount.resetCValue();
        txtCashAmount.setCValueEditable(true);
        txtTotalAmount.resetCValue();
        txtTotalAmount.setCValueEditable(false);
        txtNewBalance.resetCValue();
        txtNewBalance.setCValueEditable(false);
        txtChequeAmount.resetCValue();
        txtChequeAmount.setCValueEditable(false);
        txtChequeNo.resetCValue();
        txtChequeNo.setCValueEditable(false);
        cmboCheque.resetCValue();
        rdoCheque.setSelected(false);
        rdoCheque.setEnabled(true);

    }

    @Override
    public void setEditMode() {

    }

    @Override
    public void resetFields() {
        txtGrnNo.resetCValue();
        txtRefrenceNo.resetCValue();
        txtGrnDate.resetCValue();
        txtSupplierName.resetCValue();
        txtSupplierName.setCValueEditable(false);
        txtContactNo.resetCValue();
        txtContactNo.setCValueEditable(false);
        txtEmail.resetCValue();
        txtEmail.setCValueEditable(false);
        modelpayment.setRowCount(0);
        modelItem.setRowCount(0);
        txtGrnValue.resetCValue();
        txtGrnValue.setCValueEditable(false);
        txtPaidValue.resetCValue();
        txtPaidValue.setCValueEditable(false);
        txtHaveToPay.resetCValue();
        txtHaveToPay.setCValueEditable(false);
        txtCashAmount.resetCValue();
        txtCashAmount.setCValueEditable(false);
        txtTotalAmount.resetCValue();
        txtTotalAmount.setCValueEditable(false);
        txtNewBalance.resetCValue();
        txtNewBalance.setCValueEditable(false);
        txtChequeAmount.resetCValue();
        txtChequeAmount.setCValueEditable(false);
        txtChequeNo.resetCValue();
        txtChequeNo.setCValueEditable(false);
        cmboCheque.resetCValue();
        rdoCheque.setSelected(false);
        rdoCheque.setEnabled(false);
    }

    @Override
    public void initObject() throws VPException {
        TPayment payment = new TPayment();
        payment.setCardAmount(0.00);
        payment.setCashAmount(txtCashAmount.getCValue());
        payment.setChequeAmount(0.00);
        if (rdoCheque.isSelected()) {
            payment.setChequeAmount(txtChequeAmount.getCValue());
        }
//        payment.setIndexNo(0);//auto
        payment.setTotalAmount(txtTotalAmount.getCValue());
        payment.setTransaction(null);

        mix.setPayment(payment);

        SupplierPayment supplierPayment = new SupplierPayment();
        supplierPayment.setDate(new Date());
        supplierPayment.setGrn(grnNo);//dont know yet
//        supplierPayment.setIndex_no(0);//auto incerment
//        supplierPayment.setPayment(0);//dont know yet
        mix.setSupplierPayment(supplierPayment);

        AccountTransaction transaction = new AccountTransaction();
        transaction.setAccount(0);//dont know yet
        transaction.setCredit(txtTotalAmount.getCValue());
        transaction.setDate(new Date());
        transaction.setDebit(0.00);
        transaction.setDescription("Grn Payment");
//        transaction.setIndex_no(0);//auto

        mix.setTransaction(transaction);

        MAccount account = new MAccount();
        account.setDescription("Grn Payment");
//        account.setIndex_no(0);//auto
        account.setMain_category(2);
        account.setSub_category(3);
        account.setType(AccountType.GRN);

        mix.setAccount(account);

        LogFileModel logFile = new LogFileModel();
        logFile.setDate(new Date());
        logFile.setFormName("Supplier Payment");
//        logFile.setIndexNo(0);auto
        logFile.setRemarks("Supplier Payment");
        logFile.setTime(FormatterUtil.getInstance().getTime());
        logFile.setTransactionType("Save");
        logFile.setUser(Home.getInstance().getUser().getIndexNo());
        logFile.setUserName(Home.getInstance().getUser().getName());
        logFile.setValue(txtTotalAmount.getCValue());
        mix.setLogFile(logFile);

    }

    @Override
    public void initInterface() throws VPException {
    }

    @Override
    protected void setValueAbstract(SupplierPaymentMix mix) {
        this.mix = mix;
    }

    @Override
    protected SupplierPaymentMix getValueAbstract() {
        return this.mix;

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel chequePanel;
    private com.sv.visionplus.util.component.combobox.CComboBox cmboCheque;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JPanel paymentTypePanel;
    private javax.swing.JRadioButton rdoCheque;
    private javax.swing.JTable tblItem;
    private javax.swing.JTable tblPayment;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtCashAmount;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtChequeAmount;
    private com.sv.visionplus.util.component.textfield.CStringField txtChequeNo;
    private com.sv.visionplus.util.component.textfield.CIntegerField txtContactNo;
    private com.sv.visionplus.util.component.textfield.CStringField txtEmail;
    private com.sv.visionplus.util.component.textfield.CDateField txtGrnDate;
    private com.sv.visionplus.util.component.textfield.CIntegerField txtGrnNo;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtGrnValue;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtHaveToPay;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtNewBalance;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtPaidValue;
    private com.sv.visionplus.util.component.textfield.CStringField txtRefrenceNo;
    private com.sv.visionplus.util.component.textfield.CStringField txtSupplierName;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtTotalAmount;
    // End of variables declaration//GEN-END:variables
    private TGrn grn;
    private final AbstractTransactionForm transactionForm;
    private MSupplier supplier;
    private DefaultTableModel modelItem;
    private DefaultTableModel modelpayment;
    private SupplierPaymentMix mix;

    public List<MBankBranch> allBankBranch() {
        return BankBranchDAO.getInstance().allBankBranch();
    }

    private void setGrn(searchGrnMix grn) {
        setDialogValue(grn.getGrnNo(), grn.getSupplier());
    }

    public void setDialogValue(int grnNo, int supplierId) {
        this.grnNo = grnNo;
        this.supplierId = supplierId;

        MSupplier selectSupplier = SupplierDAO.getInstance().getSupplier(supplierId);
        TGrn selectGrn = GrnDAO.getInstance().getGrn(grnNo);

        setValueToForm(selectGrn, selectSupplier);

        List<GrnItemMix> searchGrnItem = SearchGrnItemDAO.getInstance().searchItem(grnNo);
        addGrnItemData(searchGrnItem);

        List<GrnSearchPayment> searchPayment = GrnSearchPaymentDAO.getInstance().searchPayment(grnNo);
        addGrnPaymentData(searchPayment);

        setPaidValue();
    }

    private void setValueToForm(TGrn selectGrn, MSupplier selectSupplier) {
        txtGrnNo.setCValue(selectGrn.getIndexNo());
        txtGrnDate.setCValue(selectGrn.getDate());
        txtGrnValue.setCValue(selectGrn.getAmount());
        txtRefrenceNo.setCValue(selectGrn.getRef_no());

        txtEmail.setCValue(selectSupplier.getEmail());
        txtSupplierName.setCValue(selectSupplier.getName());
        txtContactNo.setText(selectSupplier.getContactNo());
    }

    private void addGrnItemData(List<GrnItemMix> searchGrnItem) {
        modelItem.setRowCount(0);
        for (GrnItemMix item : searchGrnItem) {
            Object[] rowdata = {
                item.getCode(),
                item.getName(),
                item.getBrand(),
                item.getCategory(),
                item.getUnit_price(),
                item.getQty(),
                item.getValue(),
                item.getDiscount(),
                item.getNet_value()
            };
            modelItem.addRow(rowdata);
        }
    }

    private void addGrnPaymentData(List<GrnSearchPayment> searchPayment) {
        modelpayment.setRowCount(0);
        for (GrnSearchPayment payment : searchPayment) {
            Object[] rowData = {
                payment.getReceipt_no(),
                payment.getDate(),
                payment.getCash(),
                payment.getCheque(),
                payment.getTotal()
            };
            modelpayment.addRow(rowData);
        }
    }

    private void setPaidValue() {
        if (tblPayment.getRowCount() < 0) {
            txtPaidValue.setCValue(0.00);
        } else {
            double paidValue = 0.00;
            for (int i = 0; i < tblPayment.getRowCount(); i++) {
                paidValue += Double.parseDouble(tblPayment.getValueAt(i, 4).toString());

            }
            txtPaidValue.setCValue(paidValue);
        }
        txtHaveToPay.setCValue(txtGrnValue.getCValue() - txtPaidValue.getCValue());
        txtNewBalance.setCValue(txtGrnValue.getCValue() - txtPaidValue.getCValue());
    }

    private void rdoSelectedMode(boolean res) {
        txtChequeAmount.setCValueEditable(res);
        txtChequeNo.setCValueEditable(res);
        cmboCheque.setCValueEditable(res);

    }

    private void setTotalAmountAndBalance() {
        if (rdoCheque.isSelected()) {
            txtTotalAmount.setCValue(txtCashAmount.getCValue() + txtChequeAmount.getCValue());

        } else {
            txtTotalAmount.setCValue(txtCashAmount.getCValue());
        }
        txtNewBalance.setCValue(txtHaveToPay.getCValue() - txtTotalAmount.getCValue());
    }

}
