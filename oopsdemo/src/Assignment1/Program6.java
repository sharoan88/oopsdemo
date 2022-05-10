package Assignment1;

import java.util.Scanner;

public class Program6 {
	public static void main(String[] args) {
		float m1,m2,m3,avg,per,sum;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter marks of 3 subjects :");
		m1= s.nextFloat();
	    m2= s.nextFloat();
	    m3= s.nextFloat();
	    s.close();
	    
	    sum=m1+m2+m3;
	    avg=(float)sum/3;
	    per= (sum/300)*100;
	    
	    System.out.println("Total marks : "+sum);
	    System.out.println("Average of 3 subject marks :"+String.format("%.2f", avg));
	    System.out.println("Percentage :"+String.format("%.2f", per));
	    
	}

}
