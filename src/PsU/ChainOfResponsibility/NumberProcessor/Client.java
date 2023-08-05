package PsU.ChainOfResponsibility.NumberProcessor;

public class Client {

	public static void main(String args[]) {
		
		Chain c = new Chain();
		
		c.process(new Number(78));
		c.process(new Number(-125678));
		c.process(new Number(0));
		c.process(new Number(787));
	
	}

}
