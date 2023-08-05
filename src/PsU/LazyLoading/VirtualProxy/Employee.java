package PsU.LazyLoading.VirtualProxy;

public class Employee {
	
	private String employeeName;
	private String employeeDesignation;
	private double employeeSalary;
	

	public Employee(String n , String desig, double sal ) {
		this.employeeName = n;
		this.employeeDesignation = desig;
		this.employeeSalary = sal;		
	}
	
    public String getEmployeeName()
    {
        return employeeName;
    }
    public double getEmployeeSalary()
    {
        return employeeSalary;
    }
    public String getEmployeeDesignation()
    {
        return employeeDesignation;
    }
    
    public String toString()
    {
        return "Employee Name: " + employeeName + ", EmployeeDesignation : " + employeeDesignation + ",Employee Salary : " + employeeSalary;
    }

}
