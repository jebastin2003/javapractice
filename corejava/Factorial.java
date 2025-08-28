package controlstatements;

public class Factorial {

	public static void main(String[] args) {
		int i=1,fact=1,num=4;
		while(i<=num) {
			fact=fact*i;
			i++;
		}
		System.out.println("factorial"+fact);

	}

}
