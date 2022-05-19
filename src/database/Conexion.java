/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cocol
 */
public class Conexion {
  private String db = "";
  private String url = "";
  private String user = "";
  private String pwd = "";
  private String driver = "";
  private Connection con = null;
  
  public boolean conectar(){
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection(url,user, pwd);
      return true;
    } catch (ClassNotFoundException | SQLException e) {
      Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
    }
    return false;
  }
}
