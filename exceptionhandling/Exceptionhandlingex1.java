package exceptionhandling;

public class Exceptionhandlingex1 {

	public static void main(String[] args) {
		try {
			int[]mynum= {1,2,3,4,5,6};
			System.out.println(mynum[11]);
		}
		catch(Exception e){
			System.out.println("error is"+e);
				
			}
		}


}

