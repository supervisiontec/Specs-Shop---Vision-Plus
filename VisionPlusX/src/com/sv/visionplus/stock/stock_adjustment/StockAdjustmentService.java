/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.stock.stock_adjustment;

import com.sv.visionplus.base.transaction.AbstractTransactionFormService;
import com.sv.visionplus.stock.stock_adjustment.model.MItem;
import com.sv.visionplus.system.exception.VPException;

/**
 *
 * @author KAZA
 */
public class StockAdjustmentService extends AbstractTransactionFormService<MItem>{

    @Override
    protected MItem select(Integer indexNo) throws VPException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void save(MItem object) throws VPException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void update(MItem object) throws VPException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void delete(MItem object) throws VPException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
