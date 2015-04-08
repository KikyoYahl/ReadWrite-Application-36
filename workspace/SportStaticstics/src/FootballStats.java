
public class FootballStats extends Sports {


	int passing, rushing, recieving, downs, defense, returning, kicking, punting; 

	FootballStats(){
		this.passing=0;
		this.rushing=0;
		this.recieving=0;
		this.downs=0;
		this.defense=0;
		this.returning=0;
		this.kicking=0;
		this.punting=0;
		
		Sports.gamesPlayed=0;
		Sports.championshipsWon=0;
		Sports.location=null;
		Sports.record=0;
		Sports.score=0;
		Sports.teamName=null;

	}

	FootballStats(int passing, int rushing, int recieving, 
			int downs, int defense, int returning, int kicking, int punting)
	{

	
		this.passing=passing;
		this.rushing=rushing;
		this.recieving=recieving;
		this.downs=downs;
		this.defense=defense;
		this.returning=returning;
		this.kicking=kicking;
		this.punting=punting;
		setGamesPlayes(17);
		setChampionshipsWon(4);
		setLocation("Los Angeles");
		setRecord(12);
		setScore(200);
		setName("Naruto");
	}

	@Override
	public String toString() {
		return "FootballStats [passing=" + passing + ", rushing=" + rushing
				+ ", recieving=" + recieving + ", downs=" + downs
				+ ", defense=" + defense + ", returning=" + returning
				+ ", kicking=" + kicking + ", punting=" + punting + "]";
	}

}
