/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.swing.JFrame;
import modelos.RolUsuario;

/**
 *
 * @author MagicPOS
 */
public interface DAORolUsuario extends DAO<RolUsuario,String>{
  public void accesoPorRol(RolUsuario rol, JFrame anterior);
}
