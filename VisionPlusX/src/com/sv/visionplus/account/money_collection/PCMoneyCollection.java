/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.account.money_collection;

import com.sv.visionplus.account.money_collection.model.BeforeBalance;
import com.sv.visionplus.account.money_collection.model.GrnSearchPayment;
import com.sv.visionplus.account.money_collection.model.MAccount;
import com.sv.visionplus.account.money_collection.model.ViewInvoicePayment;
import com.sv.visionplus.account.payment_voucher.SearchVoucherDAO;
import com.sv.visionplus.account.payment_voucher.model.SearchVoucherMix;
import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.base.transaction.AbstractTransactionForm;
import com.sv.visionplus.channel.channel_register.ChannelFormDAO;
import com.sv.visionplus.channel.channel_register.model.ChannelModel;
import com.sv.visionplus.master.item.model.MItem;
import com.sv.visionplus.resource.accountType.AccountType;
import com.sv.visionplus.system.exception.VPException;
import com.sv.visionplus.util.formatter.FormatterUtil;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mohan
 */
public class PCMoneyCollection extends AbstractObjectCreator<MAccount> {

    private Date date;

    /**
     * Creates new form PCInvoice
     */
    public PCMoneyCollection(AbstractTransactionForm transactionForm) {
        initComponents();
        this.transactionForm = transactionForm;
        modelVoucher = (DefaultTableModel) tblVoucher.getModel();
        modelInvoicePayment = (DefaultTableModel) tblInvoicePayment.getModel();
        modelGrnPayment = (DefaultTableModel) tblGrnPayment.getModel();
        modelChannel = ((javax.swing.table.DefaultTableModel) tblChannel.getModel());
        this.date = txtDate.getDate();

        tblInvoicePayment.getColumnModel().getColumn(0).setMinWidth(70);
        tblInvoicePayment.getColumnModel().getColumn(0).setPreferredWidth(70);
        tblInvoicePayment.getColumnModel().getColumn(0).setMaxWidth(70);

        tblGrnPayment.getColumnModel().getColumn(0).setMinWidth(70);
        tblGrnPayment.getColumnModel().getColumn(0).setPreferredWidth(70);
        tblGrnPayment.getColumnModel().getColumn(0).setMaxWidth(70);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblGrnPayment = new javax.swing.JTable();
        txtGrnTotalAmount = new com.sv.visionplus.util.component.textfield.CDoubleField();
        txtGrnCheque = new com.sv.visionplus.util.component.textfield.CDoubleField();
        txtGrnCash = new com.sv.visionplus.util.component.textfield.CDoubleField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVoucher = new javax.swing.JTable();
        txtvoucherAmount = new com.sv.visionplus.util.component.textfield.CDoubleField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblInvoicePayment = new javax.swing.JTable();
        txtTotalAmount = new com.sv.visionplus.util.component.textfield.CDoubleField();
        txtChequeAmount = new com.sv.visionplus.util.component.textfield.CDoubleField();
        txtCardAmount = new com.sv.visionplus.util.component.textfield.CDoubleField();
        txtCash = new com.sv.visionplus.util.component.textfield.CDoubleField();
        jLabel2 = new javax.swing.JLabel();
        txtAdvancePayment = new com.sv.visionplus.util.component.textfield.CDoubleField();
        jLabel4 = new javax.swing.JLabel();
        txtCustomerPayment = new com.sv.visionplus.util.component.textfield.CDoubleField();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtChannelAmount = new com.sv.visionplus.util.component.textfield.CDoubleField();
        txtTotalInvoicePayment = new com.sv.visionplus.util.component.textfield.CDoubleField();
        txtTotalReserved = new com.sv.visionplus.util.component.textfield.CDoubleField();
        txtVoucherAmount = new com.sv.visionplus.util.component.textfield.CDoubleField();
        txtGrnPaymentAmount = new com.sv.visionplus.util.component.textfield.CDoubleField();
        jLabel16 = new javax.swing.JLabel();
        txtTotalReleaseValue = new com.sv.visionplus.util.component.textfield.CDoubleField();
        jLabel1 = new javax.swing.JLabel();
        lblBefore = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblTodayBalance = new javax.swing.JLabel();
        lblCashInHand = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblChannel = new javax.swing.JTable();
        txtChanelAmount = new com.sv.visionplus.util.component.textfield.CDoubleField();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtDate = new org.jdesktop.swingx.JXDatePicker();

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("GRN Information"));

