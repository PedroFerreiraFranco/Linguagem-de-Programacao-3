package view;

import model.Circle;
import model.Ret;
import model.Square;
import model.Triangulo;

public class Main {
	 public static void main(String[] args) {
		Square q1 = new Square(10);
		Ret r1 = new Ret(10,5);
		Circle c1 = new Circle(15);
		Triangulo t1 = new Triangulo(5, 4);
	
		Canvas c = new Canvas();
		c.addShape(c1);
		c.addShape(r1);
		c.addShape(q1);
		c.addShape(t1);
	
		c.printShape();
	}
}
