package PsU.Facade;

public class Shopekeeper {
	
	private MobileShop mi;
	private MobileShop ms;
	private MobileShop mb;

	public Shopekeeper() {
		mi = new PhoneApple();
		ms = new PhoneSamsung();
		mb = new PhoneBlackBerry();		 
	}
	
	public void iphoneSale() {
		mi.modelNumber();
		mi.price();
	}
	
	public void bbPhoneSale() {
		mb.modelNumber();
		mb.price();
	}
	
	public void samsungPhoneSale() {
		ms.modelNumber();
		ms.price();
	}

}
