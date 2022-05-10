package oopsdemo2;

public class Accountant extends Employee{ // base class invokes the parent class
	
	String task,tech;
	
	public Accountant(int empId, String name,String t1,String t2) {
		super(empId, name); //invokes base class constructor and pass arguments
		this.tech=t1;
		this.tech=t2;	
	}
	void print()
	{
		super.display(); //invokes Employee base class display method
		System.out.println("Accountant Task :"+task);
		System.out.println("Software used :"+tech);
	}

	

}
