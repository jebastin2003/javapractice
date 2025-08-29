package controlstatements;

public class Switchcase {

	public static void main(String[] args) {
		int month=4;
		String monthstring;
		switch (month) {
		case 1:monthstring="janauary";break;
		case 2:monthstring="febuary";break;
		case 3:monthstring="march";break;
		case 4:monthstring="april";break;
		case 5:monthstring="may";break;
		case 6:monthstring="june";break;
		case 7:monthstring="july";break;
		default:monthstring="invalid month";
		}
		System.out.println(monthstring);
		
		String fruit="apple";
		String features;
		switch (fruit) {
		case "apple":features="apple is good";break;
		case "mango":features="mango is good";break;
		case "guava":features="guava is good";break;
		default:features="not valid";
		}
		System.out.println(features);

	}

}
