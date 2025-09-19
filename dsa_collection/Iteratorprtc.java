//hasNext returns true if there is another element in the list,it checks if there is more to iterate.
//the "next" element in iteration returns the next element.it moves the pointer and returns the value.



package collectionframework;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;

public class Iteratorprtc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer>b=new ArrayList<>();
		b.add(800);
		b.add(700);
		b.add(900);
		b.add(100);
		ArrayList <Integer>a=new ArrayList<>();
		a.add(100);
		a.add(200);
		a.add(300);
		a.add(100);
		Iterator<Integer>it=a.iterator();
		while(it.hasNext()) {
			Integer x=it.next();
			System.out.println(x);
			
		}
		Collections.copy(a, b);
		System.out.println(a);
		Collections.swap(a, 0, 1);
		System.out.println(a);
		Collections.shuffle(a);
		System.out.println(a);
		Collections.reverse(a);
		System.out.println(a);

	}

}
