package com.sv.visionplus.util.payment;

import com.sv.visionplus.util.formatter.FormatterUtil;
import com.sv.visionplus.util.payment.model.TPayment;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.text.ParseException;

/**
 *
 * @author Mohan
 */
//XXX:KASUN
public class PaymentDialog extends javax.swing.JDialog {

    //singleton instance of payment dialog
    private static PaymentDialog INASTANCE;

    public static final PaymentDialog getInstance() {
        if (INASTANCE == null) {
            INASTANCE = new PaymentDialog();
        }
        return INASTANCE;
    }

    private PaymentDialog() {
        super();

        initComponents();

        initOthers();
    }

    public TPayment getPayment(Double totalAmount) throws ParseException {
        this.totalAmount = totalAmount;

        //show dialog
        this.setVisible(true);

        //parse payment object
        txtInviiveValue.setText(FormatterUtil.getInstance().formatDouble(totalAmount));

        //return payment object
        TPayment payment = new TPayment();

        Double cardAmount = FormatterUtil.getInstance().parseDouble(txtCardAmount.getText());
        Double cashAmount = FormatterUtil.getInstance().parseDouble(txtCashAmount.getText());
        Double chequeAmount = FormatterUtil.getInstance().parseDouble(txtChequeAmount.getText());

        payment.setCardAmount(cardAmount);
        payment.setCashAmount(cashAmount);
        payment.setChequeAmount(chequeAmount);

        payment.setTotalAmount(cardAmount + cashAmount + chequeAmount);

        return payment;

    }

    private void validatePayment() {
        this.payment = new TPayment();
        //TODO:set other fields, payment information

    }

    private void discardPayment() {
        this.payment = null;

        dispose();
    }

