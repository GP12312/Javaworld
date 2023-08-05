package PsU.InterceptingFilter;

public class FilterClient {
	
	FilterManager fm;

	public void setFilterManager(FilterManager fmngr) {
		this.fm = fmngr;		
	}
	
	public void sendRequest(String str) {
		 fm.FilterRequest(str);	
	}
}
