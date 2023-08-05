package PsU.Composite;


// This is the Client of the composite. 


public class Company {


	public static void main(String[] args) {

		CompanyDirectory cEnggDir = new CompanyDirectory();
		CompanyDirectory cMngrDir = new CompanyDirectory();
		CompanyDirectory cAccDir  = new CompanyDirectory();
		
		
		Developer d1 = new Developer(100, "Anil Kuttan", "HeavenBA");
		Developer d2 = new Developer(101, "Sameer Patil", "HeavenSQL");
		
		Manager m1 = new Manager(200, "Mahesh Ravelli", "HeavenOPS");
		Manager m2 = new Manager(201, "Mrs Ashwin", "HeavenPGM");
		
		
		cEnggDir.addEmployee(d1);
		cEnggDir.addEmployee(d2);
		
		cMngrDir.addEmployee(m1);
		cMngrDir.addEmployee(m2);
		
		System.out.println("e e e e e e e e e e e e e e e e e ");
		cEnggDir.showEmployeeDetails();
		System.out.println("m m m m m m m m m m m m m m m m m ");
		cMngrDir.showEmployeeDetails();
		System.out.println("==================================");
		cAccDir.addEmployee(cEnggDir);
		cAccDir.addEmployee(cMngrDir);
		cAccDir.showEmployeeDetails();
		

	}

}
