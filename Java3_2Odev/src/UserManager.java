
public class UserManager {
	public void add(User user)
	{
		System.out.println("----------------");
		System.out.println(user.getFirstName() +"Kullan�c� eklendi");
	}
	
	public void remove(User user)
	{
		System.out.println("----------------");
		System.out.println( user.getFirstName() +"Kullan�c� Silindi");
	}

}
