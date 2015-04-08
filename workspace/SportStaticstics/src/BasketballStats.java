
public class BasketballStats extends Sports{
	
	int points, rebounds, assists, blocks, steals;


	public BasketballStats(){
		this.points=0;
		this.rebounds=0;
		this.assists=0;
		this.blocks=0;
		this.steals=0;
		
		Sports.gamesPlayed=0;
		Sports.championshipsWon=0;
		Sports.location=null;
		Sports.record=0;
		Sports.score=0;
		Sports.teamName=null;
	}
	
	public BasketballStats(int points, int rebounds, int assists, int blocks, int steals){
		this.points=points;
		this.rebounds=rebounds;
		this.assists=assists;
		this.blocks=blocks;
		this.steals=steals;
		
		setGamesPlayes(81);
		setChampionshipsWon(12);
		setLocation("Los Angeles");
		setRecord(12);
		setScore(100);
		setName("Lakers");
		
	}

	@Override
	public String toString() {
		return "BasketballStats [points=" + points + ", rebounds=" + rebounds
				+ ", assists=" + assists + ", blocks=" + blocks + ", steals="
				+ steals + "]";
	}
	
	
	
	
}
