package arrays;

import java.util.Scanner;

public class Arrayex5 {
	static void findtimes(int[] arr,int find) {
		int count=0;
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==find) {
				count+=1;
			}
		}
		System.out.println("this present "+count+" times");
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
		System.out.println("enter the num you need to find how many times there:");
		int find=sc.nextInt();
		sc.close();
		findtimes(arr,find);
	}

}
