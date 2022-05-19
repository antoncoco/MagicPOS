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
public class Proveedor {
  private String rfc;
  private String nombre;
  private String contactoNombre;
  private String contactoDesc;
  private String calle;
  private int numExt;
  private int numInt;
  private String estado;
  private String ciudad;
  private String cp;
  private String correo;
  private String telefono;
  private String sitioWeb;

  public Proveedor(String rfc, String nombre, String contactoNombre, String contactoDesc, String calle, int numExt, int numInt, String estado, String ciudad, String cp, String correo, String telefono, String sitioWeb) {
    this.rfc = rfc;
    this.nombre = nombre;
    this.contactoNombre = contactoNombre;
    this.contactoDesc = contactoDesc;
    this.calle = calle;
    this.numExt = numExt;
    this.numInt = numInt;
    this.estado = estado;
    this.ciudad = ciudad;
    this.cp = cp;
    this.correo = correo;
    this.telefono = telefono;
    this.sitioWeb = sitioWeb;
  }
  
}
