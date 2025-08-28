package controlstatements;

public class Methodexx {
	public int addition(int x,int y) {
		int add=x+y;
		return add;
	}

	public static void main(String[] args) {
		int num1=10;
		int num2=20;
		Methodexx obj=new Methodexx();
		int answer=obj.addition(num1,num2);
		System.out.println("Result is"+" "+answer);
	}

}
