package encapsulation;

public class BankAccounts {
	
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void deposit(int money_deposited) {
		balance = balance + money_deposited;
	}
	
	public void withdraw(int money_withdraw) {
		if (money_withdraw > balance ) {
			System.out.println("Insufficient Balance for withdrawal");
		}
		else {
			balance = balance - money_withdraw;
		}
		
	}
	
	public static void main(String[] args) {
		BankAccounts b = new BankAccounts();
		b.setBalance(50000);
		
		b.deposit(10000);
		
		System.out.println(b.getBalance());
		
		b.withdraw(20000);
		
		System.out.println(b.getBalance());
		
	}

}
