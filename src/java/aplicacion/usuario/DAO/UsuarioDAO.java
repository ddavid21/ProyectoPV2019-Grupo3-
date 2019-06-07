/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.usuario.DAO;

import aplicacion.modelo.dominio.Usuario;

/**
 *
 * @author Alumno
 */
public interface UsuarioDAO {
    public Usuario validarusuario(String nombreusuario, String password);
    public Usuario obtenerusuario (String nombreusuario);
    public void modificar (Usuario unUsuario);
    
}
