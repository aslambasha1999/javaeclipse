package MyJavaLearnings;

class Parents{
	
	public void car()
	{
		System.out.println("Audi 2 series");
	}
	public void gold()
	{
		System.out.println("2kg");
	}
}

class Child extends Parents
{

	public void car()
	{
		System.out.println("Benz");
	}
	public void gold()
	{
		System.out.println("4kg");
	}
}

public class MethodOverriding {
	
	
	public static void main(String args[])
	{
		Parents p=new Parents();
		p.car();
		p.gold();
		
		Child c=new Child();
		c.car();
		c.gold();
				
	}
	
	

}
