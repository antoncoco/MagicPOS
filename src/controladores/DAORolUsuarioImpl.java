/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import dao.DAORolUsuario;
import database.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import modelos.RolUsuario;
import vistas.IniciarSesion;
import vistas.Inventario;
import vistas.PanelAdmin;
import vistas.Reportes;
import vistas.Venta;

/**
 *
 * @author MagicPOS
 */
public class DAORolUsuarioImpl implements DAORolUsuario{
  private RolUsuario rol;

  @Override
  public void accesoPorRol(RolUsuario rol, JFrame anterior) {
    String id = rol.getFolioRol();
    JFrame siguiente = new JFrame();
    switch(id){
      case "ROL-00001":
        siguiente = new PanelAdmin();
        break;
      case "ROL-00002":
        siguiente = new Venta();
        break;
      case "ROL-00003":
        siguiente = new Inventario();
        break;
      case "ROL-00004":
        siguiente = new Reportes();
        break;
      default:
        siguiente = new IniciarSesion();
    }
    siguiente.setLocationRelativeTo(anterior);
    anterior.dispose();
    siguiente.setVisible(true);
  }

  @Override
  public RolUsuario consultar(String id) {
    Conexion conexion = new Conexion();
    conexion.conectar();
    Connection con = conexion.getCon();
    try {
      Statement stmt;
      stmt = con.createStatement();
      ResultSet resultado = stmt.executeQuery("SELECT * FROM Rol_usuario WHERE RolUsu_folio='"+id+"'");
      if(resultado.next()){
        return new RolUsuario(
          id,
          resultado.getString("RolUsu_nombre")
        );
      }
      con.close();
    } catch (SQLException ex) {
      Logger.getLogger(DAOUsuarioImpl.class.getName()).log(Level.SEVERE, null, ex);
    }  
    return null;
  }

  @Override
  public boolean eliminar(String id) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean actualizar(RolUsuario entidad) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean insertar(RolUsuario entidad) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public List<RolUsuario> listarTodos() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  
}
