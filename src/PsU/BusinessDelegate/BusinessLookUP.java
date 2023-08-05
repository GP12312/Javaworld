package PsU.BusinessDelegate;

public class BusinessLookUP {

	public BusinessService getBSLookUP(String str) {
		
		switch(str) {
		
		case "JNDI":
			return new ServiceJNDI();
		case "GraphDB":
			return new ServiceGraphDB();
	}
		return null;

}
}
