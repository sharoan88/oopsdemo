package Practice;

//main method of employee class
public class EmployeeTest {
	public static void main(String[] args) {
		
		//create an object for the employee class
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		//invoke methods
		e1.inputEmployeeDetails();
		e1.calculateNetSalary();
	    e1.displayEmployeeDetails();
	    
	    e2.inputEmployeeDetails();
	    e2.calculateNetSalary();
	    e2.displayEmployeeDetails();
	    
	    e3.inputEmployeeDetails();
	    e3.calculateNetSalary();
	    e3.displayEmployeeDetails();
		
	}

}
