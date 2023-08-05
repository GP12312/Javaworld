package PsU.ServiceLocator;

import java.util.List;
import java.util.ArrayList;

public class Cache {
	
	private List<Service> serviceL ;

	public Cache() {
		serviceL = new ArrayList<>();
	}
	

	public void addService(Service addnewSrvc) {
		boolean exists =false;
		for (Service s1 :serviceL) {
			if(s1.getName().equalsIgnoreCase(addnewSrvc.getName()));		
			exists=true;
		}
		if(!exists) {
			serviceL.add(addnewSrvc);
		}
	}
	
	public Service getService(String se){		
		for(Service s : serviceL) {
			 System.out.println("xxxxxdg " + s.getName() + se);
			if(s.getName().equalsIgnoreCase(se)) {
				 System.out.println("xxxxxdtg ");
				System.out.println("Returning the service from CACHE " +se +" object");
				return s;
			}			
		}
		return null;
	}
	
	
	
}
