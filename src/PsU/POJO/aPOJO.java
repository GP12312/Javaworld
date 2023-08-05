package PsU.POJO;

// All Beans are special type of POJOs. Each bean is a POJO but vice versa is not true
// POJO has no restrictions on any fileds access modifiers . Unlike beans they may or may not implement Serializable interface 
// POJO fields can be accessed by their names - which has to be done by getter and setter methods in bean
// A  POJO may or may not have a no-arg constructor 
// Give complete access to implementation - Bean give restricted access to fields





 public class aPOJO {
	
		public String name;
		public int id ;
		private double salary;
		
		public aPOJO( String s , int i, double d ) {		
			this.name=s;
			this.id=i;
			this.salary=d;	
		}
		
	    public String getName()
	    {
	        return name;
	    }
	  
	    // getter method for id
	    public int getId()
	    {
	        return id;
	    }
	  
	    // getter method for salary
	    public Double getSalary()
	    {
	        return salary;
	    }
		 
	  
}
	
	

