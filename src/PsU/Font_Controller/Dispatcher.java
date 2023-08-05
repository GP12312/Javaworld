package PsU.Font_Controller;

public class Dispatcher {
	
	private ViewHome vh;
	private ViewStudent vs;

	public Dispatcher() {
		
		vh = new ViewHome();
		vs = new ViewStudent();
	}
	
	public void dispatch(String str) {
		switch(str) {		
		case ("Student"): 
			vs.show();break;
		case ("Home"): 
			vh.show();break;	
		}
		
	}

}
