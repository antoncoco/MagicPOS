/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.*;
import database.Conexion;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.RolUsuario;
import modelos.Usuario;

/**
 *
 * @author MagicPOS
 */
public interface DAOUsuario extends DAO<Usuario, String>{
  public boolean login(Usuario usuario);
}
