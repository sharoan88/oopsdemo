package Practice;

public class ThisDemo {
	
	int age;
	
	//instance method
	//this keyword is used in instance method to access object
	void inti(int a)
	{
		this.age=a; //this keyword refers to the current objct that invokes the method 
	}

	public static void main(String[] args) {
		
		ThisDemo td1 = new ThisDemo();
		td1.inti(20);
		System.out.println("The value of age is :  "+td1.age);
	}
}
