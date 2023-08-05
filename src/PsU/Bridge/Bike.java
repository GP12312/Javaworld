package PsU.Bridge;

public class Bike extends Vehicle  {

	public Bike(iWorkshop w1, iWorkshop w2) {		
		super(w1, w2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void manufacture() {
		System.out.println("Bike");
		workshop1.work();
		workshop2.work();
	}
}
