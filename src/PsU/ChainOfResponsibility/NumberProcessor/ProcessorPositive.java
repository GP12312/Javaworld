package PsU.ChainOfResponsibility.NumberProcessor;

public class ProcessorPositive extends Processor {

	public ProcessorPositive(Processor p) {
		super(p);		 
	}
	
	public void process(Number r) {
		
		if (r.getNumber() > 0) {
			System.out.println("Number is +ve  : " + r.getNumber());
		}
		else {
			super.process(r);
		}
		
	}

}
