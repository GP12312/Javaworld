package PsU.Observer;

public class DisplayAverageScore implements Observer {
	
	private float runRate;
	private int predictedScore;
 	 

	@Override
	public void update(int runs, int wickets, float overs) {
		this.runRate = (float)(runs/overs);
		this.predictedScore =  (int) runRate *50;
		display();

	}
	
	public void display() {
		System.out.println("\n -----------------Average Scoreboard Display -----------------\n");
		System.out.println("   Average Score  	:" + runRate);
		System.out.println("   Predicted Score  	:" + predictedScore);
	}

}
