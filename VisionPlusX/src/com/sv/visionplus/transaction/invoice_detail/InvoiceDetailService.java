package com.sv.visionplus.transaction.invoice_detail;

import com.sv.visionplus.base.transaction.AbstractTransactionFormService;
import com.sv.visionplus.system.exception.VPException;
import com.sv.visionplus.transaction.invoice_detail.model.TPatientInformation;

public class InvoiceDetailService
        extends AbstractTransactionFormService<TPatientInformation> {

    public InvoiceDetailService() {
    }

    @Override
    protected TPatientInformation select(Integer indexNo)
            throws VPException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    protected void save(TPatientInformation detail) throws VPException {
        InvoiceDetailDAO.getInstance().saveInvoice(detail);
    }

    @Override
    protected void update(TPatientInformation object)
            throws VPException {
    }

    @Override
    protected void delete(TPatientInformation mix) throws VPException {
    }
}
