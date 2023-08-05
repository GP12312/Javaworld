package PsU.Observer;

public class Client {

 

	public static void main(String[] args) {
		
		// These are the Observers who are to be notified by the Subject
		 DisplayAverageScore das = new DisplayAverageScore();
		 DisplayCurrentScore dcs = new DisplayCurrentScore();	
		 
		// This is the subject 
		 CricketData cdata = new CricketData();
		 
		 
		// This is the registration of the observes with the subject  
		 cdata.register(dcs);
		 cdata.register(das);
		 
		 // See data reflected  		 
		 cdata.dataReflect();
		 
		 // For the time being unregister one observer DisplayAverageScore
		 cdata.unregister(das);
		 
		 System.out.println("/-----After Unregistering---------/");
		 cdata.dataReflect();
	}

}
