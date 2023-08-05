package PsU.Decorator;

public class DecoratorMushrooms extends DecoratorToppings {
	
	Pizza pizza;

	public DecoratorMushrooms(Pizza p) {
		this.pizza = p;
	}
	
	public String getDescription() {
		return  " + Mushrooms";
	}

	public int getCost() {
		return 85 ;
		
	}}
