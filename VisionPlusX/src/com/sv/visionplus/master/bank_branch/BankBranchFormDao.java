/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.master.bank_branch;

import com.sv.visionplus.base.master.AbstractMasterFormDAO;
import com.sv.visionplus.master.bank_branch.model.MBankBranch;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author KAZA
 */
public class BankBranchFormDao extends AbstractMasterFormDAO<MBankBranch> {

     private QueryUtil<MBankBranch> queryUtil;

    public BankBranchFormDao() {
        this.queryUtil = QueryUtil.getInstance(MBankBranch.class);
    }
    @Override
    public void save(Connection connection, MBankBranch bankBranch) throws SQLException {
        queryUtil.executeInsert(connection, bankBranch);
    }

    @Override
    public void update(Connection connection, MBankBranch bankBranch) throws SQLException {
        queryUtil.executeUpdate(connection, bankBranch, "code=?", bankBranch.getCode());
    }

    @Override
    public void delete(Connection connection, MBankBranch bankBranch) throws SQLException {
        queryUtil.executeDelete(connection, "code=?", bankBranch.getCode());
    }

    @Override
    public List<MBankBranch> getSearchResult(Connection connection, String text) throws SQLException {
        return queryUtil.executeSelect(connection);
    }
    
}
