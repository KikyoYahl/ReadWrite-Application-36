public class Room {

	private String wallColor;
	private String floorType;
	private int numWindows;
	
	public Room(){
		this.wallColor = "white";
		this.floorType= "hardwood";
		this.numWindows=0;
	}
	
	public Room(String wallColor){
		this.wallColor=wallColor.toLowerCase();
		this.floorType="hardwood";
		this.numWindows=0;
	}
	
	public Room(int numWindows){
		this.wallColor="white";
		this.floorType="hardwood";
		this.numWindows=numWindows;
	}
	

	public Room(String wallColor, int numWindows){
		this.numWindows=numWindows;
		this.wallColor=wallColor.toLowerCase();
		this.floorType="hardwood";
		
	}
	
	public Room(String wallColor, String floorType){
		this.numWindows=0;
		this.wallColor=wallColor.toLowerCase();
		this.floorType=floorType.toLowerCase();
		
	}
	
	public Room(String wallColor, String floorType, int numWindows ){
		this.numWindows=numWindows;
		this.wallColor=wallColor.toLowerCase();
		this.floorType=floorType.toLowerCase();
		
	}
	


	public String getWallColor(){
		return wallColor;
	}
	
	public void setWallColor(String wallColor){
		this.wallColor=wallColor;
	}

	
	public String getFloorType(){
		return floorType;
	}
	
	public void setFloorType(String floorType){
		this.floorType=floorType;
	}


	
	public int getNumWindows(){
		return numWindows;
	}
	public void setNumWindows(int newNumWindows){
		this.numWindows=newNumWindows;
	}
	
	public void printRoom(){
		System.out.println("The room features "+wallColor+" walls "+numWindows+
				" windows and "+floorType+" floors");
	}	
}
	
