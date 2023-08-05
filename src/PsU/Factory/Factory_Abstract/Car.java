package PsU.Factory.Factory_Abstract;

public abstract class Car {
	
	TypeCar  model = null ;
	Location loc = null ;
	

	public Car(TypeCar model, Location loc) {
		this.model=model;
		this.loc=loc;		
	}
	
	public TypeCar getModel() {
		return model;
	}
	
	public void setModel(TypeCar tc) {
		this.model=tc;
	}
	
	public Location getLocation() {
		return loc;
	}
	
	public void setLocation(Location lc) {
		this.loc=lc;
	}
	
	abstract void contsruct();
	
	public String toString() {
		return "Car model" + model + "located in" + loc;
	}

}
