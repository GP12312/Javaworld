package PsU.Decorator;

public class DecoratorTomato extends DecoratorToppings {
	
	Pizza pizza;

	public DecoratorTomato(Pizza p) {
		this.pizza = p;
	}
	
	public String getDescription() {
		return  " + Tomatoes";
	}

	public int getCost() {
		return 45 ;
		
	}
}
