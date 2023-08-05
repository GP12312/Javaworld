package PsU.Singleton;

public class singletonMain {

	public static void main(String[] args) {
		System.out.println("In Singmain ");
		
		
		SingletonEager s = SingletonEager.getInstance();
		System.out.println("from singletonMain " + s );
		
		SingletonEager s2 = SingletonEager.getInstance();
		System.out.println("from singletonMain " + s2 );
		
		if (s==s2) {System.out.println("Both objects are the same; although they are called with different names ");}
		
		
		SingletonLazy sl = SingletonLazy.getInstance();
		System.out.println("from singletonMain " + sl );
		
		SingletonLazy s22 = SingletonLazy.getInstance();
		System.out.println("from singletonMain " + s22 );
		
		SingletonLazy s32 = SingletonLazy.setInstance(89);
		SingletonLazy s3 = SingletonLazy.getInstance();
		SingletonLazy s33 = SingletonLazy.setInstance(90);
		SingletonLazy s34 = SingletonLazy.getInstance();
	}
	
	

}
