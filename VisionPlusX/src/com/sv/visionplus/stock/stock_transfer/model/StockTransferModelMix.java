/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.stock.stock_transfer.model;

import java.util.List;
import visionplusx.logFile.LogFileModel;

/**
 *
 * @author KAZA
 */
public class StockTransferModelMix {
    private List<TStockLedger> ledger;
    private LogFileModel logFile;

    public List<TStockLedger> getLedger() {
        return ledger;
    }

    public void setLedger(List<TStockLedger> ledger) {
        this.ledger = ledger;
    }

    public LogFileModel getLogFile() {
        return logFile;
    }

    public void setLogFile(LogFileModel logFile) {
        this.logFile = logFile;
    }
    
    
    
}
