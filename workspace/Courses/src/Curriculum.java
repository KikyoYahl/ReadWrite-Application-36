
public class Curriculum {

	char grade;
	boolean syllabus;
	String  teacherName, courseName, schoolType, topic;
	int numStudents,  numTeacher;
	
	public Curriculum(){
		this.courseName="CSC201";
		this.grade='A';
		this.numStudents=0;
		this.numTeacher=0;
		this.schoolType=null;
		this.syllabus=true;
		this.teacherName=null;
		this.topic=null;
	}

	@Override
	public String toString() {
		return "Curriculum [grade=" + grade + ", syllabus=" + syllabus
				+ ", teacherName=" + teacherName + ", courseName=" + courseName
				+ ", schoolType=" + schoolType + ", topic=" + topic
				+ ", numStudents=" + numStudents + ", numTeacher=" + numTeacher
				+ "]";
	}
	
}
