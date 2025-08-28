package controlstatements;

import java.util.Scanner;

public class Greatestofthree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number 1:");
		int a=sc.nextInt();
		System.out.println("enter number 2:");
		int b=sc.nextInt();
		System.out.println("enter number 3:");
		int c=sc.nextInt();
		sc.close();
		if((a>b && a<c)||(a>c && a<b)) {
			System.out.println(a +" "+"is second greatest");
		}else if((b>a && b<c)||(b>c && b<a)) {
			System.out.println(b +" "+"is second greatest");
		}else{
			System.out.println(c+" "+"is second greatest");
		}

	}

}
