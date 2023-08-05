package PsU.Bridge.BridgeQ;

import java.util.ArrayList;
import java.util.List;

public class JavaQts implements iQuestions {
	
	private List <String> qts =  new ArrayList<String>();
	int current = 0;
	

	public JavaQts() {
	    qts.add("What is Inner class? ");  
	    qts.add("What is Marker interface? ");  
	    qts.add("What is abstraction? ");  
	    qts.add("How multiple polymorphism is achieved in java? ");  
	    qts.add("How many types of exception  handling are there in java? ");  
	    qts.add("Define the keyword final for  variable, method, and class in java? ");  
	    qts.add("What is abstract class? ");  
	    qts.add("What is multi-threading? ");  
	}

	@Override
	public void nextQts() {
		if(current <= qts.size()-1) {
		   current++;
		   System.out.println(current);
		}		
	}

	@Override
	public void prevQts() {
		if(current > 0 ) {
			current--;
			System.out.println(current);
		}
	}

	@Override
	public void deleteQts(String g) {
		qts.remove(g);
	}


	@Override
	public void newQts(String q) {
		 qts.add(q);

	}

	@Override
	public void displayQts() {
		System.out.println( qts.get(current) );  
	}

	@Override
	public void displayAllQts() {
		for(String qs:qts)
			System.out.println(qs);
	}

}
