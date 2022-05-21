/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magicpos;

import vistas.AgregarCategoria;
import vistas.AgregarInventario;
import vistas.AgregarProducto;
import vistas.AgregarProveedor;
import vistas.AgregarUsuario;
import vistas.GestionDeUsuarios;
import vistas.IniciarSesion;
import vistas.PanelAdmin;

/**
 *
 * @author MagicPOS
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    System.out.println("MagicPOS is amazing!");

//    IniciarSesion iniciar = new IniciarSesion();
//    PanelAdmin iniciar = new PanelAdmin();
//    AgregarUsuario iniciar = new AgregarUsuario();
//    AgregarCategoria iniciar = new AgregarCategoria();
//    AgregarInventario iniciar = new AgregarInventario();
//    AgregarProveedor iniciar = new AgregarProveedor();
//    AgregarProducto iniciar = new AgregarProducto();
    GestionDeUsuarios iniciar = new GestionDeUsuarios();
    iniciar.setVisible(true);
  }

}
