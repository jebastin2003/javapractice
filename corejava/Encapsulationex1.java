package controlstatements;

public class Encapsulationex1 {

	public static void main(String[] args) {
//		encapsulation means wrapping data(variables or attributes),methods(behaviour)together in a single unit and restricting direct access to sum of
//		the direct components.
		person obj=new person();
		obj.setname("jebastin");
		obj.setage(21);
		System.out.println("name is "+obj.getname());
		System.out.println("age is "+obj.getage());
	}

}
class person{
	private String name;
	private int age;
	public void setname(String newname) {
		name=newname;
	}
	public String getname() {
		return name;
	}
	public void setage(int newage) {
			age=newage;
	}
	public int getage() {
		return age;
	}
}