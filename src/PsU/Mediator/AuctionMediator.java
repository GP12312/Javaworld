package PsU.Mediator;

import java.util.*;

public class AuctionMediator implements Mediator {
	
	private ArrayList buyers;

	public AuctionMediator() {
		buyers = new ArrayList<>();
	}

	@Override
	public void addBuyer(Buyer b) {
		 buyers.add(b);
		 System.out.println(b.name  + " added to the Auction List");

	}

	@Override
	public void findHighestBidder() {
		int maxbid =0;
		Buyer winner=null;
		for (int b=0; b<buyers.size();b++) {
			Buyer bu = buyers[b];
		}
		
		
		
		
		for (Buyer bu: buyers) {
			if(bu.price > maxbid) {
				maxbid = bu.price;
				winner = bu;
			}
		}
		System.out.println("The auction winner is " + winner.name +
		        ". Paid " + winner.price + "$ for the item.");
	}
}
