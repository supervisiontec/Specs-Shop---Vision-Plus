/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visionplusx;

import com.sv.visionplus.account.money_collection.MoneyCollectionForm;
import com.sv.visionplus.account.payment_voucher.PaymentVoucherForm;
import com.sv.visionplus.channel.channel_register.ChannelFormGUI;
import com.sv.visionplus.channel.doctor.DoctorFormGUI;
import com.sv.visionplus.log_file.LogFileForm;
import com.sv.visionplus.logout.LogOutForm;
import com.sv.visionplus.master.bank_branch.BankBranchFormGUI;
import com.sv.visionplus.master.customer.CustomerFormGUI;
import com.sv.visionplus.master.factory.FactoryFormGUI;
import com.sv.visionplus.master.item.ItemFormGUI;
import com.sv.visionplus.master.supplier.SupplierFormGUI;
import com.sv.visionplus.master.user.UserFormGUI;
import com.sv.visionplus.messanger.Messanger;
import com.sv.visionplus.report.report_panel;
import javax.swing.JPanel;
import static com.sv.visionplus.resource.VPResources.*;
import com.sv.visionplus.stock.stock_adjustment.StockAdjustmentForm;
import com.sv.visionplus.stock.stock_transfer.StockTransferForm;
import com.sv.visionplus.transaction.check_In.CheckingForm;
import com.sv.visionplus.transaction.customer_payment.CustomerPaymentForm;
import com.sv.visionplus.transaction.grn.GrnForm;
import com.sv.visionplus.transaction.invoice.InvoiceForm;
import com.sv.visionplus.transaction.invoice_detail.InvoiceDetailForm;
import com.sv.visionplus.transaction.invoice_tab.InvoiceFormTab;
import com.sv.visionplus.transaction.supplier_payment.SupplierPaymentForm;
import com.sv.visionplus.util.backup.BackupRestore;
import com.sv.visionplus.util.component.main_frame.DefaultMainframe;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import visionplusx.model.MUser;

/**
 *
 * @author Mohan
 */
public class Home extends DefaultMainframe {

    private static Home INSTANCE;

