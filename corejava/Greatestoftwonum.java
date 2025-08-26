package controlstatements;

import java.util.Scanner;

public class Greatestoftwonum {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("biggest among two num");
		System.out.println("Enter number 1:");
		int a=sc.nextInt();
		System.out.println("enter number 2:");
		int b=sc.nextInt();
		if(a<b) {
			System.out.println(b+" "+" is big");
		}else {
			System.out.println(a+" "+"is big");
		}

	}

}
