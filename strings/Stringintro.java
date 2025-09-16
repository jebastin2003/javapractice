//string are immutable,once we created string object we cannot change its content

package string;

public class Stringintro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sa="hello i am jebastin and i am a java developer";
		String sa1=new String("hello i am jebastin");
		int a=sa1.length();
		int b=sa.length();
		System.out.println(a);
		System.out.println(b);
		int c=1485;
		String dum=String.valueOf(c);
		System.out.println(dum);
		char []arr= {'a','b','c'};
		String dumchar=String.valueOf(arr);
		System.out.println(dumchar);
		String s5="apple";
		String s6="orange";
		String s7=s5+s6;
		System.out.println(s7);
		String all=s5.concat(s6);
		System.out.println(all);

	}

}
