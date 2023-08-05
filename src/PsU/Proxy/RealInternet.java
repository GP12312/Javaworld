package PsU.Proxy;

public class RealInternet implements iInternet {



	@Override
	public void connectTo(String s) throws Exception {
		System.out.println(" Connecting to .. " + s);

	}

}
