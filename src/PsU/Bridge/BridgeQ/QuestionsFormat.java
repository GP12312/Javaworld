package PsU.Bridge.BridgeQ;

public class QuestionsFormat extends QuestionsManager{

	public QuestionsFormat(String sq) {
		super(sq);		 
	}
	
	public void displayAll() {
		 System.out.println("\n---------------------------------------------------------"); 
		 super.displayAll();
		 System.out.println("============================================================");		
	}
}
