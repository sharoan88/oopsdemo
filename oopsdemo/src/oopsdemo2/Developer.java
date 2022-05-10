package oopsdemo2;

//sub class/derived class/child class - inheritance is relationship
public class Developer extends Employee 
{
	String technology;
	public Developer(int empId, String name,String tech) {
		super(empId, name); //class Employee base class constructor
		this.technology=tech;
	}
	
	void display1()
    {
        System.out.println("Technology Used: "+technology);
    }
}
