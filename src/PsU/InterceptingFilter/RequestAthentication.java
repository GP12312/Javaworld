package PsU.InterceptingFilter;

public class RequestAthentication implements filter {

	public RequestAthentication() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(String s) {
		System.out.println("!  Athentication request " + s );

	}

}
