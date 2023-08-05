package PsU.BusinessDelegate;

public class BusinessDelegate {
	
	BusinessService bss;
	BusinessLookUP blp = new BusinessLookUP();
	String ServiceType;
	
	
	public void setServiceType(String serviceType) {
		ServiceType = serviceType;
	}
	
	public void doTask() {
		bss = blp.getBSLookUP(ServiceType);
		bss.doProcessing();
	}
	
	



}
