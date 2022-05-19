/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import modelos.Venta;

/**
 *
 * @author MagicPOS
 */
public class DAOVenta implements DAO<Venta, String>{

  @Override
  public Venta consultar(String id) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean eliminar(String id) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean actualizar(Venta entidad) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean insertar(Venta entidad) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public List<Venta> listarTodos() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  
  public boolean validarVenta(Venta venta){
    boolean bandera = false;
    return bandera;
  }
  
  public boolean registrarVenta(Venta venta){
    boolean bandera = false;
    return bandera;
  }
  
  public static void generarTicket(List<Venta> ventas){}
  
  public static void generarReporte(List<Venta> ventas){}
  
}
