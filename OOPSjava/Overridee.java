package oopsconcept;
class kiaa{
	void safety() {
		System.out.println("drive carefullt");
	}
}
class car extends kiaa{
	@Override
	void safety() {
		System.out.println("car is safe");
	}
}
public class Overridee {
	public static void main(String[] args) {
		kiaa obj=new kiaa();
		obj.safety();
		kiaa obj1=new car();
		obj1.safety();
	}
}
