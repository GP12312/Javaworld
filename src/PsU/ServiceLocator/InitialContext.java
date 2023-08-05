package PsU.ServiceLocator;

public class InitialContext {

	public Object lookup(String s ) {
		
		switch(s) {
		
		case "Service1":
				System.out.println("LookingUp and Creating a new service - Service1");
				return new Service1();
				
		case "Service2":
				System.out.println("LookingUp and Creating a new service - Service2");
				return new Service2();			
		}
		return null;
		
		
		
	}

}
