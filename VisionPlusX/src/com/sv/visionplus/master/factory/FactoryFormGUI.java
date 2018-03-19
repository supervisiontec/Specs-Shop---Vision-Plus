package com.sv.visionplus.master.factory;

import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.base.master.AbstractMasterFormDAO;
import com.sv.visionplus.base.master.AbstractMasterFormGUI;
import com.sv.visionplus.master.factory.model.Factory;
import com.sv.visionplus.util.component.table.CTableColumn;
import com.sv.visionplus.util.component.table.CTableModel;

/**
 * @author Nidura Prageeth
 */
public class FactoryFormGUI extends AbstractMasterFormGUI<Factory> {

    @Override
    protected CTableModel<Factory> getTableModel() {
        return new CTableModel<>(
                new CTableColumn("Name", "name"),
                new CTableColumn("Address", "address"),
                new CTableColumn("Contact No.", "contactNo")
        );
    }

    @Override
    protected AbstractMasterFormDAO<Factory> getMasterFormDAO() {
        return new FactoryFormDAO();
    }

    @Override
    protected AbstractObjectCreator<Factory> getObjectCreator() {
        return new PCFactory();
    }

}
