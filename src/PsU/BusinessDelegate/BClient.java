package PsU.BusinessDelegate;

public class BClient {
	
	BusinessDelegate bdg;

	public BClient(BusinessDelegate b) {
		this.bdg =b;
	}
	
	public void doTask() {
		bdg.doTask();
	}

}
