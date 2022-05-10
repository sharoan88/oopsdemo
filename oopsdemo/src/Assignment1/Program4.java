package Assignment1;

import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		int num1,num2,x;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the First Integer : ");
		num1=s.nextInt();
		System.out.println("Enter the Second Integer : ");
		num2=s.nextInt();
		s.close();
		x=num1%num2;
		if(x == 0)
			System.out.println(num1+" is multiple of "+num2+":" +x);
		else
			System.out.println(num1+" is not the multiple of "+num2+":"+x);
	}

}
