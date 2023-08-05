package PsU.Template_Method;

public class OrderStore extends OrderProcessTemplate {

	public OrderStore() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doSelect() {
		   System.out.println("Customer chooses the item from shelf.");
	}

	@Override
	public void doPayment() {
		System.out.println("Pays at counter through cash/POS");

	}

	@Override
	public void doDelivery() {
		System.out.println("Item delivered to in delivery counter.");

	}

}
