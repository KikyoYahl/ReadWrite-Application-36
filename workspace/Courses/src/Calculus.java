
public class Calculus extends Curriculum {

	boolean calculator, pencil, graphingPaper, textbook;
	
	public Calculus(){
		this.calculator=true;
		this.pencil=true;
		this.graphingPaper=true;
		this.textbook=true;
		this.courseName="MTH173";
		this.grade='A';
		this.numStudents=30;
		this.numTeacher=1;
		this.schoolType="College";
		this.syllabus=true;
		this.teacherName="Mr. Krize";
		this.topic="Math";
	}

	@Override
	public String toString() {
		return "Calculus [calculator=" + calculator + ", pencil=" + pencil
				+ ", graphingPaper=" + graphingPaper + ", textbook=" + textbook+
				 "grade=" + grade + ", syllabus=" + syllabus
				+ ", teacherName=" + teacherName + ", courseName=" + courseName
				+ ", schoolType=" + schoolType + ", topic=" + topic
				+ ", numStudents=" + numStudents + ", numTeacher=" + numTeacher
				+ "]";
	}
	




}
