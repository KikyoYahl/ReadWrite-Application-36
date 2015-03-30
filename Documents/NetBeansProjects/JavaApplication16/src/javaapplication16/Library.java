import java.util.Scanner;
public class Library {
	
	public static void main (String[] args){
		 int numberOfBooks;
		 String title;
		 String author, volumeName;
		 Volume [] volume = null;
		 Book [] book = null;
		 @SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		
		System.out.println("How many books are you adding to the library today?");
		int count = input.nextInt();
		book= new Book[count];
		volume= new Volume[count];
		for(int i=0; i<count;i++){
			System.out.println("Please enter title");
			title=input.next();
			System.out.println("Please enter the author");
			author = input.next();
			System.out.println("Please enter number of pages");
			int numberOfPages= input.nextInt();
			book[i]= new Book(title,author,numberOfPages);
			System.out.println("Volume name");
			volumeName=input.next();
			System.out.println("Volume number");
			numberOfBooks=input.nextInt();
			volume[i]= new Volume (volumeName,numberOfBooks, book);
		}
		for(int p=0;p<count;p++){
		System.out.println(volume[p].getBookArray());
		}
		
	}
	
	
	

}
