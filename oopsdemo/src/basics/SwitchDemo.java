package basics;

import java.util.Scanner;

public class SwitchDemo {
	public static void main(String[] args) {
		
		int a,b,res;
		String op;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter 2 numbers :");
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("Enter an operator : ");
		op=s.next();
		
		s.close();
		
		switch(op) {
		case "+" : res=a+b;
		           System.out.println("The addition is :"+res);
		           break;
		case "-" : res=a-b;
                   System.out.println("The Substraction is :"+res);
                   break;
		case "*" : res=a*b;
                   System.out.println("The multiplication is :"+res);
                   break;
		case "/" : res=a/b;
                   System.out.println("The division is :"+res);
                   break;
		default  : System.out.println("Invalid operator");
                
		 
		}
		
	}

}
