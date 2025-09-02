package controlstatements;

public class Constructorex2 {
	int id;
	String name;
	public Constructorex2(int i,String n) {
		id=i;
		name=n;
	}
	public void display() {
		System.out.println("my name is "+name+" id is "+id);
	}

	public static void main(String[] args) {
		Constructorex2 obj=new Constructorex2(1,"jebastin");
		Constructorex2 obj1=new Constructorex2(2,"manoj");
		Constructorex2 obj2=new Constructorex2(3,"surya");
		
		obj.display();
		obj1.display();
		obj2.display();
		

	}

}
