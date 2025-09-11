package arrays;
import java.util.Scanner;
public class Arraysorting {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int size =sc.nextInt();
		int[] array = new int[size];
		// Step 2: Input elements
		System.out.println("Enter " + size + " numbers:");
		for (int i = 0; i < size; i++){
		array[i] = sc.nextInt();}
		sc.close();
		// Step 3: Bubble sort (no built-in methods)
		for (int i = 0; i < size-1; i++) {
		for (int j = 0; j < size-i-1; j++) {
		//Note//For Ascending = >//For Descending = <<
		if (array[j] < array[j + 1]) {
		// Swap
		int temp = array[j];
		array [j]=array[j+1];
		array [j + 1] = temp;
		}
		}
		}
		// Step 4: Print sorted array
		System.out.println("Sorted array (descending):");
		for (int i = 0; i < size; i++) {
		System.out.print(array[i] + " ");
		}
	}
}
