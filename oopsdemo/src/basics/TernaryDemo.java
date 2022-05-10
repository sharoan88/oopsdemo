package basics;

public class TernaryDemo {
	public static void main(String[] args) {
		int a=20,b=30,max;
		
		System.out.println("First Number : "+a);
		System.out.println("Second Number : "+b);
		
		max=(a>b) ? a:b; // Ternary operator
		
		String mes = (a>b) ? "A is Greatest" : "B is Greatest";
		
		System.out.println("The Maximum of 2 numbers is : "+max+ " . "+mes);
		
	}

}
