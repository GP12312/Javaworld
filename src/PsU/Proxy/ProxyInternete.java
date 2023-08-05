package PsU.Proxy;


import java.util.ArrayList;
import java.util.List;

public class ProxyInternete implements iInternet {
	
	private iInternet i = new RealInternet();
	private static List<String> bannedSites; 
	
	static {
			bannedSites = new ArrayList<String>();
			
			bannedSites.add("abc.com");
			bannedSites.add("xyz.com");
			bannedSites.add("pintrest.com");
			bannedSites.add("linkedIn.com");
	}
	
	
	@Override
	public void connectTo(String s2) throws Exception {
		
		if(bannedSites.contains(s2.toLowerCase())){
			throw new Exception (" You are prohibhited from accessing this site  ...!");			
		}
		i.connectTo(s2);	
	}
	
}
