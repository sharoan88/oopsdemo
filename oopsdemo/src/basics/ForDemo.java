package basics;

import java.util.Scanner;

public class ForDemo {
	public static void main(String[] args) {
		int i,j,n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of n :");
		n=s.nextInt();
		s.close();
		
		for(i=1;i<=n;i++)
		System.out.println(+i);
		
		System.out.println("Displaying 55 to 20");
		
		for(j=n;j>=20;j--)
			System.out.println(+j);
		
	}

}
