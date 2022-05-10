package Practice;

public class TimeTest {
	public static void main(String[] args) {
		
		Time t1= new Time(12,45,55);
		Time t2= new Time(10,30,65);
		
		t1.add(t2);
		
		System.out.println("Addition of 2 times is :");
		t1.display();
		
	}

}
