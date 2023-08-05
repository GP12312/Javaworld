package PsU.Mediator;

public class AuctionManager extends Buyer {

	public AuctionManager(Mediator m, String s) {
		super(m, s);		 
	}

	@Override
	public void bid(int i) {
		this.price = i;
	}

	@Override
	public void cancelBid() {
		this.price = -1;	 
	}

}
