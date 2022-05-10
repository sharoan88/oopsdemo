package oopsdemo3;

//Rectangle class implementing shape interface
public class Rectangle1 implements Shape {
	
	private double width;
	private double height;
	
	//generate constructor using fields
	public Rectangle1(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Rectangle");
	}

	@Override
	public double getArea() {
		
		return this.height*this.width;
	}

}
