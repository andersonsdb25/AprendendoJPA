package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Dao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("AprendendoJPA");
	EntityManager em = emf.createEntityManager();

	public static void cadastrar(Object objeto) {

	}

}
