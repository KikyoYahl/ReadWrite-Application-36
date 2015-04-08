
public class Novel extends ReadingMaterials {
	static int seriesNum;
	static String seriesName;

	public Novel(){
		Novel.seriesName=null;
		Novel.seriesNum=0;
		ReadingMaterials.author=null;
		ReadingMaterials.title=null;
		ReadingMaterials.publisher=null;
		ReadingMaterials.numberOfPg=0;
		}
	public Novel(int seriesNum, String seriesName){
		Novel.seriesName=seriesName;
		Novel.seriesNum=seriesNum;
		setAuthor("J.K.Rowling");
		setTitle("Harry Potter");
		setPublisher("Arthur A.Levine Books");
		setPages(400);
	}
	@Override
	public String toString() {
		return "Novel [Series Name = "+seriesName+"Series Number = "+seriesNum+"; NumberOfPg = " + numberOfPg + "; Aauthor = " + author + "; Publisher = " + publisher
				+ "; Title = " + title + "]";
	}
	
}
