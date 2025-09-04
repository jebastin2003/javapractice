package oopsconcept;

interface A{
	 void show(); 
}
interface B{
	 void show();
}
class Interface implements A,B{
	public void show() {
		System.out.println("show from a and b ");
	}
	public static void main(String[] args) {
		Interface obj =new Interface();
		obj.show();
		
	}

}
