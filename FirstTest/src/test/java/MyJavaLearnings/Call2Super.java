package MyJavaLearnings;

class First
{
	public First()
	{
		System.out.println("First  class ");
	}
}

class Second extends First
{

	public Second() {
		
		System.out.println("Second Class");
		
	}
	
}

public class Call2Super {
	
	
	
	public static void main(String args[])
	{
		Second obj=new Second();
	}

}
