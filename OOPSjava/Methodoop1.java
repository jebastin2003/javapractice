package controlstatements;

class car{
	String color;
	int year;
	void startengine() {
		System.out.println("engine started");
	}
}

public class Methodoop1 {

	public static void main(String[] args) {
		car mycar=new car();
		mycar.color="yellow";
		mycar.year=2025;
		System.out.println("my car color"+" "+mycar.color);
		System.out.println("my car year is"+" "+mycar.year);
		mycar.startengine();

	}

}
