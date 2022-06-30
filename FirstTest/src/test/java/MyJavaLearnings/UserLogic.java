package MyJavaLearnings;

interface company
{

	abstract public void pf();
	void salary();
	int a=10;
	
	
	
}

class infosys implements company
{

	@Override
	public void pf() {
		
		System.out.println("1000");
	}

	@Override
	public void salary() {
		
		System.out.println("30000");
		
	}
	
}

public class UserLogic {
	
	
	public static void main(String args[])
	{
		infosys i=new infosys();
		i.pf();
		i.salary();
		System.out.println(i.a);
		
	}

	}


