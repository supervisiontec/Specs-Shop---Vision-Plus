package com.sv.visionplus.util.database;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;




public class DatabaseUtil
{
  private Connection connection;
  private static DatabaseUtil INSTANCE;
  private static final String CONFIG_FILE = "config";
  private static final String HOST = "HOST";
  private static final String DATABASE = "DATABASE";
  private static final String USERNAME = "USERNAME";
  private static final String PASSWORD = "PASSWORD";
  private ConnectionInfomation connectionInfomation;
  
  private DatabaseUtil()
    throws SQLException
  {
    try
    {
      Class.forName("com.mysql.jdbc.Driver");
      initConnectionInformation();
    }
    catch (ClassNotFoundException ex)
    {
      Logger.getLogger(DatabaseUtil.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  
  public static DatabaseUtil getInstance() throws SQLException {
    if (INSTANCE == null) {
      INSTANCE = new DatabaseUtil();
    }
    return INSTANCE;
  }
  
  private void initConnectionInformation() {
    Properties properties = new Properties();
    try
    {
      properties.loadFromXML(new FileInputStream(new File(CONFIG_FILE)));
      
      connectionInfomation = new ConnectionInfomation(
              properties.getProperty(HOST), 
              properties.getProperty(DATABASE),
              properties.getProperty(USERNAME),
              properties.getProperty(PASSWORD)
      );
     
      try
      {
        Connection connection = openConnection();
        closeConnection(connection);
      } catch (SQLException ex) {
        Logger.getLogger(DatabaseUtil.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Unable to connect database. System will shutdown.", "DATABASE ERROR", 0);
        System.exit(0);
      }
    }
    catch (IOException ex) {
      properties.put(HOST, "localhost");
      properties.put(DATABASE, "mydb");
      properties.put(USERNAME, "root");
      properties.put(PASSWORD, "mysql");
      try
      {
        properties.storeToXML(new FileOutputStream(new File(CONFIG_FILE)), "database connection information");
      } catch (IOException ex1) {
        Logger.getLogger(DatabaseUtil.class.getName()).log(Level.SEVERE, null, ex1);
      }
      
      JOptionPane.showMessageDialog(null, "Unable to locate database configuration. System will shutdown.", "DATABASE ERROR", 0);
      System.exit(0);
    }
  }
  
  public Connection openConnection() throws SQLException
  {
      Properties prop = new Properties();
      try {
          prop.loadFromXML(new FileInputStream(new File(CONFIG_FILE)));
      } catch (IOException ex) {
          Logger.getLogger(DatabaseUtil.class.getName()).log(Level.SEVERE, null, ex);
      }
    connection = DriverManager.getConnection(
            "jdbc:mysql://"+prop.getProperty(HOST)+"/"+prop.getProperty(DATABASE), prop.getProperty(USERNAME), prop.getProperty(PASSWORD));

    return connection;
  }
  
  public void closeConnection(Connection connection) throws SQLException {
    connection.close();
  }
  
  public ConnectionInfomation getConnectionInfomation() {
    return connectionInfomation;
  }
  
  public static class ConnectionInfomation
  {
    public String host;
    public String database;
    public String userName;
    public String password;
    
    public ConnectionInfomation(String host, String database, String userName, String password) {
      this.host = host;
      this.database = database;
      this.userName = userName;
      this.password = password;
    }
    
    public String getURL() {
      return "jdbc:mysql://" + host + "/" + database;
    }
    
    public String getUserName() {
      return userName;
    }
    
    public String getPassword() {
      return password;
    }
  }
}
