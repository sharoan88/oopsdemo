package basics;

import java.util.Scanner;

public class SumAvg {
	public static void main(String[] args) {
		int a,b,c,sum;
		float avg;
		
		Scanner s = new Scanner(System.in);
		
		String name;
		System.out.println("Enter your name : ");
		name=s.next();
		int age;
		System.out.println("Enter your age : ");
		age=s.nextInt();
		System.out.println("Enter 3 numbers : ");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		s.close();
		
		sum=a+b+c;
		avg=(float)sum/3;
		
		System.out.println("Hello "+name+". your age is :"+age);
		System.out.println("The Addition of 3 numbers "+a+","+b+","+c+" is :"+sum);
        System.out.println("The average of three numbers is :" +String.format("%.2f",avg));		
	}

}