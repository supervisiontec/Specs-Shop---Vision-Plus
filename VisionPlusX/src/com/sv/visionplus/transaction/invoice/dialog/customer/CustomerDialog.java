package com.sv.visionplus.transaction.invoice.dialog.customer;

import javax.swing.GroupLayout;

public class CustomerDialog extends javax.swing.JDialog
{
  private javax.swing.JButton addButton;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel5;
  private javax.swing.JPanel jPanel6;
  private javax.swing.JPanel jPanel7;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  
  public CustomerDialog(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
    setLocationRelativeTo(null);
    model = ((javax.swing.table.DefaultTableModel)tblCustomer.getModel());
    allCustomer();
  }
  


  private void initComponents()
  {
    jPanel7 = new javax.swing.JPanel();
    addButton = new javax.swing.JButton();
    selectButton = new javax.swing.JButton();
    searchButton = new javax.swing.JButton();
    jPanel5 = new javax.swing.JPanel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    jScrollPane2 = new javax.swing.JScrollPane();
    txtAddress = new javax.swing.JTextArea();
    jLabel9 = new javax.swing.JLabel();
    txtName = new com.sv.visionplus.util.component.textfield.CStringField();
    txtNic = new com.sv.visionplus.util.component.textfield.CStringField();
    txtContactNo = new com.sv.visionplus.util.component.textfield.CStringField();
    jPanel6 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tblCustomer = new javax.swing.JTable();
    
    setDefaultCloseOperation(2);
    
    addButton.setText("Add");
    addButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        CustomerDialog.this.addButtonActionPerformed(evt);
      }
      
    });
    selectButton.setText("Select");
    selectButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        CustomerDialog.this.selectButtonActionPerformed(evt);
      }
      
    });
    searchButton.setText("Search");
    searchButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        CustomerDialog.this.searchButtonActionPerformed(evt);
      }
      
    });
    GroupLayout jPanel7Layout = new GroupLayout(jPanel7);
    jPanel7.setLayout(jPanel7Layout);
    jPanel7Layout.setHorizontalGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(searchButton, -2, 79, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(selectButton, -2, 82, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(addButton).addGap(33, 33, 33)));
    









    jPanel7Layout.setVerticalGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel7Layout.createSequentialGroup().addContainerGap().addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(selectButton).addComponent(searchButton)).addComponent(addButton)).addContainerGap(-1, 32767)));
    










    jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Search Type"));
    
    jLabel6.setText("Name :");
    
    jLabel7.setText("Address :");
    
    jLabel8.setText("Contact No :");
    
    txtAddress.setColumns(20);
    txtAddress.setRows(5);
    jScrollPane2.setViewportView(txtAddress);
    
    jLabel9.setText("NIC :");
    
    GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addContainerGap().addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel9).addComponent(jLabel6, -2, 57, -2).addComponent(jLabel8, -2, 71, -2).addComponent(jLabel7, -2, 71, -2)).addGap(14, 14, 14).addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jScrollPane2, -2, 0, 32767).addComponent(txtName, -1, -1, 32767).addComponent(txtNic, -1, -1, 32767).addComponent(txtContactNo, -1, -1, 32767)).addGap(26, 26, 26)));
    















    jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addGap(40, 40, 40).addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel6).addComponent(txtName, -2, -1, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel9).addComponent(txtNic, -2, -1, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel8).addComponent(txtContactNo, -2, -1, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel7).addComponent(jScrollPane2, -2, 84, -2)).addContainerGap(48, 32767)));
    




















    tblCustomer.setModel(new javax.swing.table.DefaultTableModel(new Object[0][], new String[] { "#", "Name", "NIC", "ContactNo", "Adress" }));
    






    tblCustomer.setSelectionMode(0);
    jScrollPane1.setViewportView(tblCustomer);
    
    GroupLayout jPanel6Layout = new GroupLayout(jPanel6);
    jPanel6.setLayout(jPanel6Layout);
    jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane1, -1, 328, 32767).addContainerGap()));
    





    jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addGap(20, 20, 20).addComponent(jScrollPane1, -2, 216, -2).addContainerGap(89, 32767)));
    






    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel7, -1, -1, 32767).addComponent(jPanel5, -1, -1, 32767)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jPanel6, -1, -1, 32767).addContainerGap()));
    









    layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jPanel5, -2, -1, -2).addGap(18, 18, 18).addComponent(jPanel7, -2, -1, -2)).addComponent(jPanel6, -2, -1, -2));
    








    pack();
  }
  
  private void selectButtonActionPerformed(java.awt.event.ActionEvent evt) {
    if (tblCustomer.getSelectedRowCount() == 1) {
      String indexNo = tblCustomer.getValueAt(tblCustomer.getSelectedRow(), 0).toString();
      String name = tblCustomer.getValueAt(tblCustomer.getSelectedRow(), 1).toString();
      String nic = tblCustomer.getValueAt(tblCustomer.getSelectedRow(), 2).toString();
      String contactNo = tblCustomer.getValueAt(tblCustomer.getSelectedRow(), 3).toString();
      String address = tblCustomer.getValueAt(tblCustomer.getSelectedRow(), 4).toString();
      
      customer = new com.sv.visionplus.transaction.invoice.dialog.customer.model.MCustomer();
      customer.setIndexNo(Integer.valueOf(Integer.parseInt(indexNo)));
      customer.setAddress(address);
      customer.setName(name);
      customer.setNic(nic);
      customer.setContactNo(contactNo);
      pcInvoice.setCustomer(customer);
      dispose();
    }
    else {
      javax.swing.JOptionPane.showMessageDialog(null, "Select a row");
    }
  }
  
  private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {
    customer = new com.sv.visionplus.transaction.invoice.dialog.customer.model.MCustomer();
    customer.setAddress(txtAddress.getText());
    customer.setName(txtName.getText());
    customer.setNic("".equals(txtNic.getText())?"000000000V":txtNic.getText());
    customer.setContactNo(txtContactNo.getText());
    if ((!"".equals(txtAddress.getText())) && (!"".equals(txtName.getText()))) {
      int customerId = CustomerService.getInstance().saveCustomer(customer);
      if (customerId > 0) {
        customer.setIndexNo(customerId);
        pcInvoice.setCustomer(customer);
        dispose();
      }
    } else {
      javax.swing.JOptionPane.showMessageDialog(this, "Empty set.");
    }
  }
  
  private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {
    customer = new com.sv.visionplus.transaction.invoice.dialog.customer.model.MCustomer();
    customer.setAddress(txtAddress.getText());
    customer.setName(txtName.getText());
    customer.setNic(txtNic.getText());
    customer.setContactNo(txtContactNo.getText());
    java.util.List<com.sv.visionplus.transaction.invoice.dialog.customer.model.MCustomer> searchCustomer = CustomerService.getInstance().searchCustomer(customer);
    if (searchCustomer != null) {
      addData(searchCustomer);
    }
  }
  


  private javax.swing.JButton searchButton;
  

  private javax.swing.JButton selectButton;
  
  private javax.swing.JTable tblCustomer;
  
  private javax.swing.JTextArea txtAddress;
  
  private com.sv.visionplus.util.component.textfield.CStringField txtContactNo;
  
  private com.sv.visionplus.util.component.textfield.CStringField txtName;
  
  private com.sv.visionplus.util.component.textfield.CStringField txtNic;
  
  private com.sv.visionplus.transaction.invoice.PCInvoice pcInvoice;
  
  private com.sv.visionplus.transaction.invoice.dialog.customer.model.MCustomer customer;
  
  private javax.swing.table.DefaultTableModel model;
  
  public void setFrame(com.sv.visionplus.transaction.invoice.PCInvoice pcInvoice)
  {
    this.pcInvoice = pcInvoice;
  }
  
  private void allCustomer()
  {
    java.util.List<com.sv.visionplus.transaction.invoice.dialog.customer.model.MCustomer> allCustomer = CustomerService.getInstance().allCustomer();
    addData(allCustomer);
  }
  
  private void addData(java.util.List<com.sv.visionplus.transaction.invoice.dialog.customer.model.MCustomer> allCustomer) {
    model.setRowCount(0);
    for (com.sv.visionplus.transaction.invoice.dialog.customer.model.MCustomer customer : allCustomer) {
      addData(customer);
    }
  }
  
  private void addData(com.sv.visionplus.transaction.invoice.dialog.customer.model.MCustomer customer) {
    Object[] rowData = { customer.getIndexNo(), customer.getName(), customer.getNic(), customer.getContactNo(), customer.getAddress() };
    





    model.addRow(rowData);
  }
}
