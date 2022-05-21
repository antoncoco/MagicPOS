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
public interface DAOProductoAlmacen extends DAO<ProductoAlmacen, String>{
  
  public boolean validarDisponibilidad(ProductoAlmacen producto);
  
  public void comprarProducto(ProductoAlmacen producto);
  
  public int calcularMerma(ProductoAlmacen producto);
  
  public void generarReporte(List<ProductoAlmacen> productos);
  
}
