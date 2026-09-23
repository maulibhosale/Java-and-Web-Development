package inheritdemo;

public class SavingsAccount extends BankAccount {

	double interestRate;
	
	public void gett(double interestRate) {
		this.interestRate = interestRate;
		
		System.out.println("Interest Rate: " +interestRate);
		}
	
}
