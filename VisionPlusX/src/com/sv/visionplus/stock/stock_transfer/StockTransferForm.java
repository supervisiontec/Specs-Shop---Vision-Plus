/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.stock.stock_transfer;

import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.base.transaction.AbstractTransactionForm;
import com.sv.visionplus.base.transaction.AbstractTransactionFormService;
import com.sv.visionplus.stock.stock_transfer.model.StockTransferModelMix;

/**
 *
 * @author KAZA
 */
public class StockTransferForm extends AbstractTransactionForm<StockTransferModelMix>{
    private PCStockTransfer stockTransfer;
    @Override
    protected AbstractTransactionFormService<StockTransferModelMix> getTransactionFormService() {
        return new StockTransferService();
    }

    @Override
    protected AbstractObjectCreator<StockTransferModelMix> getObjectCreator() {
        return new PCStockTransfer(this);
    }

    @Override
    public void doSave() {
        super.doSave(); //To change body of generated methods, choose Tools | Templates.
        if (stockTransfer!=null) {
            stockTransfer.resetFields();
        }
    }
    
    
}
