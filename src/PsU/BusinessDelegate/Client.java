package PsU.BusinessDelegate;

public class Client {

	public static void main(String args[]) {
		
		BusinessDelegate bg = new BusinessDelegate();
		BClient bcl = new BClient(bg);
		
		bg.setServiceType("JNDI");			
		bcl.doTask();

		bg.setServiceType("GraphDB");			
		bcl.doTask();
		
}
	
}
