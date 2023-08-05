package PsU.BridgeS;

public class Square extends aShape {

	public Square(iColor c1) {
		super(c1);
	}

	@Override
	public String draw() {
		 
		return "Square drawn " + c.fill();
	}

}
