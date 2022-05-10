package Assignment4;

import java.util.Scanner;

public class Employee {
	
	//properties
	private String name,address;
	private int yearOfJoining;
	private double salary;
	
	Scanner s = new Scanner(System.in);
	
	public void inputEmployeeDetails()
	{
		System.out.println("Enter the Name,Year of joining,address :");
		name=s.next();
		yearOfJoining=s.nextInt();
		s.nextLine();
		address=s.nextLine();
		System.out.println("Enter the salary");
		salary=s.nextDouble();
	}
	
	public void displayEmployeeDetails()
	{
		System.out.println(name+" "+yearOfJoining+" "+address);
	}
	

}
