package overridingdemo;

public class Bank {

	public int getBalance() {
		return 0;
	}
	
	public void getInterest(double intr) {
		System.out.println("Interest is " +intr);
	}
	
}
