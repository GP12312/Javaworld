package PsU.Factory.Factory_Abstract;

public class CarLuxury extends Car {

	public CarLuxury( Location lo) {
		super(TypeCar.LUXURY, lo);
		contsruct();
	}
		 

	@Override
	void contsruct() {
		System.out.println("Constructing LUXURY Car");
	}

}
