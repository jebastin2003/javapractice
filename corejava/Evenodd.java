package controlstatements;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number between 1 to 10");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println(num+" "+"is even");
		}else {
			System.out.println(num+" "+"is odd");
		}

	}

}
