package PsU.JavaBean;

public class JavaBeanMain {

	public static void main(String[] args) {
		
		System.out.println("Inside the bean main ");
		
		aBean ab = new aBean();
		aBean cd = new aBean();
		
		ab.setId(12);
		System.out.println("Fetching id  " + ab.getId());
		ab.setId(32);// this line overrides the id set for the same object
		System.out.println("Fetching id  " + ab.getId());
		
		cd.setId(52);
		System.out.println("Fetching id  " + cd.getId());
		cd.setId(82);// this line overrides the id set for the same object
		System.out.println("Fetching id  " + cd.getId());
			
		// thus ab and cd are the two objects ( beans ) thus  created 
		
		System.out.println(ab.hashCode());
		System.out.println(cd.hashCode());
	}

}
