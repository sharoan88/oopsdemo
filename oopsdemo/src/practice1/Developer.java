package practice1;

//child class
public class Developer extends Employee{
	
	String technology;

	public Developer(int empId, String name,String tech) {
		super(empId, name); //calls Employees base class constructor
		this.technology=tech;
	}
	
	void display1()
	{
		System.out.println("Technology used :"+technology);
	}

}
