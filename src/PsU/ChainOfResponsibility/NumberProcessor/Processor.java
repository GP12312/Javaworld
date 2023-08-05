package PsU.ChainOfResponsibility.NumberProcessor;

public abstract class Processor {
	
		private Processor nextProcessor;
		
		public Processor(Processor np) {
			this.nextProcessor = np;			
		}
		
		public void process(Number n) {
			if(nextProcessor != null) {
				nextProcessor.process(n);
			}
			System.out.println("Done");
		}		
}