/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.usuario.Bean;

import aplicacion.modelo.dominio.Usuario;
import aplicacion.usuario.DAO.UsuarioDAO;
import aplicacion.usuario.Daoimp.usuarioDAOimp;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Alumno
 */
@ManagedBean
@ViewScoped
public class UsuarioBean {
    private UsuarioDAO Unusuario;
    private Usuario usuario1;
    

    /**
     * Creates a new instance of UsuarioBean
     */
    public UsuarioBean() {
        Unusuario= new usuarioDAOimp();
        
    }
    public void verificarusuario(String nombre,String password)
    {
        setUsuario1(getUnusuario().validarusuario(nombre, password));
    }
    public void obtenerusuario (String nombreUsuario)
    {
        setUsuario1(getUnusuario().obtenerusuario(nombreUsuario));
    }

    /**
     * @return the Unusuario
     */
    public UsuarioDAO getUnusuario() {
        return Unusuario;
    }

    /**
     * @param Unusuario the Unusuario to set
     */
    public void setUnusuario(UsuarioDAO Unusuario) {
        this.Unusuario = Unusuario;
    }

    /**
     * @return the usuario1
     */
    public Usuario getUsuario1() {
        return usuario1;
    }

    /**
     * @param usuario1 the usuario1 to set
     */
    public void setUsuario1(Usuario usuario1) {
        this.usuario1 = usuario1;
    }
    
}
