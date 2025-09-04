package oopsconcept;
class x{
	public void method1() {
		System.out.println("method a");
	}
}
class y extends x{
	public void method2() {
		System.out.println("method b");
	}
}
class z extends y{
	public void method3() {
		System.out.println("method c");
	}
}
class w extends z{
	public void method4() {
		System.out.println("method d");
	}
}

public class Multilevelinheritence {

	public static void main(String[] args) {
		w obj=new w();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
		
		

	}

}
