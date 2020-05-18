/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.invoice;

import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.base.transaction.AbstractTransactionForm;
import com.sv.visionplus.transaction.invoice.dialog.customer.model.MCustomer;
import com.sv.visionplus.system.exception.VPException;
import com.sv.visionplus.transaction.invoice.dialog.Item.ItemDialog;
import com.sv.visionplus.transaction.invoice.dialog.Item.SearchItemMixModel;
import com.sv.visionplus.transaction.invoice.dialog.confirm.Confirm_Password;
import com.sv.visionplus.transaction.invoice.dialog.customer.CustomerDialog;
import com.sv.visionplus.transaction.invoice.dialog.patient_details.PatientDetail;
import com.sv.visionplus.transaction.invoice.dialog.search_invoice.searchInvoice;
import com.sv.visionplus.transaction.invoice.model.InvoiceMix;
import com.sv.visionplus.transaction.invoice.model.Status;
import com.sv.visionplus.transaction.invoice.model.TInvoice;
import com.sv.visionplus.transaction.invoice.model.TInvoiceItem;
import com.sv.visionplus.transaction.invoice.model.TPatientInformation;
import com.sv.visionplus.transaction.invoice.model.TStockLedger;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import visionplusx.logFile.LogFileModel;
import visionplusx.model.MUser;

/**
 *
 * @author Mohan
 */
public class PCInvoice extends AbstractObjectCreator<InvoiceMix> {

    private final DefaultTableModel model;

