/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.customer_payment.dialog;

import com.sv.visionplus.transaction.customer_payment.InvoiceDAO;
import com.sv.visionplus.transaction.customer_payment.PCCustomerPayment;
import com.sv.visionplus.transaction.customer_payment.SearchInvoiceDAO;
import com.sv.visionplus.transaction.customer_payment.model.CustomerInvoiceMix;
import com.sv.visionplus.transaction.customer_payment.model.TInvoice;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KAZA
 */
public class SearchInvoice extends javax.swing.JDialog {

    private DefaultTableModel model;
    private PCCustomerPayment form;

    /**
     * Creates new form SearchInvoice
     */
    public SearchInvoice(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        model = (DefaultTableModel) invoiceTable.getModel();
        btnSearch.doClick();
        getAll();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        invoiceTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new com.sv.visionplus.util.component.textfield.CStringField();
        btnSearch = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        invoiceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoice No", "Date", "Status", "cid", "Customer Name", "Nic", "Contact No", "amount", "index", "Barcode"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(invoiceTable);
        if (invoiceTable.getColumnModel().getColumnCount() > 0) {
            invoiceTable.getColumnModel().getColumn(3).setMinWidth(0);
            invoiceTable.getColumnModel().getColumn(3).setPreferredWidth(0);
            invoiceTable.getColumnModel().getColumn(3).setMaxWidth(0);
            invoiceTable.getColumnModel().getColumn(8).setMinWidth(0);
            invoiceTable.getColumnModel().getColumn(8).setPreferredWidth(0);
            invoiceTable.getColumnModel().getColumn(8).setMaxWidth(0);
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Search Type"));

        jLabel1.setText("Customer Name / NIC / Contact No/ Barcode");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jButton2.setText("Select");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(jButton2))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
        List<CustomerInvoiceMix> searchInvoice = SearchInvoiceDAO.getInstance().searchInvoice(txtSearch.getCValue());
        if (searchInvoice.size() == 1) {
            form.setInvoice(searchInvoice.get(0));
            this.dispose();
        } else if (searchInvoice.size() > 0) {
            addData(searchInvoice);
        } else {
            JOptionPane.showMessageDialog(this, "Not found Invoice","Error Message",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (invoiceTable.getSelectedRowCount() == 1) {
            CustomerInvoiceMix mix = new CustomerInvoiceMix();
            mix.setInvoice_date((Date) invoiceTable.getValueAt(invoiceTable.getSelectedRow(), 1));
            mix.setStatus((String) invoiceTable.getValueAt(invoiceTable.getSelectedRow(), 2));
            mix.setCustomer_id((Integer) invoiceTable.getValueAt(invoiceTable.getSelectedRow(), 3));
            mix.setName((String) invoiceTable.getValueAt(invoiceTable.getSelectedRow(), 4));
            mix.setNic((String) invoiceTable.getValueAt(invoiceTable.getSelectedRow(), 5));
            mix.setContact_no((String) invoiceTable.getValueAt(invoiceTable.getSelectedRow(), 6));
            mix.setAmount((double) invoiceTable.getValueAt(invoiceTable.getSelectedRow(), 7));
            mix.setInvoice_no((int) invoiceTable.getValueAt(invoiceTable.getSelectedRow(), 8));
            mix.setBarcode((String) invoiceTable.getValueAt(invoiceTable.getSelectedRow(), 9));
            form.setInvoice(mix);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Select a Row","Error Message",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SearchInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SearchInvoice dialog = new SearchInvoice(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JTable invoiceTable;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.sv.visionplus.util.component.textfield.CStringField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void addData(List<CustomerInvoiceMix> searchInvoice) {
        model.setRowCount(0);
        Integer count=0;
        for (CustomerInvoiceMix invoice : searchInvoice) {
            if (count==20) {
                return;
            }
            TInvoice invoice1 = InvoiceDAO.getInstance().searchInvoice(invoice.getInvoice_no());
            Object[] rowData = {
                invoice1.getNumber(),
                invoice.getInvoice_date(),
                invoice.getStatus(),
                invoice.getCustomer_id(),
                invoice.getName(),
                invoice.getNic(),
                invoice.getContact_no(),
                invoice.getAmount(),
                invoice.getInvoice_no(),
                invoice.getBarcode()
            };
            model.addRow(rowData);
            count++;
        }
    }

    public void setFrame(PCCustomerPayment form) {
        this.form = form;
    }

    private void getAll() {
        List<CustomerInvoiceMix> allInvoice = SearchInvoiceDAO.getInstance().allInvoice();
        addData(allInvoice);
    }

    
}
