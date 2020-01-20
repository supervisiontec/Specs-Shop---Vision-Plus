package com.sv.visionplus.transaction.invoice_tab;

import com.sv.visionplus.base.transaction.AbstractTransactionFormService;
import com.sv.visionplus.system.exception.VPException;
import com.sv.visionplus.transaction.invoice_tab.dialog.Invoice_Payment.InvoicePayment;
import com.sv.visionplus.transaction.invoice_tab.model.InvoiceMix;
import javax.swing.JOptionPane;

public class InvoiceService
        extends AbstractTransactionFormService<InvoiceMix> {

    public InvoiceService() {
    }

    protected InvoiceMix select(Integer indexNo)
            throws VPException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    protected void save(InvoiceMix invoiceMix) throws VPException {
        if (invoiceMix != null) {
            if (invoiceMix.getInvoice().getStatus2().equals("EDITED INVOICE")) {
                InvoiceDAO.getInstance().saveInvoice(invoiceMix);
            } 
            else if (invoiceMix.getInvoice().getStatus2().equals("DELETED INVOICE")) {
                InvoiceDAO.getInstance().saveInvoice(invoiceMix);
            } 
            else {
                InvoicePayment payment = new InvoicePayment(null, true);
                payment.setValue(invoiceMix);
                payment.setModal(true);
                payment.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Transaction password is worng..","Error Message",JOptionPane.ERROR_MESSAGE);
        }
    }

    protected void update(InvoiceMix object)
            throws VPException {
        JOptionPane.showMessageDialog(null, "click new button > select Invoice > change > select edit invoice checkbox > click save button","Error Message",JOptionPane.ERROR_MESSAGE);
    }

    protected void delete(InvoiceMix mix) throws VPException {
        JOptionPane.showMessageDialog(null, "sorry , anyone no permission to delete Invoice","Error Message",JOptionPane.ERROR_MESSAGE);
    }
}
