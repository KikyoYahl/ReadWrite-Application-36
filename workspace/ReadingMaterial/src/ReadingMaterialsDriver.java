
public class ReadingMaterialsDriver {
	public static void main (String[]args){
	
		ReadingMaterials TheOldManAndTheSea= new Book("Ernest Hemingway", "The Old Man and The Sea", "Charles Scribner's Sons", 200);
		System.out.println(TheOldManAndTheSea.toString());
	
		ReadingMaterials adventureskelly = new Novel(1, "Harry Potter and the Philospher's Stone; ");
		System.out.println(adventureskelly.toString());
		
		ReadingMaterials drToday = new Journal(4,2014,"Medicine","UVA");
		System.out.println(drToday.toString());
		
		ReadingMaterials autoToday= new Magazine(4,2014,"March");
		System.out.println(autoToday.toString());
		
	
	}

}
