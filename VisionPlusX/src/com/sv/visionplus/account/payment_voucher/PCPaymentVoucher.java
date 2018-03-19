/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.account.payment_voucher;

import com.sv.visionplus.account.payment_voucher.model.MAccount;
import com.sv.visionplus.account.payment_voucher.model.MainCategory;
import com.sv.visionplus.account.payment_voucher.model.PaymentVoucherMix;
import com.sv.visionplus.account.payment_voucher.model.SearchVoucherMix;
import com.sv.visionplus.account.payment_voucher.model.SubCategory;
import com.sv.visionplus.account.payment_voucher.model.TAccountTransaction;
import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.base.transaction.AbstractTransactionForm;
import com.sv.visionplus.master.item.model.MItem;
import com.sv.visionplus.resource.accountType.AccountType;
import com.sv.visionplus.system.exception.VPException;
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
public class PCPaymentVoucher extends AbstractObjectCreator<PaymentVoucherMix> {

    /**
     * Creates new form PCInvoice
     */
    public PCPaymentVoucher(AbstractTransactionForm transactionForm) {
        initComponents();
        this.transactionForm = transactionForm;
        txtMainHidden.setCValueEditable(false);
        txtSubHidden.setCValueEditable(false);
        model = (DefaultTableModel) tblVoucher.getModel();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDescription = new com.sv.visionplus.util.component.textfield.CStringField();
        txtAmount = new com.sv.visionplus.util.component.textfield.CDoubleField();
        jLabel1 = new javax.swing.JLabel();
        txtDate = new com.sv.visionplus.util.component.textfield.CDateField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMainHidden = new com.sv.visionplus.util.component.textfield.CStringField();
        txtSubHidden = new com.sv.visionplus.util.component.textfield.CStringField();
        comboMainCategory = new com.sv.visionplus.util.component.combobox.CComboBox(){
            @Override
            public List getComboData(){
                return allMainCategory();
            }

        };
        comboSubCategory = new com.sv.visionplus.util.component.combobox.CComboBox(){
            @Override
            public List getComboData(){
                return allSubCategory();
            }

        };
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVoucher = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtTotalAmount = new com.sv.visionplus.util.component.textfield.CDoubleField();

        jLabel4.setText("Description :");

        jLabel5.setText("Amount :");

        jLabel1.setText("Date :");

        jLabel2.setText("Main Category :");

        jLabel3.setText("Sub Category :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(txtMainHidden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSubHidden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboMainCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboSubCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(comboMainCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMainHidden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(comboSubCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSubHidden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(186, Short.MAX_VALUE))
        );

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
        tblVoucher.setToolTipText("");
        tblVoucher.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tblVoucher);
        tblVoucher.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tblVoucher.getColumnModel().getColumnCount() > 0) {
            tblVoucher.getColumnModel().getColumn(0).setResizable(false);
            tblVoucher.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblVoucher.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel6.setText("Daily Voucher Amount:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 149, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(145, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void setIdealMode() {
        txtDate.setCValue(new Date());
        txtDate.setCValueEditable(false);
        txtDescription.setCValueEditable(false);
        comboMainCategory.resetCValue();
        comboSubCategory.resetCValue();
        txtMainHidden.setCValueEditable(false);
        txtSubHidden.setCValueEditable(false);
        txtAmount.setCValueEditable(false);
        txtTotalAmount.setCValueEditable(false);
        model.setRowCount(0);
    }

    @Override
    public void setNewMode() {
        mix = new PaymentVoucherMix();

        txtDate.setCValue(new Date());
        txtDate.setCValueEditable(false);
        txtDescription.setCValueEditable(true);
        txtMainHidden.setCValueEditable(true);
        txtSubHidden.setCValueEditable(true);
        txtAmount.setCValueEditable(true);
        txtTotalAmount.setCValueEditable(false);
        model.setRowCount(0);
        setAllVouchers();
    }

    @Override
    public void setEditMode() {
        txtDate.setCValue(new Date());
        txtDate.setCValueEditable(true);
        txtDescription.setCValueEditable(true);
        comboMainCategory.setCValueEditable(true);
        comboSubCategory.setCValueEditable(true);
        txtMainHidden.setCValueEditable(true);
        txtSubHidden.setCValueEditable(true);
        txtAmount.setCValueEditable(true);
        txtTotalAmount.setCValueEditable(false);
    }

    @Override
    public void resetFields() {
        txtDate.resetCValue();
        txtDescription.resetCValue();
        comboMainCategory.resetCValue();
        comboSubCategory.resetCValue();
        txtMainHidden.resetCValue();
        txtSubHidden.resetCValue();
        txtAmount.resetCValue();
        txtTotalAmount.resetCValue();
        model.setRowCount(0);
        setAllVouchers();
    }

    @Override
    public void initObject() throws VPException {

        MainCategory category = new MainCategory();
        String comboValue = comboMainCategory.getCValue().toString();
        if (!comboValue.isEmpty()) {
            String mainCategoryId = comboValue.split("-")[0];
            String mainCategoryName = comboValue.split("-")[1];
            if (mainCategoryId.equals("0")) {
                category.setIndexNo(0);
                category.setName(txtMainHidden.getCValue());
            } else {
                category.setName(mainCategoryName);
                category.setIndexNo(Integer.parseInt(mainCategoryId));
            }
        } else {
            category.setIndexNo(0);//auto Increment
            category.setName(txtMainHidden.getCValue());
        }
        mix.setMainCategory(category);

        SubCategory subCategory = new SubCategory();
        String comboValueSub = comboSubCategory.getCValue().toString();
        if (!comboValue.isEmpty()) {
            String subCategoryId = comboValueSub.split("-")[0];
            String SubCategoryName = comboValueSub.split("-")[1];
            if (subCategoryId.equals("0")) {
                subCategory.setIndexNo(0);
                subCategory.setName(txtSubHidden.getCValue());
            } else {
                subCategory.setIndexNo(Integer.parseInt(subCategoryId));
                subCategory.setName(SubCategoryName);
            }
        } else {
            subCategory.setIndexNo(0);//auto Increment
            subCategory.setName(txtMainHidden.getCValue());
        }
        mix.setSubCategory(subCategory);

        MAccount account = new MAccount();
        account.setDescription(txtDescription.getCValue());
//        account.setIndexNo(0);//auto increment
//        account.setMainCategroy(0);//auto increment
//        account.setSubCategory(0);//auto increment
        account.setType(AccountType.VOUCHER);
        mix.setAccount(account);

        TAccountTransaction transaction = new TAccountTransaction();
//        transaction.setAccount(0);//dont know
        transaction.setCredit(txtAmount.getCValue());
        transaction.setDate(new Date());
        transaction.setDebit(0.00);
        transaction.setDescription(txtDescription.getCValue());
//        transaction.setIndexNo();auto increment
        mix.setAccountTransaction(transaction);

        LogFileModel logFile = new LogFileModel();
        logFile.setDate(new Date());
        logFile.setFormName("Payment Voucher");
//        logFile.setIndexNo(0);//auto
        logFile.setRemarks("new Payment Voucher Saved");
        logFile.setTime(FormatterUtil.getInstance().getTime());
        logFile.setTransactionType("Save");
        logFile.setUser(Home.getInstance().getUser().getIndexNo());
        logFile.setUserName(Home.getInstance().getUser().getName());
        logFile.setValue(txtAmount.getCValue());
        mix.setFileModel(logFile);
    }

    @Override
    public void initInterface() throws VPException {

    }

    @Override
    protected void setValueAbstract(PaymentVoucherMix mix) {
        this.mix = mix;
    }

    @Override
    protected PaymentVoucherMix getValueAbstract() {
        return this.mix;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.sv.visionplus.util.component.combobox.CComboBox comboMainCategory;
    private com.sv.visionplus.util.component.combobox.CComboBox comboSubCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVoucher;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtAmount;
    private com.sv.visionplus.util.component.textfield.CDateField txtDate;
    private com.sv.visionplus.util.component.textfield.CStringField txtDescription;
    private com.sv.visionplus.util.component.textfield.CStringField txtMainHidden;
    private com.sv.visionplus.util.component.textfield.CStringField txtSubHidden;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtTotalAmount;
    // End of variables declaration//GEN-END:variables
    private AbstractTransactionForm<MItem> transactionForm;
    private DefaultTableModel model;
    private PaymentVoucherMix mix;

    private List<MainCategory> allMainCategory() {
        return MainCategoryDAO.getInstance().allCategory();
    }

    private List<SubCategory> allSubCategory() {
        return SubCategoryDAO.getInstance().allCategory();
    }

    private void setAllVouchers() {
        List<SearchVoucherMix> allVouchers = SearchVoucherDAO.getInstance().searchVouchers(FormatterUtil.getInstance().formatDate(new Date()),AccountType.VOUCHER);
        addData(allVouchers);
    }

    private void addData(List<SearchVoucherMix> allVouchers) {
        model.setRowCount(0);
        for (SearchVoucherMix voucher : allVouchers) {
            addData(voucher);
        }
        if (model.getRowCount() > 0) {
            double totalValue = 0;
            for (int i = 0; i < model.getRowCount(); i++) {
                totalValue += Double.parseDouble(model.getValueAt(i, 5).toString());
            }
            txtTotalAmount.setCValue(totalValue);
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
        model.addRow(rowData);
    }
}
