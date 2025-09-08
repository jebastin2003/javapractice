package arrays;

import java.util.Scanner;

public class Arrayex4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array :");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter the "+i+" element:");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("enter the element you want to find:");
		int key=sc.nextInt();
		sc.close();
		boolean found=false;
		for(int i=0;i<n;i++) {
			if(arr[i]==key) {
				System.out.println("the element is found at index "+i);
				found=true;
			}
		}
		if(!found) {
			System.out.println("not found");
		}

	}

}
