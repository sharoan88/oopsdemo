package oopsdemo3;

public class Circle implements Shape {
	
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		
		System.out.println("Drawing Circle");
	}

	@Override
	public double getArea() {
		
		return Math.PI*this.radius*this.radius;
	}
    
	//generate getter() for radius
	public double getRadius() {
		return radius;
	}
	
	

}
