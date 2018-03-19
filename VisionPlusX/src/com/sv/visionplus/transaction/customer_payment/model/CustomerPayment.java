package com.sv.visionplus.transaction.customer_payment.model;

import com.sv.visionplus.util.database.annotation.VPTable;
import java.util.Date;

/**
 *
 * @author KAZA
 */
@VPTable("customer_payment")
public class CustomerPayment {

    private Date date;
    private Integer payment;
    private Integer invoice;
    private Boolean isAdvance;

    public Boolean getIsAdvance() {
        return isAdvance;
    }

    public void setIsAdvance(Boolean isAdvance) {
        this.isAdvance = isAdvance;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    public Integer getInvoice() {
        return invoice;
    }

    public void setInvoice(Integer invoice) {
        this.invoice = invoice;
    }

}
