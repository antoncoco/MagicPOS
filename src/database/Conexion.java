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
 * @author MagicPOS
 */
public class Conexion {
  private String db = "bld9w4cxyecovqqpndrg";
  private String user = "uch4ep8usc1dteku";
  private String pwd = "e1L6iQOcwCspKYs4eQpt";
  private String driver = "jdbc:mysql";
  private String host = "bld9w4cxyecovqqpndrg-mysql.services.clever-cloud.com";
  private String url = driver+"://"+host+"/"+db;
  private Connection con = null;
  
  public boolean conectar(){
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection(url,user, pwd);
      return true;
    } catch (ClassNotFoundException | SQLException e) {
      Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
    }
    return false;
  }
}
