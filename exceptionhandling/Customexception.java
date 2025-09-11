package exceptionhandling;

public class Customexception extends Exception {
	private static  int accno[]= {1001,1002,1003};
	private static String name[]= {"ram","prasun","sam","buddha"};
	private static double balanc[]= {100000.00,12333.00,999,26777.00};
	public Customexception(){}
    public Customexception(String me){
    	super(me);
    		
	}
	public static void main(String[] args) {
		try {
			System.out.println("accno"+"\t"+"name"+"\t"+"balance");
			for(int i=0;i<5;i++) {
				System.out.println(accno[i]+"\t"+name[i]+"\t"+balanc[i]);
				if(balanc[i]<1000) {
					Customexception me=new Customexception("balance is less than 1000");
					throw me;	
				}		
			}
		}
		catch(Customexception me) {
			me.printStackTrace();
		}
	}
}
