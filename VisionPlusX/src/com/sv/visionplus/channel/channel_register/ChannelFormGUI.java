package com.sv.visionplus.channel.channel_register;

import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.base.master.AbstractMasterFormDAO;
import com.sv.visionplus.base.master.AbstractMasterFormGUI;
import com.sv.visionplus.channel.channel_register.model.ChannelModelMix;
import com.sv.visionplus.util.component.table.CTableColumn;
import com.sv.visionplus.util.component.table.CTableModel;

public class ChannelFormGUI
        extends AbstractMasterFormGUI<ChannelModelMix> {

    public ChannelFormGUI() {
    }

    @Override
    protected CTableModel<ChannelModelMix> getTableModel() {
        return new CTableModel(new CTableColumn[]{
            new CTableColumn("Doctor Name", "doctorName"),
            new CTableColumn("Patient Name", "patientName"),
            new CTableColumn("Contact No", "mobile"),
            new CTableColumn("Date", "date"),
            new CTableColumn("Channel Date", "channelDate"),
            new CTableColumn("Channel Id", "channelId"),
            new CTableColumn("Time", "time"),
            new CTableColumn("Amount", "amount"),
            new CTableColumn("Pay 1", "payAmount"),
            new CTableColumn("Pay 2", "payAmount2"),
            new CTableColumn("Over Pay", "overPayAmount"),
            new CTableColumn("Refund", "refundAmount"),
            new CTableColumn("Is Present", "isPresent")
        });
    }

    @Override
    protected AbstractMasterFormDAO<ChannelModelMix> getMasterFormDAO() {
        return new ChannelFormDAO();
    }

    @Override
    protected AbstractObjectCreator<ChannelModelMix> getObjectCreator() {
        return new PCChannel();
    }
}
