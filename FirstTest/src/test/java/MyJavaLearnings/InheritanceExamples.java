package MyJavaLearnings;

public class InheritanceExamples {

	static String name;
	static int num;
	String company;
	int pincode;

	public static String display()
	{
		name="Aslam";
		num=8090013;

		return name+" "+num;

	}
	public String view()
	{
		company="Virtusa";
		pincode=515671;

		return company+" "+pincode;
	}
	
	public static void main(String args[])
	{
		System.out.println(display());
		
		
	}

}
class subclass extends InheritanceExamples{

	
subclass obj=new subclass();



	
	
	


}
