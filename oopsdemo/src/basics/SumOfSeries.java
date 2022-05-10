package basics;

import java.util.Scanner;

public class SumOfSeries {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		
		int i=1,sum=0,n;
		System.out.println("Enter the value of N:");
		n=s.nextInt();
		s.close();
		
		while(i<=n)
		{
			sum=sum+i;
			i=i+1;
		}
		System.out.println("The Sum Of Series is :"+sum);
		
	}
}
