package PsU.Decorator;

public class PizzaStore {

	 

	public static void main(String[] args) {
		
		Pizza pz1 = new PizzaMargharita();
		
		System.out.println("+-------------You Ordered----------------+");
		System.out.println("==========================================");			
		System.out.println(pz1.getDescription() + " Price :" + pz1.getCost());
		
		Pizza pz2 = new PizzaFarmHouse();
		System.out.println(pz2.getDescription() + " Price :" + pz2.getCost());
		// Add Tomatoes to this pizza
		DecoratorTomato t = new DecoratorTomato(pz2);
		System.out.println(t.getDescription() + " Price :" + t.getCost());
		// Add Mushrooms  to this pizza
		DecoratorMushrooms m = new DecoratorMushrooms(pz2);
		System.out.println(m.getDescription() + " Price :" + m.getCost());
		// Add Capsicum  to this pizza
		DecoratorCapsicum c = new DecoratorCapsicum(pz2);
		System.out.println(c.getDescription() + " Price :" + c.getCost());
		System.out.println("============Total Price================");
		System.out.println(pz2.getCost()+ t.getCost() + m.getCost()+ c.getCost());
		
	}

}
