/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.log_file;

import com.sv.visionplus.base.transaction.AbstractTransactionFormService;
import com.sv.visionplus.log_file.model.LogFileModel;
import com.sv.visionplus.system.exception.VPException;

/**
 *
 * @author KAZA
 */
public class LogFileService extends AbstractTransactionFormService<LogFileModel>{

    @Override
    protected LogFileModel select(Integer indexNo) throws VPException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void save(LogFileModel object) throws VPException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void update(LogFileModel object) throws VPException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void delete(LogFileModel object) throws VPException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
