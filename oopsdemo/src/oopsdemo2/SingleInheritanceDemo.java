package oopsdemo2;

public class SingleInheritanceDemo {
	public static void main(String[] args) {
		
		Developer d1 = new Developer(101,"james Gosling","JDBC");
		Developer d2 = new Developer(102,"Rod Jhonson","Spring Framework");
		
		d1.display();//child class object invokes parent class method
		d1.display1();
		d2.display();
		d2.display1();
		
	}

}
