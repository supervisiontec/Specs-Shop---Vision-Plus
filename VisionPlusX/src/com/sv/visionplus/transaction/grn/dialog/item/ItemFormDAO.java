package com.sv.visionplus.transaction.grn.dialog.item;

import com.sv.visionplus.transaction.grn.dialog.item.model.ItemMix;
import com.sv.visionplus.transaction.grn.dialog.item.model.MItem;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Nidura Prageeth
 */
public class ItemFormDAO {

    public static ItemFormDAO INSTANCE;
    private QueryUtil<ItemMix> queryUtil;

    public static ItemFormDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ItemFormDAO();
        }
        return INSTANCE;
    }

    public ItemFormDAO() {
        this.queryUtil = QueryUtil.getInstance(ItemMix.class);
    }

    public List<ItemMix> getSearchResult(Connection connection, ItemMix items ) throws SQLException {
        return queryUtil.executeSelect(connection, "code Like ? and item_name Like ? and brand_name Like ? and category_name Like ?", "%"+items.getCode()+"%","%"+items.getItem_name()+"%","%"+items.getBrand_name()+"%","%"+items.getCategory_name()+"%");
    }

}
