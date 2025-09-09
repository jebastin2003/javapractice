package arrays;

import java.util.Scanner;

public class Arraycomparison {
	static boolean comparison(int[]arr,int[]arr1) {
		boolean result[]=new boolean[arr1.length];
		for(int i=0;i<arr.length;i++) {
			boolean found=false;
			
			
			
			for(int j=0;j<arr1.length;j++) {
				
				if(arr[i]==arr1[j] && !result[j]) {
					result[j]=true;
					found=true;
					break;
					
				}
				}
			if(!found) {
				return false;
				
				
			}
		}
		return true;
	
		
		
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number elements:");
		int n=scan.nextInt();
		int[]arr=new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("enter "+i+" element");
			arr[i]=scan.nextInt();
			
		}
		
		System.out.println("enter the number elements:");
		int n1=scan.nextInt();
		int[]arr1=new int[n];
		
		for(int i=0;i<n1;i++) {
			System.out.println("enter "+i+" element");
			arr1[i]=scan.nextInt();
			
		}
		scan.close();
		
		System.out.println(comparison(arr,arr1));

	}

}
