/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.grn.model;

import java.util.List;
import visionplusx.logFile.LogFileModel;

/**
 *
 * @author KAZA
 */
public class GrnMix {
    private TGrn grn;
    private List<GrnDetail> grnDetail;
    private LogFileModel logFileModel;
    private List<TStockLedger> ledger;

    public List<TStockLedger> getLedger() {
        return ledger;
    }

    public void setLedger(List<TStockLedger> ledger) {
        this.ledger = ledger;
    }

    public TGrn getGrn() {
        return grn;
    }

    public void setGrn(TGrn grn) {
        this.grn = grn;
    }

    public LogFileModel getLogFileModel() {
        return logFileModel;
    }

    public void setLogFileModel(LogFileModel logFileModel) {
        this.logFileModel = logFileModel;
    }
    
    public List<GrnDetail> getGrnDetail() {
        return grnDetail;
    }

    public void setGrnDetail(List<GrnDetail> grnDetail) {
        this.grnDetail = grnDetail;
    }
    
    
    
    
    
}
