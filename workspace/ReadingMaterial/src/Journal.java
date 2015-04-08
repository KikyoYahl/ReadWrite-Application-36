
public class Journal extends ReadingMaterials{
	int volumeNum, year;
	String topic, university;
	
	public Journal(){
		this.volumeNum=0;
		this.year=0;
		this.university=null;
		this.topic=null;
		ReadingMaterials.author=null;
		ReadingMaterials.title=null;
		ReadingMaterials.publisher=null;
		ReadingMaterials.numberOfPg=0;
	}
	public Journal(int volumeNum, int year, String topic, String university){
		
		this.volumeNum=volumeNum;
		this.year=year;
		this.university=university;
		this.topic=topic;
		setAuthor("Dr.Magiro");
		setTitle("Medical Journal");
		setPublisher("University Of Virginia");
		setPages(5000);
	}
	@Override
	public String toString() {
		return "Journal [VolumeNum = " + volumeNum + ", Year = " + year
				+ ", Topic = " + topic + ", University = " + university +", NumberOfPg = " + numberOfPg + ", Author = " + author + ", Publisher = " + publisher
				+ ", Title = " + title + "]";
	}
	
	
	
	
	
}
