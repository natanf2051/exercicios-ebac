package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import main.Marca;

public class MarcaDAO implements IMarcaDAO{

    @Override
    public Marca cadastrar(Marca marca) {
        EntityManagerFactory mc = 
        Persistence.createEntityManagerFactory("exemploCarro");
        EntityManager entityManager = mc.createEntityManager();
        
        entityManager.getTransaction().begin();
		entityManager.persist(marca);
		entityManager.getTransaction().commit();
		 
		entityManager.close();
		mc.close();

        return marca;
    }

    
}
