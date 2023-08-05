package PsU.Template_Method;

public class Client {

	public static void main(String[] args) {
		
		OrderInternet oi = new OrderInternet();
		oi.processOrder(false);
		
		System.out.println(" <<<<<<>>>>>>>>>>");
		
		
		OrderProcessTemplate os = new OrderStore();
		os.processOrder(true);
		
	}
}
