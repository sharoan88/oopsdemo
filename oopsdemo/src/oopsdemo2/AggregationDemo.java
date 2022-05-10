package oopsdemo2;

public class AggregationDemo {
	public static void main(String[] args) {
		
		Address ad1 = new Address("Bengaluru","Karnatak", "India", 566016);
		Address ad2 = new Address("Prague","Austin", "Czkth", 777777);
		
		Student sd1 = new Student(101,"Ravi", ad2);
		Student sd2 = new Student(102, "Rakesh", ad2);
		
		sd1.display();
		sd2.display();
		
	}

}
