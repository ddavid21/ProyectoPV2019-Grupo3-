/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.usuario.Daoimp;

import aplicacion.hibernate.configuracion.HibernateUtil;
import aplicacion.modelo.dominio.Usuario;
import aplicacion.usuario.DAO.UsuarioDAO;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Alumno
 */
public class usuarioDAOimp implements UsuarioDAO{

    @Override
    public Usuario validarusuario(String nombreusuario, String password) {
      Usuario u=null;
      Session session= HibernateUtil.getSessionFactory().openSession();
      session.beginTransaction();
      Criteria criteria= session.createCriteria(Usuario.class);
      criteria.add(Restrictions.like("nombreusuario", nombreusuario));
      criteria.add(Restrictions.like("Password", password));
      criteria.add(Restrictions.like("Estado", true));
      if(!criteria.list().isEmpty())
      {
          u=(Usuario)criteria.list().get(0);
          session.getTransaction().commit();
          session.close();
      }
      return u;
    }

    @Override
    public Usuario obtenerusuario(String nombreusuario) {
        Usuario u=null;
      Session session= HibernateUtil.getSessionFactory().openSession();
      session.beginTransaction();
      Criteria criteria= session.createCriteria(Usuario.class);
      criteria.add(Restrictions.like("nombreusuario", nombreusuario));
      if(!criteria.list().isEmpty())
      {
          u=(Usuario)criteria.list().get(0);
          session.getTransaction().commit();
          session.close();
      }
      return u;
    }

    @Override
    public void modificar(Usuario unUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
