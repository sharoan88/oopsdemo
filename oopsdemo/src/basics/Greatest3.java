package basics;

import java.util.Scanner;

public class Greatest3 {
	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 3 numbers :");
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		scan.close();
		
		if(a>b && a>c)
		{
			System.out.println(a + " is greatest");
		}
		else if(b>c)
		{
			System.out.println(b + " is greatest");
		}
		else if(a==b && b==c)
		{
			System.out.println("All numbers are equal");
		}
		else
		{
			System.out.println(c + " is greatest");
		}
	}

}
