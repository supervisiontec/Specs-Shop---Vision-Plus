package com.sv.visionplus.transaction.check_In.model;

import com.sv.visionplus.transaction.invoice.model.*;
import com.sv.visionplus.util.database.annotation.VPTable;

/**
 * Date : Aug 26, 2016 Time : 10:36:05 AM
 *
 * @copyright : INCOSYZ
 * @author Nidura Prageeth
 */
@VPTable("t_invoice_item1")
public class TInvoiceItem {

    private Integer indexNo;
    private Integer item;
    private Integer invoice;
    private Double unitPrice;
    private Integer qty;
    private Double value;
    private Double discount;
    private Double netValue;

    public Integer getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }

    public Integer getInvoice() {
        return invoice;
    }

    public void setInvoice(Integer invoice) {
        this.invoice = invoice;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getNetValue() {
        return netValue;
    }

    public void setNetValue(Double netValue) {
        this.netValue = netValue;
    }
}
