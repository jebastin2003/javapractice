package controlstatements;

import java.util.Scanner;

public class Addoddeven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number 1:");
		int num1=sc.nextInt();
		System.out.println("enter number 2:");
		int num2=sc.nextInt();
		int even=0;
		int odd=0;
		for(int i=num1;i<=num2;i++) {
			if(i%2==0) {
				even+=i;
			}else {
				odd+=i;
			}
		}
		System.out.println("even number is"+" "+even);
		System.out.println("odd number is"+" "+odd);
		

	}

}
