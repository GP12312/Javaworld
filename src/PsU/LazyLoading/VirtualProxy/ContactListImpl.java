package PsU.LazyLoading.VirtualProxy;

import java.util.List;
import java.util.ArrayList;

public class ContactListImpl implements ContactList {

	@Override
	public List<Employee> getEmployeeList() {
		
		return getEmpList();
	}
	
	private static List<Employee> getEmpList(){
		
		List<Employee> empList = new ArrayList<Employee>(5);
		
		empList.add(new Employee("Swapnil Ratnakar", "VP", 28900766.90));
		empList.add(new Employee("Rahul Kulkarni", "Director", 2676554.90));
		empList.add(new Employee("Nilesh Jain ", "SVP", 678900790));
		empList.add(new Employee("Manoj Rathi", "Developer",   900766.90));
		empList.add(new Employee("Suhas Joshi", "CP", 1445628.74));		
		
		return empList;
		
	}

}
