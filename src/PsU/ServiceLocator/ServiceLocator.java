package PsU.ServiceLocator;

public class ServiceLocator {

	private static Cache cac  ;
	
	static {
	cac = new Cache();
	}
	public static Service getService(String gs) {
				  Service ss = cac.getService(gs);
				 if( ss != null) {					 
					 System.out.println("xxxxxdd" + gs);
					 return ss;
				 }		
				 InitialContext ict = new InitialContext();
				 Service sc = (Service)ict.lookup(gs);
				 cac.addService(sc);
				 return sc;				 				 						
	}
}