        tblGrnPayment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Inv Index", "Date", "Cash", "Cheque", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblGrnPayment);
        if (tblGrnPayment.getColumnModel().getColumnCount() > 0) {
            tblGrnPayment.getColumnModel().getColumn(0).setMinWidth(30);
            tblGrnPayment.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblGrnPayment.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        txtGrnTotalAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrnTotalAmountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtGrnCash, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGrnCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGrnTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGrnTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGrnCheque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGrnCash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Payment Vouchers Information"));

        tblVoucher.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Date", "Description", "Main Category", "Sub Category", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVoucher.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tblVoucher);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtvoucherAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtvoucherAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Invoice Information"));

        tblInvoicePayment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Inv Index", "Number", "Date", "Cash", "Card", "Cheque", "Total Amount", "Is Advance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblInvoicePayment);
        if (tblInvoicePayment.getColumnModel().getColumnCount() > 0) {
            tblInvoicePayment.getColumnModel().getColumn(0).setMinWidth(30);
            tblInvoicePayment.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblInvoicePayment.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        jLabel2.setText("Advance payment:");

        txtAdvancePayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdvancePaymentActionPerformed(evt);
            }
        });

        jLabel4.setText("Customer payment:");

        txtCustomerPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerPaymentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(txtCash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCardAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtChequeAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotalAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(159, 159, 159))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdvancePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCustomerPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAdvancePayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCustomerPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 94, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtChequeAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCardAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel11.setText("Total Invoice Amount:");

        jLabel12.setText("Total Reserved Amount :");

        jLabel13.setText("Total Vouchers Value :");

        jLabel14.setText("Total Channel Amount :");

        jLabel15.setText("GRN Payment Amount :");

        txtTotalInvoicePayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalInvoicePaymentActionPerformed(evt);
            }
        });

        txtGrnPaymentAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrnPaymentAmountActionPerformed(evt);
            }
        });

        jLabel16.setText("Total Release Value :");

        jLabel1.setText("Cash In Hand :");

        lblBefore.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBefore.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBefore.setText("0.00");

        jLabel5.setText("Before Balance :");

        jLabel6.setText("Today Balance :");

        lblTodayBalance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTodayBalance.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTodayBalance.setText("0.00");

        lblCashInHand.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCashInHand.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCashInHand.setText("0.00");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtTotalInvoicePayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtChannelAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTotalReserved, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtVoucherAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalReleaseValue, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGrnPaymentAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblBefore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTodayBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCashInHand, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtGrnPaymentAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVoucherAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotalReleaseValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)))
                    .addComponent(jLabel15)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblBefore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lblTodayBalance))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblCashInHand)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotalInvoicePayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtChannelAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotalReserved, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Channel Information"));

        tblChannel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " #", "Date", "Channel Date", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblChannel);

        txtChanelAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChanelAmountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtChanelAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                    .addGap(13, 13, 13)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(193, Short.MAX_VALUE)
                .addComponent(txtChanelAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addGap(35, 35, 35)))
        );

        jLabel3.setText("Date :");

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(424, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButton1)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtGrnTotalAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrnTotalAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGrnTotalAmountActionPerformed

    private void txtChanelAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChanelAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChanelAmountActionPerformed

    private void txtGrnPaymentAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrnPaymentAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGrnPaymentAmountActionPerformed

    private void txtTotalInvoicePaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalInvoicePaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalInvoicePaymentActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        resetFields();
        date = txtDate.getDate();
        if (date == null) {
            JOptionPane.showMessageDialog(this, "Select a date to view money collection ", "Error Message", JOptionPane.ERROR_MESSAGE);
        } else {
            allVouchers();
            setChannelDetail();
            allInvoicePayment();
//            allGrnPayment();
            setCashInHand();
            beforeBalance();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtAdvancePaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdvancePaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdvancePaymentActionPerformed

    private void txtCustomerPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerPaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerPaymentActionPerformed

    @Override
    public void setIdealMode() {
        resetFields();
    }

    @Override
    public void setNewMode() {

//        allVouchers();
//        allInvoicePayment();
//        allGrnPayment();
//        setChannelDetail();
//        setCashInHand();
    }

    @Override
    public void setEditMode() {

    }

    @Override
    public void resetFields() {
        modelChannel.setRowCount(0);
        modelGrnPayment.setRowCount(0);
        modelInvoicePayment.setRowCount(0);
        modelVoucher.setRowCount(0);
        txtCash.resetCValue();
        txtCash.setCValueEditable(false);
        txtCardAmount.resetCValue();
        txtCardAmount.setCValueEditable(false);
        txtChequeAmount.resetCValue();
        txtChequeAmount.setCValueEditable(false);
        txtTotalAmount.resetCValue();
        txtTotalAmount.setCValueEditable(false);
        txtGrnCash.resetCValue();
        txtGrnCash.setCValueEditable(false);
        txtGrnCheque.resetCValue();
        txtGrnCheque.setCValueEditable(false);
        txtGrnPaymentAmount.resetCValue();
        txtGrnPaymentAmount.setCValueEditable(false);
        txtGrnTotalAmount.resetCValue();
        txtGrnTotalAmount.setCValueEditable(false);
        txtVoucherAmount.resetCValue();
        txtVoucherAmount.setCValueEditable(false);
        txtvoucherAmount.resetCValue();
        txtvoucherAmount.setCValueEditable(false);
        txtChanelAmount.resetCValue();
        txtChanelAmount.setCValueEditable(false);
        txtChanelAmount.resetCValue();
        txtChanelAmount.setCValueEditable(false);
        txtChannelAmount.resetCValue();
        txtChannelAmount.setCValueEditable(false);
        txtTotalInvoicePayment.resetCValue();
        txtTotalInvoicePayment.setCValueEditable(false);
        txtTotalReserved.resetCValue();
        txtTotalReserved.setCValueEditable(false);
        txtTotalReleaseValue.resetCValue();
        txtTotalReleaseValue.setCValueEditable(false);
        lblBefore.setText("0.00");
    }

    @Override
    public void initObject() throws VPException {
    }

    @Override
    public void initInterface() throws VPException {

    }

    @Override
    protected void setValueAbstract(MAccount object) {
    }

    @Override
    protected MAccount getValueAbstract() {
        return null;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblBefore;
    private javax.swing.JLabel lblCashInHand;
    private javax.swing.JLabel lblTodayBalance;
    private javax.swing.JTable tblChannel;
    private javax.swing.JTable tblGrnPayment;
    private javax.swing.JTable tblInvoicePayment;
    private javax.swing.JTable tblVoucher;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtAdvancePayment;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtCardAmount;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtCash;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtChanelAmount;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtChannelAmount;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtChequeAmount;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtCustomerPayment;
    private org.jdesktop.swingx.JXDatePicker txtDate;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtGrnCash;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtGrnCheque;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtGrnPaymentAmount;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtGrnTotalAmount;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtTotalAmount;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtTotalInvoicePayment;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtTotalReleaseValue;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtTotalReserved;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtVoucherAmount;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtvoucherAmount;
    // End of variables declaration//GEN-END:variables
    private AbstractTransactionForm<MItem> transactionForm;
    private DefaultTableModel modelVoucher;
    private DefaultTableModel modelInvoicePayment;
    private DefaultTableModel modelGrnPayment;
    private DefaultTableModel modelCashReserved;
    private DefaultTableModel modelChannel;

    private void allVouchers() {
        List<SearchVoucherMix> allVouchers = SearchVoucherDAO.getInstance().searchVouchers(FormatterUtil.getInstance().formatDate(date), AccountType.VOUCHER,AccountType.VOUCHER);
        addData(allVouchers);
    }

    private void addData(List<SearchVoucherMix> allVouchers) {
        modelVoucher.setRowCount(0);
        for (SearchVoucherMix voucher : allVouchers) {
            addData(voucher);
        }
        if (modelVoucher.getRowCount() > 0) {
            double totalValue = 0;
            for (int i = 0; i < modelVoucher.getRowCount(); i++) {
                totalValue += Double.parseDouble(modelVoucher.getValueAt(i, 5).toString());
            }
            txtVoucherAmount.setCValue(totalValue);
            txtvoucherAmount.setCValue(totalValue);
        }
    }

    private void addData(SearchVoucherMix voucher) {
        Object[] rowData = {
            voucher.getIndex_no(),
            voucher.getDate(),
            voucher.getDescription(),
            voucher.getMain_category(),
            voucher.getSub_category(),
            voucher.getCredit()
        };
        modelVoucher.addRow(rowData);
    }

    private void allInvoicePayment() {
        List<ViewInvoicePayment> list = ViewInvoicePaymentDAO.getInstance().searchInvoicePayment(FormatterUtil.getInstance().formatDate(date));
        addInvoicePayment(list);

        if (modelInvoicePayment.getRowCount() > 0) {
            double totalValue = 0;
            double cash = 0;
            double cheque = 0;
            double card = 0;
            for (int i = 0; i < modelInvoicePayment.getRowCount(); i++) {
                cash += Double.parseDouble(modelInvoicePayment.getValueAt(i, 3).toString());
                card += Double.parseDouble(modelInvoicePayment.getValueAt(i, 4).toString());
                cheque += Double.parseDouble(modelInvoicePayment.getValueAt(i, 5).toString());
                totalValue += Double.parseDouble(modelInvoicePayment.getValueAt(i, 6).toString());
            }
            txtCash.setCValue(cash);
            txtCardAmount.setCValue(card);
            txtChequeAmount.setCValue(cheque);
            txtTotalAmount.setCValue(totalValue);
            txtTotalInvoicePayment.setCValue(totalValue);
        }
    }

    private void addInvoicePayment(List<ViewInvoicePayment> list) {
        modelInvoicePayment.setRowCount(0);
        double advancePayment = 0.00;
        double customerPayment = 0.00;
        for (ViewInvoicePayment invoice : list) {
            if (invoice.getIsAdvance()) {
                advancePayment += invoice.getTotal();
            } else {
                customerPayment += invoice.getTotal();
            }
            Object[] rowdata = {
                invoice.getInvoiceNo(),
                invoice.getNumber(),
                invoice.getDate(),
                invoice.getCash(),
                invoice.getCard(),
                invoice.getCheque(),
                invoice.getTotal(),
                invoice.getIsAdvance() ? "YES" : "NO"

            };
            modelInvoicePayment.addRow(rowdata);
        }
        txtAdvancePayment.setCValue(advancePayment);
        txtCustomerPayment.setCValue(customerPayment);
    }

    private void allGrnPayment() {
        List<GrnSearchPayment> list = GrnSearchPaymentDAO.getInstance().searchPayment(FormatterUtil.getInstance().formatDate(date));
        addGrnPayment(list);

    }

    private void addGrnPayment(List<GrnSearchPayment> list) {
        modelGrnPayment.setRowCount(0);
        for (GrnSearchPayment payment : list) {
            Object[] rowData = {
                payment.getGrn_no(),
                payment.getDate(),
                payment.getCash(),
                payment.getCheque(),
                payment.getTotal()
            };
            modelGrnPayment.addRow(rowData);

            txtGrnCash.setCValue(txtGrnCash.getCValue() + payment.getCash());
            txtGrnCheque.setCValue(txtGrnCheque.getCValue() + payment.getCheque());
            txtGrnTotalAmount.setCValue(txtGrnTotalAmount.getCValue() + payment.getTotal());

            txtGrnPaymentAmount.setCValue(txtGrnCash.getCValue());
        }
    }

    private void setCashInHand() {
        txtTotalReserved.setCValue(txtChannelAmount.getCValue() + txtTotalInvoicePayment.getCValue());
        txtTotalReleaseValue.setCValue(txtGrnPaymentAmount.getCValue() + txtVoucherAmount.getCValue());

        lblTodayBalance.setText(txtTotalReserved.getCValue() - txtTotalReleaseValue.getCValue() + "");
    }

    private void setChannelDetail() {
        java.util.List<ChannelModel> list = ChannelFormDAO.getInstance().searchChannel(txtDate.getDate());

        addChannel(list);
    }

    private void addChannel(java.util.List<ChannelModel> list) {
        modelChannel.setRowCount(0);
        double channelAmount = 0.0D;
        for (ChannelModel channel : list) {
            channelAmount += channel.getAmount();
            addChannel(channel);
        }
        txtChanelAmount.setCValue(channelAmount);
        txtChannelAmount.setCValue(txtChanelAmount.getCValue());
    }

    private void addChannel(ChannelModel channel) {
        Object[] rowData = {
            channel.getIndex_no(),
            channel.getDate(),
            channel.getChannel_date(),
            channel.getAmount()
        };

        modelChannel.addRow(rowData);
    }

    private void beforeBalance() {
        List<BeforeBalance> list = BeforeBalanceDAO.getInstance().getBeforeBalance(date);
        double val=0;
        for (BeforeBalance beforeBalance : list) {
            val+=beforeBalance.getBalance();
        }
        lblBefore.setText(val+"");
        lblCashInHand.setText((val+Double.parseDouble(lblTodayBalance.getText()))+"");
        
        
        
    }

}