    @SuppressWarnings("unchecked")
    private void initOthers() {
        setModal(true);

        //validation of payment
        FocusListener focusListener = new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                validatePayment();
            }
        };
        //TODO:set focus listener to input components

        //TODO:button actions
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtPayAmount = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtInviiveValue = new javax.swing.JTextField();
        cardPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtCashAmount = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtNewBalance = new javax.swing.JTextField();
        cardPanel2 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txtCardAmount = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtCardNo = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        rdoCardPayment = new javax.swing.JRadioButton();
        cmboCardBank = new javax.swing.JComboBox();
        chequePanel = new javax.swing.JPanel();
        rdoChequePayment = new javax.swing.JRadioButton();
        txtChequeAmount = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        cmboChequeBank = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtChequeNo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel13.setText("Pay Amount :");

        jLabel8.setText("Invoice Value :");

        txtInviiveValue.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtInviiveValueFocusLost(evt);
            }
        });

        cardPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cash Payment"));

        jLabel14.setText(" Amount :");

        txtCashAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCashAmountActionPerformed(evt);
            }
        });
        txtCashAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCashAmountKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout cardPanel1Layout = new javax.swing.GroupLayout(cardPanel1);
        cardPanel1.setLayout(cardPanel1Layout);
        cardPanel1Layout.setHorizontalGroup(
            cardPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(26, 26, 26)
                .addComponent(txtCashAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );
        cardPanel1Layout.setVerticalGroup(
            cardPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(cardPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtCashAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94))
        );

        jLabel15.setText("New Balance :");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15))
                .addGap(38, 38, 38)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtInviiveValue)
                    .addComponent(txtPayAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(txtNewBalance))
                .addGap(35, 35, 35)
                .addComponent(cardPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(254, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtInviiveValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtPayAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtNewBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(cardPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        cardPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Card Payment"));

        jLabel18.setText(" Amount :");

        jLabel19.setText("Bank :");

        txtCardNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCardNoActionPerformed(evt);
            }
        });

        jLabel20.setText(" Card No :");

        rdoCardPayment.setText("Card Payment");
        rdoCardPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoCardPaymentActionPerformed(evt);
            }
        });

        cmboCardBank.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sampath Bank", "HNB", "People's Bank", "Other" }));
        cmboCardBank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboCardBankActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cardPanel2Layout = new javax.swing.GroupLayout(cardPanel2);
        cardPanel2.setLayout(cardPanel2Layout);
        cardPanel2Layout.setHorizontalGroup(
            cardPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardPanel2Layout.createSequentialGroup()
                        .addComponent(rdoCardPayment)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardPanel2Layout.createSequentialGroup()
                        .addGroup(cardPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel18))
                        .addGap(24, 24, 24)
                        .addGroup(cardPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCardAmount)
                            .addComponent(cmboCardBank, 0, 250, Short.MAX_VALUE)
                            .addComponent(txtCardNo))
                        .addGap(31, 31, 31))))
        );
        cardPanel2Layout.setVerticalGroup(
            cardPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdoCardPayment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cardPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtCardAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cardPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(cmboCardBank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cardPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtCardNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        chequePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Cheque Payment"));

        rdoChequePayment.setText("Cheque Payment");
        rdoChequePayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoChequePaymentActionPerformed(evt);
            }
        });

        jLabel16.setText(" Amount :");

        cmboChequeBank.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sampath Bank", "HNB", "People's Bank", "Other" }));
        cmboChequeBank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboChequeBankActionPerformed(evt);
            }
        });

        jLabel17.setText("Bank :");

        jLabel21.setText(" Cheque No :");

        javax.swing.GroupLayout chequePanelLayout = new javax.swing.GroupLayout(chequePanel);
        chequePanel.setLayout(chequePanelLayout);
        chequePanelLayout.setHorizontalGroup(
            chequePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chequePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(chequePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(chequePanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(chequePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel21)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(chequePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtChequeNo)
                            .addComponent(txtChequeAmount)
                            .addComponent(cmboChequeBank, 0, 277, Short.MAX_VALUE)))
                    .addGroup(chequePanelLayout.createSequentialGroup()
                        .addComponent(rdoChequePayment)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        chequePanelLayout.setVerticalGroup(
            chequePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chequePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdoChequePayment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(chequePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtChequeAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(chequePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(cmboChequeBank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(chequePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtChequeNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cardPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chequePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chequePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCashAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCashAmountActionPerformed

    }//GEN-LAST:event_txtCashAmountActionPerformed

    private void txtCashAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCashAmountKeyReleased

    }//GEN-LAST:event_txtCashAmountKeyReleased

    private void txtCardNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCardNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCardNoActionPerformed

    private void rdoCardPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoCardPaymentActionPerformed

    }//GEN-LAST:event_rdoCardPaymentActionPerformed

    private void cmboCardBankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboCardBankActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmboCardBankActionPerformed

    private void rdoChequePaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoChequePaymentActionPerformed

    }//GEN-LAST:event_rdoChequePaymentActionPerformed

    private void cmboChequeBankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboChequeBankActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmboChequeBankActionPerformed

    private void txtInviiveValueFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtInviiveValueFocusLost
        initOthers();
    }//GEN-LAST:event_txtInviiveValueFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cardPanel1;
    private javax.swing.JPanel cardPanel2;
    private javax.swing.JPanel chequePanel;
    private javax.swing.JComboBox cmboCardBank;
    private javax.swing.JComboBox cmboChequeBank;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton rdoCardPayment;
    private javax.swing.JRadioButton rdoChequePayment;
    private javax.swing.JTextField txtCardAmount;
    private javax.swing.JTextField txtCardNo;
    private javax.swing.JTextField txtCashAmount;
    private javax.swing.JTextField txtChequeAmount;
    private javax.swing.JTextField txtChequeNo;
    private javax.swing.JTextField txtInviiveValue;
    private javax.swing.JTextField txtNewBalance;
    private javax.swing.JTextField txtPayAmount;
    // End of variables declaration//GEN-END:variables
    private Double totalAmount;
    private TPayment payment;
}
