
package collectionframework;

import java.util.Stack;

public class Stackex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>a=new Stack<>();
		a.push(null);
		a.push(10);
		a.push(10);
		a.push(30);
		System.out.println(a);
		System.out.println(a.peek());
		a.pop();
		System.out.println(a);

	}

}
