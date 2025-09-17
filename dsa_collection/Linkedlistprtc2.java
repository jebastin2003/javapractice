package collectionframework;

import java.util.LinkedList;

class pair{
	int id;
	String name;
	
	pair(int id,String name){
		this.id=id;
		this.name=name;
		
	}
}


public class Linkedlistprtc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<pair>list=new LinkedList<>();
		list.add(new pair(1,"jebastin"));
		list.add(new pair(2,"rashmika"));
		for(pair p:list) {
			System.out.println("id "+p.id+" name is "+p.name);
		}
		

	}

}
