package PsU.Builder;

public class Client {

 

	public static void main(String[] args) {
		
		MealBuilder mbd = new MealBuilder();
		
		Meal vegMeal = mbd.prepareVegMeal();
		System.out.println("<-----Vegeterian Meal--------->");
		vegMeal.showMealItems();
		System.out.println(" Total Cost : " + vegMeal.getCost());
		
		
		Meal nonvegMeal = mbd.prepareNonVegMeal();
		System.out.println("<-----Non-Vegeterian Meal--------->");
		nonvegMeal.showMealItems();
		System.out.println(" Total Cost : " + nonvegMeal.getCost());
		 
	}

}
