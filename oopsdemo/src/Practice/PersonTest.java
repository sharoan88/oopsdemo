package Practice;

import java.util.Scanner;

public class PersonTest {
	public static void main(String[] args) {
		
		Person objPerson1 = new Person();  //invoke implicit constructor
		
		objPerson1.input();
		objPerson1.print();
		
		System.out.println("---------------------------------");
		Person objPerson2 = new Person("Mike",45);//invokes constructor with 2 arguments
		
		objPerson2.print();
		
		System.out.println("---------------------------------");
		Person objPerson3 = new Person("Ravi","Chennai",43);
		
		objPerson3.print();
		
		System.out.println("----------------------------");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter ur Name, Constituency & Age");
		String name=s.next();
		String c = s.next();
		int a=s.nextInt();
		
		Person objPerson4 = new Person(name,c,a);
		
		objPerson4.print();
	}

}
