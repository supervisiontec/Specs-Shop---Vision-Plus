/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.account.payment_voucher;

import com.sv.visionplus.account.payment_voucher.model.PaymentVoucherMix;
import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.base.transaction.AbstractTransactionForm;
import com.sv.visionplus.base.transaction.AbstractTransactionFormService;

/**
 *
 * @author KAZA
 */
public class PaymentVoucherForm extends AbstractTransactionForm<PaymentVoucherMix>{
    private PCPaymentVoucher voucher;
    
    @Override
    protected AbstractTransactionFormService<PaymentVoucherMix> getTransactionFormService() {
        return new PaymentVoucherService();
    }

    @Override
    protected AbstractObjectCreator<PaymentVoucherMix> getObjectCreator() {
        return new PCPaymentVoucher(this);
    }

    @Override
    public void doSave() {
        super.doSave(); 
        
        if (voucher!=null) {
            voucher.resetFields();
        }
    }
    
    
}
