/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import dao.DAOUsuario;
import database.Conexion;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import modelos.RolUsuario;
import modelos.Usuario;
import utils.Util;

/**
 *
 * @author MagicPOS
 */
public class DAOUsuarioImpl implements DAOUsuario{
  @Override
  public boolean login(Usuario usuario) {
    return (usuario != null);
  }

  @Override
  public Usuario consultar(String id) {
    Conexion conexion = new Conexion();
    conexion.conectar();
    Connection con = conexion.getCon();
    try {
      Statement stmt;
      stmt = con.createStatement();
      ResultSet resultado = stmt.executeQuery("SELECT * FROM Usuario WHERE Usu_folio='"+id+"'");
      if(resultado.next()){
        return new Usuario(
          id,
          resultado.getString("Usu_nombre"),
          resultado.getString("Usu_pwd"),
          new RolUsuario(
            resultado.getString("RolUsu_folio")
          )
        );
      }
      con.close();
    } catch (SQLException ex) {
      Logger.getLogger(DAOUsuarioImpl.class.getName()).log(Level.SEVERE, null, ex);
    }  
    return null;
  }
  
  public Usuario consultar(String nombre, String password){
    String pwdEncrypt = Util.encriptar(password);
    System.out.println(pwdEncrypt);
    Conexion conexion = new Conexion();
    conexion.conectar();
    Connection con = conexion.getCon();
    try {
      Statement stmt;
      stmt = con.createStatement();
      ResultSet resultado = stmt.executeQuery("SELECT * FROM Usuario WHERE "
              + "Usu_nombre='"+nombre+"' and Usu_pwd='"+pwdEncrypt+"'");
      System.out.println("SELECT * FROM Usuario WHERE "
              + "Usu_nombre='"+nombre+"' and Usu_pwd='"+pwdEncrypt+"'");
      System.out.println("hola");
      if(resultado.next()){
        return new Usuario(
          resultado.getString("Usu_folio"),
          nombre,
          pwdEncrypt,
          new RolUsuario(
            resultado.getString("RolUsu_folio")
          )
        );
      }
      con.close();
    } catch (SQLException ex) {
      Logger.getLogger(DAOUsuarioImpl.class.getName()).log(Level.SEVERE, null, ex);
    }  
    return null;
  }

  @Override
  public boolean eliminar(String id) {
    Conexion conexion = new Conexion();
    conexion.conectar();
    Connection con = conexion.getCon();
    try {
      Statement stmt;
      stmt = con.createStatement();
      stmt.executeUpdate("DELETE FROM Usuario WHERE Usu_folio='"+id+"'");
      return true;
    } catch (SQLException ex) {
      Logger.getLogger(DAOUsuarioImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
    return false;
  }

  @Override
  public boolean actualizar(Usuario entidad) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean insertar(Usuario entidad) {
    Conexion conexion = new Conexion();
    conexion.conectar();
    Connection con = conexion.getCon();
    try {
      Statement stmt;
      stmt = con.createStatement();
      stmt.executeUpdate("INSERT INTO Usuario "
              + "VALUES ('"+entidad.getFolio()+"', "
              + "'"+entidad.getNombre()+"', "
              + "'"+entidad.getRol().getFolioRol()+"', "
              + "'"+entidad.getPwd()+"')");
      
      return true;
    } catch (SQLException ex) {
      Logger.getLogger(DAORolUsuarioImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
    return false;
  }

  @Override
  public List<Usuario> listarTodos() {
    LinkedList<Usuario> lista = new LinkedList<>();
    Conexion conexion = new Conexion();
    conexion.conectar();
    Connection con = conexion.getCon();
    try {
      Statement stmt;
      stmt = con.createStatement();
      ResultSet resultado = stmt.executeQuery("SELECT * FROM Usuario");
      while(resultado.next()){
        lista.add(new Usuario(
          resultado.getString("Usu_folio"),
          resultado.getString("Usu_nombre"),
          resultado.getString("Usu_pwd"),
          new RolUsuario(
            resultado.getString("RolUsu_folio")
          )
        ));
      }
      con.close();
      return lista;
    } catch (SQLException ex) {
      Logger.getLogger(DAOUsuarioImpl.class.getName()).log(Level.SEVERE, null, ex);
    }  
    return null;
  }
  
  public DefaultTableModel listar(){
    Conexion conexion = new Conexion();
    conexion.conectar();
    Connection con = conexion.getCon();
    try {
      Statement stmt;
      stmt = con.createStatement();
      ResultSet resultado = stmt.executeQuery("SELECT * FROM Usuario");
      
      ResultSetMetaData metaData = resultado.getMetaData();
      Vector<String> columnNames = new Vector<String>();
      int columnCount = metaData.getColumnCount();
      for (int column = 1; column <= columnCount; column++) {
          columnNames.add(metaData.getColumnName(column));
      }

      Vector<Vector<Object>> data = new Vector<Vector<Object>>();
      while (resultado.next()) {
        Vector<Object> vector = new Vector<Object>();
        for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
            vector.add(resultado.getObject(columnIndex));
        }
        data.add(vector);
      }
      con.close();
      return new DefaultTableModel(data, columnNames);
    } catch (SQLException ex) {
      Logger.getLogger(DAOUsuarioImpl.class.getName()).log(Level.SEVERE, null, ex);
    }  
    return null;
  }
}
