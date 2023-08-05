package PsU.Builder;

import java.util.ArrayList;
import java.util.List;


public class Meal {
	
	
	private List<Item> meaList = new ArrayList<Item>();

	public void addItem(Item i ) {
		meaList.add(i);		
	}
	
	public float getCost() {		
		float cost = 0.0f;
		
		for(Item i2 : meaList) {
			cost += i2.price();			
		}
		return cost;
	}
	
	public void showMealItems() {
		for (Item i3 :meaList) {
			System.out.println("Food Item	:" + i3.name());
			System.out.println("Packing		:" + i3.packing().pack());
			System.out.println("Price		:" + i3.price());
			System.out.println("===========================");
		}
	}
}
