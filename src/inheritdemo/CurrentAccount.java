package inheritdemo;

public class CurrentAccount extends BankAccount {

	int amtCredited;
	
	public void give(int amtCredited) {
		this.amtCredited = amtCredited;
		
		System.out.println("Amount Credited: " +amtCredited);
		}

	public static void main(String[] args) {
		SavingsAccount s = new SavingsAccount();
		s.display("Mauli", 101, 50000);
		s.gett(3.5);
		
		CurrentAccount c = new CurrentAccount();
		c.give(10000);
	}
	
}
