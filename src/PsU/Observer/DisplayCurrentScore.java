package PsU.Observer;

public class DisplayCurrentScore implements Observer {
	
	private int runs;
	private float overs;
	private int wickets;



	@Override
	public void update(int runs, int wickets, float overs) {
		this.runs =runs;
		this.wickets = wickets;
		this.overs = overs;
		display();
	}
	
	public void display() {
		System.out.println("\n -----------------Current Scoreboard Display -----------------\n");
		System.out.println("   Current Score  	:" + runs);
		System.out.println("   Wickets 		  	:" + wickets);
		System.out.println("   Overs 		  	:" + overs);
		
		
	}

}
