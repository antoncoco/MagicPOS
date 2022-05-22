/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import dao.DAOProductoAlmacen;
import database.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import modelos.ProductoAlmacen;

/**
 *
 * @author MagicPOS
 */
public class DAOProductoAlmacenImpl implements DAOProductoAlmacen {

  @Override
  public boolean validarDisponibilidad(ProductoAlmacen producto) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void comprarProducto(ProductoAlmacen producto) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public int calcularMerma(ProductoAlmacen producto) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void generarReporte(List<ProductoAlmacen> productos) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public ProductoAlmacen consultar(String id) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean eliminar(String id) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean actualizar(ProductoAlmacen entidad) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean insertar(ProductoAlmacen entidad) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public List<ProductoAlmacen> listarTodos() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
