package oopsdemo1;
//OOP's Features - reusability
//reuse Employee class

public class AccentureEmployee {
	public static void main(String[] args) {
		
		Employee ac1 = new Employee();
		
		ac1.inputEmployeeDetails();
		ac1.calculateNetSalary();
		ac1.displayEmployeeDetails();
	}

}
