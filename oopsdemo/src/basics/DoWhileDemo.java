package basics;

import java.util.Scanner;

public class DoWhileDemo {
	public static void main(String[] args) {
		int count=0,n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of N :");
		n=s.nextInt();
		s.close();
		do {
			count=count+1;
			System.out.println(count);
		}
		while(count<=n);
	}

}
