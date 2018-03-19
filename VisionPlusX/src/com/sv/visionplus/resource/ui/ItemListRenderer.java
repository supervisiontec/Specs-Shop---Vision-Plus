/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.resource.ui;

import com.sv.visionplus.transaction.invoice.dialog.Item.SearchItemMixModel;
import java.awt.Component;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Mohan
 */
public class ItemListRenderer implements ListCellRenderer<SearchItemMixModel> {

    @Override
    public Component getListCellRendererComponent(JList<? extends SearchItemMixModel> list, SearchItemMixModel value, int index, boolean isSelected, boolean cellHasFocus) {
        return new InvoiceItemCell((value instanceof SearchItemMixModel ? value : null), isSelected);
    }

    
}
