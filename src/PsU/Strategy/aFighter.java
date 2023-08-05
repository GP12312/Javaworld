package PsU.Strategy;

public abstract class aFighter {
	
	iKickBehaviour kb;  // Because Kick and Jump as optional to the fighter 
	iJumpBehaviour jb;

	public aFighter(iKickBehaviour k, iJumpBehaviour j) {
		this.jb=j;
		this.kb=k;
	}
	
	public void setJumpBehaviour(iJumpBehaviour j) {
		this.jb = j;
	}
	
	public void setKickBehaviour(iKickBehaviour k) {
		this.kb = k;
	}
	
	public abstract void display();
	public void roll() {
		System.out.println("Default Roll");
	}
	public void punch() {
		System.out.println("Default Punch");
	}
	public void jump() {
		jb.jump();
	}
	public void kick() {
		kb.kick();
		
	}
	
	
}
