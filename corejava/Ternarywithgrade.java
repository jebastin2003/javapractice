package controlstatements;

public class Ternarywithgrade {

	public static void main(String[] args) {
		int score=85;
		String grade=(score >=90)?"A":
			         (score >=80)?"B":
			         (score >=70)?"c":"F";
		System.out.println("student grade is"+" "+grade);

	}

}
