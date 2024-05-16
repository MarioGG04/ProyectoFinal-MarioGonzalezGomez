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
import org.model.Habitaciones;

/**
 *
 * @author Mario González Gómez
 */
public class HabitacionesController {
    public SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    /**
     * 
     * @param nombre
     * @return 
     */    
    public List<Habitaciones> obtenerHabitaciones() {

        try  {
              Session sesion = sessionFactory.openSession();
                Query q = sesion.createQuery("FROM Habitaciones");
		List<Habitaciones> ht = q.getResultList();
		
		return ht;    

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public Habitaciones filtrarHabitacion(Hoteles h){
        try  {
              Session sesion = sessionFactory.openSession();
                Query q = sesion.createQuery("FROM Habitaciones WHERE id = :id");
                
                int idHab = 0;
                
                switch(h.getId()){
                    case 1:
                        idHab = 10;
                        break;
                        
                    case 2:
                        idHab =14;
                        break;
                        
                    case 3:
                        idHab = 15;
                        break;
                        
                    case 4:
                        idHab = 16;
                        break; 
                    
                    case 5:
                        idHab = 11;
                        break;
                        
                    case 6:
                        idHab = 12;
                        break;
                        
                    case 7:
                        idHab = 13;
                        break;
                        
                    case 8:
                        idHab = 17;
                        break;
                        
                    case 9:
                        idHab = 18;
                        break;
                        
                    case 10:
                        idHab = 2;
                        break;
                        
                    case 11:
                        idHab = 3;
                        break;
                        
                    case 12:
                        idHab = 4;
                        break;
                        
                    case 13:
                        idHab = 5;
                        break;
                        
                    case 14:
                        idHab = 6;
                        break;    
                        
                    case 15:
                        idHab = 1;
                        break;
                        
                    case 16:
                        idHab = 7;
                        break;
                        
                    case 17:
                        idHab = 8;
                        break;
                        
                    case 18:
                        idHab = 9;
                        break;
         
                }
		q.setParameter("id", idHab);
		List<Habitaciones> ht = q.getResultList();
		
                Habitaciones ht2 = null;
		
		for (Habitaciones u: ht) {
			ht2 = u;
		}
                
		return ht2;    

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
        
}
