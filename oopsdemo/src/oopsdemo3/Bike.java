package oopsdemo3;

public abstract class Bike {
    
	//Generate implicit constructor
	public Bike() 
	{
		System.out.println("Bike is created");    
	}
	
	abstract void run(); //
	
	void changeGear()  //instance method
	{
		System.out.println("Gear Changed");
	}

}
