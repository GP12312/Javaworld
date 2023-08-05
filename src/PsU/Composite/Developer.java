package PsU.Composite;

// This is the leaf of the composite 

public class Developer implements iEmployee {
	
	private String name;
	private long empId;
	private String position;

	public Developer(long eid, String n1, String p1) {
		this.empId = eid;
		this.name = n1;
		this.position = p1;
	}

	@Override
	public void showEmployeeDetails() {
		System.out.println(empId + " " + name);

	}

}
