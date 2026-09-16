package constructors;

public class BankAccount {
	int accountNumber;
	String name;
	double balance;
	
	static int totalAccounts = 0;
	
	public BankAccount(int accountNumber, String name, double balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		
		totalAccounts++;
	}
	
	public static void main(String[] args) {
		    BankAccount b1 = new BankAccount(101, "Mauli", 5000);
	        BankAccount b2 = new BankAccount(102, "Rohan", 6000);
	        BankAccount b3 = new BankAccount(103, "Priya", 7000);
	        BankAccount b4 = new BankAccount(104, "Amit", 8000);

	        System.out.println("Total number of accounts = " + BankAccount.totalAccounts);
		
	}
	

}