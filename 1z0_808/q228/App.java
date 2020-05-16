package com.wealth.certificate.dumps_1z0_808.question228;

public class Circle {
	double radius;
	public double area;
	public Circle(double r) { radius = r; }
	protected double getRadius() { return radius; }
	public void setRadius(double r) { radius = r; }
	public double getArea() {return Math.PI * radius * radius; }
}
class App {
	public static void main(String[] args) {
		Circle c1 = new Circle(17.4);
		c1.area = Math.PI * c1.getRadius() * c1.getRadius();
	}
}
