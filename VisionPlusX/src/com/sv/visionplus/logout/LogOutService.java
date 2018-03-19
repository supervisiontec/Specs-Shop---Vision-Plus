package com.sv.visionplus.logout;

import com.sv.visionplus.base.transaction.AbstractTransactionFormService;
import com.sv.visionplus.logout.model.LogFileModel;
import com.sv.visionplus.system.exception.VPException;






public class LogOutService
  extends AbstractTransactionFormService<LogFileModel>
{
  public LogOutService() {}
  
  protected LogFileModel select(Integer indexNo)
    throws VPException
  {
    throw new UnsupportedOperationException("Not supported yet.");
  }
  
  protected void save(LogFileModel object) throws VPException
  {
    throw new UnsupportedOperationException("Not supported yet.");
  }
  
  protected void update(LogFileModel object) throws VPException
  {
    throw new UnsupportedOperationException("Not supported yet.");
  }
  
  protected void delete(LogFileModel object) throws VPException
  {
    throw new UnsupportedOperationException("Not supported yet.");
  }
}
