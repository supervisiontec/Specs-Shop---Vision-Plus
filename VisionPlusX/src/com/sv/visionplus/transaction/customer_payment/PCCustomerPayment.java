/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.customer_payment;

import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.base.transaction.AbstractTransactionForm;
import com.sv.visionplus.resource.InvoiceStatus.InvoiceStatus;
import com.sv.visionplus.resource.accountType.AccountType;
import com.sv.visionplus.system.exception.VPException;
import com.sv.visionplus.transaction.customer_payment.dialog.SearchInvoice;
import com.sv.visionplus.transaction.customer_payment.model.CustomerInvoiceMix;
import com.sv.visionplus.transaction.customer_payment.model.CustomerPayment;
import com.sv.visionplus.transaction.customer_payment.model.CustomerPaymentMix;
import com.sv.visionplus.transaction.customer_payment.model.CustomerPaymentView;
import com.sv.visionplus.transaction.customer_payment.model.MAccount;
import com.sv.visionplus.transaction.customer_payment.model.MBankBranch;
import com.sv.visionplus.transaction.customer_payment.model.Status;
import com.sv.visionplus.transaction.customer_payment.model.TAccountTransaction;
import com.sv.visionplus.transaction.customer_payment.model.TInvoice;
import com.sv.visionplus.transaction.customer_payment.model.TPayment;
import com.sv.visionplus.util.formatter.FormatterUtil;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import visionplusx.Home;
import visionplusx.logFile.LogFileModel;

/**
 *
 * @author Mohan
 */
public class PCCustomerPayment extends AbstractObjectCreator<CustomerPaymentMix> {

    private DefaultTableModel paymentModel;
    private DefaultTableModel statusModel;
    private int value = 0;
    private CustomerPaymentMix mix;

