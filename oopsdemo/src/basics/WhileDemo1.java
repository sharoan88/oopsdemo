package basics;
/*
 * Program to display numbers from 1 to 10.
 *
 * Understand the concept of Loop.
 * Loop - A set of statements executing repeatedly , until a particular
 * condition is TRUE.
 */

public class WhileDemo1 {
	public static void main(String[] args) {
		
		int i=1; //initialization
		
		while(i<=10)// set a condition
		{
			System.out.println(i+" Raj");
			i=i+1;    //increment
		}
		System.out.println("EXITING LOOP..............");
		System.out.println("*****Reverse a loop****");
		int j=10;
		while(j>=1)
		{
			System.out.println(j+" varma");
			j-=1;
		}
	}

}
