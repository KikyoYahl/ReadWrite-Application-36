
public class ElectronicsDriver {

	public static void main (String[]args){
		Electronics ps4 = new Playstation(false, true, false);
		System.out.print(ps4.toString());
		
		Electronics iPhone6= new Phone(true,true,true,true);
		System.out.print(iPhone6.toString());

		Electronics dell = new Computer(true, true, false, true);
		System.out.print(dell.toString());
	}
}
