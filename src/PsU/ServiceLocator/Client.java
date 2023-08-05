package PsU.ServiceLocator;

public class Client {

	public static void main(String args[]) {
	
	Service s1 = ServiceLocator.getService("Service1");
	s1.execute();
	
	System.out.println("+++++++++++++++++++++++++")
;	
	s1 = ServiceLocator.getService("Service2");
	s1.execute();
	
	System.out.println("+++++++++++++++++++++++++");
	
	s1 = ServiceLocator.getService("Service1");
	s1.execute();
	
	System.out.println("+++++++++++++++++++++++++");
	s1 = ServiceLocator.getService("Service2");
	s1.execute();
	
	
	
	
	

}
}
