/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import dao.DAOProveedor;
import database.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import modelos.Proveedor;

/**
 *
 * @author MagicPOS
 */
public class DAOProveedorImpl implements DAOProveedor {

  private Proveedor proveedor;

  @Override
  public Proveedor consultar(String id) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean eliminar(String id) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean actualizar(Proveedor entidad) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean insertar(Proveedor entidad) {
    Conexion conexion = new Conexion();
    conexion.conectar();
    Connection con = conexion.getCon();
    try {
      Statement stmt;
      stmt = con.createStatement();
      stmt.executeUpdate("INSERT INTO Proveedor "
        + "VALUES ('" + entidad.getRfc() + "', "
        + "'" + entidad.getNombre() + "', "
        + "'" + entidad.getContactoNombre() + "', "
        + "'" + entidad.getContactoDesc() + "', "
        + "'" + entidad.getCalle() + "', "
        + "'" + entidad.getNumExt() + "', "
        + "'" + entidad.getNumInt() + "', "
        + "'" + entidad.getEstado() + "', "
        + "'" + entidad.getCiudad() + "', "
        + "'" + entidad.getCp() + "', "
        + "'" + entidad.getCorreo() + "', "
        + "'" + entidad.getTelefono() + "', "
        + "'" + entidad.getSitioWeb() +"');");

      return true;
    } catch (SQLException ex) {
      Logger.getLogger(DAOCategoriaImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
    return false;
  }

  @Override
  public List<Proveedor> listarTodos() {
    LinkedList<Proveedor> lista = new LinkedList<>();
    Conexion conexion = new Conexion();
    conexion.conectar();
    Connection con = conexion.getCon();
    try {
      Statement stmt;
      stmt = con.createStatement();
      ResultSet resultado = stmt.executeQuery("SELECT * FROM Proveedor");
      while (resultado.next()) {
        lista.add(new Proveedor(
          resultado.getString("Prov_RFC"),
          resultado.getString("Prov_nombre"),
          resultado.getString("Prov_contactoNombre"),
          resultado.getString("Prov_contactoDescripcion"),
          resultado.getString("Prov_calle"),
          resultado.getString("Prov_numExt"),
          resultado.getString("Prov_numInt"),
          resultado.getString("Prov_estado"),
          resultado.getString("Prov_ciudad"),
          resultado.getString("Prov_CP"),
          resultado.getString("Prov_correo"),
          resultado.getString("Prov_telefono"),
          resultado.getString("Prov_sitioWeb")
        ));
      }
      con.close();
      return lista;
    } catch (SQLException ex) {
      Logger.getLogger(DAOProveedorImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
  }

  public DefaultTableModel listar() {
    Conexion conexion = new Conexion();
    conexion.conectar();
    Connection con = conexion.getCon();
    try {
      Statement stmt;
      stmt = con.createStatement();
      ResultSet resultado = stmt.executeQuery("SELECT * FROM Proveedor");

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
