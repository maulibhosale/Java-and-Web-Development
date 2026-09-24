package overridingdemo;

public class BankMain extends Bank{
	
	public static void main(String[] args) {
		BankA a = new BankA();
		System.out.println(a.getBalance());
		a.getInterest(3.4);
		
		System.out.println();
		
		BankB b = new BankB();
		System.out.println(b.getBalance());
		b.getInterest(4.1);
		
		System.out.println();
		
		BankC c = new BankC();
		System.out.println(c.getBalance());
		c.getInterest(2.8);
	}

}
