//linkedlist -it is a type of list used to store and display the data through the doubly linked list

//dynamic in size(can grow or shrink dynamically or runtime),efficient insertion or deletion
//insertion or deletion is faster because there is no need to shift the element like an array
//elements are store in an nodes which contains data and reference link to the next node 
//slow access(no random access),memory efficient for insertion
//each node requires extra memories for storing pointers
package collectionframework;

import java.util.LinkedList;

public class Linkedlistprtc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>cars=new LinkedList<String>();
		cars.add("volvo");
		cars.add("audi");
		cars.add("bmw");
		cars.add("volkswagan");
		cars.add(null);
		cars.add("audi");
		System.out.println(cars);
		System.out.println(cars.removeFirst());
		System.out.println(cars.removeLast());
		System.out.println(cars.getFirst());
		System.out.println(cars.getLast());
		System.out.println(cars.contains("volvo"));

		
	}

}