    public static Home getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Home();
        }

        return INSTANCE;
    }
    private static MUser user;

    public Home() {
    }

    @Override
    protected JPanel getContentPanel() {
        this.contentPanel = new ContentPanel();

        return contentPanel;
    }

    @Override
    protected void createGUI() {
        createMaster();
        setTitle("Vision Plus Management System");
        ImageIcon imageIcon = new ImageIcon(getImageUrl(TASK));
        setIconImage(imageIcon.getImage());
    }

    public ActionListener getActionListener(final Class<? extends JPanel> panelClass) {
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    JPanel panel = panelClass.newInstance();
                    Home.this.contentPanel.setView(panel);

                } catch (InstantiationException | IllegalAccessException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };

        return actionListener;
    }

    private void createMaster() {

        if ("User".equals(Login.getInstance().user.getType()) || "Admin".equals(Login.getInstance().user.getType())) {
            addTask("Master");
            addBand("Customer", getImageUrl(MASTER_CUSTOMER));
            addButton("Customer", getImageUrl(MASTER_CUSTOMER), DefaultMainframe.ElementPriority.TOP, getActionListener(CustomerFormGUI.class));
            addBand("Item", getImageUrl(MASTER_ITEM));
            addButton("Item", getImageUrl(MASTER_ITEM), DefaultMainframe.ElementPriority.TOP, getActionListener(ItemFormGUI.class));
        }
        if ("Admin".equals(Login.getInstance().user.getType())) {
            addBand("Supplier", getImageUrl(MASTER_SUPPLIER));
            addButton("Supplier", getImageUrl(MASTER_SUPPLIER), DefaultMainframe.ElementPriority.TOP, getActionListener(SupplierFormGUI.class));
            addBand("User", getImageUrl(MASTER_USER));
            addButton("User", getImageUrl(MASTER_USER), DefaultMainframe.ElementPriority.TOP, getActionListener(UserFormGUI.class));
        }

        if ("Admin".equals(Login.getInstance().user.getType())) {
            addBand("Bank", getImageUrl(MASTER_BRANCH));
            addButton("Bank Branch", getImageUrl(MASTER_BRANCH), DefaultMainframe.ElementPriority.TOP, getActionListener(BankBranchFormGUI.class));
        }
        if ("User".equals(Login.getInstance().user.getType()) || "Admin".equals(Login.getInstance().user.getType())) {
            addBand("Factory", getImageUrl(MASTER_BRANCH));
            addButton("Factory", getImageUrl(MASTER_BRANCH), DefaultMainframe.ElementPriority.TOP, getActionListener(FactoryFormGUI.class));
        }

        addTask("Transaction");
        addBand("Transaction", getImageUrl(TRANSACTION_INVOICE));
        if ("User".equals(Login.getInstance().user.getType()) || "Admin".equals(Login.getInstance().user.getType())) {
            addButton("Invoice", getImageUrl(TRANSACTION_INVOICE), DefaultMainframe.ElementPriority.TOP, getActionListener(InvoiceForm.class));
        }
        addButton("Invoice Detail", getImageUrl(TRANSACTION_INVOICE_DETAIL), DefaultMainframe.ElementPriority.TOP, getActionListener(InvoiceDetailForm.class));

        if ("Admin".equals(Login.getInstance().user.getType()) || "Tab".equals(Login.getInstance().user.getType())) {
            addButton("Tab Invoice", getImageUrl(TRANSACTION_INVOICE_TAB), DefaultMainframe.ElementPriority.TOP, getActionListener(InvoiceFormTab.class));
        }

        if ("User".equals(Login.getInstance().user.getType()) || "Admin".equals(Login.getInstance().user.getType())) {
            addButton("GRN", getImageUrl(TRANSACTION_GRN), DefaultMainframe.ElementPriority.TOP, getActionListener(GrnForm.class));
            addBand("Payment", getImageUrl(TRANSACTION_PAYMENT));
            addButton("Customer Payment", getImageUrl(TRANSACTION_PAYMENT), DefaultMainframe.ElementPriority.TOP, getActionListener(CustomerPaymentForm.class));
        }
        if ("Admin".equals(Login.getInstance().user.getType())) {
            addButton("Supplier Payment", getImageUrl(SUPPLIER_PAYMENT), DefaultMainframe.ElementPriority.TOP, getActionListener(SupplierPaymentForm.class));
        }

        if ("User".equals(Login.getInstance().user.getType()) || "Admin".equals(Login.getInstance().user.getType())) {
            addBand("Check in", getImageUrl(TRANSACTION_PAYMENT));
            addButton("Check in", getImageUrl(TRANSACTION_CHECK), DefaultMainframe.ElementPriority.TOP, getActionListener(CheckingForm.class));
        }
        if ("User".equals(Login.getInstance().user.getType()) || "Admin".equals(Login.getInstance().user.getType())) {
            addTask("Account");
            addBand("Account", getImageUrl(ACCOUNT_MONEY));
        }
        if ("Admin".equals(Login.getInstance().user.getType())) {
            addButton("Money Collection", getImageUrl(ACCOUNT_MONEY), DefaultMainframe.ElementPriority.TOP, getActionListener(MoneyCollectionForm.class));
        }
        if ("User".equals(Login.getInstance().user.getType()) || "Admin".equals(Login.getInstance().user.getType())) {
            addButton("Payment Vouchers", getImageUrl(ACCOUNT_VOUCHER), DefaultMainframe.ElementPriority.TOP, getActionListener(PaymentVoucherForm.class));
        }
        if ("Admin".equals(Login.getInstance().user.getType())) {
            addTask("Stock");

            addBand("Stock", getImageUrl(STOCK_TRANSFER));
            addButton("stock Adjustmant", getImageUrl(STOCK_ADJUST), DefaultMainframe.ElementPriority.TOP, getActionListener(StockAdjustmentForm.class));
            addButton("stock transfer", getImageUrl(STOCK_TRANSFER), DefaultMainframe.ElementPriority.TOP, getActionListener(StockTransferForm.class));
        }

        if ("Admin".equals(Login.getInstance().user.getType())) {
            addTask("Log File");
            addBand("Log", getImageUrl(LOG_FILE));
            addButton("Log File", getImageUrl(LOG_FILE), DefaultMainframe.ElementPriority.TOP, getActionListener(LogFileForm.class));
        }

        if ("User".equals(Login.getInstance().user.getType()) || "Admin".equals(Login.getInstance().user.getType())) {
            addTask("Channel");
        }
        if ("Admin".equals(Login.getInstance().user.getType())) {
            addBand("Doctor", getImageUrl(DOCTOR));
            addButton("Doctor", getImageUrl(DOCTOR), DefaultMainframe.ElementPriority.TOP, getActionListener(DoctorFormGUI.class));
        }
        if ("User".equals(Login.getInstance().user.getType()) || "Admin".equals(Login.getInstance().user.getType())) {
            addBand("Channel Registration", getImageUrl(CHANNEL));
            addButton("Channel", getImageUrl(CHANNEL), DefaultMainframe.ElementPriority.TOP, getActionListener(ChannelFormGUI.class));

            addTask("Backup");

            addBand("Save Data", getImageUrl(BACKUP_EXPORT));
            addButton("Backup", getImageUrl(BACKUP_EXPORT), DefaultMainframe.ElementPriority.TOP, getActionListener(BackupRestore.class));

            addTask("Log Out");

            addBand("Logout", getImageUrl(LOG_OUT));
            addButton("Logout", getImageUrl(LOG_OUT), DefaultMainframe.ElementPriority.TOP, getActionListener(LogOutForm.class));

            addTask("Reports");

            addBand("Reports", getImageUrl(REPORT_VIEWER));
            addButton("reports", getImageUrl(REPORT_VIEWER), DefaultMainframe.ElementPriority.TOP, getActionListener(report_panel.class));

            addTask("Messanger");

            addBand("Messanger", getImageUrl(MESSANGER));
            addButton("Messanger", getImageUrl(MESSANGER), DefaultMainframe.ElementPriority.TOP, getActionListener(Messanger.class));
        }
    }

    private ContentPanel contentPanel;

    void setUser(MUser user) {
        this.user = user;
    }

    public MUser getUser() {
        return this.user;
    }

}
