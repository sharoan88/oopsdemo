package oopsdemo1;

public class EmployeeTest {
	public static void main(String[] args) {
		//main class to test Employee class methods
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		//invoke the methods of the class
		
		e1.inputEmployeeDetails();
		e1.calculateNetSalary();
		e1.displayEmployeeDetails();
		
		
		e2.inputEmployeeDetails();
		e2.calculateNetSalary();
		e3.displayEmployeeDetails();
		
		e3.inputEmployeeDetails();
		e3.calculateNetSalary();
		e3.displayEmployeeDetails();
		
		
	}

}
