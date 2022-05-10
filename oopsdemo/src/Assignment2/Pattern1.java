package Assignment2;

import java.util.Scanner;
       
public class Pattern1 {
	public static void main(String[] args) {
		int n,i,j;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter no of rows :");
		n=s.nextInt();
		
		for(i=1;i<=n;i++)
		{
			for(j=n;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	
}
