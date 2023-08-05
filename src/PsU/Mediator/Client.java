package PsU.Mediator;

public class Client {

	 

	public static void main(String[] args) {
	
		AuctionMediator amed = new AuctionMediator();
		
		Buyer b1 = new AuctionManager(amed , "Steve Phil");
		Buyer b2 = new AuctionManager(amed , "Thomas Robinson");
		Buyer b3 = new AuctionManager(amed , "Peter Pal");
		
		amed.addBuyer(b1);
		amed.addBuyer(b2);
		amed.addBuyer(b3);
		
		System.out.println("Auction begins ...!");
		b1.bid(10000);
		b2.bid(22000);
		b3.bid(22500);
		
		System.out.println("Au-----------------uA");
		amed.findHighestBidder();
		}

}
