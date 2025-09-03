package oopsconcept;
interface one1{
	public void printone();
}
interface two1{
	public void printtwo();
}
interface three1 extends one1,two1{
	public void printthree();
}

class child implements three1{
	public void printone() {
		System.out.println("print one from class one");
	}
	public void printtwo() {
		System.out.println("print two from class two");
	}
	public void printthree() {
		System.out.println("print three from class three");
	}
}

public class Inheritanceex2 {

	public static void main(String[] args) {
		three1 c=new child(); //or even child c=new child();
		c.printone();
		c.printtwo();
		c.printthree();

	}

}
