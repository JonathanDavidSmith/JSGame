package data;


import java.util.List;
import java.io.IOException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.databind.ObjectMapper;

import entities.Leaderboard;
@Transactional
public class XHRDAO
{
	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<Leaderboard> getAllScores()
	{
		return em.createNamedQuery("Leaderboard.getAllScores").getResultList();
	}

	public void createScore(String score)
	{
		ObjectMapper om = new ObjectMapper();
		Leaderboard l = null;
		
		try
		{
			l = om.readValue(score,Leaderboard.class);
			em.merge(l);
			em.persist(l);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}



	
}
