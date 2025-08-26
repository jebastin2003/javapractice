package controlstatements;

import java.util.Scanner;

public class Numdivby4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number between 1 to 25");
		int a=sc.nextInt();
		if(a%4==0) {
			System.out.println(a+" "+"is divisible by 4");
		}else {
			System.out.println(a+" "+"is not divisible by 4");
		}

	}

}
