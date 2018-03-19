package com.sv.visionplus.master.item.brand;

import com.sv.visionplus.master.item.brand.model.MBrand;
import com.sv.visionplus.system.exception.VPException;
import com.sv.visionplus.util.database.DatabaseUtil;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Date : Aug 29, 2016 Time : 5:41:59 PM
 *
 * @copyright : INCOSYZ
 * @author Nidura Prageeth
 */
public class BrandService {

    public static BrandService INSTANCE;

    public static BrandService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new BrandService();
        }
        return INSTANCE;
    }

    public BrandService() {

    }

    public int save(MBrand brand) {
        int save = 0;
        try {
            Connection connection = DatabaseUtil.getInstance().openConnection();
            save = BrandFormDAO.getInstance().save(connection, brand);
        } catch (SQLException ex) {
            Logger.getLogger(BrandService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return save;
    }

    public List<MBrand> getAllBrands() {
        List<MBrand> allBrands = new ArrayList<>();
        try {
            Connection connection = DatabaseUtil.getInstance().openConnection();
            allBrands = BrandFormDAO.getInstance().getAllBrands(connection);
        } catch (SQLException ex) {
            Logger.getLogger(BrandService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return allBrands;
    }

    public List<MBrand> getSearchResult(String text) {
        List<MBrand> brands = new ArrayList<>();
        try {
            Connection connection = DatabaseUtil.getInstance().openConnection();
            brands = BrandFormDAO.getInstance().getSearchResult(connection, text);
        } catch (SQLException ex) {
            Logger.getLogger(BrandService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return brands;
    }

}
