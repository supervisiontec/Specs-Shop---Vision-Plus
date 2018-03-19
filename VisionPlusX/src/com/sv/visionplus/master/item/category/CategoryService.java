package com.sv.visionplus.master.item.category;

import com.sv.visionplus.master.item.category.model.MCategory;
import com.sv.visionplus.system.exception.VPException;
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
public class CategoryService {

    public static CategoryService INSTANCE;

    public static CategoryService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CategoryService();
        }
        return INSTANCE;
    }

    public CategoryService() {

    }

    public int save(MCategory category) {
        int save = 0;
        try {
            Connection connection = DatabaseUtil.getInstance().openConnection();
            save = CategoryFormDAO.getInstance().save(connection, category);
        } catch (SQLException ex) {
            Logger.getLogger(CategoryService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return save;
    }

    public List<MCategory> getAllCategory() {
        List<MCategory> allCategory = new ArrayList<>();
        try {
            Connection connection = DatabaseUtil.getInstance().openConnection();
            allCategory = CategoryFormDAO.getInstance().getAllCategory(connection);
        } catch (SQLException ex) {
            Logger.getLogger(CategoryService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return allCategory;
    }

    public List<MCategory> getSearchResult(String text) {
        List<MCategory> categorys = new ArrayList<>();
        try {
            Connection connection = DatabaseUtil.getInstance().openConnection();
            categorys = CategoryFormDAO.getInstance().getSearchResult(connection, text);
        } catch (SQLException ex) {
            Logger.getLogger(CategoryService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return categorys;
    }

}
