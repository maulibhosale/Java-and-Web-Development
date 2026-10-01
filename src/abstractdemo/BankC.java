package abstractdemo;

import java.util.Scanner;

public class BankC extends Bank {

	@Override
	public void getBalance() {
		// TODO Auto-generated method stub
		System.out.println("Balance in Bank C: $200");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Bank (A/B/C): ");
		String bank = sc.nextLine();
		
		System.out.println();
		
		if(bank.equals("A")) {
			BankA a = new BankA();
			a.getBalance();
		}
		else if(bank.equals("B")) {
			BankB b = new BankB();
			b.getBalance();
		}
		else if(bank.equals("C")) {
			BankC c = new BankC();
			c.getBalance();
		}
		else {
			System.out.println("Invalid Bank");
		}
		sc.close();
	}
	
}
