package PsU.ChainOfResponsibility.NumberProcessor;

public class Chain {
	
	Processor chain;

	public Chain() {
		buildChain();
	}
	
	private void buildChain() {
		chain = new ProcessorNegative(new ProcessorZero(new ProcessorPositive(null)));		
	}

	public void process(Number nr) {
		chain.process(nr);
	}
}
