package org.Controlador;

import javax.persistence.Query;
import org.model.Usuario;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.mindrot.jbcrypt.BCrypt;

public class HibernateUtil {
private static SessionFactory sessionFactory = buildSessionFactory();

/**
 * Inicializacion de la conexion con la base de datos
 *
 * @return SessionFactory
 */
public static SessionFactory buildSessionFactory() {
  Configuration configuration = new Configuration();
  configuration.configure(
    "hibernate.cfg.xml");
  return configuration.buildSessionFactory();
}

    // Método para cerrar la sesión
    public static void closeSession(Session session) {
        if (session != null && session.isOpen()) {
            session.close();
        }
    }

    // Método para realizar el registro de un Usuario
    public static void registrarUsuario(String nombre, String apellidos, String user, String email, String pass) {
        SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();
        Session session = sessionFactory.openSession();
        
        try {
            session.beginTransaction();
            Usuario usuario = new Usuario();
            String hashPass = BCrypt.hashpw(pass, BCrypt.gensalt());
            usuario.setNombre(nombre);
            usuario.setApellido(apellidos);
            usuario.setUsername(user);
            usuario.setEmail(email);
            usuario.setPassword(hashPass);
            session.save(usuario);
            session.getTransaction().commit();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static boolean comprobarPass(String pass, String user){
        
        Usuario usr = obtenerUsuario(user);
        
        String hashPass = usr.getPassword();
        
        if (BCrypt.checkpw(pass, hashPass)) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void actualizarUsuario(String user, String pass) {
        SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();
        Session session = sessionFactory.openSession();
    try  {
        Transaction tx = session.beginTransaction();
        Usuario usr = obtenerUsuario(user);
        // Cargar el usuario existente desde la base de datos
        Usuario usuario = session.get(Usuario.class, usr.getId());

        if (usuario != null) {
            // Actualizar los campos necesarios
            usuario.setNombre(usr.getNombre());
            usuario.setApellido(usr.getApellido());
            usuario.setUsername(usr.getUsername());
            usuario.setEmail(usr.getEmail());
            

            // Verificar si se proporciona una nueva contraseña y actualizarla
            if (pass != null && !pass.isEmpty()) {
                String hashPass = BCrypt.hashpw(pass, BCrypt.gensalt());
                usuario.setPassword(hashPass);
            }

            // Guardar los cambios
            session.update(usuario);

            tx.commit();
        } 
    } catch (Exception e) {
        e.printStackTrace();
    }
}

    
    public static Usuario obtenerUsuario(String nombreUsuario) {
        SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();
        Session session = sessionFactory.openSession();
    try  {
        // Utilizando HQL
        String hql = "FROM Usuario WHERE username = :nombreUsuario";
        var query = session.createQuery(hql, Usuario.class);
        query.setParameter("nombreUsuario", nombreUsuario);
        Usuario usuario = query.uniqueResult();

        return usuario;
    } catch (Exception e) {
        e.printStackTrace();
        return null;
    }
}
}
