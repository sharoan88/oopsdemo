package Assignment4;

import java.util.Scanner;

public class Area {
	
	private float length,breadth,area;
	
	Scanner s = new Scanner(System.in);
	
	public void inputDetails()
	{
		System.out.println("Enter length of the rectangle :");
		length=s.nextFloat();
		System.out.println("Enter breadth of the rectangle :");
		breadth=s.nextFloat();
	}
	
	public float returnArea()
	{
		area = length*breadth;
		return area;
	}
	
	public void displayDetails()
	{
		System.out.println("Length of rectangle :"+length);
		System.out.println("Breadth of rectangle :"+breadth);
		System.out.println("Area of rectange :"+area);
	}

}
