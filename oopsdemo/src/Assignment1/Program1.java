package Assignment1;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		float f,c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Fahrenheit value : ");
		f=scan.nextFloat();
		scan.close();
		c=((f-32)*5)/9;
		System.out.println("Temperature in celsius : "+String.format("%.2f",c));
	}

}
