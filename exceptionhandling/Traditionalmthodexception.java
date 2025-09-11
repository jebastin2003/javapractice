package exceptionhandling;

import java.util.Scanner;

public class Traditionalmthodexception {

	public static void main(String[] args) {
		Scanner sc=new Scanner("hello");
		System.out.println(""+sc.nextLine());
		System.out.println("exception output"+" "+sc.ioException());
		sc.close();

	}

}
