package PsU.Composite;


// This is the Leaf of the composite
public class Manager implements iEmployee {
	
	private String name;
	private long empId;
	private String position;

	public Manager(long eid, String n1, String p1) {
		this.empId = eid;
		this.name = n1;
		this.position = p1;
	}

	@Override
	public void showEmployeeDetails() {
		System.out.println(empId + " " + name);

	}

}
