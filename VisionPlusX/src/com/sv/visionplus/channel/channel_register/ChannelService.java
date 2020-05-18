package com.sv.visionplus.channel.channel_register;

import com.sv.visionplus.channel.channel_register.model.ChannelModel;
import com.sv.visionplus.channel.channel_register.model.ChannelModelMix;
import com.sv.visionplus.util.database.DatabaseUtil;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChannelService {

    private static ChannelService INSTANCE;
    private final QueryUtil<ChannelModel> Query;
    private Connection connection;

    public static ChannelService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ChannelService();
        }

        return INSTANCE;
    }

    public ChannelService() {
        Query = QueryUtil.getInstance(ChannelModel.class);
    }

    int saveItem(Connection connection, ChannelModelMix mix) {
        ChannelModel item = new ChannelModel();
        item.setAmount(mix.getAmount());
        item.setPayAmount(mix.getPayAmount());
        item.setChannel_date(mix.getChannelDate());
        item.setChannel_id(mix.getChannelId());
        item.setDate(mix.getDate());
        item.setDoctor_id(mix.getDoctorId());
        item.setIndex_no(mix.getIndexNo());
        item.setTime(mix.getTime());
        item.setPatient_name(mix.getPatientName());
        item.setMobile(mix.getMobile());
        item.setOverPayAmount(mix.getOverPayAmount());
        item.setOverPayRemarks(mix.getOverPayRemarks());
        item.setPayAmount2(mix.getPayAmount2());
        item.setDate2(mix.getPayDate2());
        item.setRefundAmount(mix.getRefundAmount());
        item.setRefundDate(mix.getRefundDate());
        item.setRefundRemarks(mix.getRefundRemarks());
        item.setIsPresent(mix.isIsPresent() ? 1 : 0);
        try {
            return Query.executeInsert(connection, item);
        } catch (SQLException ex) {
            Logger.getLogger(ChannelService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    int updateItem(Connection connection, ChannelModelMix mix) {
        ChannelModel item = new ChannelModel();
        item.setAmount(mix.getAmount());
        item.setChannel_date(mix.getChannelDate());
        item.setChannel_id(mix.getChannelId());
        item.setDate(mix.getDate());
        item.setDoctor_id(mix.getDoctorId());
        item.setIndex_no(mix.getIndexNo());
        item.setTime(mix.getTime());
        item.setPatient_name(mix.getPatientName());
        item.setMobile(mix.getMobile());
        item.setOverPayAmount(mix.getOverPayAmount());
        item.setOverPayRemarks(mix.getOverPayRemarks());
        item.setPayAmount2(mix.getPayAmount2());
        item.setPayAmount(mix.getPayAmount());
        item.setDate2(mix.getPayDate2());
        item.setRefundAmount(mix.getRefundAmount());
        item.setRefundDate(mix.getRefundDate());
        item.setRefundRemarks(mix.getRefundRemarks());
        item.setIsPresent(mix.isIsPresent() ? 1 : 0);
        try {
            return Query.executeUpdate(connection, item, "index_no=?", new Object[]{item.getIndex_no()});
        } catch (SQLException ex) {
            Logger.getLogger(ChannelService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    int deleteItem(Connection connection, ChannelModelMix mix) {
        try {
            return Query.executeDelete(connection, "index_no=?", new Object[]{mix.getIndexNo()});
        } catch (SQLException ex) {
            Logger.getLogger(ChannelService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    List<ChannelModel> searchItem(Connection connection, String text) {
        text = "%" + text + "%";
        try {
            List<ChannelModel> list = Query.executeSelect(connection, "channel_date LIKE ? OR amount LIKE ? or patient_name LIKE ? ", new Object[]{text , text , text});

            return list;
        } catch (SQLException ex) {
            Logger.getLogger(ChannelService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    List<ChannelModel> searchChannel(String formatDate) {
        List<ChannelModel> list = new ArrayList();
        try {
            Connection connection = DatabaseUtil.getInstance().openConnection();
            list = Query.executeSelect(connection, "channel_date=?", new Object[]{formatDate});
        } catch (SQLException ex) {
            Logger.getLogger(ChannelService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
