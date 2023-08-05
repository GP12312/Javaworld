package PsU.POJO;

public class POJO_Main {

	public static void main(String[] args) {
		
		aPOJO ap  =  new aPOJO( "Vikas", 12312, 23000.67);
		
		System.out.println(" Emplaoyeed details as below: ");
		System.out.println(" ---------------------------- ");
		System.out.println(" id	: " + ap.getId());
		System.out.println(" Name	: " + ap.getName());
		System.out.println(" Salary	: " + ap.getSalary());		
	}

}
