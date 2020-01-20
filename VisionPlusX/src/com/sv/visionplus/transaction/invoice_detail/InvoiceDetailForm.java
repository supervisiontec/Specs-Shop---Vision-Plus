/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.invoice_detail;

import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.base.transaction.AbstractTransactionForm;
import com.sv.visionplus.base.transaction.AbstractTransactionFormService;
import com.sv.visionplus.transaction.invoice_detail.model.TPatientInformation;

/**
 *
 * @author kasun
 */
public class InvoiceDetailForm extends AbstractTransactionForm<TPatientInformation> {

    private InvoiceDetails invoiceDetail;

    public InvoiceDetailForm() {
    }

    protected AbstractTransactionFormService<TPatientInformation> getTransactionFormService() {
        return new InvoiceDetailService();
    }

    protected AbstractObjectCreator<TPatientInformation> getObjectCreator() {
        invoiceDetail = new InvoiceDetails(this);
        return invoiceDetail;
    }

    public void doSave() {
        super.doSave();

    }
}
