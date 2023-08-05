package PsU.Factory.Factory_Abstract;

public class FactoryINDIACar {

		static Car buildCar(TypeCar tyc) {
			
			Car c = null;
			switch(tyc)
			{
			case MICRO:
						c = new CarMicro(Location.INDIA);
						break;
						
			case MINI:
				c = new CarMini(Location.INDIA);
				break;
				
			case LUXURY:
				c = new CarLuxury(Location.INDIA);
				break;
				
			default:
				break;
			}
			return c;
		}
}
