package controlstatements;

public class whileoddsum {

	public static void main(String[] args) {
		int i=1;
		int sum=0;
		while(i<=10) {
			sum+=i;
			i+=2;
		}
		System.out.println("sum of odd is"+" "+sum);

	}

}
