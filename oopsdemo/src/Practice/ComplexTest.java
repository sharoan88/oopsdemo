package Practice;

public class ComplexTest {
	public static void main(String[] args) {
		
		Complex c1 = new Complex(10.3,67.4); //invokes constructor
		Complex c2 = new Complex(0.7,3.6);
		
		c1.add(c2); //calls method add by passing object c2
		
		System.out.println("The addition of 2 complex numbrs is :");
		c1.display();
	}

}
