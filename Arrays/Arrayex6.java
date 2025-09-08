package arrays;

import java.util.Scanner;

public class Arrayex6 {
	static void findtimes(int[]arr) {
		int n=arr.length;
		boolean[]visited=new boolean[n];
		
		for(int i=0;i<n;i++) {
			if(visited[i]==true) {
				continue;
			}
			int count=1;
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					count++;
					visited[j]=true;
				}
			}
			if(count>1) {
				System.out.println(arr[i]+"->"+count+" times");
				
			}else {
				System.out.println(arr[i]+"->"+count+" time");
			}
			
		}
		
		
		
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
		findtimes(arr);

	}

}
