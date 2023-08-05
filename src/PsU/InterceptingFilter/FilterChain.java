package PsU.InterceptingFilter;

import java.util.List;
import java.util.ArrayList;
public class FilterChain {
	
	private List<filter> fc = new ArrayList<filter>();
	private Target target;

	public void addFilter(filter ft) {		
		fc.add(ft);			
	}
	
	public void execute(String s) {
		for (filter  fr : fc) {
			fr.execute(s);
		}
		target.execute(s);	
	}
	
	public void setTarget(Target t) {
		this.target =t ;
	}

}