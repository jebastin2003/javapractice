package controlstatements;

public class Encapsulationex2 {

	public static void main(String[] args) {
		bank obj=new bank();
		obj.set(100);
		System.out.println("get your amount "+obj.wdraw(101));
		System.out.println("balance is "+obj.balance());
		

	}

}
class bank{
	private int deposit;
	
	
	public void set(int damount) {
		deposit=damount;
	}
	public int wdraw(int withdraw) {
		if(deposit>withdraw) {
			withdraw=deposit-withdraw;
			return withdraw;
		}else {
			System.out.println("deposited amount is less than"+withdraw);
			return 0;	
		}
	}
	public int balance() {
		int bal=deposit;
		return bal;
	}
}
