package com.sv.visionplus.resource.ui;

import com.sv.visionplus.transaction.invoice.dialog.Item.SearchItemMixModel;
import com.sv.visionplus.util.formatter.FormatterUtil;
import javax.swing.UIManager;

public class InvoiceItemCell extends javax.swing.JPanel {

    public InvoiceItemCell(SearchItemMixModel mixModel, boolean isSelected) {
        this.mixModel = mixModel;
        this.isSelected = isSelected;

        initComponents();

        initOthers();
    }

    @SuppressWarnings("unchecked")
    private void initOthers() {
        if (this.mixModel != null) {
            this.lblCode.setText(mixModel.getCode());
            this.lblName.setText(mixModel.getName() + " - " + mixModel.getBrand_name());

            this.lblQuantity.setText(mixModel.getTotal_qty() + " X ");
            double newValue = mixModel.getSale_price();
            this.lblPrice.setText(newValue + "");
            this.lblDiscount.setText("Discount : " + mixModel.getTotal_qty() * mixModel.getDicsount());
        } else {
            this.lblCode.setText("");
            this.lblName.setText("");
            this.lblQuantity.setText("");
            this.lblPrice.setText("");
            this.lblDiscount.setText("");
        }

        if (isSelected) {
            setBackground(UIManager.getColor("List.selectionBackground"));
        } else {
            setBackground(UIManager.getColor("List.background"));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblCode = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        lblDiscount = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sv/visionplus/resource/icons/list_render/item.png"))); // NOI18N

        lblPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPrice.setText("Rs. 100.00");

        lblName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblName.setText("Sun Glass - RayBan");

        lblCode.setText("10010002");

        lblQuantity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblQuantity.setText("10 x ");

        lblDiscount.setText("Discount : 150.00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName)
                    .addComponent(lblCode, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lblQuantity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPrice))
                    .addComponent(lblDiscount, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPrice)
                                    .addComponent(lblQuantity))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDiscount)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCode)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCode;
    private javax.swing.JLabel lblDiscount;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblQuantity;
    // End of variables declaration//GEN-END:variables

    private SearchItemMixModel mixModel;
    private boolean isSelected;
}
