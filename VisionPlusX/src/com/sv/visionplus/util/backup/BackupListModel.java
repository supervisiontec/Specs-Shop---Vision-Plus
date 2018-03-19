/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.util.backup;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.AbstractListModel;

/**
 *
 * @author user
 */
public class BackupListModel extends AbstractListModel<File> {

    public static final FileFilter FILE_FILTER =
            new FileFilter() {
        @Override
        public boolean accept(File pathname) {
            return BackupFunctions.getExtension(pathname).equalsIgnoreCase(BackupFunctions.BACKUP_EXTENSION);
        }
    };
    private File backupDir;
    private List<File> backups = Collections.emptyList();

    public BackupListModel() {
        backupDir = new File(BackupFunctions.BACKUP_DIR);
        refresh();
    }

    public void refresh() {
        backups = getBackups();
        fireContentsChanged(this, 0, getSize());
    }

    @Override
    public int getSize() {
        return backups.size();
    }

    @Override
    public File getElementAt(int index) {
        return backups.get(index);
    }

    private List getBackups() {
        File[] files = backupDir.listFiles(FILE_FILTER);

        if (files == null) {
            files = new File[0];
        }
        return Arrays.asList(files);
    }
}
