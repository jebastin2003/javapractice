package arrays;

import java.util.Scanner;

public class Arrayaddition {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter size of the array:");
		int size=scan.nextInt();
		int[]arr1=new int[size];
		int[]arr2=new int[size];
		int[]arr3=new int[size];
	
		
		for(int i=0;i<size;i++) {
			System.out.println((i+1)+". element of first array: ");
			arr1[i]=scan.nextInt();
		}
		for(int i=0;i<size;i++) {
			System.out.println((i+1)+". element of second array: ");
			arr2[i]=scan.nextInt();
		}
		for(int i=0;i<size;i++) {
			System.out.println((i+1)+". element of third array: ");
			arr3[i]=scan.nextInt();
		}
		scan.close();
		System.out.println("output");
		for(int i=0;i<size;i++) {
			System.out.print((arr1[i]+arr2[i]+arr3[i])+" ");
			
		}



	}

}
