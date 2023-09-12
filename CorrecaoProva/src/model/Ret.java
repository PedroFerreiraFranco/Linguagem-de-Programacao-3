package model;

public class Ret implements Shape{

	private double width;
	private double heigh;

	
	public Ret(double width, double height) {
		this.heigh = height;
		this.width = width;
	}
	
	@Override
	public String name() {
		return "Retângulo";
	}

	@Override
	public double area() {
		return this.width * this.heigh;
	}

}
