package com.sv.visionplus.transaction.customer_payment.model;

import com.sv.visionplus.util.database.annotation.VPId;
import com.sv.visionplus.util.database.annotation.VPTable;

/**
 *
 * @author KAZA
 */
@VPTable("t_cheque_details")
public class TChequeDetail {
    
    @VPId
    private Integer indexNo;
    private Integer payment;
    private Integer bankBranch;
    private Integer chequeNo;
    private double amount;

    public Integer getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    public Integer getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(Integer bankBranch) {
        this.bankBranch = bankBranch;
    }

    public Integer getChequeNo() {
        return chequeNo;
    }

    public void setChequeNo(Integer chequeNo) {
        this.chequeNo = chequeNo;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

   
}
