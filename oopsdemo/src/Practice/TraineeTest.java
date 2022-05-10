package Practice;

public class TraineeTest {
	
	public static void main(String[] args) {
		
		Trainee t1 = new Trainee();
		t1.display();
		
		Trainee t2 = new Trainee(222,"Rod Jhonson","Spring",7000);
		t2.display();
		
		Trainee t3 = new Trainee(333,"Gavin King","Hibernate",6000);
		t3.display();
	}

}
