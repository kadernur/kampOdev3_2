
public class UserManager {
	public void add(User user)
	{
		System.out.println("----------------");
		System.out.println(user.getFirstName() +"Kullanýcý eklendi");
	}
	
	public void remove(User user)
	{
		System.out.println("----------------");
		System.out.println( user.getFirstName() +"Kullanýcý Silindi");
	}

}
