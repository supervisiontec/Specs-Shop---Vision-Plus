/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.check_In.model;
/**
 * Date : Aug 26, 2016 Time : 10:16:01 AM
 *
 * @copyright : INCOSYZ
 * @author Nidura Prageeth
 */
public class InvoiceMix {

    private TInvoice invoice;
    private TInvoiceItem invoiceItem;
    private Status status;
    private MFactory factory;

    public TInvoice getInvoice() {
        return invoice;
    }

    public void setInvoice(TInvoice invoice) {
        this.invoice = invoice;
    }

    public TInvoiceItem getInvoiceItem() {
        return invoiceItem;
    }

    public void setInvoiceItem(TInvoiceItem invoiceItem) {
        this.invoiceItem = invoiceItem;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public MFactory getFactory() {
        return factory;
    }

    public void setFactory(MFactory factory) {
        this.factory = factory;
    }

    
    
}
