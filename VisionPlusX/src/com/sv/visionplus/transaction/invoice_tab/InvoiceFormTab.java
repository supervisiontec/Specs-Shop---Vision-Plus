package com.sv.visionplus.transaction.invoice_tab;

import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.base.transaction.AbstractTransactionForm;
import com.sv.visionplus.base.transaction.AbstractTransactionFormService;
import com.sv.visionplus.transaction.invoice_tab.model.InvoiceMix;

public class InvoiceFormTab
        extends AbstractTransactionForm<InvoiceMix> {

    private PCInvoiceTab invoice;

    public InvoiceFormTab() {
    }

    protected AbstractTransactionFormService<InvoiceMix> getTransactionFormService() {
        return new InvoiceService();
    }

    protected AbstractObjectCreator<InvoiceMix> getObjectCreator() {
        invoice = new PCInvoiceTab(this);
        return invoice;
    }

    public void doSave() {
        super.doSave();

    }
}
