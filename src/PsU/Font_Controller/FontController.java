package PsU.Font_Controller;

public class FontController {
	
	Dispatcher dispatcher;

	public FontController() {
		dispatcher = new Dispatcher();
	}
	
	public boolean isAuthenticUser() {
		System.out.println("User  Authenticated");	
		return true;
	}
	
	public void trackRequest(String U) {
		System.out.println("Page Requested... " +  U);	
	}
	
	public void dispatchRequest(String request) {
		trackRequest(request);		
		if(isAuthenticUser()) {
			dispatcher.dispatch(request);
		}
	}
}
