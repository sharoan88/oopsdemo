package basics;

import java.util.Scanner;

public class TernaryDemo1 {
	public static void main(String[] args) {
		int number;
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		number=s.nextInt();
		s.close();
		
		if(number >=1 && number <=50)
            System.out.println("Kid");
        else if(number >=51 && number <=100)
            System.out.println("Medium");
        else if(number >=101 && number <=200)
              System.out.println("Large");
        else
        System.out.println("Invalid");
	}

}
