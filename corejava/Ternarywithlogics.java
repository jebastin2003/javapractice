package controlstatements;
import java.util.Scanner;
public class Ternarywithlogics {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int a=sc.nextInt();
		sc.close();
		String result=(a%2==0)?"even":"odd";
		System.out.println("the number is "+result);

	}

}
