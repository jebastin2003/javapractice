package controlstatements;

public class Constructoroverloading {
	int id;
	String name;
	String department;
	Constructoroverloading(int i,String nm) {
		name=nm;
		id=i;
	}
	Constructoroverloading(int i,String nm,String dep){
		name=nm;
		id=i;
		department=dep;
	}
	void display() {
		System.out.println("name ,id "+name+" "+id);
	}
	void display1() {
		System.out.println("name ,id,department "+name+" "+id+" "+department);
	}
	

	public static void main(String[] args) {
		Constructoroverloading obj1=new Constructoroverloading(1,"jebastin");
		Constructoroverloading obj2=new Constructoroverloading(1,"jebastin","ECE");
		obj1.display();
		obj2.display1();
		

	}

}
