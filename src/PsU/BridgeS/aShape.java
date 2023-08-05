package PsU.BridgeS;

public abstract class aShape {
	
		protected iColor c;
		
		protected aShape(iColor c1) {
			this.c=c1;
		}
		
		abstract public String draw();				

}
