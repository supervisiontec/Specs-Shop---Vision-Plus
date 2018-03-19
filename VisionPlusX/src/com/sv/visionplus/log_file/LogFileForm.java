/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.log_file;

import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.base.transaction.AbstractTransactionForm;
import com.sv.visionplus.base.transaction.AbstractTransactionFormService;
import com.sv.visionplus.log_file.model.LogFileModel;

/**
 *
 * @author KAZA
 */
public class LogFileForm extends AbstractTransactionForm<LogFileModel>{

    @Override
    protected AbstractTransactionFormService<LogFileModel> getTransactionFormService() {
        return new LogFileService();
    }

    @Override
    protected AbstractObjectCreator<LogFileModel> getObjectCreator() {
        return new PCLogFile(this);
    }
    
}
