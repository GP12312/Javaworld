package PsU.Factory.Factory_Abstract;

public class FactoryUSACar {

		static Car buildCar(TypeCar tyc) {
			
			Car c = null;
			switch(tyc)
			{
			case MICRO:
						c = new CarMicro(Location.USA);
						break;
						
			case MINI:
				c = new CarMini(Location.USA);
				break;
				
			case LUXURY:
				c = new CarLuxury(Location.USA);
				break;
				
			default:
				break;
			}
			return c;
		}
}
