package PsU.ChainOfResponsibility.NumberProcessor;

public class ProcessorZero extends Processor {

	public ProcessorZero(Processor p) {
		super(p);		 
	}
	
	public void process(Number r) {
		
		if (r.getNumber() == 0) {
			System.out.println("Number is 0  : " + r.getNumber());
		}
		else {
			super.process(r);
		}
		
	}
}
