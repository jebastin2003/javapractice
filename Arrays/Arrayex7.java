package arrays;

import java.util.Scanner;

public class Arrayex7 {
	static void sumevenodd(int []arr) {
		int odd=0;
		int even=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even+=arr[i];
				
			}else if(arr[i]%2!=0) {
				odd+=arr[i];
				
			}
		}
		System.out.println("sum of odd numbers is "+odd);
		System.out.println("sum of even numbers is "+even);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array :");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter the "+i+" element:");
			arr[i]=sc.nextInt();
		}
		
		sc.close();
		sumevenodd(arr);

	}

}
