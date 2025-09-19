package collectionframework;
import java.util.Vector;

//thread safe but slower than arraylist

public class Vectorex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer>a=new Vector<>();
		a.add(1);
		a.add(null);
		a.add(1);
		a.add(6);
		a.add(null);
		System.out.println(a);
		System.out.println(a.firstElement());
		System.out.println(a.lastElement());
		a.add(1,90);
		a.remove(0);
		System.out.println(a);

	}

}
