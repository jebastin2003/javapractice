package controlstatements;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		int total=num+2;
		if(total==20) {
			System.out.println("yes it is");
		}else {
			System.out.println("no it is not");
		}

	}

}
