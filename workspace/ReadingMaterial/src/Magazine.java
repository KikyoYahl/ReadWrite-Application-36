
public class Magazine extends ReadingMaterials {
	int volumeNum, year;
	String month;

	public Magazine(){
		this.volumeNum=0;
		this.year=0;
		this.month=null;
		ReadingMaterials.author=null;
		ReadingMaterials.title=null;
		ReadingMaterials.publisher=null;
		ReadingMaterials.numberOfPg=0;
	}
	public Magazine(int volumeNum, int year, String month){
		this.volumeNum=volumeNum;
		this.year=year;
		this.month=month;
		setAuthor("Keith Jones");
		setTitle("Auto Today");
		setPublisher("WashingtonPost");
		setPages(30);
	}
	@Override
	public String toString() {
		return "Magazine [VolumeNum = " + volumeNum + ", Year = " + year
				+ ", Month = " + month + ", Author = " + author + ", Pblisher = " + publisher
				+ ", Title = " + title + "]";
	}






}
