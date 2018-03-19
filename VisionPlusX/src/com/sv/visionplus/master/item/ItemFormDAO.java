/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.master.item;

import com.sv.visionplus.base.master.AbstractMasterFormDAO;
import com.sv.visionplus.master.item.brand.BrandFormDAO;
import com.sv.visionplus.master.item.brand.model.MBrand;
import com.sv.visionplus.master.item.category.CategoryFormDAO;
import com.sv.visionplus.master.item.category.model.MCategory;
import com.sv.visionplus.master.item.model.MItem;
import com.sv.visionplus.master.item.model.MItemMix;
import com.sv.visionplus.stock.stock_transfer.StockLedgerDAO;
import com.sv.visionplus.stock.stock_transfer.model.TStockLedger;
import com.sv.visionplus.util.database.QueryUtil;
import com.sv.visionplus.util.formatter.FormatterUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Date : Aug 24, 2016 Time : 12:19:51 AM
 *
 * @copyright : INCOSYZ
 * @author Nidura Prageeth
 */
public class ItemFormDAO extends AbstractMasterFormDAO<MItemMix> {

    private QueryUtil<MItem> queryUtil;

    public ItemFormDAO() {
        this.queryUtil = QueryUtil.getInstance(MItem.class);
    }

    @Override
    public void save(Connection connection, MItemMix mix) throws SQLException {

        int indexNo = ItemService.getInstance().saveItem(connection, mix);
        if (indexNo > 0) {
            JOptionPane.showMessageDialog(null, "Item Save SuccessFully..");
        }

    }

    @Override
    public void update(Connection connection, MItemMix mix) throws SQLException {
        MItem item = new MItem();
        item.setBrand(mix.getBrand());
        item.setCategory(mix.getCategory());
        item.setCode(mix.getCode());
        item.setName(mix.getName());
        item.setCostPrice(mix.getCostPrice());
        item.setIndexNo(mix.getIndexNo());
        item.setIsstockItem(mix.getIsstockItem());
        item.setReorderQty(mix.getReorderQty());
        item.setSalePrice(mix.getSalePrice());
        queryUtil.executeUpdate(connection, item, "index_no=?", mix.getIndexNo());
    }

    @Override
    public void delete(Connection connection, MItemMix mix) throws SQLException {
        queryUtil.executeDelete(connection, "index_no=?", mix.getIndexNo());
    }

    @Override
    public List<MItemMix> getSearchResult(Connection connection, String text) throws SQLException {
        text = "%" + text + "%";
        List<MItemMix> mix=new ArrayList<>();
        List<MItem> itemList = queryUtil.executeSelect(connection, "code LIKE ? OR name LIKE ? OR brand LIKE ? OR category LIKE ?", text, text, text, text);
        for (MItem mItem : itemList) {
            MBrand brand = BrandFormDAO.getInstance().getBrandFromIndex(connection, mItem.getBrand());
            MCategory category = CategoryFormDAO.getInstance().getCategoryFromIndex(connection, mItem.getCategory());
            MItemMix itemMix=new MItemMix();
            itemMix.setBrand(mItem.getBrand());
            itemMix.setBrandName(brand.getName());
            itemMix.setCategory(mItem.getCategory());
            itemMix.setCategoryName(category.getName());
            itemMix.setCode(mItem.getCode());
            itemMix.setCostPrice(mItem.getCostPrice());
            itemMix.setIndexNo(mItem.getIndexNo());
            itemMix.setIsstockItem(mItem.getIsstockItem());
            itemMix.setName(mItem.getName());
            itemMix.setReorderQty(mItem.getReorderQty());
            itemMix.setSalePrice(mItem.getSalePrice());
            
            mix.add(itemMix);
            
        }
        return mix;
    }

}
