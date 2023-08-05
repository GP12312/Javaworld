package PsU.Composite;

import java.util.List;
import java.util.ArrayList;

public class CompanyDirectory implements iEmployee {
	
	
	private List<iEmployee> empList = new ArrayList<iEmployee>();
	public CompanyDirectory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showEmployeeDetails() {
		for (iEmployee e:empList)
		{
			e.showEmployeeDetails();
		}
	}
	
	public void addEmployee(iEmployee e2) {
		empList.add(e2);		
	}
	
	public void removeEmployee(iEmployee e2) {
		empList.remove(e2);		
	}		

}
