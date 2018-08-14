/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.report.report_file;

import java.net.URL;

/**
 *
 * @author Supervision
 */
public class ReportFiles {
     public static final String BEST_CUSTOMER = "jasper_form/best_customer.jasper";
     public static final String BEST_USER = "jasper_form/best_user.jasper";
     public static final String CHANNEL = "jasper_form/channel.jasper";
     public static final String FACTORY_REPORT = "jasper_form/factory_report.jasper";
     public static final String GRN = "jasper_form/grn.jasper";
     public static final String INVOICE_RECEIPT = "jasper_form/invoice_receipt.jasper";
     public static final String INVOICE_STATUS = "jasper_form/invoice_status.jasper";
     public static final String ISSUE_FRAME_LENS = "jasper_form/issue_frame_lense.jasper";
     public static final String CLAIM = "jasper_form/claim.jasper";
     public static final String CLAIM1 = "jasper_form/claim_1.jasper";
     public static final String CHANNEL_LIST = "jasper_form/channel-list.jasper";
     public static final String INVOICE_LIST = "jasper_form/invoice_list.jasper";
     
     public static URL getReportUrl(String path) {
        return ReportFiles.class.getResource(path);
    }
}
