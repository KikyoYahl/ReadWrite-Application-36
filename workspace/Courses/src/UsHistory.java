

public class UsHistory extends Curriculum{
	
	public UsHistory(){
		
		this.courseName="US History";
		this.grade='A';
		this.numStudents=30;
		this.numTeacher=1;
		this.schoolType="College";
		this.syllabus=true;
		this.teacherName="Ms.Robinson";
		this.topic="History";
	}

	@Override
	public String toString() {
		return "UsHistory [grade=" + grade + ", syllabus=" + syllabus
				+ ", teacherName=" + teacherName + ", courseName=" + courseName
				+ ", schoolType=" + schoolType + ", topic=" + topic
				+ ", numStudents=" + numStudents + ", numTeacher=" + numTeacher
				+ "]";
	}
	
	
	
	
	
	
}

























