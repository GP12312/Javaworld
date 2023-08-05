package PsU.Strategy;

public class Charachter_Brad extends aFighter{

	public Charachter_Brad(iKickBehaviour ik, iJumpBehaviour ij  ) {
		super(ik,ij);
	}

	public void display() {
		System.out.println("Charachter_Brad Fighter");
	}
}
