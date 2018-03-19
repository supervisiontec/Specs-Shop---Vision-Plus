/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.stock.stock_transfer;

import com.sv.visionplus.base.transaction.AbstractTransactionFormService;
import com.sv.visionplus.stock.stock_transfer.model.MItem;
import com.sv.visionplus.stock.stock_transfer.model.StockTransferModelMix;
import com.sv.visionplus.system.exception.VPException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author KAZA
 */
public class StockTransferService extends AbstractTransactionFormService<StockTransferModelMix> {

    @Override
    protected StockTransferModelMix select(Integer indexNo) throws VPException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void save(StockTransferModelMix mix) throws VPException {
        try {
            int itemCount = StockTransferDAO.getInstance().makeStockTransfer(mix);
            if (itemCount > 0) {
                JOptionPane.showMessageDialog(null, itemCount/2 + " Item Transfer Successfully");
            }
        } catch (SQLException ex) {
            Logger.getLogger(StockTransferService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void update(StockTransferModelMix object) throws VPException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void delete(StockTransferModelMix object) throws VPException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
