package com.sv.visionplus.transaction.grn.dialog.item.model;

import com.sv.visionplus.util.database.annotation.VPTable;

/**
 * @author Nidura Prageeth
 */
@VPTable("grn_search_item")
public class ItemMix {

    private Integer index_no;
    private String code;
    private String item_name;
    private String brand_name;
    private String category_name;
    private Double sale_price;
    private Double cost_price;
    private boolean isstock_item;
    private double bal_qty;

    public Integer getIndex_no() {
        return index_no;
    }

    public void setIndex_no(Integer index_no) {
        this.index_no = index_no;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public Double getSale_price() {
        return sale_price;
    }

    public void setSale_price(Double sale_price) {
        this.sale_price = sale_price;
    }

    public Double getCost_price() {
        return cost_price;
    }

    public void setCost_price(Double cost_price) {
        this.cost_price = cost_price;
    }

    public boolean isIsstock_item() {
        return isstock_item;
    }

    public void setIsstock_item(boolean isstock_item) {
        this.isstock_item = isstock_item;
    }

    public Double getBalQty() {
        return bal_qty;
    }

    public void setBalQty(Double bal_qty) {
        this.bal_qty = bal_qty;
    }

    
}
