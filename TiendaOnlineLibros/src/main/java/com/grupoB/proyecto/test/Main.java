package com.grupoB.proyecto.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.grupoB.proyecto.modelo.Categoria;
import com.grupoB.proyecto.util.Sesion;

public class Main 
{

	public static void main(String[] args) 
	{
		System.out.println("-------------------------------------------");
        System.out.println("--- Hibernate 06c. Trabajando con NamedQueries ---");
        System.out.println("-------------------------------------------"); 	
        //Sesion sesion=new Sesion();

        // Creamos el SessionFactory y el objeto de Session hibernate
        SessionFactory sessions = Sesion.getSessionFactory();
        
        // tb vale SessionFactory sessions = new Configuration().configure().buildSessionFactory();
        // org.â€‹hibernate.â€‹SessionFactory
        Session session = sessions.openSession();

        // PROBANDO EL HQL
        Query query;

        System.out.println("\n------ LISTADO DE CATEGORIAS");
        query = session.getNamedQuery("Categoria.findAll");
        System.out.println("\n--las listo");
        List<Categoria> categoriaList = query.list();
        for (Categoria categoria : categoriaList) {
            System.out.println(categoria);
        }

        /*//usa  @NamedQuery(name = "Direccion.findByCity", query = "SELECT r FROM Direccion r WHERE r.city = :city")})
        System.out.println("\n------ LISTADO DE DIRECCIONES DE MADRID");
        query = session.getNamedQuery("Direccion.findByCity");
        //despuÃ©s de la precompilada hace el set
        query.setString("city", "Madrid");
      //PONDRÃ�A OTRA SI TUVIERA OTRA CONDICION query.setString("", "");
        // System.out.println("-- " + query.getQueryString());
        addressList = query.list();
        for (Direccion addr : addressList) {
            System.out.println(addr);
        }
        // Realiza la operaciÃ³n
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            System.out.println("--- OK. Realizo transaccion");
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                System.out.println("--- Fallo. Deshacer accion");
                tx.rollback();
            }
            System.out.println(e.getMessage());
            e.getMessage();
        } finally {
            session.close();
        }
*/

	}

}
