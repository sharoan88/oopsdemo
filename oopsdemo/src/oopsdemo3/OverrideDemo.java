package oopsdemo3;
class SoftwareEngineer
{
	String name,tech;
	double salary;
	public SoftwareEngineer(String name, String tech, double salary) {
		this.name = name;
		this.tech = tech;
		this.salary = salary;
	}
	void display()
	{
		System.out.println(name+" "+tech+" "+salary);
	}
	
	void work()
	{
		System.out.println("Coding & Testing");
	}
	
	
}
class Developer extends SoftwareEngineer
{

	public Developer(String name, String tech, double salary) {
		super(name, tech, salary);
		
	}
	void work()
	{
		System.out.println("Coding using:"+tech);
	}
}
class Tester extends SoftwareEngineer
{

	public Tester(String name, String tech, double salary) {
		super(name, tech, salary);
		
	}
	void work()
	{
		System.out.println("Testing  using:"+tech);
	}
	
}

public class OverrideDemo {
	public static void main(String[] args) {
		Developer d1=new Developer("Gosling","Java",25000);
		Tester t1=new Tester("Mike","Jmeter", 20000);
		d1.display();
		d1.work();
		t1.display();
		t1.work();
	}

}