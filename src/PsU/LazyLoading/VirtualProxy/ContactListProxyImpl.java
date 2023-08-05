package PsU.LazyLoading.VirtualProxy;

import java.util.List;

public class ContactListProxyImpl implements ContactList {
	
	private ContactList cntl; 

	public ContactListProxyImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Employee> getEmployeeList() {
		if (cntl == null) {
			System.out.println("Fetching COntact List ....! ");
			cntl = new ContactListImpl();
		}
		return cntl.getEmployeeList();
	}

}
