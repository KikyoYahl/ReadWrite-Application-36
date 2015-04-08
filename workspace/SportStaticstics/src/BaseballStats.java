
public class BaseballStats extends Sports {

int batting, pitching, fielding, splits;


	BaseballStats(){
		this.batting=0;
		this.pitching=0;
		this.fielding=0;
		this.splits=0;
		
		Sports.gamesPlayed=0;
		Sports.championshipsWon=0;
		Sports.location=null;
		Sports.record=0;
		Sports.score=0;
		Sports.teamName=null;
	}
	
	BaseballStats(int batting, int pitching, int fielding, int splits){
		this.batting=batting;
		this.pitching=pitching;
		this.fielding=fielding;
		this.splits=0;
		
		setGamesPlayes(168);
		setChampionshipsWon(22);
		setLocation("Los Angeles");
		setRecord(140);
		setScore(11);
		setName("Kikyo");
	}



}
