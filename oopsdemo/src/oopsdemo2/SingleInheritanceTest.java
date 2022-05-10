package oopsdemo2;

//parent class/base class/super class
class Animal
{
	String name;//properties
	
	public void eat()//methods
	{
		System.out.println("I can eat ");
	}
}
//inherits Animal class
//child/sub/derived class
class Dog extends Animal
{
	public void display()
	{
		System.out.println("My name is :"+name);
	}
}
public class SingleInheritanceTest {
	public static void main(String[] args) {
		
		//create and initialize an object of sub class
		Dog labrador = new Dog();
		
		//access field of super class
        labrador.name = "Zimba";
        		
        //call method of derived class using derived class
	    labrador.display();
        
        //call method of super class using derived class
        labrador.eat();
		
		
	}

}
