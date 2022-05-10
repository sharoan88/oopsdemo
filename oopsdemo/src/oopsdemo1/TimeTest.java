package oopsdemo1;

public class TimeTest {
	public static void main(String[] args) {
		Time t1 = new Time(12,45,55); //invoke constructor and initialize the values
		Time t2 = new Time(10,30,30);
		
		t1.add(t2);  // invoke the add method passing an object
		
		
		System.out.println("Addition of 2 times is :");
		t1.display();
	}

}
