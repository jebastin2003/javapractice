package oopsconcept;

//when u expect classes to have some common method but each time class must implements its own version
//abstract class can have constructor and interface cannot have
//a class can extends only one abstract class
// a class can implements multiple classes
//can have both abstract and concrete method,interface can have abstract,default,static,private

abstract class shape1{
	public abstract void rect();
	public void cir() {
		System.out.println("cir");
	}
}

class abs extends shape1{
	public void rect() {
		System.out.println("rect");
	}
	
}
public class Abstractclassmetex1{
	
	public static void main(String[] args) {
		shape1 obj=new abs();
		abs obj1=new abs();
		obj.cir();
		obj.rect();
		obj1.cir();
		obj1.rect();

	}

}
