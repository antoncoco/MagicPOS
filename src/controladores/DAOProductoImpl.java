/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import dao.DAOProducto;
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
import modelos.Producto;
import modelos.Proveedor;

/**
 *
 * @author MagicPOS
 */
public class DAOProductoImpl implements DAOProducto {

  private Producto producto;

  @Override
  public Producto consultar(String id) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean eliminar(String id) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean actualizar(Producto entidad) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean insertar(Producto entidad) {
    Conexion conexion = new Conexion();
    conexion.conectar();
    Connection con = conexion.getCon();
    try {
      Statement stmt;
      stmt = con.createStatement();
      stmt.executeUpdate("INSERT INTO Producto "
        + "VALUES ('" + entidad.getClave() + "', "
        + "'" + entidad.getNombre() + "', "
        + "'" + entidad.getMedidaDesc() + "', "
        + "'" + entidad.getPrecio() + "', "
        + "'" + entidad.getCantidadProveedor() + "', "
        + "'" + entidad.getCantidadLimite() + "', "
        + "'" + entidad.isDescontinuado() + "', "
        + "'" + entidad.getProveedor().getRfc() + "', "
        + "'" + entidad.getCategoria().getFolio() + "')"
      );

      return true;
    } catch (SQLException ex) {
      Logger.getLogger(DAOProductoImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
    return false;
  }

  @Override
  public List<Producto> listarTodos() {
    LinkedList<Producto> lista = new LinkedList<>();
    Conexion conexion = new Conexion();
    conexion.conectar();
    Connection con = conexion.getCon();
    try {
      Statement stmt;
      stmt = con.createStatement();
      ResultSet resultado = stmt.executeQuery("SELECT * FROM Producto");
      while (resultado.next()) {
        lista.add(new Producto(
          resultado.getString("Prod_clave"),
          resultado.getString("Prod_nombre"),
          resultado.getString("Prod_medidaDescripcion"),
          resultado.getDouble("Prod_precio"),
          resultado.getInt("Prod_cantidadProveedor"),
          resultado.getInt("Prod_cantidadLimite"),
          resultado.getShort("Prod_descontinuado"),
          new Proveedor(
            resultado.getString("Prov_RFC")
          ),
          new Categoria(
            resultado.getString("Cat_folio")
          )
        ));
      }
      con.close();
      return lista;
    } catch (SQLException ex) {
      Logger.getLogger(DAOProductoImpl.class.getName()).log(Level.SEVERE, null, ex);
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
      ResultSet resultado = stmt.executeQuery("SELECT * FROM Producto");

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
