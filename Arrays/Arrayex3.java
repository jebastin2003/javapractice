package arrays;

import java.util.Scanner;

public class Arrayex3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array :");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter the "+i+" element:");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("enter the index of the element you want to access (0 to "+(n-1)+")");
		int index=sc.nextInt();
		
		if(index >=0 && index<n) {
			System.out.println("element at index "+index+" is "+arr[index]);
		}else {
			System.out.println("invalid index! please enter value between 0 and "+(n-1));
		}
		sc.close();
		

	}

}
