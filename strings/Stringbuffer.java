//stringbuffer is a class which represents a mutable sequence of character,it means changing in content.
//can append,insert,delete,reverse,etc
//it is threadsafe but not synchronised
package string;

public class Stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("hai");
		sb.append("java");
		System.out.println(sb);
		sb.insert(1, "jebastin");
		System.out.println(sb);
		sb.delete(1, 9);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		StringBuffer sbr=new StringBuffer("SLA");
		String str=sbr.toString();
		StringBuilder sb1=new StringBuilder(str);
		System.out.println(sb1);
		

	}

}
