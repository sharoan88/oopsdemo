package oopsdemo1;
//Program to demonstrate constructors in java
class Language
{
	private String s;
	private int version;
	
	Language() //implicit constructor
	{
		System.out.println("I am implicit constructor");
		s="python";
		System.out.println("Hello from :"+s);
	}
	
	Language(String lang) // Parameterized constructor
	{
		System.out.println("I am parameterized constructor");
		this.s=lang;
		System.out.println("Hello from :"+s);
	}
	Language(String lang,int ver) //parameterized constructor with 2 arguments
	{
		System.out.println("I am parameterized constructor with 2 arguments ");
		this.s=lang;
		this.version = ver;
		System.out.println("Hello from : "+s+" V."+ver);
	}
}

public class LanguageDemo {
	
	public static void main(String[] args) {
		Language l1 = new Language();       //automatically invokes Implicit constructor
		Language l2 = new Language("Ruby"); 
		Language l3 = new Language("Scala");//automatically invokes the parameterized constructor
		Language l4 = new Language();
		Language l5 = new Language("Java",2);
		
	}

}
