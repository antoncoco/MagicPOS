/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author MagicPOS
 */
public class Producto {
  private String clave;
  private String nombre;
  private String medidaDesc;
  private double precio;
  private int cantidadProveedor;
  private int cantidadLimite;
  private boolean descontinuado;
  private Proveedor proveedor;
  private Categoria categoria;

  public Producto(String clave, String nombre, String medidaDesc, double precio, int cantidadProveedor, int cantidadLimite, boolean descontinuado, Proveedor proveedor, Categoria categoria) {
    this.clave = clave;
    this.nombre = nombre;
    this.medidaDesc = medidaDesc;
    this.precio = precio;
    this.cantidadProveedor = cantidadProveedor;
    this.cantidadLimite = cantidadLimite;
    this.descontinuado = descontinuado;
    this.proveedor = proveedor;
    this.categoria = categoria;
  }
  
}
