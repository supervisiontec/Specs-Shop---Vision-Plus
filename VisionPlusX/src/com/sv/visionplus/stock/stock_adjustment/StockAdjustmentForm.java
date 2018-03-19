/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.stock.stock_adjustment;

import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.base.transaction.AbstractTransactionForm;
import com.sv.visionplus.base.transaction.AbstractTransactionFormService;
import com.sv.visionplus.stock.stock_adjustment.model.MItem;

/**
 *
 * @author KAZA
 */
public class StockAdjustmentForm extends AbstractTransactionForm<MItem>{

    @Override
    protected AbstractTransactionFormService<MItem> getTransactionFormService() {
        return new StockAdjustmentService();
    }

    @Override
    protected AbstractObjectCreator<MItem> getObjectCreator() {
        return new PCStockAdujstment(this);
    }
    
}
