package controlstatements;

public class Constructorex {

	public static void main(String[] args) {
		hello obj=new hello("jebastin");
		obj.surname("jebas");

	}

}
class hello{
	String name;
	 hello(String name) {
		 this.name=name;
		 System.out.println("my name is "+this.name);
	}
	 public void surname(String sname) {
		 System.out.println("you can call me "+name +" "+"or "+sname);
	 }
}
