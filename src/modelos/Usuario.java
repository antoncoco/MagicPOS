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
public class Usuario {
  private String folio;
  private String nombre;
  private String pwd;
  private RolUsuario rol;

  public Usuario(String folio, String nombre, String pwd, RolUsuario rol) {
    this.folio = folio;
    this.nombre = nombre;
    this.pwd = pwd;
    this.rol = rol;
  }
}
