package PsU.Template_Method;

public abstract class OrderProcessTemplate {

	boolean isGift;
	
	public abstract void doSelect();
	public abstract void doPayment();
	public final void giftWrap() {
		System.out.println("Get gift wrap preference");
		try {
			System.out.println("Gift wrapped successfully");
			
		} catch (Exception e) {
			
			System.out.println(" Gift wrapping unsuccessful");
		}
	}	
	
	public abstract void doDelivery();

	public final void processOrder( boolean isGift) {
		doSelect();
		doPayment();
		if(isGift) {
			giftWrap();
		}
		doDelivery();		
	}

}
