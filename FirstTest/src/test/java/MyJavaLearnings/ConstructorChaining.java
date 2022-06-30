package MyJavaLearnings;

public class ConstructorChaining {
	
	public ConstructorChaining()
	{
		this(1,2);
		System.out.println("Hello");
	}
	public ConstructorChaining(int i,int j)
	{
		this(1,2,3);
		System.out.println(i+j);
	}
	
	public ConstructorChaining(int i,int j, int k)
	{
		
		System.out.println(i+j+k);
	}
	
	public static void main(String args[])
	{
		ConstructorChaining obj=new ConstructorChaining();
		
	}

}
