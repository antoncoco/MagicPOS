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
  private short descontinuado;
  private Proveedor proveedor;
  private Categoria categoria;

  public Producto(String clave, String nombre, String medidaDesc, double precio, int cantidadProveedor, int cantidadLimite, short descontinuado, Proveedor proveedor, Categoria categoria) {
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

  public Producto(String clave) {
    this.clave = clave;
    this.nombre = "";
    this.medidaDesc = "";
    this.precio = 0.00;
    this.cantidadProveedor = 0;
    this.cantidadLimite = 0;
    this.descontinuado = 0;
    this.proveedor = null;
    this.categoria = null;
  }

  public String getClave() {
    return clave;
  }

  public String getNombre() {
    return nombre;
  }

  public String getMedidaDesc() {
    return medidaDesc;
  }

  public double getPrecio() {
    return precio;
  }

  public int getCantidadProveedor() {
    return cantidadProveedor;
  }

  public int getCantidadLimite() {
    return cantidadLimite;
  }

  public short isDescontinuado() {
    return descontinuado;
  }

  public Proveedor getProveedor() {
    return proveedor;
  }

  public Categoria getCategoria() {
    return categoria;
  }

}
