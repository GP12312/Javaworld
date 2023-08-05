package PsU.Factory.Factory_Abstract;

public class CarMini extends Car {

	public CarMini( Location lo) {
		super(TypeCar.MINI, lo);
		contsruct();
	}
		 

	@Override
	void contsruct() {
		System.out.println("Constructing MINI Car");
	}

}
