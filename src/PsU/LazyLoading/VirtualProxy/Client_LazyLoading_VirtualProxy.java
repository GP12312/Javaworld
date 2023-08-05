package PsU.LazyLoading.VirtualProxy;

import java.util.List;

public class Client_LazyLoading_VirtualProxy {

	public Client_LazyLoading_VirtualProxy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		 ContactList cl = new ContactListProxyImpl();
		 Company comp = new Company ("Eigen Tech" , "MagarpattaCity" , "9665016163", cl );
		 
		 
        System.out.println("Company Name: " + comp.getCompanyName());
        System.out.println("Company Address: " + comp.getCompanyAddress());
        System.out.println("Company Contact No.: " + comp.getCompanyContactNo());
        System.out.println("Requesting for contact list");

        cl = comp.getContactList();
        List<Employee> empL = cl.getEmployeeList();
        for (Employee e : empL) {
        	System.out.println(e);
        }
        
        
	}

}


//In this above code have a Company object is created with a proxy ContactList object. 
//At this time,
//the Company object holds a proxy reference, not the real ContactList object’s reference, 
//so there no employee list loaded into the memory

//You are creating an application in which there is a Company object and 
//this object contains a list of employees of the company in a ContactList object. 
//There could be thousands of employees in a company. 
//Loading the Company object from the database along with the list of all its employees 
//in the ContactList object could be very time consuming. 
//In some cases you don’t even require the list of the employees, 
//but you are forced to wait until the company and its list of employees loaded into the memory.
//One way to save time and memory is to avoid loading of the employee objects until required 
//and this is done using the Lazy Loading Design Pattern