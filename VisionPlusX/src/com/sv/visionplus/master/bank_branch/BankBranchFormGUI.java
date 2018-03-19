/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.master.bank_branch;

import com.sv.visionplus.base.master.AbstractMasterFormDAO;
import com.sv.visionplus.base.master.AbstractMasterFormGUI;
import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.master.bank_branch.model.MBankBranch;
import com.sv.visionplus.util.component.table.CTableColumn;
import com.sv.visionplus.util.component.table.CTableModel;

/**
 *
 * @author Mohan
 */
public class BankBranchFormGUI extends AbstractMasterFormGUI<MBankBranch>  {

    @Override
    protected CTableModel<MBankBranch> getTableModel() {
         return new CTableModel<>(
                new CTableColumn("Code", "code"),
                new CTableColumn("Bank", "bank"),
                new CTableColumn("Branch", "branch")
        );
    }

    @Override
    protected AbstractMasterFormDAO<MBankBranch> getMasterFormDAO() {
        return new BankBranchFormDao();
    }

    @Override
    protected AbstractObjectCreator<MBankBranch> getObjectCreator() {
        return new PCBankBranch();
    }
    
}