    /**
     * Creates new form PCInvoice
     */
    public PCInvoice(AbstractTransactionForm transactionForm) {
        initComponents();
        initOthers();
        model = (DefaultTableModel) tblInfo.getModel();

        this.transactionForm = transactionForm;
        lblStar1.setVisible(false);
        lblStar2.setVisible(false);
        lblStar3.setVisible(false);
        lblStar4.setVisible(false);
        lblStar5.setVisible(false);
        lblDelete.setVisible(false);
        lblInvoiceIndex.setVisible(false);

        chxCashRefund.setVisible(false);
        chxNonRefund.setVisible(false);
    }

//    action
    private void doView() {
//        AbstractMasterFormGUI form = new AbstractMasterFormGUI(){};
//        form.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    private void initOthers() {
        btnAddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                PCInvoice.this.doView();
            }

        });
        itemListModel = new javax.swing.DefaultListModel();
        lstItem.setModel(itemListModel);

        lstItem.setCellRenderer(new com.sv.visionplus.resource.ui.ItemListRenderer());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jSplitPane3 = new javax.swing.JSplitPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        txtDate = new com.sv.visionplus.util.component.textfield.CDateField();
        chxNormalInvoice = new javax.swing.JRadioButton();
        chxFactoryInvoice = new javax.swing.JRadioButton();
        chxOldInvoice = new javax.swing.JRadioButton();
        chxEditInvoice = new javax.swing.JRadioButton();
        txtInvoiceNo = new com.sv.visionplus.util.component.textfield.CStringField();
        jLabel20 = new javax.swing.JLabel();
        chxDeleteInvoice = new javax.swing.JRadioButton();
        lblDelete = new javax.swing.JLabel();
        chxCashRefund = new javax.swing.JRadioButton();
        chxNonRefund = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaAddress = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        btnAddCustomer = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtName = new com.sv.visionplus.util.component.textfield.CStringField();
        txtNic = new com.sv.visionplus.util.component.textfield.CStringField();
        txtContactNo = new com.sv.visionplus.util.component.textfield.CIntegerField();
        txtAge = new com.sv.visionplus.util.component.textfield.CIntegerField();
        jLabel12 = new javax.swing.JLabel();
        lblStar1 = new javax.swing.JLabel();
        lblStar2 = new javax.swing.JLabel();
        lblStar3 = new javax.swing.JLabel();
        lblStar4 = new javax.swing.JLabel();
        lblStar5 = new javax.swing.JLabel();
        lblInvoiceIndex = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstItem = new javax.swing.JList();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        lblAmount = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
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
        txtHbRxLeft = new com.sv.visionplus.util.component.textfield.CStringField();
        txtHbRxSubLeft = new com.sv.visionplus.util.component.textfield.CStringField();
        txtHbRxRight = new com.sv.visionplus.util.component.textfield.CStringField();
        txtHbRxSubRight = new com.sv.visionplus.util.component.textfield.CStringField();
        btnDetail = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblInfo = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        txtLenseName = new com.sv.visionplus.util.component.textfield.CStringField();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtLenseBrand = new com.sv.visionplus.util.component.textfield.CStringField();
        jLabel19 = new javax.swing.JLabel();
        txtLenseType = new com.sv.visionplus.util.component.textfield.CStringField();
        jLabel21 = new javax.swing.JLabel();
        txtBarcode = new com.sv.visionplus.util.component.textfield.CStringField();
        myopiaRadio = new javax.swing.JRadioButton();
        presbyopiaRadio = new javax.swing.JRadioButton();
        hypermtropiaRadio = new javax.swing.JRadioButton();
        astimatismRadio = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtRemarks1 = new javax.swing.JTextArea();

        jSplitPane3.setDividerLocation(512);
        jSplitPane3.setResizeWeight(0.5);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Invoice Information"));

        jLabel2.setText("Date :");

        jButton10.setText("+");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        buttonGroup2.add(chxNormalInvoice);
        chxNormalInvoice.setText("Normal Invoice");
        chxNormalInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chxNormalInvoiceActionPerformed(evt);
            }
        });

        buttonGroup2.add(chxFactoryInvoice);
        chxFactoryInvoice.setText("Factory Invoice");
        chxFactoryInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chxFactoryInvoiceActionPerformed(evt);
            }
        });

        buttonGroup2.add(chxOldInvoice);
        chxOldInvoice.setText("Old Invoice");
        chxOldInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chxOldInvoiceActionPerformed(evt);
            }
        });

        buttonGroup2.add(chxEditInvoice);
        chxEditInvoice.setText("Edit Invoice");
        chxEditInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chxEditInvoiceActionPerformed(evt);
            }
        });

        jLabel20.setText("Invoice No :");

        buttonGroup2.add(chxDeleteInvoice);
        chxDeleteInvoice.setText("Delete Invoice");
        chxDeleteInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chxDeleteInvoiceActionPerformed(evt);
            }
        });

        lblDelete.setBackground(new java.awt.Color(153, 0, 0));
        lblDelete.setForeground(new java.awt.Color(255, 255, 255));
        lblDelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDelete.setText("Deleted");
        lblDelete.setOpaque(true);

        buttonGroup3.add(chxCashRefund);
        chxCashRefund.setText("Cash Refund");

        buttonGroup3.add(chxNonRefund);
        chxNonRefund.setText("Cash Non Refund");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(chxOldInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chxNormalInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chxEditInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chxCashRefund))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chxDeleteInvoice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chxFactoryInvoice)
                                    .addComponent(chxNonRefund))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtInvoiceNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jButton10)
                        .addGap(8, 8, 8))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(chxNormalInvoice)
                            .addGap(0, 0, 0)
                            .addComponent(chxEditInvoice))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(chxFactoryInvoice)
                            .addGap(0, 0, 0)
                            .addComponent(chxDeleteInvoice))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(chxOldInvoice))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chxCashRefund)
                    .addComponent(chxNonRefund))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel20))
                            .addComponent(txtInvoiceNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel2))
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, 0))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Customer Information"));

        jLabel3.setText("Name :");

        jLabel4.setText("NIC :");

        jLabel5.setText("Address :");

        txtaAddress.setColumns(20);
        txtaAddress.setRows(5);
        jScrollPane1.setViewportView(txtaAddress);

        jLabel6.setText("Contact No. :");

        btnAddCustomer.setText("+");
        btnAddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCustomerActionPerformed(evt);
            }
        });

        jLabel7.setText("Age :");

        txtNic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNicKeyPressed(evt);
            }
        });

        txtContactNo.setText("");

        txtAge.setText("");

        jLabel12.setText("Rate :");

        lblStar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sv/visionplus/resource/icons/transaction/star.png"))); // NOI18N

        lblStar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sv/visionplus/resource/icons/transaction/star.png"))); // NOI18N

        lblStar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sv/visionplus/resource/icons/transaction/star.png"))); // NOI18N

        lblStar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sv/visionplus/resource/icons/transaction/star.png"))); // NOI18N

        lblStar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sv/visionplus/resource/icons/transaction/star.png"))); // NOI18N

        lblInvoiceIndex.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addComponent(txtContactNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAddCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblInvoiceIndex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblStar1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblStar2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblStar3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblStar4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblStar5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnAddCustomer)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblInvoiceIndex))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lblStar1)
                    .addComponent(lblStar2)
                    .addComponent(lblStar3)
                    .addComponent(lblStar4)
                    .addComponent(lblStar5)))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Item Information"));

        jScrollPane3.setViewportView(lstItem);

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel11.setText("Total Amount :");

        jButton11.setText("Remove");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        lblAmount.setText("0.00");
        lblAmount.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblAmount.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(lblAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jLabel11)
                    .addComponent(jButton11)
                    .addComponent(lblAmount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jSplitPane3.setLeftComponent(jPanel5);

        jLabel9.setText("VA With P/H ");

        jLabel8.setText("Auto Ref :");

        jLabel10.setText("VA With Glass");

        jLabel13.setText("VA Without Glass");

        jLabel16.setText("Hb Rx :");

        jLabel17.setText("NTC :");

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

        btnDetail.setText("Details");
        btnDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel8)
                            .addComponent(jLabel13)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVaWithPhLeft, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(txtVaWithGlassLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAutoRefLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNtcLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtHbRxLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtVaWithoutGlassLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtHbRxSubLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHbRxSubRight, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(txtVaWithoutGlassRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtVaWithPhRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAutoRefRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNtcRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtHbRxRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtVaWithGlassRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDetail)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnDetail)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHbRxLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHbRxRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        jLabel15.setText("Lens Name :");

        jLabel18.setText("Lens Brand :");

        jLabel19.setText(" Frame Type :");

        jLabel21.setText("Barcode :");

        txtBarcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBarcodeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLenseType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLenseName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLenseBrand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBarcode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtLenseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(txtLenseBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(txtLenseType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(txtBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
        );

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
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE))
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
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jSplitPane3.setRightComponent(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane3)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane3)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        if (0 > lstItem.getSelectedIndex()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Select a Item to Delete...", "Error Message", JOptionPane.ERROR_MESSAGE);
        } else {
            com.sv.visionplus.transaction.invoice.dialog.Item.SearchItemMixModel model = (com.sv.visionplus.transaction.invoice.dialog.Item.SearchItemMixModel) selectedItemList.get(lstItem.getSelectedIndex());
            double qty = model.getTotal_qty();
            double value = 0.0D;
            value -= qty * model.getSale_price();
            value += qty * model.getDicsount();

            lblAmount.setText(Double.parseDouble(lblAmount.getText()) + value + "");

            selectedItemList.remove(lstItem.getSelectedIndex());
            itemListModel.removeElementAt(lstItem.getSelectedIndex());
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ItemDialog dialog = new ItemDialog(null, true);
        dialog.setFrame(this);
        dialog.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnAddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCustomerActionPerformed
        CustomerDialog dialog = new CustomerDialog(null, true);
        dialog.setFrame(this);
        dialog.setVisible(true);
    }//GEN-LAST:event_btnAddCustomerActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        searchInvoice searchInvoice = new searchInvoice(null, true);
        searchInvoice.setFrame(this);
        searchInvoice.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

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

    private void txtNicKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNicKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNicKeyPressed

    private void chxNormalInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chxNormalInvoiceActionPerformed
        if (chxNormalInvoice.isSelected()) {
            chxCashRefund.setVisible(false);
            chxNonRefund.setVisible(false);
        } else {
            chxCashRefund.setVisible(true);
            chxNonRefund.setVisible(true);
        }
    }//GEN-LAST:event_chxNormalInvoiceActionPerformed

    private void chxEditInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chxEditInvoiceActionPerformed
        if (chxEditInvoice.isSelected()) {
            chxCashRefund.setVisible(false);
            chxNonRefund.setVisible(false);
        } else {
            chxCashRefund.setVisible(true);
            chxNonRefund.setVisible(true);
        }
    }//GEN-LAST:event_chxEditInvoiceActionPerformed

    private void chxOldInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chxOldInvoiceActionPerformed
        if (chxOldInvoice.isSelected()) {
            txtInvoiceNo.setCValueEditable(true);
            chxCashRefund.setVisible(false);
            chxNonRefund.setVisible(false);
        } else {
            chxCashRefund.setVisible(true);
            chxNonRefund.setVisible(true);
        }
    }//GEN-LAST:event_chxOldInvoiceActionPerformed

    private void txtBarcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBarcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBarcodeActionPerformed

    private void chxDeleteInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chxDeleteInvoiceActionPerformed
        if (chxDeleteInvoice.isSelected()) {
            chxCashRefund.setVisible(true);
            chxNonRefund.setVisible(true);
        } else {
            chxCashRefund.setVisible(false);
            chxNonRefund.setVisible(false);
        }
    }//GEN-LAST:event_chxDeleteInvoiceActionPerformed

    private void chxFactoryInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chxFactoryInvoiceActionPerformed
        if (chxFactoryInvoice.isSelected()) {
            chxCashRefund.setVisible(false);
            chxNonRefund.setVisible(false);
        } else {
            chxCashRefund.setVisible(true);
            chxNonRefund.setVisible(true);
        }
    }//GEN-LAST:event_chxFactoryInvoiceActionPerformed

    private void btnDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailActionPerformed
        PatientDetail detail = new PatientDetail(null, true);
        detail.setFrame(this);
        detail.setVisible(true);
    }//GEN-LAST:event_btnDetailActionPerformed

    @Override
    public void setIdealMode() {
        txtInvoiceNo.setCValueEditable(false);
        chxEditInvoice.setSelected(false);
        chxFactoryInvoice.setSelected(false);
        chxNormalInvoice.setSelected(false);
        chxOldInvoice.setSelected(false);
        txtDate.setCValueEditable(false);
        txtName.setCValueEditable(false);
        txtNic.setCValueEditable(false);
        txtaAddress.setEditable(false);
        txtContactNo.setCValueEditable(false);
        txtAge.setCValueEditable(false);
        txtOther.setCValueEditable(false);
        txtRemarks1.setEditable(false);
        txtHbRxLeft.setCValueEditable(false);
        txtHbRxRight.setCValueEditable(false);
        txtHbRxSubLeft.setCValueEditable(false);
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
        txtBarcode.setCValueEditable(false);
        txtBarcode.setText("-");
        lblDelete.setVisible(false);
        btnDetail.setEnabled(false);

        btnAddCustomer.setEnabled(false);
        jButton10.setEnabled(false);
        jButton2.setEnabled(false);
        invoiceItem = new com.sv.visionplus.transaction.invoice.model.TInvoiceItem();
        lblAmount.setText("0");
    }

    @Override
    public void setNewMode() {
        txtInvoiceNo.resetCValue();
        txtInvoiceNo.setCValueEditable(false);
        chxEditInvoice.setSelected(false);
        chxFactoryInvoice.setSelected(false);
        chxNormalInvoice.setSelected(true);
        chxOldInvoice.setSelected(false);
        invoice = new com.sv.visionplus.transaction.invoice.model.TInvoice();
        invoiceMix = new com.sv.visionplus.transaction.invoice.model.InvoiceMix();
        customer = null;
        status = new com.sv.visionplus.transaction.invoice.model.Status();
        patientInformation = new com.sv.visionplus.transaction.invoice.model.TPatientInformation();
        invoiceItem = new com.sv.visionplus.transaction.invoice.model.TInvoiceItem();
        logFile = new visionplusx.logFile.LogFileModel();
        stockLedger = new com.sv.visionplus.transaction.invoice.model.TStockLedger();

        txtDate.setCValueEditable(true);
        txtName.setCValueEditable(false);
        txtNic.setCValueEditable(false);
        txtaAddress.setEditable(false);
        txtContactNo.setCValueEditable(false);
        txtAge.setCValueEditable(false);
        txtOther.setCValueEditable(false);
        txtRemarks1.setEditable(true);
        txtHbRxLeft.setCValueEditable(true);
        txtHbRxRight.setCValueEditable(true);
        txtHbRxSubLeft.setCValueEditable(true);
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
        txtBarcode.setCValueEditable(true);
        txtBarcode.setText("-");
        lblDelete.setVisible(false);
        btnDetail.setEnabled(true);

        model.setRowCount(0);
        Object[] firstRowdata = {"DIST", "", "", "", "", "", ""};

        model.addRow(firstRowdata);
        Object[] secondRowdata = {"NEAR", "", "", "", "", "", ""};

        model.addRow(secondRowdata);
        invoiceMix.setInvoiceItem(new ArrayList<>());
        itemListModel.setSize(0);

        btnAddCustomer.setEnabled(true);
        jButton10.setEnabled(true);
        jButton2.setEnabled(true);
        lblAmount.setText("0.00");

    }

    @Override
    public void setEditMode() {
        txtInvoiceNo.setCValueEditable(false);
        chxEditInvoice.setSelected(true);
        chxFactoryInvoice.setSelected(false);
        chxNormalInvoice.setSelected(false);
        chxOldInvoice.setSelected(false);
        txtDate.setCValueEditable(true);
        txtName.setCValueEditable(true);
        txtNic.setCValueEditable(true);
        txtaAddress.setEditable(true);
        txtContactNo.setCValueEditable(true);
        txtAge.setCValueEditable(true);
        txtOther.setCValueEditable(true);
        txtRemarks1.setEditable(true);
        txtHbRxLeft.setCValueEditable(true);
        txtHbRxRight.setCValueEditable(true);
        txtHbRxSubLeft.setCValueEditable(true);
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
        txtBarcode.setCValueEditable(true);
        invoiceMix.setInvoiceItem(new ArrayList<>());
        itemListModel.setSize(0);
    }

    @Override
    public void resetFields() {

        txtInvoiceNo.resetCValue();
        chxEditInvoice.setSelected(false);
        chxFactoryInvoice.setSelected(false);
        chxNormalInvoice.setSelected(false);
        chxOldInvoice.setSelected(false);
        txtDate.resetCValue();
        txtName.resetCValue();
        txtNic.resetCValue();
        txtaAddress.setText("");
        txtContactNo.resetCValue();
        txtAge.resetCValue();
        txtOther.resetCValue();
        txtRemarks1.setText("");
        txtHbRxLeft.resetCValue();
        txtHbRxRight.resetCValue();
        txtHbRxSubLeft.resetCValue();
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
        txtBarcode.setText("-");
        lblDelete.setVisible(false);

        model.setRowCount(0);
        Object[] firstRowdata = {"DIST", "", "", "", "", "", ""};

        model.addRow(firstRowdata);
        Object[] secondRowdata = {"NEAR", "", "", "", "", "", ""};

        model.addRow(secondRowdata);

        selectedItemList = new java.util.ArrayList();
        itemListModel.setSize(0);
        lblAmount.setText("0.00");

        lblStar1.setVisible(false);
        lblStar2.setVisible(false);
        lblStar3.setVisible(false);
        lblStar4.setVisible(false);
        lblStar5.setVisible(false);
    }

    @Override
    public void initObject() throws VPException {
        Confirm_Password passwordform = new Confirm_Password(null, true);
        passwordform.setFrame(this);
        passwordform.setLocationRelativeTo(null);
        passwordform.setVisible(true);
        invoiceMix = null;
        if (user != null) {
            invoiceMix = new com.sv.visionplus.transaction.invoice.model.InvoiceMix();

            if (invoiceMix != null) {
                if (null == customer) {
                    invoice.setCustomer(1);
                } else {
                    invoice.setCustomer(customer.getIndexNo());
                }
                invoice.setAmount(Double.parseDouble(lblAmount.getText()));
                invoice.setFactory(1);
                invoice.setInvoiceDate(txtDate.getCValue());
                invoice.setIsdelete(false);
                invoice.setStatus("Reserved From Customer");
                invoice.setNumber(txtInvoiceNo.getCValue());
                if (chxEditInvoice.isSelected()) {
                    invoice.setStatus2("EDITED INVOICE");
                    invoice.setIndexNo(Integer.parseInt(lblInvoiceIndex.getText()));
                }
                if (chxFactoryInvoice.isSelected()) {
                    invoice.setStatus2("FACTORY INVOICE");
                }
                if (chxNormalInvoice.isSelected()) {
                    invoice.setStatus2("NORMAL INVOICE");
                }
                if (chxOldInvoice.isSelected()) {
                    invoice.setStatus2("OLD INVOICE");
                }
                if (chxDeleteInvoice.isSelected()) {
                    invoice.setStatus2("DELETED INVOICE");
                    invoice.setIsdelete(Boolean.TRUE);
                    invoice.setIndexNo(Integer.parseInt(lblInvoiceIndex.getText()));
                    if (chxCashRefund.isSelected()) {
                        invoiceMix.setIsCashRefund(true);
                    } else {
                        invoiceMix.setIsCashRefund(false);
                    }

                }
                invoice.setBarcode(txtBarcode.getCValue());
                invoice.setUser(user.getIndexNo());

                invoiceMix.setInvoice(invoice);

                invoiceMix.setMobile(this.customer.getContactNo());

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
                patientInformation.setHbRxLeft(txtHbRxLeft.getText());
                patientInformation.setHbRxRight(txtHbRxRight.getText());
                patientInformation.setHbRxSubLeft(txtHbRxSubLeft.getText());
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

                invoiceMix.setPatientInformation(patientInformation);

                invoiceMix.setCustomer(this.customer);

                java.util.List<com.sv.visionplus.transaction.invoice.model.TInvoiceItem> invoiceItemList = new java.util.ArrayList();
                for (com.sv.visionplus.transaction.invoice.dialog.Item.SearchItemMixModel item : selectedItemList) {
                    invoiceItem.setDiscount(item.getDicsount());

                    invoiceItem.setItem(item.getItem());

                    invoiceItem.setQty(item.getTotal_qty());
                    invoiceItem.setUnitPrice(item.getSale_price());
                    invoiceItem.setValue(item.getTotal_qty() * item.getSale_price());
                    invoiceItem.setNetValue(Double.valueOf(invoiceItem.getValue() - item.getTotal_qty() * item.getDicsount()));

                    invoiceItemList.add(invoiceItem);
                    invoiceItem = new com.sv.visionplus.transaction.invoice.model.TInvoiceItem();
                }

                invoiceMix.setInvoiceItem(invoiceItemList);

                status.setDate(new java.util.Date());
//                status.setInvoice(0);
                status.setName("Reserved From Customer");
                invoiceMix.setStatus(status);

                logFile.setDate(new java.util.Date());
                logFile.setFormName("Invoice Form");

                logFile.setRemarks(txtLenseType.getCValue() + " " + txtLenseBrand.getCValue() + " " + txtLenseName.getCValue());
                logFile.setTime(com.sv.visionplus.util.formatter.FormatterUtil.getInstance().getTime());
                logFile.setTransactionType("Save");
                logFile.setUser(user.getIndexNo());
                logFile.setUserName(user.getName());
                logFile.setValue(invoice.getAmount());
                invoiceMix.setLogFile(logFile);

                java.util.List<com.sv.visionplus.transaction.invoice.model.TStockLedger> stockLedgerList = new java.util.ArrayList();
                for (com.sv.visionplus.transaction.invoice.dialog.Item.SearchItemMixModel item : selectedItemList) {
                    if (item.isIsstock_item()) {
                        stockLedger.setDate(new java.util.Date());
                        stockLedger.setForm("Invoice");
                        stockLedger.setItem(item.getItem());
                        stockLedger.setQty(item.getTotal_qty() * -1);
                        stockLedger.setStore(item.getStore_id());
                        stockLedgerList.add(stockLedger);
                        stockLedger = new com.sv.visionplus.transaction.invoice.model.TStockLedger();
                    }
                }
                invoiceMix.setStockLedgerList(stockLedgerList);
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "The Invoice can't Save Again or unused Invoice", "Error Message", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Transaction Password is worng...", "Error Message", JOptionPane.ERROR_MESSAGE);
        }

    }

    @Override
    public void initInterface() throws VPException {

    }

    @Override
    protected void setValueAbstract(InvoiceMix invoiceMix) {
        this.invoiceMix = invoiceMix;
    }

    @Override
    protected InvoiceMix getValueAbstract() {
        return invoiceMix;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton astimatismRadio;
    private javax.swing.JButton btnAddCustomer;
    private javax.swing.JButton btnDetail;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JRadioButton chxCashRefund;
    private javax.swing.JRadioButton chxDeleteInvoice;
    private javax.swing.JRadioButton chxEditInvoice;
    private javax.swing.JRadioButton chxFactoryInvoice;
    private javax.swing.JRadioButton chxNonRefund;
    private javax.swing.JRadioButton chxNormalInvoice;
    private javax.swing.JRadioButton chxOldInvoice;
    private javax.swing.JCheckBox dischargeCheckBox;
    private javax.swing.JCheckBox headacheCheckBox;
    private javax.swing.JRadioButton hypermtropiaRadio;
    private javax.swing.JCheckBox irritationCheckBox;
    private javax.swing.JCheckBox itchingCheckBox;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSplitPane jSplitPane3;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblDelete;
    private javax.swing.JLabel lblInvoiceIndex;
    private javax.swing.JLabel lblStar1;
    private javax.swing.JLabel lblStar2;
    private javax.swing.JLabel lblStar3;
    private javax.swing.JLabel lblStar4;
    private javax.swing.JLabel lblStar5;
    private javax.swing.JList lstItem;
    private javax.swing.JRadioButton myopiaRadio;
    private javax.swing.JCheckBox otherChechBox;
    private javax.swing.JRadioButton presbyopiaRadio;
    private javax.swing.JCheckBox redCheckBox;
    private javax.swing.JTable tblInfo;
    private javax.swing.JCheckBox tearingCheckBox;
    private com.sv.visionplus.util.component.textfield.CIntegerField txtAge;
    private com.sv.visionplus.util.component.textfield.CStringField txtAutoRefLeft;
    private com.sv.visionplus.util.component.textfield.CStringField txtAutoRefRight;
    private com.sv.visionplus.util.component.textfield.CStringField txtBarcode;
    private com.sv.visionplus.util.component.textfield.CIntegerField txtContactNo;
    private com.sv.visionplus.util.component.textfield.CDateField txtDate;
    private com.sv.visionplus.util.component.textfield.CStringField txtHbRxLeft;
    private com.sv.visionplus.util.component.textfield.CStringField txtHbRxRight;
    private com.sv.visionplus.util.component.textfield.CStringField txtHbRxSubLeft;
    private com.sv.visionplus.util.component.textfield.CStringField txtHbRxSubRight;
    private com.sv.visionplus.util.component.textfield.CStringField txtInvoiceNo;
    private com.sv.visionplus.util.component.textfield.CStringField txtLenseBrand;
    private com.sv.visionplus.util.component.textfield.CStringField txtLenseName;
    private com.sv.visionplus.util.component.textfield.CStringField txtLenseType;
    private com.sv.visionplus.util.component.textfield.CStringField txtName;
    private com.sv.visionplus.util.component.textfield.CStringField txtNic;
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
    private javax.swing.JTextArea txtaAddress;
    private javax.swing.JCheckBox visionNDCheckBox;
    // End of variables declaration//GEN-END:variables
    private AbstractTransactionForm<InvoiceMix> transactionForm;
    private InvoiceMix invoiceMix;
    private MCustomer customer;
    private TInvoice invoice;
    private Status status;
    private TPatientInformation patientInformation;
    private TInvoiceItem invoiceItem;
    private LogFileModel logFile;
    private List<SearchItemMixModel> selectedItemList = new ArrayList<>();
    private DefaultListModel itemListModel;
    private TStockLedger stockLedger;
    private MUser user;

    public void setCustomer(com.sv.visionplus.transaction.invoice.dialog.customer.model.MCustomer customer) {
        lblStar1.setVisible(false);
        lblStar2.setVisible(false);
        lblStar3.setVisible(false);
        lblStar4.setVisible(false);
        lblStar5.setVisible(false);

        this.customer = new com.sv.visionplus.transaction.invoice.dialog.customer.model.MCustomer();
        this.customer = customer;
        txtName.setCValue(customer.getName());
        txtaAddress.setText(customer.getAddress());
        txtContactNo.setText(customer.getContactNo());
        txtNic.setText(customer.getNic());

        if (!txtNic.getText().isEmpty()) {
            if ("000000000V".equals(customer.getNic())) {
                txtAge.setCValue(-1);
            } else {
                int year = Integer.parseInt(com.sv.visionplus.util.formatter.FormatterUtil.getInstance().formatDate(new java.util.Date()).substring(0, 4));
                int birthYear = Integer.parseInt("19" + customer.getNic().substring(0, 2));
                txtAge.setCValue(year - birthYear);
            }
        } else {
            txtAge.setCValue(-1);
        }

        java.util.List<com.sv.visionplus.transaction.invoice.model.TInvoice> searchInvoice = InvoiceDAO.getInstance().searchInvoice(customer.getIndexNo());
        double amount = 0.0D;
        for (com.sv.visionplus.transaction.invoice.model.TInvoice invoice : searchInvoice) {
            amount += invoice.getAmount();
        }
        if (amount > 7500.0D) {
            lblStar1.setVisible(true);
            if (amount > 10000.0D) {
                lblStar2.setVisible(true);
                if (amount > 15000.0D) {
                    lblStar3.setVisible(true);
                    if (amount > 20000.0D) {
                        lblStar4.setVisible(true);
                        if (amount > 25000.0D) {
                            lblStar5.setVisible(true);
                        }
                    }
                }
            }
        }
    }

    public void setItem(com.sv.visionplus.transaction.invoice.dialog.Item.SearchItemMixModel mixModel) {
        selectedItemList.add(mixModel);
        itemListModel.addElement(mixModel);

        double value = 0.0D;

        value = mixModel.getTotal_qty() * mixModel.getSale_price();
        value -= mixModel.getTotal_qty() * mixModel.getDicsount();
        value = Double.parseDouble(lblAmount.getText()) + value;
        lblAmount.setText(value + "");
        value = 0.0D;
    }

    public void setValue(int index) {
        System.out.println(index);
        TPatientInformation info = PatientInformationDAO.getInstance().searchInvoiceByIndex(index);
        setInfo(info);
    }

    public void setValue(com.sv.visionplus.transaction.invoice.model.TInvoice invoice, com.sv.visionplus.transaction.invoice.dialog.customer.model.MCustomer customer) {
        setNewMode();
        setCustomer(customer);
        txtDate.setCValue(invoice.getInvoiceDate());
        txtInvoiceNo.setCValue(invoice.getNumber());
        txtBarcode.setText(invoice.getBarcode());
        lblDelete.setVisible(invoice.getIsdelete());
        lblInvoiceIndex.setText(invoice.getIndexNo() + "");

        TPatientInformation info = PatientInformationDAO.getInstance().searchInvoicePatientInfo(invoice.getIndexNo());
        setInfo(info);

        java.util.List<com.sv.visionplus.transaction.invoice.model.TInvoiceItem> list = InvoiceItemDAO.getInstance().searchItems(invoice.getIndexNo());
        for (com.sv.visionplus.transaction.invoice.model.TInvoiceItem item : list) {
            com.sv.visionplus.transaction.invoice.dialog.Item.SearchItemMixModel mix = new com.sv.visionplus.transaction.invoice.dialog.Item.SearchItemMixModel();
            mix.setSale_price(item.getUnitPrice());
            mix.setTotal_qty(item.getQty());
            mix.setDicsount(item.getDiscount());
            mix.setItem(item.getItem());

            com.sv.visionplus.transaction.invoice.model.MItem searchItem = ItemDAO.getInstance().search(item.getItem());
            mix.setCode(searchItem.getCode());
            mix.setName(searchItem.getName());

            com.sv.visionplus.transaction.invoice.model.MBrand brand = BrandDAO.getInstance().searchBrand(searchItem.getBrand());
            mix.setBrand_name(brand.getName());

            setItem(mix);

            invoiceMix = null;
        }
    }

    private void setInfo(com.sv.visionplus.transaction.invoice.model.TPatientInformation info) {
        if (info != null) {
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
        }
    }

    public void setUser(MUser user) {
        this.user = user;
    }
}
