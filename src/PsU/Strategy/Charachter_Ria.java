package PsU.Strategy;

public class Charachter_Ria extends aFighter{

	public Charachter_Ria(iKickBehaviour ik, iJumpBehaviour ij  ) {
		super(ik,ij);
	}

	public void display() {
		System.out.println("Charachter_Ria Fighter");
	}
}
