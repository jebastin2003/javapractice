package controlstatements;

import java.util.Scanner;

public class Calculator {
	void add(int a,int b) {
		System.out.println(a+b);
	}
	void sub(int a,int b) {
		System.out.println(a-b);
	}
	void multiply(int a,int b) {
		System.out.println(a*b);
	}
	void div(int a,int b) {
		System.out.println(a/b);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1:");
		int num1=sc.nextInt();
		System.out.println("Enter number 2:");
		int num2=sc.nextInt();
		System.out.println("enter 1 for add,2 for sub,3 for multiply,4 for div");
		int num3=sc.nextInt();
		sc.close();
		Calculator calculate=new Calculator();
		if(num3==1) {
			calculate.add(num1,num2);
		}else if(num3==2) {
			calculate.sub(num1,num2);
		}else if(num3==3){
			calculate.multiply(num1,num2);
		}else if(num3==4) {
			calculate.div(num1,num2);
		}else {
			System.out.println("invalid enter 1 to 4 for +,-,*,/");
		}

	}

}
