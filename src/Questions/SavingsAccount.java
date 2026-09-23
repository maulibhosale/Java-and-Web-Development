package Questions;

public class SavingsAccount extends BankAccount {

	double interestRate;
	
	public void gett(double interestRate) {
		this.interestRate = interestRate ;
		
		double Interest = Balance * interestRate / 100 ;
		
		System.out.println("Interest rate: " +interestRate);
		System.out.println("Interest: " + Interest);	
	}
	
	public static void main(String[] args) {
		SavingsAccount s = new SavingsAccount();
		s.display("Mauli", 101, 50000);
		s.gett(3.5);
	}
	
}
