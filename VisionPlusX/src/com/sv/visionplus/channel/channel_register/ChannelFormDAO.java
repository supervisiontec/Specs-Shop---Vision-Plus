package com.sv.visionplus.channel.channel_register;

import com.sv.visionplus.base.master.AbstractMasterFormDAO;
import com.sv.visionplus.channel.channel_register.model.ChannelModel;
import com.sv.visionplus.channel.channel_register.model.ChannelModelMix;
import com.sv.visionplus.channel.doctor.DoctorFormDao;
import com.sv.visionplus.channel.doctor.model.DoctorModel;
import static com.sv.visionplus.report.report_file.ReportFiles.*;
import com.sv.visionplus.report.report_panel;
import com.sv.visionplus.util.database.QueryUtil;
import com.sv.visionplus.util.formatter.FormatterUtil;
import com.sv.visionplus.util.sms.SmsSender;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import visionplusx.Home;
import visionplusx.logFile.LogFileDAO;
import visionplusx.logFile.LogFileModel;

public class ChannelFormDAO extends AbstractMasterFormDAO<ChannelModelMix> {

    private QueryUtil<ChannelModelMix> queryUtil;
    public static ChannelFormDAO INSTANCE;

    public static ChannelFormDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ChannelFormDAO();
        }
        return INSTANCE;
    }

    public ChannelFormDAO() {
        queryUtil = QueryUtil.getInstance(ChannelModelMix.class);
    }

    public void save(Connection connection, ChannelModelMix mix)
            throws SQLException {
        int indexNo = ChannelService.getInstance().saveItem(connection, mix);
        if (indexNo > 0) {
            LogFileModel logFile = new LogFileModel();
            logFile.setDate(mix.getDate());
            logFile.setFormName("Channel Form");

            logFile.setRemarks("New Channel");
            logFile.setTime(FormatterUtil.getInstance().getTime());
            logFile.setTransactionType("Save");
            logFile.setUser(Home.getInstance().getUser().getIndexNo());
            logFile.setUserId(Home.getInstance().getUser().getIndexNo());
            logFile.setUserName(Home.getInstance().getUser().getName());
            logFile.setValue(Double.valueOf(mix.getAmount()));
            int saveLog = LogFileDAO.getInstance().saveLog(connection, logFile);

            try {
                JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getReportUrl(CHANNEL));
                HashMap<String, Object> dataMap = new HashMap<>();
                dataMap.put("channel_id", mix.getChannelId());
                dataMap.put("channel_date", mix.getChannelDate());
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, dataMap, connection);

                JasperPrintManager.printReport(jasperPrint, true);

            } catch (JRException ex) {
                Logger.getLogger(report_panel.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (saveLog > 0) {
                JOptionPane.showMessageDialog(null, indexNo + " Channel Save SuccessFully..");
            }

            //sms sender
            int code = SmsSender.messageSendForChannel(mix);

            if (code == 200) {
                JOptionPane.showMessageDialog(null, mix.getMobile() + " Message Send Successfully.");
            }
        }
    }

    public void update(Connection connection, ChannelModelMix mix)
            throws SQLException {
        int indexNo = ChannelService.getInstance().updateItem(connection, mix);
    }

    public void delete(Connection connection, ChannelModelMix mix)
            throws SQLException {
        int indexNo = ChannelService.getInstance().deleteItem(connection, mix);
    }

    public List<ChannelModelMix> getSearchResult(Connection connection, String text)
            throws SQLException {
        List<ChannelModelMix> list = new ArrayList();
        List<ChannelModel> searchItem = ChannelService.getInstance().searchItem(connection, text);
        for (ChannelModel item : searchItem) {
            ChannelModelMix mix = new ChannelModelMix();
            DoctorFormDao dao = new DoctorFormDao();
            DoctorModel doctorModel = dao.searchDoctor(connection, item.getDoctor_id());

            mix.setAmount(item.getAmount());
            mix.setChannelDate(item.getChannel_date());
            mix.setChannelId(item.getChannel_id());
            mix.setDate(item.getDate());
            mix.setDoctorId(item.getDoctor_id());
            mix.setDoctorName(doctorModel.getdoctor_name());
            mix.setIndexNo(item.getIndex_no());
            mix.setTime(item.getTime());
            mix.setPatientName(item.getPatient_name());
            mix.setMobile(item.getMobile());

            list.add(mix);
        }
        return list;
    }

    public List<ChannelModel> searchChannel(Date date) {
        return ChannelService.getInstance().searchChannel(FormatterUtil.getInstance().formatDate(date));
    }
}
