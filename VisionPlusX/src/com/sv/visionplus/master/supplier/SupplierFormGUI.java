/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.master.supplier;

import com.sv.visionplus.base.master.AbstractMasterFormDAO;
import com.sv.visionplus.base.master.AbstractMasterFormGUI;
import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.master.supplier.model.MSupplier;
import com.sv.visionplus.util.component.table.CTableColumn;
import com.sv.visionplus.util.component.table.CTableModel;

/**
 *
 * @author Mohan
 */
public class SupplierFormGUI extends AbstractMasterFormGUI<MSupplier> {

    @Override
    protected CTableModel<MSupplier> getTableModel() {
        return new CTableModel<>(
                new CTableColumn("Name", "name"),
                new CTableColumn("Contact No.", "contactNo"),
                new CTableColumn("Email", "email"),
                new CTableColumn("Contact Name", "contactName"),
                new CTableColumn("Address", "address")
        );
    }

    @Override
    protected AbstractMasterFormDAO<MSupplier> getMasterFormDAO() {
        return new SupplierFormDAO();
    }

    @Override
    protected AbstractObjectCreator<MSupplier> getObjectCreator() {
        return new PCSupplier();
    }

}
