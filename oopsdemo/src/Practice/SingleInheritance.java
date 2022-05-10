package Practice;

//main class
class Animal
{
	String name; // properties
	
	public void eat() //methods
	{
		System.out.println("I can eat");
	}
}

//Inherits Animal class 
class Dog extends Animal
{
	public void display()
	{
		System.out.println("My name is :"+name);
	}
}
public class SingleInheritance {
	
	public static void main(String[] args) {
		
		//create and access the object of the sub class
		Dog labrador = new Dog();
		
		//access field of super class
		labrador.name="Zimba";
		
		//call the method of derived class using derived class object
		labrador.display();
		
		//call the method of the super class using derived class object
		labrador.eat();
		
	}

}
