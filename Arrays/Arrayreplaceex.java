package arrays;

import java.util.Scanner;

public class Arrayreplaceex {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number elements:");
		int n=scan.nextInt();
		int[]arr=new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("enter "+i+" element");
			arr[i]=scan.nextInt();
			
		}
		System.out.println("enter the value you want to replace");
		int keyreplace=scan.nextInt();
		System.out.println("enter the number you want to replace");
		int replacenum=scan.nextInt();
		scan.close();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==keyreplace) {
				arr[i]=replacenum;
			}
		}
		System.out.println("updated array");
		for(int i:arr) {
			System.out.println(i);
		}

	}

}
