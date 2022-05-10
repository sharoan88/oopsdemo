package basics;

import java.util.Scanner;

public class DoWhileDemo1 {
	public static void main(String[] args) {
		int sum=0,number=0;
		Scanner s = new Scanner(System.in);

		do {
			sum+=number;
			System.out.println("Enter the number : ");
			number=s.nextInt();
			System.out.println(number);

		}while(number>=0);
		System.out.println("Sum = " + sum);
		s.close();
	}

}





