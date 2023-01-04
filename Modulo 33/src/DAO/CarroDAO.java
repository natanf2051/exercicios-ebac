package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import main.Carro;

public class CarroDAO implements ICarroDAO{

    @Override
    public Carro cadastrar(Carro carro) {
        EntityManagerFactory mc = 
        Persistence.createEntityManagerFactory("exemploCarro");
        EntityManager entityManager = mc.createEntityManager();
        
        entityManager.getTransaction().begin();
		entityManager.persist(carro);
		entityManager.getTransaction().commit();
		 
		entityManager.close();
		mc.close();

        return carro;
    }
    
}
