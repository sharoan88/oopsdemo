package Practice;
//program to add 2 complex numbers
public class Complex {
	
	double real;
	double imaginary;
	
	public Complex(double real, double imaginary) {//Generating parameterized constructor
		this.real = real;
		this.imaginary = imaginary;
	}
	
	void add(Complex obj)//method which accept object as argument
	{
		this.real+=obj.real;
		this.imaginary+=obj.imaginary;
	}
	
	void display()
	{
		//System.out.println("The addition of 2 complex numbers is :");
		System.out.println("r"+this.real+"+i"+this.imaginary);
	}
	
	

}
