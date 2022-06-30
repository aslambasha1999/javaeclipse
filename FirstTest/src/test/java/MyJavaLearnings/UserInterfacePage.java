package MyJavaLearnings;

class Login
{

	private String userName;
	private String password;
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserName() {
		
		if(userName=="Aslam")
		{
			return "Username is Correct , Enter Password ";
		}
		else
		{
			return "Username is Incorrect";
		}
			
				
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		
		if(password=="@Syash461")
		{
			return "Login Successful";
		}
		else
		{
			return "Invalid Password";
		}
	}
		
}
public class UserInterfacePage {
	
	public static void main(String args[])
	{
		Login lobj=new Login();
		lobj.setUserName("Aslam");
		lobj.setPassword("@Syash461");
		System.out.println(lobj.getUserName());
		System.out.println(lobj.getPassword());
	}

}
