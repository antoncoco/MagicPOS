/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.Date;

/**
 *
 * @author MagicPOS
 */
public class ProductoAlmacen {
  private String folio;
  private Producto producto;
  private int cantidad;
  private Date fechaReg;
  private Date caducidad;

  public ProductoAlmacen(String folio, int cantidad, Date fechaReg, Date caducidad, Producto producto) {
    this.folio = folio;
    this.cantidad = cantidad;
    this.fechaReg = fechaReg;
    this.caducidad = caducidad;
    this.producto = producto;
  }

  public String getFolio() {
    return folio;
  }

  public Producto getProducto() {
    return producto;
  }

  public int getCantidad() {
    return cantidad;
  }

  public Date getFechaReg() {
    return fechaReg;
  }

  public Date getCaducidad() {
    return caducidad;
  }
  
  
}
