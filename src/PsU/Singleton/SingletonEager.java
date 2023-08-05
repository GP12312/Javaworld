package PsU.Singleton;

public class SingletonEager {
	
	private static SingletonEager singe = new SingletonEager();
	static String str = "";
	
	// Declaration and definition of the variable occur simultaneously
	
	private SingletonEager(){
		// This is the pvt constructor
	}
	
	
	public static SingletonEager getInstance() { 
		str = "Hi from Singleton";
		System.out.println(str);
		// 			Pls write your singleton code here  
		
	return singe ;
	
	}
	
	
	
}
