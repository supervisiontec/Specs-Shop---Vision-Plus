/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.log_file;

import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.base.transaction.AbstractTransactionForm;
import com.sv.visionplus.log_file.model.LogFileModel;
import com.sv.visionplus.stock.stock_adjustment.model.MItem;
import com.sv.visionplus.system.exception.VPException;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mohan
 */
public class PCLogFile extends AbstractObjectCreator<LogFileModel> {

    private DefaultTableModel model;

    /**
     * Creates new form PCInvoice
     */
    public PCLogFile(AbstractTransactionForm transactionForm) {
        initComponents();

        this.transactionForm = transactionForm;
        model = ((javax.swing.table.DefaultTableModel) tblLog.getModel());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblLog = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtDate = new org.jdesktop.swingx.JXDatePicker();
        btnSearch = new javax.swing.JButton();
        txtUserName = new com.sv.visionplus.util.component.textfield.CStringField();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        tblLog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Date", "Time", "User Name", "Form Name", "Remarks", "Type", "Value "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblLog);

        jLabel3.setText("Date :");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel4.setText("User Name :");

        jButton2.setText("All");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(465, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String date = com.sv.visionplus.util.formatter.FormatterUtil.getInstance().formatDate(txtDate.getDate());
        String user = txtUserName.getCValue();
        java.util.List<LogFileModel> searchUser = LogFileDAO.getInstance().searchUser(date, user);
        setDate(searchUser);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      setLog();
    }//GEN-LAST:event_jButton2ActionPerformed

    @Override
    public void setIdealMode() {

    }

    @Override
    public void setNewMode() {
         logFile = new LogFileModel();
    }

    @Override
    public void setEditMode() {

    }

    @Override
    public void resetFields() {

    }

    @Override
    public void initObject() throws VPException {
        logFile = new LogFileModel();
    }

    @Override
    public void initInterface() throws VPException {

    }

    @Override
    protected void setValueAbstract(LogFileModel log) {
        logFile = log;
    }

    @Override
    protected LogFileModel getValueAbstract() {
        return logFile;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblLog;
    private org.jdesktop.swingx.JXDatePicker txtDate;
    private com.sv.visionplus.util.component.textfield.CStringField txtUserName;
    // End of variables declaration//GEN-END:variables
    private AbstractTransactionForm<MItem> transactionForm;
    private LogFileModel logFile;

    private void setLog() {
        List<LogFileModel> logs = LogFileDAO.getInstance().AllUser();
        setDate(logs);
    }

    private void setDate(List<LogFileModel> logs) {
        model.setRowCount(0);
        for (LogFileModel log : logs) {
            Object[] rowData = {
                log.getDate(),
                log.getTime(),
                log.getName(),
                log.getFormName(),
                log.getRemarks(),
                log.getTransactionType(),
                log.getValue()};
            model.addRow(rowData);
        }
    }
}
