
public class StudentManager  extends UserManager{

	@Override
	
	public void add(User user)
	{
		System.out.println("-------------");
		System.out.println(user.getFirstName()+"��renci eklendi");
		
		
	}
	@Override
	
	public void remove(User user)
	{
		System.out.println("------------");
		System.out.println(user.getFirstName()+ "��renci silindi");
		
		
		
	}
	
	
	
}
