/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.customer_payment;

import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.base.transaction.AbstractTransactionForm;
import com.sv.visionplus.base.transaction.AbstractTransactionFormService;
import com.sv.visionplus.transaction.customer_payment.model.CustomerPaymentMix;

/**
 *
 * @author KAZA
 */
public class CustomerPaymentForm extends AbstractTransactionForm<CustomerPaymentMix> {
private PCCustomerPayment customerPayment;
    @Override
    protected AbstractTransactionFormService<CustomerPaymentMix> getTransactionFormService() {
        return new CustomerPaymentService();
    
    }

    @Override
    protected AbstractObjectCreator<CustomerPaymentMix> getObjectCreator() {
        customerPayment= new PCCustomerPayment(this);
        return customerPayment;
    }

    @Override
    public void doSave() {
        super.doSave(); 
        if (customerPayment!=null) {
            customerPayment.resetFields();
        }
    }

   
}