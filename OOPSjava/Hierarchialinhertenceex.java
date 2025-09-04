package oopsconcept;
class a{
	public void methoda() {
		System.out.println("method a");
	}
}
class b extends a{
	public void methodb() {
		System.out.println("method b");
	}
}
class c extends a{
	public void methodc() {
		System.out.println("method c");
	}
}
class d extends a{
	public void methodd() {
		System.out.println("method d");
	}
}

public class Hierarchialinhertenceex {

	public static void main(String[] args) {
		c obj=new c();
		obj.methoda();
		obj.methodc();
		d obj1=new d();
		obj1.methodd();
		obj1.methoda();
		b obj2=new b();
		obj2.methoda();
		obj2.methodb();
		
	
		

	}

}
