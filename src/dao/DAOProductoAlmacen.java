/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import modelos.ProductoAlmacen;

/**
 *
 * @author MagicPOS
 */
public class DAOProductoAlmacen implements DAO<ProductoAlmacen, String>{

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
  
  public boolean validarDisponibilidad(ProductoAlmacen producto){
    boolean bandera = false;
    return bandera;
  }
  
  public void comprarProducto(ProductoAlmacen producto){}
  
  public int calcularMerma(ProductoAlmacen producto){
    int merma = 0;
    return merma;
  }
  
  public void generarReporte(List<ProductoAlmacen> productos){}
  
}
