package com.sv.visionplus.logout;

import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.base.transaction.AbstractTransactionForm;
import com.sv.visionplus.logout.model.LogFileModel;
import com.sv.visionplus.system.exception.VPException;
import com.sv.visionplus.util.formatter.FormatterUtil;
import java.util.Date;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.JOptionPane;
import visionplusx.Home;
import visionplusx.model.MUser;





public class PCLogOut
  extends AbstractObjectCreator<LogFileModel>
{
  private AbstractTransactionForm<LogFileModel> transactionForm;
  
  public PCLogOut(AbstractTransactionForm transactionForm)
  {
    initComponents();
    
    this.transactionForm = transactionForm;
    int res = JOptionPane.showConfirmDialog(this, "Do You Want to Log Out ?", "Log Out", 2);
    if (res == 0) {
      int logOut = logOut();
      if (logOut > 0) {
        System.exit(0);
      }
    }
    
    JOptionPane.showMessageDialog(this, "Log Out Failed.Try Again..");
  }
  




  private void initComponents()
  {
    GroupLayout layout = new GroupLayout(this);
    setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 733, 32767));
    


    layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 435, 32767));
  }
  



  public void setIdealMode() {}
  



  public void setNewMode() {}
  



  public void setEditMode() {}
  


  public void resetFields() {}
  


  public void initObject()
    throws VPException
  {}
  


  public void initInterface()
    throws VPException
  {}
  


  protected void setValueAbstract(LogFileModel file) {}
  


  protected LogFileModel getValueAbstract()
  {
    return null;
  }
  




  private int logOut()
  {
    LogFileModel model = new LogFileModel();
    model.setDate(new Date());
    model.setFormName("Log Out");
    
    model.setRemarks("User Log Out");
    model.setTime(FormatterUtil.getInstance().getTime());
    model.setTransactionType("Save");
    model.setUser(Home.getInstance().getUser().getIndexNo());
    model.setName(Home.getInstance().getUser().getName());
    model.setValue(Double.valueOf(0.0D));
    
    return LogFileDAO.getInstance().saveLog(model);
  }
}
