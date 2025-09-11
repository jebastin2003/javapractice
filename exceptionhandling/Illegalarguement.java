package exceptionhandling;

public class Illegalarguement {
	public static void print(int a) {
		if(a>=18) {
			System.out.println("eligible to vote");
		}else {
			throw new IllegalArgumentException("not eligible to vote");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(13);

	}

}
