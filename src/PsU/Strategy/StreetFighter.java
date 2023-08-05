package PsU.Strategy;

public class StreetFighter {

	
	public static void main(String[] args) {
		iJumpBehaviour ijb_s = new JumpShort();
		iJumpBehaviour ijb_l = new JumpLong();
		iKickBehaviour ikb_t = new KickTornado();
		
		aFighter Charachter_Ria = new Charachter_Ria(ikb_t,ijb_s);
		Charachter_Ria.display();
		
		Charachter_Ria.roll();
		Charachter_Ria.punch();
		Charachter_Ria.jump();
		
		Charachter_Ria.setJumpBehaviour(ijb_l); // Here the behaviour is changed in run time ---- this is the power of the Strategy
		Charachter_Ria.jump();
	}

}
