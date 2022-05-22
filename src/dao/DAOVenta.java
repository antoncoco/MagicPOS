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
public interface DAOVenta extends DAO<Venta, String>{
  
  public boolean validarVenta(Venta venta);
  
  public boolean registrarVenta(Venta venta);
  
}
