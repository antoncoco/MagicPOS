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
public class Venta {
  private String folio;
  private ProductoAlmacen producto;
  private int cantidad;
  private double descuento;
  private Date fechaReg;

  public Venta(String folio, ProductoAlmacen producto, int cantidad, double descuento, Date fechaReg) {
    this.folio = folio;
    this.producto = producto;
    this.cantidad = cantidad;
    this.descuento = descuento;
    this.fechaReg = fechaReg;
  }
 
}
