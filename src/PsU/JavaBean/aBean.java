package PsU.JavaBean;

public class aBean implements java.io.Serializable {
	
	// A bean will always have private fields and public getter setter methods 
	// A bean will always implement the SERIALIZABLE Interface 
	// A bean will always have a no argument constructor
	// A bean will always be mutable 
	// A bean for each property may be a boiler plate 
	
	private int id;
	private String name;
	
	public aBean() {
		// This is the no argument constructors		
	}
	
	// ------ to get set the id property
	public void setId (int i ) {
		id=i;
	}
	
	public int getId() {		
		return id;		
	}
	
	
	// ------ to get set the name property
	public void setName (String s) {
		name=s;
	}
	
	public String getName() {		
		return name;		
	}


}
