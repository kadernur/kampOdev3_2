
public class InstructorManager extends UserManager {


	@Override
	public void add(User user ) {
		System.out.println(user.getFirstName()+" �nstructor added");
	}
	
	
@Override
	
	public void remove(User user)
	{
		System.out.println("------------");
		System.out.println(user.getFirstName()+ "�nstructor removed");
		
		
		
	}
}
