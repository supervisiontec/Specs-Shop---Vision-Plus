/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.supplier_payment.model;

import com.sv.visionplus.util.database.annotation.VPTable;

/**
 *
 * @author KAZA
 */
@VPTable("search_grn_item")
public class GrnItemMix {
    
    private Integer grn_no;
    private String code;
    private String name;
    private String brand;
    private String category;
    private double unit_price;
    private double qty;
    private double value;
    private double discount;
    private double net_value;

    public Integer getGrnNo() {
        return grn_no;
    }

    public void setGrnNo(Integer grnNo) {
        this.grn_no = grnNo;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(double unit_price) {
        this.unit_price = unit_price;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getNet_value() {
        return net_value;
    }

    public void setNet_value(double net_value) {
        this.net_value = net_value;
    }
    
    
    
    
}
