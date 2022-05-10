package Assignment1;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		int a,b,sum,diff,pro;
		float quotient;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the input values : ");
		a=s.nextInt();
		b=s.nextInt();
		s.close();
		sum=a+b;
		diff=a-b;
		pro=a*b;
		quotient=a/b;
		
		System.out.println("Sum of the values : "+sum);
		System.out.println("Difference of the values : "+diff);
		System.out.println("product of the values : "+pro);
		System.out.println("Quotient : "+quotient);
		
	}

}
