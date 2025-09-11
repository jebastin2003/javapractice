package arrays;

class student{
public int id;
public String name;
student(int id,String name){
	this.id=id;
	this.name=name;
}
public void display() {
	System.out.println("student id is"+""+id+""+"name is"+""+name);
}
}

public class Arrayobjects {

	public static void main(String[] args) {
		student[]arr=new student[3];
		arr[0]=new student(100,"malar");
		arr[1]=new student(101,"jebastin");
		arr[2]=new student(102,"surya");
		System.out.println("student data arr0");
		arr[0].display();
		System.out.println("student data arr1");
		arr[1].display();
		System.out.println("student data arr1");
		arr[2].display();

	}

}
