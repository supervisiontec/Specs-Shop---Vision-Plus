package com.sv.visionplus.logout;

import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.base.transaction.AbstractTransactionForm;
import com.sv.visionplus.base.transaction.AbstractTransactionFormService;
import com.sv.visionplus.logout.model.LogFileModel;








public class LogOutForm
  extends AbstractTransactionForm<LogFileModel>
{
  public LogOutForm() {}
  
  protected AbstractTransactionFormService<LogFileModel> getTransactionFormService()
  {
    return new LogOutService();
  }
  
  protected AbstractObjectCreator<LogFileModel> getObjectCreator()
  {
    return new PCLogOut(this);
  }
}
