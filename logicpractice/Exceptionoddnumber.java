package logicpractice;

public class Exceptionoddnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=13;
		trynumber(n);
		int g=8;
		checkevennumber(g);

	}
	public static void trynumber(int n) {
		try {
			checkevennumber(n);
			System.out.println(n +" is even");
		}catch(IllegalArgumentException e) {
			System.out.println("error:" + e.getMessage());
		}
	}
	public static void checkevennumber(int num) {
		if(num%2 != 0) {
			throw new IllegalArgumentException(num+" is odd");
		}
	}

}
