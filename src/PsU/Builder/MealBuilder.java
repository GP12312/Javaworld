package PsU.Builder;

public class MealBuilder {

	public Meal prepareVegMeal() {
		
		Meal veg = new Meal();
		veg.addItem(new VegBurger());
		veg.addItem(new Coke());		
		return veg;		
	}
	
	public Meal prepareNonVegMeal() {
		
		Meal nonveg = new Meal();
		nonveg.addItem(new ChickenBurger());
		nonveg.addItem(new Pepsi());		
		return nonveg;		
	}
	
}
