package oopsconcept;

class Product{
	public int multiply(int a,int b) {
		int prod=a*b;
		return prod;
	}
	public int multiply(int a,int b,int c) {
		int prod=a*b*c;
		return prod;
	}
	public double multiply(double a,double b) {
		double prod=a*b;
		return prod;
	}
}
public class Polymorphismex {

	public static void main(String[] args) {
		Product obj1=new Product();
		System.out.println(obj1.multiply(7, 1));
		System.out.println(obj1.multiply(3,2,1));
		System.out.println(obj1.multiply(1234.869, 234.987));

	}

}
