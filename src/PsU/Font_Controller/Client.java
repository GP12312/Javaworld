package PsU.Font_Controller;

public class Client {
 

	public static void main(String[] args) {
		FontController fc = new FontController();
		fc.dispatchRequest("Student");
		System.out.println("===============");
		fc.dispatchRequest("Home");
			
		
	}

}
