
public class Book {
	
	String title, author;
	int numberOfPages;
	
	public Book(){
		this.title="";
		this.author="";
		this.numberOfPages=0;
	}
	
	public Book(String title, String author, int numberOfPages){
		this.title=title;
		this.author=author;
		this.numberOfPages=numberOfPages;
	}
	public void displayBook(){
	System.out.println(	"Title: "+title+"\nAuthor: "+author+
			"\nNumber Of Pages: "+numberOfPages);
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author
				+ ", numberOfPages=" + numberOfPages + "]";
	}


}
