/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.util.backup;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileFilter;
import visionplusx.Home;

/**
 *
 * @author user
 */
public class BackupRestore extends JPanel {

    /**
     * Creates new form BackupRestore
     */
    public BackupRestore() {
        initComponents();

        initOthers();
    }

    public void doRefresh() {
        ((BackupListModel) lstBackupList.getModel()).refresh();
    }

    public void doBackup() {
        try {
            prgBackup.setIndeterminate(true);
            backupFunctions.backup();

//            msgBox("Backup successful...!", "Backup", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("success,,,,");
//JOptionPane.showMessageDialog(null, "Backup successful...!");
        } catch (Exception ex) {
            Logger.getLogger(BackupRestore.class.getName()).log(Level.SEVERE, null, ex);
//            JOptionPane.showMessageDialog(null, "Backup fail...!");
            System.out.println("error,,,,");
//            msgBox("Backup Failed...!\n" + ex.getMessage(), "Backup", JOptionPane.ERROR_MESSAGE);
        }
        prgBackup.setIndeterminate(false);

        ((BackupListModel) lstBackupList.getModel()).refresh();
    }

//    private void msgBox(String message, String title, int msgtype) {
////        Runnable r = () -> {
//            JOptionPane.showMessageDialog(Home.getInstance(), message, title, msgtype);
////        };
//
////        SwingUtilities.invokeLater(r);
//    }
    public void doExport() throws FileNotFoundException, IOException {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setApproveButtonText("Export");
        chooser.setDialogTitle("Export");
        chooser.showOpenDialog(this);
        File destiction = chooser.getSelectedFile();

        File source = (File) lstBackupList.getSelectedValue();
        destiction = new File(destiction, source.getName());

        if (destiction.exists()) {
            int q = JOptionPane.showConfirmDialog(Home.getInstance(), "File " + destiction.getCanonicalPath() + " is already exists. Do you want to replace ?", "Already Exists", JOptionPane.WARNING_MESSAGE);

            if (q == JOptionPane.YES_OPTION) {
                Files.copy(source.toPath(), destiction.toPath(), StandardCopyOption.REPLACE_EXISTING);

                JOptionPane.showMessageDialog(Home.getInstance(), "Backup exported successfully...", "Export", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            Files.copy(source.toPath(), destiction.toPath(), StandardCopyOption.REPLACE_EXISTING);
            JOptionPane.showMessageDialog(Home.getInstance(), "Backup exported successfully...", "Export", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void doImport() throws IOException {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setApproveButtonText("Import");
        chooser.setDialogTitle("Import");
        chooser.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                return BackupFunctions.getExtension(f).equalsIgnoreCase(BackupFunctions.BACKUP_EXTENSION);
            }

            @Override
            public String getDescription() {
                return "Backup Files";
            }
        });
        chooser.showOpenDialog(this);
        File source = chooser.getSelectedFile();

        File destiction = new File(BackupFunctions.BACKUP_DIR, source.getName());

        if (destiction.exists()) {
            int q = JOptionPane.showConfirmDialog(Home.getInstance(), "File " + destiction.getName() + " is already exists. Do you want to replace ?", "Already Exists", JOptionPane.WARNING_MESSAGE);

            if (q == JOptionPane.YES_OPTION) {
                Files.copy(source.toPath(), destiction.toPath(), StandardCopyOption.REPLACE_EXISTING);

                JOptionPane.showMessageDialog(Home.getInstance(), "Backup imported successfully...", "Import", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            Files.copy(source.toPath(), destiction.toPath(), StandardCopyOption.REPLACE_EXISTING);
            JOptionPane.showMessageDialog(Home.getInstance(), "Backup imported successfully...", "Import", JOptionPane.INFORMATION_MESSAGE);
        }
        ((BackupListModel) lstBackupList.getModel()).refresh();
    }

    public void doDelete() {
        File file = (File) lstBackupList.getSelectedValue();
        int q = JOptionPane.showConfirmDialog(Home.getInstance(), "Do you sure want to delete backup, " + file.getName() + "", "Delete Backup", JOptionPane.WARNING_MESSAGE);

        if (q == JOptionPane.YES_OPTION) {
            Path path = file.toPath();
            try {
                Files.delete(path);

                JOptionPane.showMessageDialog(Home.getInstance(), "Backup deleted successfully...", "Delete", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException ex) {
                Logger.getLogger(BackupRestore.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        ((BackupListModel) lstBackupList.getModel()).refresh();
    }

    public void doRestore() {
        File filepath = (File) lstBackupList.getSelectedValue();

        try {
            prgRestore.setIndeterminate(true);
            backupFunctions.restore(filepath);
            JOptionPane.showMessageDialog(Home.getInstance(), "Restore successful...!", "Restore", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            Logger.getLogger(BackupRestore.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(Home.getInstance(), "Restore Failed...!\n" + ex.getMessage(), "Restore", JOptionPane.ERROR_MESSAGE);
        }
        prgRestore.setIndeterminate(false);
    }

    @SuppressWarnings("unchecked")
    private void initOthers() {
        backupFunctions = new BackupFunctions();

        //default values
//        txtApplication.setCValue(CApplication.getInstance().getApplicationName());
//        txtVersion.setCValue(CApplication.getInstance().getApplicationVersion());
//        dateWorkingDate.setCValue((Date) CApplication.getSessionVariable(CApplication.WORKING_DATE));
//        txtBranch.setCValue((String) CApplication.getSessionVariable(CApplication.STORE_ID));
        dateSystemDate.setCValue(new Date());

        //disable fields
        txtApplication.setCValueEditable(false);
        txtVersion.setCValueEditable(false);
        dateWorkingDate.setCValueEditable(false);
        txtBranch.setCValueEditable(false);
        dateSystemDate.setCValueEditable(false);

        //set recent backup
        lstBackupList.setModel(new BackupListModel());

        //Action binding
//        ActionUtil actionUtil = new ActionUtil(this);
//        actionUtil.setAction(btnBackup, "doBackup");
//        actionUtil.setAction(btnRestore, "doRestore");
//        actionUtil.setAction(btnImport, "doImport");
//        actionUtil.setAction(btnDelete, "doDelete");
//        actionUtil.setAction(btnRefresh, "doRefresh");
//        actionUtil.setAction(btnExport, "doExport");
        //icons
//        btnBackup.setIcon(ApplicationResources.getImageIcon(ApplicationResources.ACTION_BACKUP, 16, 16));
//        btnRestore.setIcon(ApplicationResources.getImageIcon(ApplicationResources.ACTION_RESTORE, 16,16));
//        btnImport.setIcon(ApplicationResources.getImageIcon(ApplicationResources.ACTION_OPEN, 16, 16));
//        btnDelete.setIcon(ApplicationResources.getImageIcon(ApplicationResources.ACTION_DELETE, 16, 16));
//        btnRefresh.setIcon(ApplicationResources.getImageIcon(ApplicationResources.ACTION_REFRESH, 16, 16));
//        btnExport.setIcon(ApplicationResources.getImageIcon(ApplicationResources.ACTION_SAVE, 16, 16));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        cDLabel1 = new javax.swing.JLabel();
        cDLabel3 = new javax.swing.JLabel();
        cDLabel4 = new javax.swing.JLabel();
        cDLabel5 = new javax.swing.JLabel();
        cDLabel6 = new javax.swing.JLabel();
        cDLabel7 = new javax.swing.JLabel();
        btnBackup = new javax.swing.JButton();
        prgBackup = new javax.swing.JProgressBar();
        txtApplication = new com.sv.visionplus.util.component.textfield.CStringField();
        txtVersion = new com.sv.visionplus.util.component.textfield.CStringField();
        txtBranch = new com.sv.visionplus.util.component.textfield.CStringField();
        dateWorkingDate = new com.sv.visionplus.util.component.textfield.CDateField();
        dateSystemDate = new com.sv.visionplus.util.component.textfield.CDateField();
        jPanel2 = new javax.swing.JPanel();
        cDLabel2 = new javax.swing.JLabel();
        btnRestore = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnImport = new javax.swing.JButton();
        prgRestore = new javax.swing.JProgressBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstBackupList = new javax.swing.JList();
        btnRefresh = new javax.swing.JButton();

        jSplitPane2.setDividerLocation(350);
        jSplitPane2.setResizeWeight(0.5);

        cDLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cDLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cDLabel1.setText("BACKUP");

        cDLabel3.setText("Application :");

        cDLabel4.setText("Version :");

        cDLabel5.setText("Working Date :");

        cDLabel6.setText("Branch :");

        cDLabel7.setText("System Date :");

        btnBackup.setText("Backup");
        btnBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackupActionPerformed(evt);
            }
        });

        dateWorkingDate.setText("");

        dateSystemDate.setText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cDLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cDLabel7)
                            .addComponent(cDLabel6)
                            .addComponent(cDLabel5)
                            .addComponent(cDLabel4)
                            .addComponent(cDLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApplication, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtVersion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dateWorkingDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBranch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dateSystemDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBackup)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(prgBackup, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(cDLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cDLabel3)
                    .addComponent(txtApplication, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cDLabel4)
                    .addComponent(txtVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cDLabel5)
                    .addComponent(dateWorkingDate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cDLabel6)
                    .addComponent(txtBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cDLabel7)
                    .addComponent(dateSystemDate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(prgBackup, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBackup)
                .addContainerGap())
        );

        jSplitPane2.setLeftComponent(jPanel1);

        cDLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cDLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cDLabel2.setText("RESTORE");

        btnRestore.setText("Restore");
        btnRestore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestoreActionPerformed(evt);
            }
        });

        btnExport.setText("Export");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnImport.setText("Import");
        btnImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportActionPerformed(evt);
            }
        });

        lstBackupList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lstBackupList);

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addComponent(prgRestore, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cDLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnRefresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRestore)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExport)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnImport, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(cDLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prgRestore, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRestore)
                    .addComponent(btnExport)
                    .addComponent(btnDelete)
                    .addComponent(btnImport)
                    .addComponent(btnRefresh))
                .addContainerGap())
        );

        jSplitPane2.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackupActionPerformed
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                doBackup();
            }
        };
        Thread thread = new Thread(runnable, "Backup");
        thread.start();
    }//GEN-LAST:event_btnBackupActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        doRefresh();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnRestoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestoreActionPerformed
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                doRestore();
            }
        };
        Thread thread = new Thread(runnable, "Backup");
        thread.start();
    }//GEN-LAST:event_btnRestoreActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        try {
            doExport();
        } catch (IOException ex) {
            Logger.getLogger(BackupRestore.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnExportActionPerformed

    private void btnImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportActionPerformed
        try {
            doImport();
        } catch (IOException ex) {
            Logger.getLogger(BackupRestore.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnImportActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        doDelete();
    }//GEN-LAST:event_btnDeleteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackup;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnImport;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRestore;
    private javax.swing.JLabel cDLabel1;
    private javax.swing.JLabel cDLabel2;
    private javax.swing.JLabel cDLabel3;
    private javax.swing.JLabel cDLabel4;
    private javax.swing.JLabel cDLabel5;
    private javax.swing.JLabel cDLabel6;
    private javax.swing.JLabel cDLabel7;
    private com.sv.visionplus.util.component.textfield.CDateField dateSystemDate;
    private com.sv.visionplus.util.component.textfield.CDateField dateWorkingDate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JList lstBackupList;
    private javax.swing.JProgressBar prgBackup;
    private javax.swing.JProgressBar prgRestore;
    private com.sv.visionplus.util.component.textfield.CStringField txtApplication;
    private com.sv.visionplus.util.component.textfield.CStringField txtBranch;
    private com.sv.visionplus.util.component.textfield.CStringField txtVersion;
    // End of variables declaration//GEN-END:variables
    private BackupFunctions backupFunctions;
}
