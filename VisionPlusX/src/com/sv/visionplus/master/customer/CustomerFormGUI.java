/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.master.customer;

import com.sv.visionplus.base.master.AbstractMasterFormDAO;
import com.sv.visionplus.base.master.AbstractMasterFormGUI;
import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.master.customer.model.MCustomer;
import com.sv.visionplus.util.component.table.CTableColumn;
import com.sv.visionplus.util.component.table.CTableModel;

/**
 *
 * @author Mohan
 */
public class CustomerFormGUI extends AbstractMasterFormGUI<MCustomer> {

    @Override
    protected CTableModel<MCustomer> getTableModel() {
        return new CTableModel<>(
                new CTableColumn("Name", "name"),
                new CTableColumn("NIC", "nic"),
                new CTableColumn("Address", "address"),
                new CTableColumn("Contact No.", "contactNo")
        );
    }

    @Override
    protected AbstractMasterFormDAO<MCustomer> getMasterFormDAO() {
        return new CustomerFormDAO();
    }

    @Override
    protected AbstractObjectCreator<MCustomer> getObjectCreator() {
        return new PCCustomer();
    }
}
