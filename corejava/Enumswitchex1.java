package controlstatements;
enum day{mon,tues,wed,thurs,fri,sat,sun};
public class Enumswitchex1 {

	public static void main(String[] args) {
		day today=day.wed;
		String monthprint;
		switch(today) {
		case mon:monthprint="its monday";break;
		case tues:monthprint="its tuesday";break;
		case wed:monthprint="its wednesday";break;
		case thurs:monthprint="its thursday";break;
		default:monthprint=("its holiday");
		}
      System.out.println(monthprint);
	}

}
