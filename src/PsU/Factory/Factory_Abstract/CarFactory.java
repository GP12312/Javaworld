package PsU.Factory.Factory_Abstract;

public class CarFactory {
	
	private CarFactory() {
		 
	}
	
	public static Car buildCar(TypeCar tca) {
		
		Car car =null;
		Location loc =Location.INDIA;
		
		switch(loc) {
		
		case USA:
				car = FactoryUSACar.buildCar(tca);break;
		case INDIA:
			car = FactoryINDIACar.buildCar(tca);break;
		default:
			car = FactoryDEFAULTCar.buildCar(tca);break;			 
		}
		return car;
	}

}
