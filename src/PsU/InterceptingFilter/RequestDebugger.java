package PsU.InterceptingFilter;

public class RequestDebugger implements filter {

	public RequestDebugger() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(String s) {
		System.out.println("!  DEBUGGER  request " + s );

	}

}
