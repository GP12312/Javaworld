package PsU.InterceptingFilter;

public class Client {

	 static FilterManager fmngr = new FilterManager(new Target ());
	 static FilterClient fclnt = new FilterClient();

	public static void main(String[] args) {
		
		fmngr.setFilter(new RequestAthentication());
		fmngr.setFilter(new RequestDebugger());
		
		fclnt.setFilterManager(fmngr);
		fclnt.sendRequest(" GST on Amount ");		
	}

}
