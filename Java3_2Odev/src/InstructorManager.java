
public class InstructorManager extends UserManager {


	@Override
	public void add(User user ) {
		System.out.println(user.getFirstName()+" ýnstructor added");
	}
	
	
@Override
	
	public void remove(User user)
	{
		System.out.println("------------");
		System.out.println(user.getFirstName()+ "ýnstructor removed");
		
		
		
	}
}
