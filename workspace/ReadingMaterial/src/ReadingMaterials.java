
public class ReadingMaterials {

	static int numberOfPg;
	static String author, publisher, title;
	
	
	public ReadingMaterials(){
		ReadingMaterials.author=null;
		ReadingMaterials.numberOfPg=0;
		ReadingMaterials.publisher=null;
		
		ReadingMaterials.title=null;
	}
	
	public int getPages(){
		return numberOfPg;
	}
	public String getAuthor(){
		return author;
	}
	public String getPublisher(){
		return publisher;
	}
	public String getTitle(){
		return title;
	}
	public void setPages(int pages){
		ReadingMaterials.numberOfPg=pages;
	}
	public void setAuthor(String author){
		ReadingMaterials.author=author;
	}
	public void setPublisher(String publisher){
		ReadingMaterials.publisher=publisher;
	}
	public void setTitle(String title){
		ReadingMaterials.title=title;
	}
	@Override
	public String toString() {
		return "ReadingMaterials [numberOfPg=" + numberOfPg + ", author=" + author + ", publisher=" + publisher
				+ ", title=" + title + "]";
	}
	
}
