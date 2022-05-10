package Assignment1;

import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		double len,breadth;
		int area;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter length of rectangle :");
		len=s.nextDouble();
		System.out.println("Enter breadth of rectangle :");
		breadth=s.nextDouble();
		s.close();
		int l=(int)len;
		int b=(int)breadth;
		area=l*b;
		System.out.println("Area of the rectangle : "+area);
	}

}
