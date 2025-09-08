package arrays;

import java.util.Scanner;

public class Arrayex1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number elements:");
		int n=scan.nextInt();
		int[]arr=new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("enter "+i+" element");
			arr[i]=scan.nextInt();
			
		}
		
		for(int i=0;i<n;i++) {
			System.out.println("array element "+i+" is "+arr[i]);
		}
		scan.close();
		
		

	}

}
