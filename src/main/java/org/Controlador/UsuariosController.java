/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.Controlador;

import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.model.Usuario;

/**
 *
 * @author Mario González Gómez
 */
public class UsuariosController {
    public SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    /**
     * 
     * @param email
     * @return 
     */    
    public Usuario obtenerUsuario(String email) {

    try  {
              Session sesion = sessionFactory.openSession();
                Query q = sesion.createQuery("FROM Usuario WHERE email = :email");
		q.setParameter("email", email);
		List<Usuario> usr = q.getResultList();
		
		Usuario usr2 = null;
		
		for (Usuario u: usr) {
			usr2 = u;
		}

		return usr2;    

    } catch (Exception e) {
        e.printStackTrace();
        return null;
    }
}
    
}
