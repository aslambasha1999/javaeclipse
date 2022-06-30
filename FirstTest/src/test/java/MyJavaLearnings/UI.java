package MyJavaLearnings;


abstract class Ingestion{
	
	abstract public void ingestion();
	abstract public void mapping();
	abstract public void dataUpload();
	
}
class UserConfig extends Ingestion{

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
public class UI {

	public static void main(String args[])
	{
		UserConfig user=new UserConfig();
		user.ingestion();
		user.mapping();
		user.dataUpload();
		
	}
}
