/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import dao.DAOCategoria;
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
import modelos.Categoria;

/**
 *
 * @author MagicPOS
 */
public class DAOCategoriaImpl implements DAOCategoria {

  private Categoria categoria;

  @Override
  public Categoria consultar(String id) {
    Conexion conexion = new Conexion();
    conexion.conectar();
    Connection con = conexion.getCon();
    try {
      Statement stmt;
      stmt = con.createStatement();
      ResultSet resultado = stmt.executeQuery("SELECT * FROM Categoria_producto WHERE Cat_folio='" + id + "'");
      if (resultado.next()) {
        return new Categoria(
          id,
          resultado.getString("Cat_nombre"),
          resultado.getString("Cat_descripcion")
        );
      }
      con.close();
    } catch (SQLException ex) {
      Logger.getLogger(DAOCategoriaImpl.class.getName()).log(Level.SEVERE, null, ex);
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
      stmt.executeUpdate("DELETE FROM Categoria_producto WHERE Cat_folio='" + id + "'");
      con.close();
      return true;
    } catch (SQLException ex) {
      Logger.getLogger(DAOCategoriaImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
    return false;
  }

  @Override
  public boolean actualizar(Categoria entidad) {
    Conexion conexion = new Conexion();
    conexion.conectar();
    Connection con = conexion.getCon();
    try {
      Statement stmt;
      stmt = con.createStatement();
      stmt.executeUpdate("UPDATE Categoria_producto SET Cat_descripcion = '" + entidad.getDescripcion() + "'"
        + "WHERE Cat_folio = '" + entidad.getFolio() + "'");
      con.close();
      return true;
    } catch (SQLException ex) {
      Logger.getLogger(DAOCategoriaImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
    return false;

  }

  @Override
  public boolean insertar(Categoria entidad) {
    Conexion conexion = new Conexion();
    conexion.conectar();
    Connection con = conexion.getCon();
    try {
      Statement stmt;
      stmt = con.createStatement();
      stmt.executeUpdate("INSERT INTO Categoria_producto "
        + "VALUES ('" + entidad.getFolio() + "', "
        + "'" + entidad.getNombre() + "', "
        + "'" + entidad.getDescripcion() + "');");

      return true;
    } catch (SQLException ex) {
      Logger.getLogger(DAOCategoriaImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
    return false;
  }

  @Override
  public List<Categoria> listarTodos() {
    LinkedList<Categoria> lista = new LinkedList<>();
    Conexion conexion = new Conexion();
    conexion.conectar();
    Connection con = conexion.getCon();
    try {
      Statement stmt;
      stmt = con.createStatement();
      ResultSet resultado = stmt.executeQuery("SELECT * FROM Categoria_producto");
      while (resultado.next()) {
        lista.add(new Categoria(
          resultado.getString("Cat_folio"),
          resultado.getString("Cat_nombre"),
          resultado.getString("Cat_descripcion")));
      }
      con.close();
      return lista;
    } catch (SQLException ex) {
      Logger.getLogger(DAOCategoriaImpl.class.getName()).log(Level.SEVERE, null, ex);
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
      ResultSet resultado = stmt.executeQuery("SELECT * FROM Categoria_producto");

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
      return new DefaultTableModel(data, columnNames) {
        @Override
        public boolean isCellEditable(int row, int column) {
          return column == 2;
        }
      };
    } catch (SQLException ex) {
      Logger.getLogger(DAOUsuarioImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
  }

  public DefaultTableModel listar(String nombreMatch) {
    Conexion conexion = new Conexion();
    conexion.conectar();
    Connection con = conexion.getCon();
    try {
      Statement stmt;
      stmt = con.createStatement();
      ResultSet resultado = stmt.executeQuery("SELECT * FROM Categoria_producto "
        + "WHERE Cat_nombre LIKE '%" + nombreMatch + "%'");

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
      return new DefaultTableModel(data, columnNames) {
        @Override
        public boolean isCellEditable(int row, int column) {
          return column == 2;
        }
      };
    } catch (SQLException ex) {
      Logger.getLogger(DAOUsuarioImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
  }

}
