package model;

public class Triangulo implements Shape{
	private double width;
	private double height;
	
	public Triangulo(double width, double height) {
		this.height = height;
		this.width = width;
	}
	
	
	@Override
	public String name() {
		return "Triangulo";
	}

	@Override
	public double area() {
		return (this.width*this.height)/2;
	}

}
