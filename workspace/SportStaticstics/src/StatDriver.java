
public class StatDriver {
	
	public static void main(String [] args){
		
		
		FootballStats cow = new FootballStats( 200,400,600, 4,120 ,300 ,100, 200);
		System.out.println("Team Name: "+cow.getName());
		System.out.println("Naruto stats are:" + cow.toString());
		System.out.println("Championships won: "+cow.getChampionshipsWon());
		System.out.println("Games in the Season: "+cow.getGamesPlayed());
		System.out.println("Highest Score: "+cow.getScore());
		System.out.println("Location: "+cow.getLocation());
		System.out.println("Record Wins: "+cow.getRecord());
		
		/*setGamesPlayes(17);
		setChampionshipsWon(4);
		setLocation("Colorado");
		setRecord(12);
		setScore(200);
		setName("Bullets");*/
		BasketballStats bulls = new BasketballStats(150,25,20,10,5);
		System.out.println("Team Name: "+bulls.getName());
		System.out.println("Lakers stats are:" + bulls.toString());
		System.out.println("Championships won: "+bulls.getChampionshipsWon());
		System.out.println("Games in the Season: "+bulls.getGamesPlayed());
		System.out.println("Highest Score: "+bulls.getScore());
		System.out.println("Location: "+bulls.getLocation());
		System.out.println("Record Wins: "+bulls.getRecord());
		
		BaseballStats nyc = new BaseballStats(3,2,11,4);
		System.out.println("Team Name: "+nyc.getName());
		System.out.println("Kikyo stats are:" + nyc.toString());
		System.out.println("Championships won: "+nyc.getChampionshipsWon());
		System.out.println("Games in the Season: "+nyc.getGamesPlayed());
		System.out.println("Highest Score: "+nyc.getScore());
		System.out.println("Location: "+nyc.getLocation());
		System.out.println("Record Wins: "+nyc.getRecord());
	
	
	}

}
