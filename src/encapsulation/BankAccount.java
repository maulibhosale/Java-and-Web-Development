package encapsulation;

public class BankAccount {
	
	int accountnumber, balance;

	public int getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		b.setAccountnumber(101);
		b.setBalance(50000);
		
		System.out.println("Bank details:-");
		System.out.println("Bank account number: " +b.getAccountnumber());
		System.out.println("Bank Balance: " +b.getBalance());
	}

}
