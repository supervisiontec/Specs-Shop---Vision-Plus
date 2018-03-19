/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.supplier_payment;

import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.base.transaction.AbstractTransactionForm;
import com.sv.visionplus.base.transaction.AbstractTransactionFormService;
import com.sv.visionplus.transaction.patient_history.*;
import com.sv.visionplus.transaction.supplier_payment.model.SupplierPaymentMix;

/**
 *
 * @author KAZA
 */
public class SupplierPaymentForm extends AbstractTransactionForm<SupplierPaymentMix> {

    private PCSupplierPayment supplierPayment;

    @Override
    protected AbstractTransactionFormService<SupplierPaymentMix> getTransactionFormService() {
        return new SupplierPaymentService();
    }

    @Override
    protected AbstractObjectCreator<SupplierPaymentMix> getObjectCreator() {
        supplierPayment = new PCSupplierPayment(this);
        return supplierPayment;
    }

    @Override
    public void doSave() {
        super.doSave(); //To change body of generated methods, choose Tools | Templates.
        if (supplierPayment != null) {
            supplierPayment.resetFields();
        }
    }

}
