package arrays;

import java.util.Scanner;

public class Arrayex2 {
	static double avgcalculation(int a[],int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=a[i];
		}
		System.out.println("the sum of elements in array is "+sum);
		return (double)sum/n;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter "+i+" element:");
			arr[i]=sc.nextInt();
		}
		sc.close();
		System.out.println("the avg of the elements in array is "+avgcalculation(arr,n));
		

	}

}
