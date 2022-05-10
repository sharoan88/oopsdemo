package Assignment1;

import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		int a,b,c,sum,max,min,pro;
		float avg;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 3 integers : ");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		s.close();
		
		max = (a>b && a>c)?a:(b>c && b>a)?b:c;
		min = (a<b && a<c)?a:(b<a && b<c)?b:c;
		
		sum=a+b+c;
		pro=a*b*c;
		avg=(float)sum/3;
		
		System.out.println("Addition of 3 integers : "+sum);
		System.out.println("Average of 3 integers : "+String.format("%.2f", avg));
	
		System.out.println("Product of 3 integers : "+pro);
		System.out.println("largest of 3 integers : "+max);
		System.out.println("Smallest of 3 integers : "+min);
		
		
	}

}
