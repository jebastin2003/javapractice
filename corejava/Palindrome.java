package controlstatements;

import java.util.Scanner;

public class Palindrome {
	boolean ispalindrome=true;
	public void stringpalindrome(String s1) {
		int left=0;
		int right=s1.length()-1;
		while(left<right) {
			if(s1.charAt(left)!=s1.charAt(right)) {
				ispalindrome=false;
				break;
			}
			left++;
			right--;
		}
		if(ispalindrome) {
			System.out.println("it is palindrome");
		}else {
			System.out.println("it is not a palindrome");
		}
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 for number palindrome 2 for text palindrome");
		int type=sc.nextInt();
		if(type==1) {
		System.out.println("enter the number:");
		int palnum=sc.nextInt();
		int a=palnum;
		int num=0;
		sc.close();
		while(a>0) {
			int digit=a%10;
			num=num*10+digit;
			a=a/10;
		}
		if(palnum==num) {
			System.out.println("yes it is palindrome");
		}else {
			System.out.println("no it is not a palindrome");
		}
		}else {
		Palindrome obj=new Palindrome();
		sc.nextLine();
		System.out.println("enter the text:");
		String text=sc.nextLine();
		obj.stringpalindrome(text);
		

	}
	}

}
