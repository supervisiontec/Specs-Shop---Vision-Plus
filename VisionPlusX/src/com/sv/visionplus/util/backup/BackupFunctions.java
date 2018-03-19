/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.util.backup;

import com.sv.visionplus.util.database.DatabaseUtil;
import com.sv.visionplus.util.database.DatabaseUtil.ConnectionInfomation;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class BackupFunctions {

    public static final String BACKUP_DIR = "BACKUPS";
    public static final String BACKUP_EXTENSION = "MAC";
    public static final String MYSQL_LIB_FOLDER = "LIB";
    public static final String MYSQL_DUMP_EXE = "MYSQLDUMP.EXE";
    public static final String MYSQL_EXE = "MYSQL.EXE";
    private static final SimpleDateFormat BACKUP_NAME_DATE_FORMAT = new SimpleDateFormat("YYYY_MM_dd_HH_mm_ss");
    private static final ConnectionInfomation CONNECTION_INFOMATION;

    static {
        CONNECTION_INFOMATION = getConnectionInfomation();
    }

    public static String getNewBackupName() {
        String backupName;

        backupName = BACKUP_NAME_DATE_FORMAT.format(new Date());

        return backupName;
    }

    public void backup() throws Exception {
        backup(CONNECTION_INFOMATION.host,
                CONNECTION_INFOMATION.database,
                CONNECTION_INFOMATION.userName,
                CONNECTION_INFOMATION.password);
    }

    public void restore(File backupFile) throws Exception {
        restore(backupFile,
                CONNECTION_INFOMATION.host,
                CONNECTION_INFOMATION.database,
                CONNECTION_INFOMATION.userName,
                CONNECTION_INFOMATION.password);
    }

    private static ConnectionInfomation getConnectionInfomation() {
        try {
            return DatabaseUtil.getInstance().getConnectionInfomation();
        } catch (SQLException ex) {
            Logger.getLogger(BackupFunctions.class.getName()).log(Level.SEVERE, null, ex);
            return null;//not happens
        }
    }

    public static String getExtension(File file) {
        String fileName = file.getName();
        return fileName.substring(fileName.lastIndexOf(".") + 1);
    }

    //
    private static void backup(String host, String database, String user, String pass) throws Exception {
        String backupName = getNewBackupName();
        String line = "";

        File mysqlDump = new File(MYSQL_LIB_FOLDER, MYSQL_DUMP_EXE);
        File backupFile = new File(BACKUP_DIR, backupName + "." + BACKUP_EXTENSION);

        if (!backupFile.getParentFile().exists()) {
            backupFile.getParentFile().mkdirs();
        }

        if (!mysqlDump.exists()) {
            throw new Exception("mysqldump.exe not found.");
        }

        String command = "cmd /c " + mysqlDump.getCanonicalPath() + " -h " + host + " -u " + user + " -p" + pass + " " + database + " > " + backupFile.getCanonicalPath();
        System.out.println(command);

        Process process = Runtime.getRuntime().exec(command);
        InputStream stdout = process.getErrorStream();

        System.out.println(stdout);
        BufferedReader reader = new BufferedReader(new InputStreamReader(stdout));

        while ((line = reader.readLine()) != null) {
            System.out.println("Stdout: " + line);
        }
        process.waitFor();
        System.out.println("ABCD");

    }

    private static void restore(File backupFile, String host, String database, String user, String pass) throws Exception {
        File mysqlFile = new File(MYSQL_LIB_FOLDER, MYSQL_EXE);
        if (!mysqlFile.exists()) {
            throw new Exception("mysql.exe not found.");
        }

        String command = "cmd /c " + mysqlFile.getCanonicalPath() + " -h " + host + " -u " + user + " -p" + pass + " " + database + " < " + backupFile.getCanonicalPath();
        System.out.println(command);

        Process process = Runtime.getRuntime().exec(command);
        process.waitFor();
    }

}
