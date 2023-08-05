package PsU.Factory.Factory_Abstract;

public class Client {

	public static void main(String args[]) {
		
		System.out.println(CarFactory.buildCar(TypeCar.LUXURY));
		System.out.println(CarFactory.buildCar(TypeCar.MINI));
		System.out.println(CarFactory.buildCar(TypeCar.MICRO));
	}

}
