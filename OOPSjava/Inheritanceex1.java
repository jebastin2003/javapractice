package oopsconcept;
interface shape{
	double getarea();
}
class Rectangle implements shape{
	private double length;
	private double width;
	public Rectangle(double length,double width) {
		this.length=length;
		this.width=width;
	}
	public double getarea() {
		return length*width;
	}
}

class Triangle implements shape{
	private double base;
	private double height;
	public Triangle(double base,double height) {
		this.base=base;
		this.height=height;
	}
	public double getarea() {
		return 0.5*base*height;
	}
}

class Circle implements shape{
	private double radius;
	public Circle(double radius) {
		this.radius=radius;
	}
	public double getarea() {
		return (22/7)*(radius*radius);
	}
}

public class Inheritanceex1 {

	public static void main(String[] args) {
		Rectangle rectangle=new Rectangle(5.0,8.0);
		shape triangle =new Triangle(8.0,9.0);
		shape circle =new Circle(7.9);
		System.out.println("Area of rectangle "+rectangle.getarea());
		System.out.println("Area of triangle "+ triangle.getarea());
		System.out.println("Area of circle "+ circle.getarea());
		

	}

}
