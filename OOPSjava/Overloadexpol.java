package oopsconcept;

public class Overloadexpol {
	private static void display(int a) {
		System.out.println("prints int a "+a);
		
	}
	private static void display(String a) {
		System.out.println("prints int a "+a);
		
	}

	public static void main(String[] args) {
		display(12);
		display("jebastin");
		

	}

}
