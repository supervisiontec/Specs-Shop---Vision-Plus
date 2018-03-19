package com.sv.visionplus.transaction.invoice;

import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.base.transaction.AbstractTransactionForm;
import com.sv.visionplus.base.transaction.AbstractTransactionFormService;
import com.sv.visionplus.transaction.invoice.model.InvoiceMix;







public class InvoiceForm
  extends AbstractTransactionForm<InvoiceMix>
{
  private PCInvoice invoice;
  
  public InvoiceForm() {}
  
  protected AbstractTransactionFormService<InvoiceMix> getTransactionFormService()
  {
    return new InvoiceService();
  }
  
  protected AbstractObjectCreator<InvoiceMix> getObjectCreator()
  {
    invoice = new PCInvoice(this);
    return invoice;
  }
  
  public void doSave(){
    super.doSave();
    
  }
}
