package basics;

import java.util.Scanner;

public class Area {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		float a,r;
		final float PI=3.14f; // constant declaration
		
		System.out.println("Enter Radius of a Circle :");
		r=s.nextFloat();  // float input
		s.close();
		
		a=PI*r*r;  // calculate area of circle
		
		System.out.print("The Area of Circle is : ");
		System.out.format("%.2f", a);
		
	}
}
