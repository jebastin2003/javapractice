package oopsconcept;

interface A{
	 void show(); 
}
interface B{
	 void show();
}
class hello implements A,b{
	public void show(){
		System.out.println("show from a and b");
	}
}
public class Interface{
	public static void main(String[] args) {
		hello obj =new hello();
		obj.show();
		
	}

}

