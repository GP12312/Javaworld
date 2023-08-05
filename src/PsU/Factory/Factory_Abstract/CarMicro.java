package PsU.Factory.Factory_Abstract;

public class CarMicro extends Car {

	public CarMicro( Location lo) {
		super(TypeCar.MICRO, lo);
		contsruct();
	}
		 

	@Override
	void contsruct() {
		System.out.println("Constructing MICRO Car");
	}

}
