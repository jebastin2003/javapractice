package controlstatements;

public class Swaping {

	public static void main(String[] args) {
		int x=10;
		int y=20;
		int temp=x;//using third variable swap
		x=y;
		y=temp;
		System.out.println(x);
		System.out.println(y);
		x=x+y;
		y=x-y;
		x=x-y;//using just two variables
		System.out.println(x);
		System.out.println(y);
	}

}
