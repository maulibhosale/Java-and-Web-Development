package inheritdemo;

// Banking System

public class BankAccount {
	
	int accNo;
	String name;
	int balance;
	
	public void display(String name, int accNo, int balance) {
		this.name = name;
		this.accNo = accNo;
		this.balance = balance;
		
		System.out.println("Account Holder Name: " +name);
		System.out.println("Account Number: " +accNo);
		System.out.println("Account Balance: " +balance);
	}

}
