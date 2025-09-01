package controlstatements;

public class Oopex1 {

	public static void main(String[] args) {
		student obj=new student();
		obj.name("jebastin");
		obj.age(21);

	}

}
class student{
	public void name(String name) {
		System.out.println("my name is "+name);
	}
	public void age(int age) {
		System.out.println("my age is "+age);
	}
}
