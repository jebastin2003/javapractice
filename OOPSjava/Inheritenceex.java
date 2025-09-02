package controlstatements;
class bar {
	protected String brand="hyndai";
	public void horn() {
		System.out.println("car makes horn sound");
	}
}

public class Inheritenceex extends bar {
public String model="exter";
	public static void main(String[] args) {
		Inheritenceex obj=new Inheritenceex();
		obj.horn();
		System.out.println(obj.model+" "+obj.brand);
		

	}

}
