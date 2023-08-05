package PsU.Mediator;

public abstract class Buyer {
	
	protected Mediator med;
	protected String name;
	protected int price;

	public Buyer(Mediator m, String s) {
		this.med = m;
		this.name = s;		 
	}
	
	public abstract void bid(int i);
	public abstract void cancelBid();
}
