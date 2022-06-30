package MyJavaLearnings;

interface Ingestion1{
	
	void ingestion();
	void mapping();
	void dataUpload();
}

class UserConfig1 implements Ingestion1
{

	@Override
	public void ingestion() {
		
		System.out.println("Ingestion");
	}

	@Override
	public void mapping() {
		
		System.out.println("Mapping");
		
	}

	@Override
	public void dataUpload() {
		
		System.out.println("Uploading");
	}
	}

public class UI2 {
	
	public static void main(String args[])
	{
		UserConfig user=new UserConfig();
		user.ingestion();
		user.mapping();
		user.dataUpload();
	}

}
