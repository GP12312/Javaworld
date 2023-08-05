package PsU.Factory.Factory_Abstract;

public class FactoryDEFAULTCar {

		static Car buildCar(TypeCar tyc) {
			
			Car c = null;
			switch(tyc)
			{
			case MICRO:
						c = new CarMicro(Location.DEFAULT);
						break;
						
			case MINI:
				c = new CarMini(Location.DEFAULT);
				break;
				
			case LUXURY:
				c = new CarLuxury(Location.DEFAULT);
				break;
				
			default:
				break;
			}
			return c;
		}
}
