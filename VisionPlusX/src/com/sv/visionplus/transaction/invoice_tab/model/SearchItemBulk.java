package com.sv.visionplus.transaction.invoice_tab.model;

import com.sv.visionplus.util.database.annotation.VPTable;






@VPTable("search_item_b")
public class SearchItemBulk
{
  private Integer index_no;
  private String code;
  private String item_name;
  private String brand_name;
  private String category_name;
  private double sale_price;
  private double cost_price;
  private boolean isstock_item;
  private double bal_qty;
  
  public SearchItemBulk() {}
  
  public Integer getIndex_no()
  {
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
  
  public String getName() {
    return item_name;
  }
  
  public void setName(String name) {
    item_name = name;
  }
  
  public String getBrand() {
    return brand_name;
  }
  
  public void setBrand(String brand) {
    brand_name = brand;
  }
  
  public String getCategory() {
    return category_name;
  }
  
  public void setCategory(String category) {
    category_name = category;
  }
  
  public double getSales_price() {
    return sale_price;
  }
  
  public void setSales_price(double sales_price) {
    sale_price = sales_price;
  }
  
  public double getCost_price() {
    return cost_price;
  }
  
  public void setCost_price(double cost_price) {
    this.cost_price = cost_price;
  }
  
  public boolean isIsstock_item() {
    return isstock_item;
  }
  
  public void setIsstock_item(boolean isstock_item) {
    this.isstock_item = isstock_item;
  }
  
  public double getBal_qty() {
    return bal_qty;
  }
  
  public void setBal_qty(double bal_qty) {
    this.bal_qty = bal_qty;
  }
}