    /**
     * Creates new form PCInvoice
     */
    public PCCustomerPayment(AbstractTransactionForm transactionForm) {
        initComponents();
        this.transactionForm = transactionForm;
        paymentModel = (DefaultTableModel) tblPayment.getModel();
        statusModel = (DefaultTableModel) tblStatus.getModel();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNic = new com.sv.visionplus.util.component.textfield.CStringField();
        txtName = new com.sv.visionplus.util.component.textfield.CStringField();
        txtMobile = new com.sv.visionplus.util.component.textfield.CIntegerField();
        jLabel1 = new javax.swing.JLabel();
        datePicker = new org.jdesktop.swingx.JXDatePicker();
        txtInvoiceNo = new com.sv.visionplus.util.component.textfield.CStringField();
        jLabel19 = new javax.swing.JLabel();
        txtRefNo = new com.sv.visionplus.util.component.textfield.CIntegerField();
        jLabel20 = new javax.swing.JLabel();
        txtBarcode = new com.sv.visionplus.util.component.textfield.CStringField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblStatus = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblPayment = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rdoIssueGoods = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtInvoiceVlaue = new com.sv.visionplus.util.component.textfield.CDoubleField();
        txtPaidValue = new com.sv.visionplus.util.component.textfield.CDoubleField();
        txtHaveToPay = new com.sv.visionplus.util.component.textfield.CDoubleField();
        txtCashAmount = new com.sv.visionplus.util.component.textfield.CDoubleField();
        txtNewBalance = new com.sv.visionplus.util.component.textfield.CDoubleField();
        jLabel18 = new javax.swing.JLabel();
        txtTotalAmount = new com.sv.visionplus.util.component.textfield.CDoubleField();
        paymentTypePanel = new javax.swing.JPanel();
        cardPanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        rdoCardPayment = new javax.swing.JRadioButton();
        txtCardAmount = new com.sv.visionplus.util.component.textfield.CDoubleField();
        txtCardNo = new com.sv.visionplus.util.component.textfield.CStringField();
        cmboCard = new com.sv.visionplus.util.component.combobox.CComboBox(){
            @Override
            public List getComboData(){
                return allBankBranch();
            }
        };
        chequePanel = new javax.swing.JPanel();
        rdoCheque = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtChequeAmount = new com.sv.visionplus.util.component.textfield.CDoubleField();
        txtChequeNo = new com.sv.visionplus.util.component.textfield.CStringField();
        cmboCheque = new com.sv.visionplus.util.component.combobox.CComboBox(){
            @Override
            public List getComboData(){
                return allBankBranch();
            }
        };

        jLabel5.setText("Name :");

        jLabel4.setText("NIC :");

        jLabel6.setText("Mobile :");

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Invoice No :");

        txtNic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNicActionPerformed(evt);
            }
        });

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel1.setText("Date :");

        datePicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datePickerActionPerformed(evt);
            }
        });

        jLabel19.setText("ref no:");

        jLabel20.setText("Barcode :");

        txtBarcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBarcodeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInvoiceNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBarcode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRefNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(datePicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMobile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txtNic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInvoiceNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(txtRefNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(txtBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Status Detail"));

        tblStatus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "DATE", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tblStatus);
        if (tblStatus.getColumnModel().getColumnCount() > 0) {
            tblStatus.getColumnModel().getColumn(0).setResizable(false);
            tblStatus.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblStatus.getColumnModel().getColumn(1).setMinWidth(100);
            tblStatus.getColumnModel().getColumn(1).setPreferredWidth(100);
            tblStatus.getColumnModel().getColumn(1).setMaxWidth(100);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("PaymentDetails"));

        tblPayment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Receipt No", "DATE", "Cash", "Cheque", "Card", "Total Amount", "isAdvance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false, true
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
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel11.setText("New Balance :");

        jLabel10.setText("Cash Amount :");

        jLabel7.setText("Invoice Value :");

        rdoIssueGoods.setText("Issue Goods");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Have To Pay :");

        jLabel8.setText("Paid Value :");

        txtHaveToPay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));

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
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPaidValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtHaveToPay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCashAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNewBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtInvoiceVlaue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTotalAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(rdoIssueGoods, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addGap(57, 57, 57))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtInvoiceVlaue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPaidValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtHaveToPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                    .addComponent(txtNewBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoIssueGoods))
        );

        cardPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Card Payment"));

        jLabel12.setText(" Amount :");

        jLabel13.setText("Bank :");

        jLabel14.setText(" Card No :");

        rdoCardPayment.setText("Card Payment");
        rdoCardPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoCardPaymentActionPerformed(evt);
            }
        });

        txtCardAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCardAmountKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout cardPanelLayout = new javax.swing.GroupLayout(cardPanel);
        cardPanel.setLayout(cardPanelLayout);
        cardPanelLayout.setHorizontalGroup(
            cardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardPanelLayout.createSequentialGroup()
                        .addComponent(rdoCardPayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(106, 106, 106))
                    .addGroup(cardPanelLayout.createSequentialGroup()
                        .addGroup(cardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cardPanelLayout.createSequentialGroup()
                                .addGroup(cardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCardAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCardNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(29, 29, 29))
                            .addGroup(cardPanelLayout.createSequentialGroup()
                                .addComponent(cmboCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(19, Short.MAX_VALUE))))))
        );
        cardPanelLayout.setVerticalGroup(
            cardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdoCardPayment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtCardAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(cmboCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtCardNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        chequePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Cheque Payment"));

        rdoCheque.setText("Cheque Payment");
        rdoCheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoChequeActionPerformed(evt);
            }
        });

        jLabel15.setText(" Amount :");

        jLabel16.setText("Bank :");

        jLabel17.setText(" Cheque No :");

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
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(chequePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtChequeNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtChequeAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(chequePanelLayout.createSequentialGroup()
                                .addComponent(cmboCheque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 7, Short.MAX_VALUE))))
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
                    .addComponent(jLabel15)
                    .addComponent(txtChequeAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(chequePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(cmboCheque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(chequePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(txtChequeNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout paymentTypePanelLayout = new javax.swing.GroupLayout(paymentTypePanel);
        paymentTypePanel.setLayout(paymentTypePanelLayout);
        paymentTypePanelLayout.setHorizontalGroup(
            paymentTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentTypePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chequePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paymentTypePanelLayout.setVerticalGroup(
            paymentTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(chequePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paymentTypePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paymentTypePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rdoCardPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoCardPaymentActionPerformed
        if (rdoCardPayment.isSelected()) {
            txtCardAmount.setCValueEditable(true);
            txtCardNo.setCValueEditable(true);
            cmboCard.setCValueEditable(true);
            txtTotalAmount.setCValue(txtTotalAmount.getCValue() + txtCardAmount.getCValue());
            txtNewBalance.setCValue(txtHaveToPay.getCValue() - txtTotalAmount.getCValue());
        } else {
            txtCardAmount.setCValueEditable(false);
            txtCardNo.setCValueEditable(false);
            cmboCard.setCValueEditable(false);
            txtTotalAmount.setCValue(txtTotalAmount.getCValue() - txtCardAmount.getCValue());
            txtNewBalance.setCValue(txtHaveToPay.getCValue() - txtTotalAmount.getCValue());
        }
    }//GEN-LAST:event_rdoCardPaymentActionPerformed

    private void rdoChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoChequeActionPerformed
        if (rdoCheque.isSelected()) {
            txtChequeAmount.setCValueEditable(true);
            txtChequeNo.setCValueEditable(true);
            cmboCheque.setCValueEditable(true);
            txtTotalAmount.setCValue(txtTotalAmount.getCValue() + txtChequeAmount.getCValue());
            txtNewBalance.setCValue(txtHaveToPay.getCValue() - txtTotalAmount.getCValue());

        } else {
            txtChequeAmount.setCValueEditable(false);
            txtChequeNo.setCValueEditable(false);
            cmboCheque.setCValueEditable(false);
            txtTotalAmount.setCValue(txtTotalAmount.getCValue() - txtChequeAmount.getCValue());
            txtNewBalance.setCValue(txtHaveToPay.getCValue() - txtTotalAmount.getCValue());

        }
    }//GEN-LAST:event_rdoChequeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CustomerInvoiceMix invoiceMix = new CustomerInvoiceMix();
        invoiceMix.setContact_no(txtMobile.getText());
        invoiceMix.setInvoice_no(txtRefNo.getCValue());
        invoiceMix.setName(txtName.getCValue());
        invoiceMix.setNic(txtNic.getCValue());
        invoiceMix.setBarcode(txtBarcode.getCValue());
        CustomerInvoiceMix searchInvoice = SearchInvoiceDAO.getInstance().searchInvoiceById(txtInvoiceNo.getCValue());
        CustomerInvoiceMix searchBarcode = SearchInvoiceDAO.getInstance().searchInvoiceByBarcode(txtBarcode.getCValue());
        if (null != searchInvoice) {
            setInvoice(searchInvoice);
        } else if (null != searchBarcode) {
            setInvoice(searchBarcode);
        } else {
            List<CustomerInvoiceMix> invoiceList = SearchInvoiceDAO.getInstance().searchInvoice(invoiceMix);
            if (invoiceList.size() == 1) {
                setInvoice(searchInvoice);
            } else {
                if (value == 2) {
                    SearchInvoice invoiceDialog = new SearchInvoice(null, true);
                    invoiceDialog.setFrame(this);
                    invoiceDialog.setVisible(true);
                }
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void datePickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datePickerActionPerformed
        if (value == 2) {

            SearchInvoice invoiceDialog = new SearchInvoice(null, true);
            invoiceDialog.setFrame(this);
            invoiceDialog.setVisible(true);
        }
    }//GEN-LAST:event_datePickerActionPerformed

    private void txtCashAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCashAmountKeyReleased
        setTotalAmount();
    }//GEN-LAST:event_txtCashAmountKeyReleased

    private void txtCardAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCardAmountKeyReleased
        setTotalAmount();
    }//GEN-LAST:event_txtCardAmountKeyReleased

    private void txtChequeAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtChequeAmountKeyReleased
        setTotalAmount();
    }//GEN-LAST:event_txtChequeAmountKeyReleased

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtNicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNicActionPerformed

    private void txtBarcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBarcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBarcodeActionPerformed

    @Override
    public void setIdealMode() {
        txtInvoiceNo.resetCValue();
        txtRefNo.resetCValue();
        txtInvoiceNo.setCValueEditable(false);
        txtRefNo.setCValueEditable(false);
        txtNic.setCValueEditable(false);
        txtNic.resetCValue();
        datePicker.setEditable(false);
        datePicker.setDate(new Date());
        txtName.setCValueEditable(false);
        txtName.resetCValue();
        txtMobile.setCValueEditable(false);
        txtMobile.resetCValue();
        txtInvoiceVlaue.setCValueEditable(false);
        txtInvoiceVlaue.resetCValue();
        txtPaidValue.setCValueEditable(false);
        txtPaidValue.resetCValue();
        txtHaveToPay.setCValueEditable(false);
        txtHaveToPay.resetCValue();
        txtCashAmount.setCValueEditable(false);
        txtCashAmount.resetCValue();
        txtTotalAmount.setCValueEditable(false);
        txtTotalAmount.resetCValue();
        txtNewBalance.setCValueEditable(false);
        txtNewBalance.resetCValue();
        rdoIssueGoods.setEnabled(false);
        rdoIssueGoods.setSelected(false);
        rdoCardPayment.setEnabled(false);
        rdoCardPayment.setSelected(false);
        rdoCheque.setEnabled(false);
        rdoCheque.setSelected(false);
        txtCardAmount.setCValueEditable(false);
        txtCardAmount.resetCValue();
        cmboCard.setCValueEditable(false);
        cmboCard.resetCValue();
        cmboCheque.setCValueEditable(false);
        cmboCheque.resetCValue();
        txtCardNo.setCValueEditable(false);
        txtCardNo.resetCValue();
        txtChequeAmount.setCValueEditable(false);
        txtChequeAmount.resetCValue();
        txtChequeNo.setCValueEditable(false);
        txtChequeNo.resetCValue();
        txtBarcode.setCValueEditable(false);
        txtBarcode.setText("-");
        value = 2;

    }

    @Override
    public void setNewMode() {
        mix = new CustomerPaymentMix();

        txtInvoiceNo.setCValueEditable(true);
        txtRefNo.setCValueEditable(true);
        txtNic.setCValueEditable(true);
        datePicker.setEnabled(true);
        txtName.setCValueEditable(true);
        txtMobile.setCValueEditable(true);
        txtCashAmount.setCValueEditable(true);
        txtBarcode.setCValueEditable(true);
        txtBarcode.setText("-");

        rdoCardPayment.setEnabled(true);
        rdoCheque.setEnabled(true);
        rdoIssueGoods.setEnabled(true);

    }

    @Override
    public void setEditMode() {
    }

    @Override
    public void resetFields() {
        txtInvoiceNo.resetCValue();
        txtRefNo.resetCValue();
        txtInvoiceNo.setCValueEditable(false);
        txtRefNo.setCValueEditable(false);
        txtNic.setCValueEditable(false);
        txtNic.resetCValue();
        datePicker.setEditable(false);
        datePicker.setDate(new Date());
        txtName.setCValueEditable(false);
        txtName.resetCValue();
        txtMobile.setCValueEditable(false);
        txtMobile.resetCValue();
        txtInvoiceVlaue.setCValueEditable(false);
        txtInvoiceVlaue.resetCValue();
        txtPaidValue.setCValueEditable(false);
        txtPaidValue.resetCValue();
        txtHaveToPay.setCValueEditable(false);
        txtHaveToPay.resetCValue();
        txtCashAmount.setCValueEditable(false);
        txtCashAmount.resetCValue();
        txtTotalAmount.setCValueEditable(false);
        txtTotalAmount.resetCValue();
        txtNewBalance.setCValueEditable(false);
        txtNewBalance.resetCValue();
        rdoIssueGoods.setEnabled(false);
        rdoIssueGoods.setSelected(false);
        rdoCardPayment.setEnabled(false);
        rdoCardPayment.setSelected(false);
        rdoCheque.setEnabled(false);
        rdoCheque.setSelected(false);
        txtCardAmount.setCValueEditable(false);
        txtCardAmount.resetCValue();
        cmboCard.setCValueEditable(false);
        cmboCard.resetCValue();
        cmboCheque.setCValueEditable(false);
        cmboCheque.resetCValue();
        txtCardNo.setCValueEditable(false);
        txtCardNo.resetCValue();
        txtChequeAmount.setCValueEditable(false);
        txtChequeAmount.resetCValue();
        txtChequeNo.setCValueEditable(false);
        txtChequeNo.resetCValue();
        txtBarcode.setCValueEditable(false);
        txtBarcode.setText("-");

        paymentModel.setRowCount(0);
        statusModel.setRowCount(0);

    }

    @Override
    public void initObject() throws VPException {
        TPayment payment = new TPayment();
        payment.setCardAmont(txtCardAmount.getCValue());
        payment.setCashAmont(txtCashAmount.getCValue());
        payment.setChequeAmont(txtChequeAmount.getCValue());
//        payment.setIndexNo(0);//auto increment
        payment.setTotalAmont(txtTotalAmount.getCValue());
        payment.setTransaction(null);

        mix.setPayment(payment);

        CustomerPayment customerPayment = new CustomerPayment();
        customerPayment.setDate(new Date());
        customerPayment.setInvoice(txtRefNo.getCValue());
        customerPayment.setIsAdvance(false);
//        customerPayment.setPayment(0);//dont know yet

        mix.setCustomerPayment(customerPayment);

        LogFileModel log = new LogFileModel();
        log.setDate(new Date());
        log.setFormName("Customer Payment");
//        log.setIndexNo(0);//auto incerment
        log.setRemarks("Save Customer Payment");
        log.setTime(FormatterUtil.getInstance().getTime());
        log.setTransactionType("Save");
        log.setUser(Home.getInstance().getUser().getIndexNo());
        log.setUserName(Home.getInstance().getUser().getName());
        log.setValue(txtTotalAmount.getCValue());

        mix.setLogFile(log);

        Status status = new Status();
        if (rdoIssueGoods.isSelected()) {
            status.setDate(new Date());
//            status.setIndexNo();
            status.setInvoice(txtRefNo.getCValue());
            status.setName(InvoiceStatus.ISSUED_TO_CUSTOMER);
        } else {
            status = null;
        }
        mix.setStatus(status);

        TInvoice invoice = new TInvoice();
        invoice.setIndexNo(txtRefNo.getCValue());
        invoice.setNumber(txtInvoiceNo.getCValue());
        if (rdoIssueGoods.isSelected()) {
            invoice.setStatus(InvoiceStatus.ISSUED_TO_CUSTOMER);
        }

        mix.setInvoice(invoice);
        mix.setGoodIssue(rdoIssueGoods.isSelected());

        //MAccount
        MAccount account = new MAccount();
        account.setDescription("Customer Payment");
//        account.setIndexNo(0);//auto
        account.setMainCategory(1);
        account.setSubCategory(2);
        account.setType(AccountType.INVOICE);
        mix.setAccount(account);

        //account Transaction
        TAccountTransaction accountTransaction = new TAccountTransaction();
//        accountTransaction.setAccount(0);//dont know yet
        accountTransaction.setCredit(0.00);
        accountTransaction.setDate(new Date());
        accountTransaction.setDebit(txtTotalAmount.getCValue());
        accountTransaction.setDescription("Customer Payment");
//        accountTransaction.setIndexNo(0);//auto
        mix.setAccountTransaction(accountTransaction);

    }

    @Override
    public void initInterface() throws VPException {

    }

    @Override
    protected void setValueAbstract(CustomerPaymentMix mix) {
        this.mix = mix;
    }

    @Override
    protected CustomerPaymentMix getValueAbstract() {
        if (txtNewBalance.getCValue() < 0) {
            CustomerPaymentMix paymentMix = null;
            return paymentMix;
        }
        return mix;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cardPanel;
    private javax.swing.JPanel chequePanel;
    private com.sv.visionplus.util.component.combobox.CComboBox cmboCard;
    private com.sv.visionplus.util.component.combobox.CComboBox cmboCheque;
    private org.jdesktop.swingx.JXDatePicker datePicker;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JPanel paymentTypePanel;
    private javax.swing.JRadioButton rdoCardPayment;
    private javax.swing.JRadioButton rdoCheque;
    private javax.swing.JRadioButton rdoIssueGoods;
    private javax.swing.JTable tblPayment;
    private javax.swing.JTable tblStatus;
    private com.sv.visionplus.util.component.textfield.CStringField txtBarcode;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtCardAmount;
    private com.sv.visionplus.util.component.textfield.CStringField txtCardNo;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtCashAmount;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtChequeAmount;
    private com.sv.visionplus.util.component.textfield.CStringField txtChequeNo;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtHaveToPay;
    private com.sv.visionplus.util.component.textfield.CStringField txtInvoiceNo;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtInvoiceVlaue;
    private com.sv.visionplus.util.component.textfield.CIntegerField txtMobile;
    private com.sv.visionplus.util.component.textfield.CStringField txtName;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtNewBalance;
    private com.sv.visionplus.util.component.textfield.CStringField txtNic;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtPaidValue;
    private com.sv.visionplus.util.component.textfield.CIntegerField txtRefNo;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtTotalAmount;
    // End of variables declaration//GEN-END:variables

    private final AbstractTransactionForm transactionForm;
    private TPayment payment;

    private List<MBankBranch> allBankBranch() {
        return BankBranchDAO.getInstance().allBankBanch();
    }

    public void setInvoice(CustomerInvoiceMix searchInvoice) {
        if (searchInvoice != null) {
            statusModel.setRowCount(0);
            paymentModel.setRowCount(0);
            txtName.setCValue(searchInvoice.getName());
            txtNic.setCValue(searchInvoice.getNic());
            txtMobile.setText(searchInvoice.getContact_no());
            txtRefNo.setCValue(searchInvoice.getInvoice_no());
            TInvoice invoice = InvoiceDAO.getInstance().searchInvoice(searchInvoice.getInvoice_no());
            txtInvoiceNo.setCValue(invoice.getNumber());
//        datePicker.setDate(searchInvoice.getInvoice_date());
            txtInvoiceVlaue.setCValue(searchInvoice.getAmount());
            txtBarcode.setCValue(searchInvoice.getBarcode());
            if (searchInvoice.getIsdelete()) {
               JOptionPane.showMessageDialog(this, "This Invoice is deleted - "+invoice.getNumber(),"Error Message",JOptionPane.ERROR_MESSAGE); 
            }
            setPayment(searchInvoice.getInvoice_no());
            setStatus(searchInvoice.getInvoice_no());
        }

    }

    private void setPayment(Integer invoice_no) {
        List<CustomerPaymentView> paymentList = CustomerPaymentViewDAO.getInstance().searchInvoicePayment(invoice_no);
        if (!paymentList.isEmpty()) {
            addDataToPaymentTable(paymentList);
        } else {
            setPaidValue(0.00);
        }
    }

    private void addDataToPaymentTable(List<CustomerPaymentView> paymentList) {
        paymentModel.setRowCount(0);
        double payAmount = 0.00;
        for (CustomerPaymentView payment : paymentList) {
            if (payment.getTotal_amount() > 0) {

                String isAdvance = "No";
                if (payment.isIs_advance()) {
                    isAdvance = "Yes";
                }
                payAmount += payment.getTotal_amount();//set pay Amount

                Object[] rowData = {
                    payment.getRecieptNo(),
                    payment.getDate(),
                    payment.getCash_amount(),
                    payment.getCheque_amount(),
                    payment.getCard_amount(),
                    payment.getTotal_amount(),
                    isAdvance
                };
                paymentModel.addRow(rowData);
                setPaidValue(payAmount);
            } else {
                setPaidValue(0.00);
            }
        }
    }

    private void setStatus(Integer invoice_no) {
        List<Status> statusList = StatusDAO.getInstance().getStatus(invoice_no);
        if (!statusList.isEmpty()) {
            addDataToStatusTable(statusList);
        }
    }

    private void addDataToStatusTable(List<Status> statusList) {
        statusModel.setRowCount(0);
        for (Status status : statusList) {
            Object[] rowData = {
                status.getIndexNo(),
                status.getDate(),
                status.getName()
            };
            statusModel.addRow(rowData);
        }
    }

    private void setPaidValue(double payAmount) {
        txtPaidValue.setCValue(payAmount);
        if (payAmount > 0.00) {
            txtHaveToPay.setCValue(txtInvoiceVlaue.getCValue() - payAmount);
        } else {
            txtHaveToPay.setCValue(txtInvoiceVlaue.getCValue());
        }

    }

    private void setTotalAmount() {
        double tot = txtCashAmount.getCValue() + txtCardAmount.getCValue() + txtChequeAmount.getCValue();
        txtTotalAmount.setCValue(tot);
        txtNewBalance.setCValue(txtHaveToPay.getCValue() - txtTotalAmount.getCValue());
        if (0.00 > txtNewBalance.getCValue()) {
            JOptionPane.showMessageDialog(this, "Over Payment","Error Message",JOptionPane.ERROR_MESSAGE);
        }
    }

}
