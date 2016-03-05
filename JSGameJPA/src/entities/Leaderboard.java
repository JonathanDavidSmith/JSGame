package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "leaderboard")
@NamedQueries({@NamedQuery (name="Leaderboard.getAllScores", query = "select l from Leaderboard l ")})
public class Leaderboard 
{	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private Long score;
	
	public Leaderboard(){}
	
	public Leaderboard(String name, Long score) {
		super();
		
		this.name = name;
		this.score = score;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getScore() {
		return score;
	}
	public void setScore(Long score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "Leaderboard [id=" + id + ", name=" + name + ", score=" + score + "]";
	}
}
