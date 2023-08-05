package PsU.Decorator;

public class DecoratorCapsicum extends DecoratorToppings {
	
	Pizza pizza;

	public DecoratorCapsicum(Pizza p) {
		this.pizza = p;
	}
	
	public String getDescription() {
		return " + Capsicum";
	}

	public int getCost() {
		return 65 ;
		
	}
}
