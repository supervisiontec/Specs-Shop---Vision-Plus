package com.sv.visionplus.master.item.category;

import com.sv.visionplus.master.item.category.model.MCategory;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Locale.Category;

/**
 * Date : Aug 29, 2016 Time : 7:15:28 PM
 *
 * @copyright : INCOSYZ
 * @author Nidura Prageeth
 */
public class CategoryFormDAO {

    public static CategoryFormDAO INSTANCE;
    private QueryUtil<MCategory> queryUtil;

    public static CategoryFormDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CategoryFormDAO();
        }
        return INSTANCE;
    }

    public CategoryFormDAO() {
        this.queryUtil = QueryUtil.getInstance(MCategory.class);
    }

    public int save(Connection connection, MCategory category) throws SQLException {
        MCategory categorys = queryUtil.executeUniqueSelect(connection, "name=?", category.getName());
        if (categorys != null) {
            return -1;
        }

        queryUtil.executeInsert(connection, category);
        categorys = queryUtil.executeUniqueSelect(connection, "name=?", category.getName());
        return categorys.getIndexNo();
    }

    public List<MCategory> getAllCategory(Connection connection) throws SQLException {
        return queryUtil.executeSelect(connection);
    }

    public List<MCategory> getSearchResult(Connection connection, String text) throws SQLException {
        text = "%" + text + "%";
        return queryUtil.executeSelect(connection, "name LIKE ?", text);
    }
    public MCategory getCategoryFromIndex(Connection connection,Integer index) throws SQLException {
        return queryUtil.executeUniqueSelect(connection, "index_no=?", index);
    }
}
