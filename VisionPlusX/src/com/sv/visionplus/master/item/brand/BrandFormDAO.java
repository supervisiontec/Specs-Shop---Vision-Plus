package com.sv.visionplus.master.item.brand;

import com.sv.visionplus.base.master.AbstractMasterFormDAO;
import com.sv.visionplus.master.item.brand.model.MBrand;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Date : Aug 29, 2016 Time : 4:44:58 PM
 *
 * @copyright : INCOSYZ
 * @author Nidura Prageeth
 */
public class BrandFormDAO {

    public static BrandFormDAO INSTANCE;
    private QueryUtil<MBrand> queryUtil;

    public static BrandFormDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new BrandFormDAO();
        }
        return INSTANCE;
    }

    public BrandFormDAO() {
        this.queryUtil = QueryUtil.getInstance(MBrand.class);
    }

    public int save(Connection connection, MBrand brand) throws SQLException {
        MBrand brands = queryUtil.executeUniqueSelect(connection, "name=?", brand.getName());
        if (brands != null) {
            return -1;
        }
        queryUtil.executeInsert(connection, brand);
        brands = queryUtil.executeUniqueSelect(connection, "name=?", brand.getName());
        return brands.getIndexNo();
    }

    public void update(Connection connection, MBrand brand) throws SQLException {
        queryUtil.executeUpdate(connection, brand, "name=?", brand.getName());
    }

    public void delete(Connection connection, MBrand brand) throws SQLException {
        queryUtil.executeDelete(connection, "name=?", brand.getName());
    }

    public List<MBrand> getAllBrands(Connection connection) throws SQLException {
        return queryUtil.executeSelect(connection);
    }
    
    public MBrand getBrandFromIndex(Connection connection,Integer index) throws SQLException {
        return queryUtil.executeUniqueSelect(connection, "index_no=?", index);
    }

    public List<MBrand> getSearchResult(Connection connection, String text) throws SQLException {
        text = "%" + text + "%";
        return queryUtil.executeSelect(connection, "name LIKE ?", text);
    }

}
