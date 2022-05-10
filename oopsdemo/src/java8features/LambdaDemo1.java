package java8features;

@FunctionalInterface
interface MyFI
{
	public String sayHello();      //A functional interface should have a single line
	//public String sayHello1();
}

public class LambdaDemo1 {
	
	public static void main(String[] args) {
		
		MyFI msg = () -> { return "Hello World";};//Lambda expression
		
		System.out.println(msg.sayHello());
	}

}
