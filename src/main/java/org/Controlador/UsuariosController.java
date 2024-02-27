/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.Controlador;

import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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
    
public void modificarUsuario(Usuario u) {
    Session sesion = sessionFactory.openSession();
    Transaction tx = null; // You need a transaction for updates
    
    try {
        tx = sesion.beginTransaction();
        
        Query q = sesion.createQuery("UPDATE Usuario SET nombre=:nombre, apellido=:apellido, username = :username WHERE email = :email");
        q.setParameter("nombre", u.getNombre());
        q.setParameter("apellido", u.getApellido());
        q.setParameter("username", u.getUsername());
        q.setParameter("email", u.getEmail());
        
        int result = q.executeUpdate(); // Execute the update query
        
        tx.commit(); // Commit the transaction
    } catch (RuntimeException e) {
        if (tx != null && tx.isActive()) {
            tx.rollback(); // Rollback transaction if exception occurs
        }
        throw e; // Rethrow the exception
    } finally {
        sesion.close(); // Close the session
    }
}

    
}
