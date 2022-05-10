package oopsdemo1;

public class TraineeTest {
	public static void main(String[] args) {
		
		Trainee t1 = new Trainee(); // invoke implicit constructor
		t1.display();
		
		Trainee t2 = new Trainee(222,"Rod Jhonson","Python",4000);// invoke parameterized constructor
		t2.display();
		
		Trainee t3 = new Trainee(254,"Jenny","Hibernate",15000);// invoke parameterized constructor
		t3.display();
	}

}
