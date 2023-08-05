package PsU.Strategy;

public class Charachter_Karthik extends aFighter{

	public Charachter_Karthik(iKickBehaviour ik, iJumpBehaviour ij  ) {
		super(ik,ij);
	}

	public void display() {
		System.out.println("Charachter_Karthik Fighter");
	}
}
