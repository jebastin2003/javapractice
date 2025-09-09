package arrays;

import java.util.Scanner;

public class Arraymultidim {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number elements:");
		
		int[][]arr=new int[100][100];
		int row,col,i,j;
		System.out.println("enter number of row");
		row=scan.nextInt();
		System.out.println("enter the number of column");
		col=scan.nextInt();
		for( i=0;i<row;i++) {
			for( j=0;j<col;j++) {
				System.out.println("enter the element for"+ "["+i+"]"+"["+j+"]");
			arr[i][j]=scan.nextInt();
			}
		}
		
		for( i=0;i<row;i++) {
			for( j=0;j<col;j++) {
				System.out.print(arr[i][j]+" ");
	
			}
		}

	}

}
