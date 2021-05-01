
public class Main {

	public static void main(String[] args) {
	

		
		StudentManager studentManager = new StudentManager();

		Student student = new Student(1, "Kader", "Tekin", "tekin65@gmail.com", "java", 20);
		

		studentManager.add(student);

		InstructorManager instructorManager = new InstructorManager();

		Instructor instructor = new Instructor(1, "Engin", "Demiroğ", "engin@gmail.com", 50000);

		
		
		
		 System.out.print("Eğitmen: ");
			instructorManager.add(instructor);


		System.out.print("Kurs: ");
		System.out.println(instructor.getSalary());

	}
}
