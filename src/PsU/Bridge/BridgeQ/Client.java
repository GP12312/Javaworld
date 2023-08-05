package PsU.Bridge.BridgeQ;

public class Client {

	public Client() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
		QuestionsFormat qf = new QuestionsFormat("Java Questions Bank "); 
		qf.q = new JavaQts();
		qf.display();
		
		qf.newOne("What is JUnit");
		qf.displayAll();
		 

	}

}
