package smith.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import data.XHRDAO;
import entities.Leaderboard;
@Controller 
public class Controllers 
{
	@Autowired
	public XHRDAO xhrdao;
	
	
	@RequestMapping("ping")
	public String test()
	{
		return "pong";
	}

	@RequestMapping(path="getAllScores", method=RequestMethod.GET)
	public List<Leaderboard> getAllScores()
	{
		return xhrdao.getAllScores();
	}

	@RequestMapping(path="createScore", method=RequestMethod.PUT)
	public void addNewScore(@RequestBody String score)
	{
		 xhrdao.createScore(score);
	}
	
	

}


