package MyJavaLearnings;

public class BankPage extends User{
	
	
	public static void main(String args[])
	{
		BankPage obj=new BankPage();
		
		obj.deposit();
		obj.withdrawl();
	}

}
class User 
{
	String accHolderName="Aslam";
	String accNum="123456";
	String bankName="HDFC";
	String ifscCode="HDFC000967";
	double availableBalance=500;
	
	public void deposit()
	{
		double amt=4500;
		availableBalance=availableBalance+amt;
		System.out.println("Amount after depositing "+amt+ " :"+ availableBalance);
	}
	
	public void withdrawl()
	{
		double amt=200;
		availableBalance=availableBalance-amt;
		System.out.println("Amount after Withdrawl :"+availableBalance);
	}
}
