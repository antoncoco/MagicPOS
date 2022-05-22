/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

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
import modelos.Venta;

/**
 *
 * @author MagicPOS
 */
public class DAOVentaImpl {

  private Venta venta;

  public boolean validarVenta(Venta venta) {
    boolean bandera = false;
    return bandera;
  }

  public boolean registrarVenta(Venta venta) {
    boolean bandera = false;
    return bandera;
  }

  public static void generarTicket(List<Venta> ventas) {
  }

  public static void generarReporte(List<Venta> ventas) {
  }

  public DefaultTableModel listarProd() {
    Conexion conexion = new Conexion();
    conexion.conectar();
    Connection con = conexion.getCon();
    try {
      Statement stmt;
      stmt = con.createStatement();
      ResultSet resultado = stmt.executeQuery("SELECT * FROM selectVenta");

      ResultSetMetaData metaData = resultado.getMetaData();
      Vector<String> columnNames = new Vector<String>();
      int columnCount = metaData.getColumnCount();
      columnNames.add("Folio");
      columnNames.add("Producto");
      columnNames.add("Cantidad");
      columnNames.add("Precio");
      columnNames.add("Fecha Registro");
      columnNames.add("Caducidad");

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
