/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.check_In;

import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.base.transaction.AbstractTransactionForm;
import com.sv.visionplus.base.transaction.AbstractTransactionFormService;
import com.sv.visionplus.transaction.check_In.model.InvoiceMix;
import com.sv.visionplus.transaction.check_In.model.TInvoice;

/**
 *
 * @author KAZA
 */
public class CheckingForm extends AbstractTransactionForm<TInvoice>{
    private PCChecking checking;
    @Override
    protected AbstractTransactionFormService<TInvoice> getTransactionFormService() {
        return new CheckingService();
    }

    @Override
    protected AbstractObjectCreator<TInvoice> getObjectCreator() {
        checking=new PCChecking(this);
        return checking;
    }

    @Override
    public void doSave() {
        super.doSave(); 
        
        if (checking!=null) {
            checking.resetFields();
        }
    }
    
    
}
