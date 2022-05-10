package Assignment4;

public class EmployeeTest {
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		e1.inputEmployeeDetails();
		e2.inputEmployeeDetails();
		e3.inputEmployeeDetails();
		
		System.out.println("Name year of joining address");
		e1.displayEmployeeDetails();
		e2.displayEmployeeDetails();
		e3.displayEmployeeDetails();
	}

}
