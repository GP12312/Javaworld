package PsU.Proxy;

public class Client {

 

	public static void main(String[] args) {
		
		iInternet ipxy = new ProxyInternete();
		
		try {
			
			ipxy.connectTo("abc.com");
		}
		catch ( Exception e ) {
			System.out.println(e.getMessage());
			
		}
		try {
			
			ipxy.connectTo("google.com");
		}
		catch ( Exception e ) {
			System.out.println(e.getMessage());
			
		}
	}

}
