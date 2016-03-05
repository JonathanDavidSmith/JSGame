package entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
	
	
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JavaScriptGamePU");
		EntityManager em = emf.createEntityManager();
		Leaderboard leader = em.find(Leaderboard.class, 1);
		System.out.println("NAME:" + leader.getName() + " HIGH SCORE: " + leader.getScore());

		em.close();
		emf.close();
	}
}