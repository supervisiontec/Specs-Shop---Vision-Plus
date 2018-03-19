package com.sv.visionplus.util.payment;

import com.sv.visionplus.util.payment.model.TPayment;

/**
 *
 * @author Mohan
 */
//XXX:KASUN
public class PaymentUtil {

    private final PaymentDialog paymentDialog;
    private static PaymentUtil INSTANCE;

    //singleton instance of PaymentUtil
    public static final PaymentUtil getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PaymentUtil();
        }
        return INSTANCE;
    }

    //constructor private, init final local field PaymentDialog
    private PaymentUtil() {
        this.paymentDialog = PaymentDialog.getInstance();
    }

//    private PaymentUtil(TPayment payment) {
//        this.paymentDialog = PaymentDialog.getInstance();
//    }
}
