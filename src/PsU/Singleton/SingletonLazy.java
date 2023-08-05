package PsU.Singleton;

public class SingletonLazy {
	
	private static SingletonLazy slzy;  // Lazy Declaration 
	
	static  int r=0;  // If i make this variable final then this cannot be overwritten 
	
	private  SingletonLazy() {
	
		
	}
	
	public static SingletonLazy getInstance() {
		
		if(slzy==null) {
			
			slzy= new SingletonLazy();  // If not created then only create the Singleton 
			System.out.println("in Lazyif" );
		}		
		
//			Pls write your singleton code here 
		System.out.println("Notin Lazyif" + r );
		return slzy;
	}
	
	
	public static SingletonLazy setInstance(int r1) {
		
		r=r1;
		System.out.println("OK r is " + r ); 
		// The r is replaced with a new value it is overwritten . no new object is created 
		
		return slzy;
	}
	
	
	
	
	
}
