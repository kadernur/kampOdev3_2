
public class Student extends User {
	
	String course;
	int courseCompletion;
	
	



	public Student(int id, String firstName, String lastName, String email, String course, int courseCompletion) {
		super(id, firstName, lastName, email);
		this.course = course;
		this.courseCompletion = courseCompletion;
	}





	public String getCourse() {
		return course;
	}





	public void setCourse(String course) {
		this.course = course;
	}





	public int getCourseCompletion() {
		return courseCompletion;
	}





	public void setCourseCompletion(int courseCompletion) {
		this.courseCompletion = courseCompletion;
	}
	
	
	

}
