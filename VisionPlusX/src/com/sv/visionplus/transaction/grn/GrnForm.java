package com.sv.visionplus.transaction.grn;

import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.base.transaction.AbstractTransactionForm;
import com.sv.visionplus.base.transaction.AbstractTransactionFormService;
import com.sv.visionplus.transaction.grn.model.GrnMix;

public class GrnForm
  extends AbstractTransactionForm<GrnMix>
{
  private PCGrn grn;
  
  public GrnForm() {}
  
  protected AbstractTransactionFormService<GrnMix> getTransactionFormService()
  {
    return new GrnService();
  }
  
  protected AbstractObjectCreator<GrnMix> getObjectCreator()
  {
    grn = new PCGrn(this);
    return grn;
  }
  
  public void doSave()
  {
    super.doSave();
    
    if (grn != null) {
      grn.resetFields();
    }
  }
}
