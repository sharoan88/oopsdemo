package oopsdemo3;

public class TestAbstaction {
	public static void main(String[] args) {
		
		Bike obj = new Honda(); //up-casting
		
		obj.run();
		obj.changeGear();
	}

}
