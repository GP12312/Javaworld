package PsU.InterceptingFilter;

public class FilterManager {
	
	FilterChain filterC = new FilterChain();

	public FilterManager(Target tar ) {
		
		filterC = new FilterChain();
		filterC.setTarget(tar);				 
	}
	
	public void setFilter(filter f) {
		
		filterC.addFilter(f);
	}
	
	public void FilterRequest(String r) {
		filterC.execute(r);
		
	}

}
