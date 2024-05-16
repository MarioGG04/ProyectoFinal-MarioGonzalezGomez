/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.Controlador;

import java.util.List;
import javax.persistence.Query;
import org.model.Hoteles;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Mario González Gómez
 */
public class AlojamientosController {
    public SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    /**
     * 
     * @param nombre
     * @return 
     */    
    public Hoteles obtenerAlojamientos(int id) {

    try  {
              Session sesion = sessionFactory.openSession();
                Query q = sesion.createQuery("FROM Hoteles WHERE id = :id");
		q.setParameter("id", id);
		List<Hoteles> ht = q.getResultList();
		
		Hoteles ht2 = null;
		
		for (Hoteles u: ht) {
			ht2 = u;
		}

		return ht2;    

    } catch (Exception e) {
        e.printStackTrace();
        return null;
    }
}
        
}
