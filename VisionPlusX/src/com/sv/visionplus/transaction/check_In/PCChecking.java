/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.check_In;

import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.base.transaction.AbstractTransactionForm;
import com.sv.visionplus.system.exception.VPException;
import com.sv.visionplus.transaction.check_In.model.MCustomer;
import com.sv.visionplus.transaction.check_In.model.MFactory;
import com.sv.visionplus.transaction.check_In.model.TInvoice;
import com.sv.visionplus.transaction.customer_payment.model.CustomerPayment;
import com.sv.visionplus.transaction.customer_payment.model.TPayment;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mohan
 */
public class PCChecking extends AbstractObjectCreator<TInvoice> {

    private int value = 2;
    private Integer count = 1;
    private Integer rowCount = 20;

    /**
     * Creates new form PCInvoice
     */
    public PCChecking(AbstractTransactionForm transactionForm) {
        initComponents();
        model = (DefaultTableModel) tblItem.getModel();
        this.transactionForm = transactionForm;
        this.value = 2;
        txtCount.setCValue(rowCount);
        lblCount.setText("0/0");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmboChangeStatus = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDate = new com.sv.visionplus.util.component.textfield.CDateField();
        cmboFactory = new javax.swing.JComboBox();
        chxBoxReturn = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnStatus = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtInvoiceNo = new com.sv.visionplus.util.component.textfield.CIntegerField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblCount = new javax.swing.JLabel();
        chxBoxAllSelect = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItem = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        txtCount = new com.sv.visionplus.util.component.textfield.CIntegerField();

        cmboChangeStatus.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmboChangeStatusItemStateChanged(evt);
            }
        });

        jLabel2.setText("Change Status :");

        jLabel4.setText("Date :");

        chxBoxReturn.setText("Return");
        chxBoxReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chxBoxReturnActionPerformed(evt);
            }
        });

        jLabel1.setText("Factory :");

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Refresh");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmboChangeStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chxBoxReturn))
                    .addComponent(jLabel2))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmboFactory, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(jButton4))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmboChangeStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmboFactory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chxBoxReturn)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnStatus.setText("Issue");
        btnStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatusActionPerformed(evt);
            }
        });

        jLabel3.setText("Invoice No :");

        jButton1.setText("Select");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Count :");

        lblCount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        chxBoxAllSelect.setText("All Select");
        chxBoxAllSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chxBoxAllSelectActionPerformed(evt);
            }
        });

        tblItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "InvoiceNo", "Customer Name", "Status", "No of Items", "Invoice Amount", "Pay Amount", "Balance", "Date", " ", "Factory", "invoice No"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblItem);
        if (tblItem.getColumnModel().getColumnCount() > 0) {
            tblItem.getColumnModel().getColumn(0).setMinWidth(20);
            tblItem.getColumnModel().getColumn(0).setPreferredWidth(20);
            tblItem.getColumnModel().getColumn(0).setMaxWidth(20);
            tblItem.getColumnModel().getColumn(3).setMinWidth(100);
            tblItem.getColumnModel().getColumn(10).setMinWidth(0);
            tblItem.getColumnModel().getColumn(10).setPreferredWidth(0);
            tblItem.getColumnModel().getColumn(10).setMaxWidth(0);
            tblItem.getColumnModel().getColumn(11).setMinWidth(0);
            tblItem.getColumnModel().getColumn(11).setPreferredWidth(0);
            tblItem.getColumnModel().getColumn(11).setMaxWidth(0);
        }

        jButton5.setText("Show");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(txtInvoiceNo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(33, 33, 33)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCount, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCount, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chxBoxAllSelect)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtInvoiceNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5)
                    .addComponent(txtCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(lblCount, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(chxBoxAllSelect)
                .addGap(399, 399, 399))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnStatus)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnStatus)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void chxBoxAllSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chxBoxAllSelectActionPerformed
        if (value == 2) {

            if (chxBoxAllSelect.isSelected()) {
                setCheckBox(true);

            } else {
                setCheckBox(false);

            }
        }
    }//GEN-LAST:event_chxBoxAllSelectActionPerformed

    private void cmboChangeStatusItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmboChangeStatusItemStateChanged
        if (value == 2) {
            Object selectedItem = cmboChangeStatus.getSelectedItem();
            if (selectedItem == null) {

            } else {
                String status = cmboChangeStatus.getSelectedItem().toString();
                if ("Reserved From Customer".equals(status)) {
                    btnStatus.setText("Issue To Factory");
                    chxBoxReturn.setEnabled(true);
                    getInvoice(status);
                } else if ("Issue To Factory".equals(status)) {
                    btnStatus.setText("Reserved From Factory");
                    chxBoxReturn.setEnabled(true);
                    getInvoice(status);
                } else if ("Reserved From Factory".equals(status)) {
                    chxBoxReturn.setEnabled(true);
                    if (chxBoxReturn.isSelected()) {
                        btnStatus.setText("Reserved From Factory");
                    } else {
                        btnStatus.setText("Issue To Customer");
                    }
                    getInvoice(status);
                } else if ("Issue To Customer".equals(status)) {
                    btnStatus.setText("Reserved From Customer");
                    chxBoxReturn.setSelected(true);
                    chxBoxReturn.setEnabled(false);
                    getInvoice(status);
                }
            }
        }
    }//GEN-LAST:event_cmboChangeStatusItemStateChanged

    private void btnStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatusActionPerformed
        if (model.getRowCount() > 0) {
            ArrayList<String> idList = new ArrayList();
            for (int i = 0; i < tblItem.getRowCount(); i++) {
                if ("true".equals(model.getValueAt(i, 9).toString())) {
                    idList.add(model.getValueAt(i, 11).toString());
                }
            }
            int updateCount = setUpdate(idList);
            if (updateCount > 0) {
                JOptionPane.showMessageDialog(this, updateCount + " invoices done");
                resetFields();
            } else {
                JOptionPane.showMessageDialog(this, "No invoice Selected");
            }
        } else {
            JOptionPane.showMessageDialog(this, "No invoice Selected");
        }
    }//GEN-LAST:event_btnStatusActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (value == 2) {
            String status = cmboChangeStatus.getSelectedItem().toString();
            if (!"All".equals(cmboFactory.getSelectedItem().toString())) {
                String factoryId = cmboFactory.getSelectedItem().toString().split("-")[0];
                List<TInvoice> Invoices = InvoiceDAO.getInstance().searchInvoice(status, factoryId);
                addData(Invoices);
            } else {
                getInvoice(status);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String invoiceNo = txtInvoiceNo.getText();
        boolean find=false;
        if (model.getRowCount() > 0) {
            for (int i = 0; i < model.getRowCount(); i++) {
                if (model.getValueAt(i, 1).toString().equals(invoiceNo)) {
                    JOptionPane.showMessageDialog(null, "The Invoice is Selected ("+invoiceNo+")");
                    model.setValueAt(true, i, 9);
                    find=true;
                }
            }
            if (!find) {
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void chxBoxReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chxBoxReturnActionPerformed
        String status = cmboChangeStatus.getSelectedItem().toString();
        if ("Reserved From Customer".equals(status)) {
            if (chxBoxReturn.isSelected()) {
                btnStatus.setText("Issue to Customer");
            } else {
                btnStatus.setText("Issue To Factory");
            }
        } else if ("Issue To Factory".equals(status)) {
            btnStatus.setText("Reserved From Factory");
        } else if ("Reserved From Factory".equals(status)) {
            if (chxBoxReturn.isSelected()) {
                btnStatus.setText("Issue to Factory");
            } else {
                btnStatus.setText("Issue To Customer");
            }
        } else if ("Issue To Customer".equals(status)) {
            btnStatus.setText("Reserved From Customer");
        }
    }//GEN-LAST:event_chxBoxReturnActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String status = cmboChangeStatus.getSelectedItem().toString();
        getInvoice(status);
        searchInvoice = InvoiceDAO.getInstance().searchInvoice(status);

        addData(searchInvoice);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String status = cmboChangeStatus.getSelectedItem().toString();
        getInvoice(status);
        searchInvoice = InvoiceDAO.getInstance().searchInvoiceByDate(status, txtDate.getText());

        addData(searchInvoice, txtDate.getCValue());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        rowCount = txtCount.getCValue();
        String status = cmboChangeStatus.getSelectedItem().toString();
        getInvoice(status);
    }//GEN-LAST:event_jButton5ActionPerformed

    @Override
    public void setIdealMode() {
        txtInvoiceNo.setCValueEditable(false);
        model.setRowCount(0);
        cmboChangeStatus.removeAllItems();
    }

    @Override
    public void setNewMode() {
        invoice = new TInvoice();
        txtInvoiceNo.setCValueEditable(true);
        cmboChangeStatus.setEditable(true);
        model.setRowCount(0);
        setFactory();
        setComboValue();

    }

    @Override
    public void setEditMode() {
        txtInvoiceNo.setCValueEditable(true);
        cmboChangeStatus.setEditable(true);
    }

    @Override
    public void resetFields() {
        setIdealMode();
    }

    @Override
    public void initObject() throws VPException {
        invoice.setStatus(cmboChangeStatus.getSelectedItem().toString());
    }

    @Override
    public void initInterface() throws VPException {

    }

    @Override
    protected void setValueAbstract(TInvoice object) {
        invoice = object;
    }

    @Override
    protected TInvoice getValueAbstract() {
        return null;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStatus;
    private javax.swing.JCheckBox chxBoxAllSelect;
    private javax.swing.JCheckBox chxBoxReturn;
    private javax.swing.JComboBox cmboChangeStatus;
    private javax.swing.JComboBox cmboFactory;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCount;
    private javax.swing.JTable tblItem;
    private com.sv.visionplus.util.component.textfield.CIntegerField txtCount;
    private com.sv.visionplus.util.component.textfield.CDateField txtDate;
    private com.sv.visionplus.util.component.textfield.CIntegerField txtInvoiceNo;
    // End of variables declaration//GEN-END:variables
    private AbstractTransactionForm<TInvoice> transactionForm;
    private DefaultTableModel model;
    private TInvoice invoice;
    private List<TInvoice> searchInvoice = null;

    private void setComboValue() {
        cmboChangeStatus.addItem("Reserved From Customer");
        cmboChangeStatus.addItem("Issue To Factory");
        cmboChangeStatus.addItem("Reserved From Factory");
        cmboChangeStatus.addItem("Issue To Customer");

    }

    private void setFactory() {
        List<MFactory> allFactorys = FactoryDAO.getInstance().allFactorys();
        cmboFactory.removeAllItems();
        for (MFactory factory : allFactorys) {
            cmboFactory.addItem(factory.getIndexNo() + "-" + factory.getName());
        }
        cmboFactory.addItem("All");
    }

    private void getInvoice(String status) {
        String status2 = "FACTORY INVOICE";
        searchInvoice = InvoiceDAO.getInstance().searchInvoiceByStatus(status, status2);
        addData(searchInvoice);
    }

    private void addData(List<TInvoice> searchInvoices) {
        model.setRowCount(0);
        count = 0;
        lblCount.setText("0/0");
        for (TInvoice selectInvoice : searchInvoices) {
            if (count == rowCount) {
                return;
            }
            if ("FACTORY INVOICE".equals(selectInvoice.getStatus2())) {
                addData(selectInvoice);
            }
            lblCount.setText(count + "/" + searchInvoices.size());
        }
    }

    private int setUpdate(ArrayList<String> idList) {
        String status = cmboChangeStatus.getSelectedItem().toString();
        String factory = cmboFactory.getSelectedItem().toString();
        if (!"All".equals(factory)) {
            Integer fac = Integer.parseInt(factory.split("-")[0]);
            if ("Reserved From Customer".equals(status)) {
                if (chxBoxReturn.isSelected()) {
                    int reply = JOptionPane.showConfirmDialog(null, "Do you want to return Customer  ? ", "Comfirm", 0);
                    if (reply == 0) {
                        return updateInvoice(idList, 1, "Issue To Customer", txtDate.getCValue());
                    }
                } else {
                    return updateInvoice(idList, fac, "Issue To Factory", txtDate.getCValue());
                }
            } else {
                if ("Issue To Factory".equals(status)) {
                    return updateInvoice(idList, fac, "Reserved From Factory", txtDate.getCValue());
                }
                if ("Reserved From Factory".equals(status)) {
                    if (chxBoxReturn.isSelected()) {
                        int reply = JOptionPane.showConfirmDialog(null, "Do you want to return Factory  ? ", "Comfirm", 0);
                        if (reply == 0) {
                            return updateInvoice(idList, fac, "Issue To Factory", txtDate.getCValue());
                        }
                    } else {

                        return updateInvoice(idList, fac, "Issue To Customer", txtDate.getCValue());
                    }
                } else {
                    if ("Issue To Customer".equals(status)) {
                        return updateInvoice(idList, fac, "Reserved From Customer", txtDate.getCValue());
                    }

                    JOptionPane.showMessageDialog(this, "Some Error... Refersh the App");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Select a Factory..");
        }
        return 0;
    }

    private void addData(TInvoice invoice) {
        double payAmount = 0.00;
        MCustomer searchCustomer = CustomerDAO.getInstance().searchCustomer(invoice.getCustomer());
        int itemSize = InvoiceItemDAO.getInstance().searchInvoiceItem(invoice.getIndexNo());
        List<CustomerPayment> paymentList = CustomerPaymentDAO.getInstance().getPayment(invoice.getIndexNo());
        for (CustomerPayment customerPayment : paymentList) {
            TPayment payment = TPaymentDAO.getInstance().getPayment(customerPayment.getPayment());
            payAmount += payment.getTotalAmont();
        }
        count++;
        Object[] rowdata = {
            count,
            invoice.getNumber(),
            searchCustomer.getName(),
            invoice.getStatus(),
            itemSize,
            invoice.getAmount(),
            payAmount,
            invoice.getAmount() - payAmount,
            invoice.getInvoiceDate(),
            false,
            invoice.getFactory(),
            invoice.getIndexNo()
        };
        model.addRow(rowdata);

    }

    private void setCheckBox(boolean res) {
        for (int i = 0; i < tblItem.getRowCount(); i++) {
            model.setValueAt(res, i, 9);
        }
    }

    private int updateInvoice(ArrayList<String> idList, Integer factory, String status, Date date) {
        TInvoice invoice = new TInvoice();
        invoice.setFactory(factory);
        invoice.setStatus(status);
        invoice.setInvoiceDate(date);
        return InvoiceDAO.getInstance().updateInvoice(invoice, idList);

    }

    private void addData(List<TInvoice> searchInvoices, java.util.Date date) {
        model.setRowCount(0);
        count = 1;
        double size = 0.0D;
        lblCount.setText("0");
        for (TInvoice selectInvoice : searchInvoices) {
            String searchDate = com.sv.visionplus.util.formatter.FormatterUtil.getInstance().formatDate(date);
            String invoiceDate = com.sv.visionplus.util.formatter.FormatterUtil.getInstance().formatDate(selectInvoice.getInvoiceDate());

            if (searchDate == null ? invoiceDate == null : searchDate.equals(invoiceDate)) {
                size += 1.0D;
                addData(selectInvoice);
                lblCount.setText(size + "");
            }
        }
    }
}
