package basics;

import java.util.Scanner;

public class Greatest2 {
	public static void main(String[] args) {
		int a,b;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers : ");
		a=scan.nextInt();
		b=scan.nextInt();
		
		scan.close();
		
		if(a>b)
		{
			System.out.println(a+"is Greatest");
		}
		else
		{
			System.out.println(b+" is Greatest");
		}
		
	}

}
