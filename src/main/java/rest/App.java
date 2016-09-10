package rest;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

//import danielcruzmx.com.data.Catalogo;

public class App {

	//private EntityManager manager;

    public static void main( String[] args )
    {
        EntityManagerFactory factory = 
        	Persistence.createEntityManagerFactory("persistenceUnit");
        EntityManager manager = factory.createEntityManager();

        TypedQuery<Catalogo> consulta = 
                        manager.createQuery("Select a From Catalogo a", Catalogo.class);
        List<Catalogo> lista = consulta.getResultList();
        System.out.println("\n");
        System.out.println("Numero de elementos:" + lista.size());
        for (Catalogo next : lista) {
            System.out.println("Siguiente: " + next);
        }
        System.out.println("\n");

        manager.close();
    }
}