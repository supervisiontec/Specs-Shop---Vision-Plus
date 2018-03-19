/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.master.user;

import com.sv.visionplus.base.master.AbstractMasterFormDAO;
import com.sv.visionplus.base.master.AbstractMasterFormGUI;
import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.util.component.table.CTableColumn;
import com.sv.visionplus.util.component.table.CTableModel;
import visionplusx.model.MUser;

/**
 *
 * @author Mohan
 */
public class UserFormGUI extends AbstractMasterFormGUI<MUser>{

    @Override
    protected CTableModel<MUser> getTableModel() {
         return new CTableModel<>(
                new CTableColumn("Name", "name"),
                new CTableColumn("User Name", "userName"),
                new CTableColumn("Password", "password"),
                new CTableColumn("Type", "type")
        );
    }

    @Override
    protected AbstractMasterFormDAO<MUser> getMasterFormDAO() {
        return new UserFormDao() ;
    
    }

    @Override
    protected AbstractObjectCreator<MUser> getObjectCreator() {
        return new PCUser();
    }
    
}
