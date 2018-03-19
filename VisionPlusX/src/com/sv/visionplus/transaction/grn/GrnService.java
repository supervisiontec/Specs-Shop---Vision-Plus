package com.sv.visionplus.transaction.grn;

import com.sv.visionplus.base.transaction.AbstractTransactionFormService;
import com.sv.visionplus.system.exception.VPException;
import com.sv.visionplus.transaction.grn.model.GrnMix;
import javax.swing.JOptionPane;






public class GrnService
  extends AbstractTransactionFormService<GrnMix>
{
  public GrnService() {}
  
  protected GrnMix select(Integer indexNo)
    throws VPException
  {
    return null;
  }
  
  protected void save(GrnMix grnMix) throws VPException
  {
    if (grnMix != null)
    {
      int grnId = GrnDAO.getInstance().saveGrn(grnMix);
      if (grnId > 0) {
        JOptionPane.showMessageDialog(null, grnId + " Grn Saved Successfully..");
      } else {
        JOptionPane.showMessageDialog(null, grnId + " Grn Saved Fail..");
      }
    }
  }
  
  protected void update(GrnMix grnMix)
    throws VPException
  {}
  
  protected void delete(GrnMix grnMix)
    throws VPException
  {}
}
