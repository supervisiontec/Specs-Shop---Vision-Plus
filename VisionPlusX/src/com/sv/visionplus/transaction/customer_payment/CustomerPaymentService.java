/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.customer_payment;

import com.sv.visionplus.base.transaction.AbstractTransactionFormService;
import com.sv.visionplus.system.exception.VPException;
import com.sv.visionplus.transaction.customer_payment.model.CustomerPaymentMix;
import javax.swing.JOptionPane;

/**
 *
 * @author KAZA
 */
public class CustomerPaymentService extends AbstractTransactionFormService<CustomerPaymentMix> {

    @Override
    protected CustomerPaymentMix select(Integer indexNo) throws VPException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void save(CustomerPaymentMix mix) throws VPException {
        if (mix != null) {
            if (mix.getPayment().getTotalAmont() > 0) {

                String paymentId = CustomerPaymentDAO.getInstance().saveCustomerPayment(mix);
                if (paymentId != null) {
                    JOptionPane.showMessageDialog(null, paymentId + " customer payment save successfilly.");
                } else {
                    JOptionPane.showMessageDialog(null, "Save fail..");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Check ur Payment Detail and try again.. ");

            }
        } else {
            JOptionPane.showMessageDialog(null, "Empty Method..");
        }
    }

    @Override
    protected void update(CustomerPaymentMix mix) throws VPException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void delete(CustomerPaymentMix mix) throws VPException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
