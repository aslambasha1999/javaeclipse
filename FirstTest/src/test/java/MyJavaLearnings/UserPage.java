package MyJavaLearnings;

abstract class RBI
{
abstract public void rateOfIntrest();

}
abstract class PNB extends RBI
{


	public void rateOfIntrest() {
		
		System.out.println("10%");
		
	}


	public abstract void loans();
	
}

class Demo extends PNB
{

	@Override
	public void loans() {
		System.out.println("hello world");
		
	}
	}
class SBI extends RBI
{


	public void rateOfIntrest() {
		System.out.println("12%");
		
	}

	
	
	}
public class UserPage {

	public static void main(String args[])
	{
		
		Demo d=new Demo();
		d.rateOfIntrest();
		d.loans();
		
		RBI s=new SBI();
		s.rateOfIntrest();
	}
}
