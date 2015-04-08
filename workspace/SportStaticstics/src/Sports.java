
public class Sports {
	
	
	static int championshipsWon, score, record, gamesPlayed; 
	static String location;
	static String teamName;
	
	Sports(){
		Sports.score=0;
		Sports.record=0;
		Sports.gamesPlayed=0;
		Sports.championshipsWon=0;
		Sports.location = null;
		Sports.teamName = null;
	}

	Sports(int score, int record, int gamesPlayed, int championshipsWon, String location, String teamName){
		Sports.score=score;
		Sports.record=record;
		Sports.gamesPlayed=gamesPlayed;
		Sports.championshipsWon=championshipsWon;
		Sports.location = location;
		Sports.teamName = teamName;
	}
	 
	public int getScore(){
		return score;
	}
	
	public String getLocation(){
		return location;
	}

	public String getName(){
		return teamName;
	}
	
	public int getRecord(){
		return record;
	}
	public int getGamesPlayed(){
		return gamesPlayed;
	}
	public int getChampionshipsWon(){
		return championshipsWon;
	}
	
	public void setScore(int score){
		this.score=score;
	}
	
	public void setLocation(String location){
		Sports.location=location;
	}
	public void setName(String name){
		Sports.teamName=name;
	}
	public void setRecord(int record){
		Sports.record=record;
	}
	public void setGamesPlayes(int gamesPlayed){
		Sports.gamesPlayed=gamesPlayed;
	}
	public void setChampionshipsWon(int championshipsWon){
		Sports.championshipsWon=championshipsWon;
	}
	@Override
	public String toString() {
		return "Sports [score=" + score + ", record=" + record
				+ ", gamesPlayed=" + gamesPlayed + ", championshipsWon="
				+ championshipsWon  + ", location="
				+ location + ", teamName=" + teamName + "]";
	}












}
