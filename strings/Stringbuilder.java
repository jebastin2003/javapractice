//it is a class that represents the mutable of character,this means you can change the content,it is not synchronised and threadsafe
//it also has append,delete,insert,reverse,replace,etc
package string;

public class Stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder("hai");
		sb.append("java");
		System.out.println(sb);
		sb.insert(1, "jebastin");
		System.out.println(sb);
		sb.delete(1, 9);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		StringBuilder sbr=new StringBuilder("SLA");
		String str=sbr.toString();
		StringBuilder sb1=new StringBuilder(str);
		System.out.println(sb1);
		sb1.replace(1, 3, "a");
		System.out.println(sb1);
		
		

	}

}
