package oopsdemo2;

public class Employee { // parent class/super class/base class
	
	int empId;
    String name;
	public Employee(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}
    
	void display()
    {
        System.out.println("********** Employee Details ***************");
        System.out.println("Employee Id :"+empId);
        System.out.println("Employee Name: "+name);
    }
    
	
}