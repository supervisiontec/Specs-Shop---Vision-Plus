/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.supplier_payment;

import com.sv.visionplus.base.transaction.AbstractTransactionFormService;
import com.sv.visionplus.system.exception.VPException;
import com.sv.visionplus.transaction.supplier_payment.model.SupplierPaymentMix;
import javax.swing.JOptionPane;

/**
 *
 * @author KAZA
 */
public class SupplierPaymentService extends AbstractTransactionFormService<SupplierPaymentMix>{

    

    @Override
    protected SupplierPaymentMix select(Integer indexNo) throws VPException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void save(SupplierPaymentMix mix) throws VPException {
        int recNo = SupplierPaymentDAO.getInstance().saveSupplierPayment(mix);
        if (recNo>0) {
            JOptionPane.showMessageDialog(null, "Supplier Payment Saved Successfully..");
        }else{
            JOptionPane.showMessageDialog(null, "Supplier Payment Saved Fail..");
        
        }
    
    }

    @Override
    protected void update(SupplierPaymentMix object) throws VPException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void delete(SupplierPaymentMix object) throws VPException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
