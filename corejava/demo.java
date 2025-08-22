package beginproject;

public class demo {
int age=10;
static int staticvar=40;
public void mymethod() {
	int locvar=4;
	System.out.println(locvar);
}
public static void main(String args[]) {
	demo obj=new demo();
	obj.mymethod();
	System.out.println(staticvar);
	System.out.println(obj.age);
	int year=2003;
	System.out.println(year);
}
}
	