package inheritdemo;
public class BankC extends Bank {
	public void getBalance() {
		System.out.println("$200 deposited in Bank C");
	}	
	
	public static void main(String[] args) {
		Bank b = new Bank();
		BankA ba = new BankA();
		BankB bb = new BankB();
		BankC bc = new BankC();
		
		b.getBalance();
		ba.getBalance();
		bb.getBalance();
		bc.getBalance();
	}
}
