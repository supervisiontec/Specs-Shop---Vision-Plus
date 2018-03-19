package com.sv.visionplus.transaction.grn.dialog.item;

import com.sv.visionplus.transaction.grn.dialog.item.model.ItemMix;
import com.sv.visionplus.transaction.grn.dialog.item.model.MItem;
import com.sv.visionplus.util.database.DatabaseUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Nidura Prageeth
 */
public class ItemService {

    private Connection connection;
    public static ItemService INSTANCE;

    public static ItemService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ItemService();
        }
        return INSTANCE;
    }

    public ItemService() {
        try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ItemService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public List<ItemMix> getSearchResult(ItemMix item) {
        
        List<ItemMix> list = new ArrayList<>();
        try {
            list = ItemFormDAO.getInstance().getSearchResult(connection, item);
        } catch (SQLException ex) {
            Logger.getLogger(ItemService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
