/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.master.item.model;

/**
 *
 * @author Supervision
 */
public class MItemMix {
    private Integer indexNo;
    private Integer brand;
    private Integer category;
    private String code;
    private String name;
    private Double salePrice;
    private Double costPrice;
    private Integer reorderQty;
    private Boolean isstockItem;
    private String brandName;
    private String categoryName;

    public MItemMix() {
    }

    public MItemMix(Integer indexNo, Integer brand, Integer category, String code, String name, Double salePrice, Double costPrice, Integer reorderQty, Boolean isstockItem, String brandName, String categoryName) {
        this.indexNo = indexNo;
        this.brand = brand;
        this.category = category;
        this.code = code;
        this.name = name;
        this.salePrice = salePrice;
        this.costPrice = costPrice;
        this.reorderQty = reorderQty;
        this.isstockItem = isstockItem;
        this.brandName = brandName;
        this.categoryName = categoryName;
    }

    public Integer getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public Integer getBrand() {
        return brand;
    }

    public void setBrand(Integer brand) {
        this.brand = brand;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
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

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
    }

    public Integer getReorderQty() {
        return reorderQty;
    }

    public void setReorderQty(Integer reorderQty) {
        this.reorderQty = reorderQty;
    }

    public Boolean getIsstockItem() {
        return isstockItem;
    }

    public void setIsstockItem(Boolean isstockItem) {
        this.isstockItem = isstockItem;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    
}
