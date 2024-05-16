/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.Controlador;

import java.sql.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.model.Habitaciones;
import org.model.Hoteles;
import org.model.Reservas;
import org.model.ReservasId;
import org.model.Usuario;

/**
 *
 * @author Mario González Gómez
 */

public class ReservasController {
    public SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    /**
     * 
     * @param u
     * @return 
     */
    public List<Reservas> mostrarReservas(Usuario u) {

            Session sesion = sessionFactory.openSession();
            Reservas reserv = new Reservas();
            
           // Query q = sesion.createQuery("from Reservas where usuario = :usuario");
           // q.setParameter("usuario", u.getId());
            Query q = sesion.createQuery("from Reservas");
            List<Reservas> reservas = q.getResultList();

            return reservas;
    }
    
    public void hacerReserva(Usuario u, Habitaciones h, Hoteles ht, Date fechaEntrada, Date fechaSalida, double precio){
        
        Session sesion = sessionFactory.openSession();
        sesion.beginTransaction();
        ReservasId rId = new ReservasId(h.getNumero(), ht.getId(), u.getId());
        Reservas r = new Reservas(rId, ht, u, h, fechaEntrada, fechaSalida, precio);
  
        sesion.save(r);
        sesion.getTransaction().commit();
        
    }
}
