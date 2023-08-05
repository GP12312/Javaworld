package PsU.InterceptingFilter;

// This is where the request should reach 

public class Target {

	public void execute(String s) {
		System.out.println("Executing on Target : " + s );
	}

}


