package collectionframework;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class Setprtc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String>a=new HashSet<>();
		a.add("india");
		a.add("australlia");
		a.add("canada");
		a.add("india");
		a.add(null);
		System.out.println(a);
		a.remove(null);
		System.out.println(a);
		Iterator<String>i=a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			
		}

	}

}
