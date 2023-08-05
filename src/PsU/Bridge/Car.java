package PsU.Bridge;

public class Car extends Vehicle{

	public Car(iWorkshop w1, iWorkshop w2 ) {
		
		super(w1, w2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void manufacture() {
		System.out.println("Car");
		workshop1.work();
		workshop2.work();
	}
}
