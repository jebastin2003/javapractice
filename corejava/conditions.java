package controlstatements;

public class conditions {

	public static void main(String[] args) {
		int a=10,b=20,c=25;
		if(a>b && a>c) {
			System.out.println("a is greater");
			
		}else if(b>a && b>c) {
			System.out.println("b is greater");
		}else if(c>a && c>b) {
			System.out.println("c is greater");
		}else {
			System.out.println("two or more numbers are same");
		}

	}

}
