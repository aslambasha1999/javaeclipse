package MyJavaLearnings;

class Bank
{
	
	String accName="Aslam";
	int accNum=12345;
	double availableBalance=100;
	
	public  void details()
	{
		System.out.println("Account Holder: "+accName+" "+accNum);
	}
	
}
class Deposit extends Bank{
	
	double amt=4550.5;
	
	public void depositAmt()
	{
		availableBalance=availableBalance+amt;
		
		System.out.println("Total balance after depositing "+availableBalance);
	}
	
	
}



public class Customer {
	public static void main(String args[])
	{
		Deposit d=new Deposit();
		d.details();
		d.depositAmt();
	}

}
