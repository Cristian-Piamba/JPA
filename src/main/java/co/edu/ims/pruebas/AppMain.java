package co.edu.ims.pruebas;

import co.edu.ims.modelo.Genero;
import co.edu.ims.modelo.Pelicula;
import co.edu.ims.modelo.Persona;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AppMain {
    
    public static void main (String[] args){
        
        EntityManagerFactory emf;
        EntityManager em; 
        
        emf = Persistence.createEntityManagerFactory("peliculasPU");        
        em = emf.createEntityManager();
        
        // Se crea objeto en memoria (sin persistir aun).
        Genero accion = new Genero("comedia", "payasos");
        
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(accion); // Se persiste objeto en base de datos.
        tx.commit();
        
        // Se crea objeto en memoria (sin persistir aun).
        Persona guillermoDelToro = new Persona(
                "Cristian ", 
                "MX",
                (new GregorianCalendar(1964, 9, 9)).getTime() );
        
        tx.begin();
        em.persist(guillermoDelToro); // Se persiste objeto en base de datos.
        tx.commit();
        
        // Se crea objeto en memoria (sin persistir aun).
//        Genero romance = new Genero("-----", "------");
        
        Pelicula pelicula = new Pelicula("Wolverine", "2017");        
        
        tx.begin();
        em.persist(pelicula);
        tx.commit();
    }
    
}
