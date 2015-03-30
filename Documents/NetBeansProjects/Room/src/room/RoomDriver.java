import java.util.Scanner;
public class RoomDriver {
	public static void main(String[]args){
		int count=0, numWindows;
		String floorType, wallColor;
		
		System.out.print("Welcome to the room builder, I can help you design a"
				+ " home based on three components.\nFloortype, wall color, and the number of windows."
				+ "\nFirst lets begin with how many homes you would like to design.");
		System.out.println("\nPlease enter the amount of homes you would wish to design now.");
		Scanner input = new Scanner(System.in);
		count=input.nextInt();
		Room house[];
		house = new Room[count];
	
		for(int i=0;i<count;i++){
			System.out.println("Please enter number of windows.");
			numWindows=input.nextInt();
			System.out.println("Please enter the wall color.");
			wallColor=input.next();
			System.out.println("Please enter the floor type.");
			floorType=input.next();
			house[i]= new Room(wallColor,floorType, numWindows);
			}
		for(int i=0; i<count; i++){
			house[i].printRoom();
	}
		input.close(); 
	}
}


	

