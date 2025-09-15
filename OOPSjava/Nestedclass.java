//to access thge inner class,create an object of the outer class,and then create an bject of the inner class:
//example: get your own java server

package oopsconcept;

class Outerclass{
	int x=90;
	class Innerclass{
		int y=5;
	}
}

public class Nestedclass {

	public static void main(String[] args) {
		Outerclass myouter=new Outerclass();
		Outerclass.Innerclass myinner=myouter.new Innerclass();
		System.out.println(myinner.y + myouter.x);

	}

}
