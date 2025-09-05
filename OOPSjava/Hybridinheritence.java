package oopsconcept;

class animal{
	void eat() {
		System.out.println("animals eats");
	}
}
interface canbark{
	void bark();
}
interface canmeow{
	void meow();
}

class pets extends animal implements canbark,canmeow{
	public void bark() {
		System.out.println("woh woh barking");
		
	}
	public void meow() {
		System.out.println("meow meow");
	}
	void play() {
		System.out.println("animals play");
	}
}

public class Hybridinheritence {

	public static void main(String[] args) {
		pets obj=new pets();
		obj.bark();
		obj.meow();
		obj.eat();
		obj.play();
		canbark obj1=new pets();
		obj1.bark();
	}

}
