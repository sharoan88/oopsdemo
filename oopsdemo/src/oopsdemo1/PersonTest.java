package oopsdemo1;

import java.util.Scanner;

public class PersonTest {
	public static void main(String[] args) {
		
		Person objperson1 = new Person();  //invoke implicit constructor
		
		objperson1.input();
		objperson1.print();
		
		System.out.println("-------------------------------------");
        Person objPerson2=new Person("Mike",45); // invokes constructor with 2 args
       
        objPerson2.print();
        
        System.out.println("-------------------------------------");
        Person objPerson3=new Person("Ravi","Delhi",60); // invokes constructor with 3 args
       
        objPerson3.print();
        
        System.out.println("-------------------------------------");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter ur Name, Constituency & Age :");
        String name=s.next();
        String c=s.next();
        int a=s.nextInt();
        s.close();
       
        Person objPerson4=new Person(name,c,a);
       
        objPerson4.print();
		
	}

}
