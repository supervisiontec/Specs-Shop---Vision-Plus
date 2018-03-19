package com.sv.visionplus.master.item;

import com.sv.visionplus.base.master.AbstractMasterFormDAO;
import com.sv.visionplus.base.master.AbstractMasterFormGUI;
import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.master.item.model.MItem;
import com.sv.visionplus.master.item.model.MItemMix;
import com.sv.visionplus.util.component.table.CTableColumn;
import com.sv.visionplus.util.component.table.CTableModel;

/**
 *
 * @author Mohan
 */
public class ItemFormGUI extends AbstractMasterFormGUI<MItemMix>{

    @Override
    protected CTableModel<MItemMix> getTableModel() {
        return new CTableModel<>(
                new CTableColumn("Code", "code"),
                new CTableColumn("Brand", "brandName"),
                new CTableColumn("Category", "categoryName"),
                new CTableColumn("Description", "name"),
                new CTableColumn("Sale Price", "salePrice"),
                new CTableColumn("Cost Price", "costPrice"),
                new CTableColumn("Re-Order Qty", "reOrderQty")
        );
    }

    @Override
    protected AbstractMasterFormDAO<MItemMix> getMasterFormDAO() {
        return new ItemFormDAO();
    }

    @Override
    protected AbstractObjectCreator<MItemMix> getObjectCreator() {
        return new PCItem();
    }
    
}
