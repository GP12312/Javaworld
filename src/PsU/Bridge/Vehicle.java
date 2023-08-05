package PsU.Bridge;

public abstract class Vehicle {
	
	protected iWorkshop workshop1;
	protected iWorkshop workshop2;
	
	protected Vehicle(iWorkshop w1, iWorkshop w2) {
		this.workshop1 = w1;
		this.workshop2 = w2;
	}
	
	abstract public void manufacture();	

}
