package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import main.Acessorio;

public class AcessorioDAO implements IAcessorioDAO {

    @Override
    public Acessorio cadastrar(Acessorio acessorio) {
        EntityManagerFactory mc = 
        Persistence.createEntityManagerFactory("exemploCarro");
        EntityManager entityManager = mc.createEntityManager();
        
        entityManager.getTransaction().begin();
		entityManager.persist(acessorio);
		entityManager.getTransaction().commit();
		 
		entityManager.close();
		mc.close();

        return acessorio;
    }
    
}
