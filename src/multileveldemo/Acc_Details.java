package multileveldemo;

public class Acc_Details extends SavingAccount {
	
	public void gett(int deposits, int withdrawals)  {
		System.out.println("Money deposited is " +deposits);
		System.out.println("Money withdrawal is " +withdrawals);
	}

	public static void main(String[] args) {
		Acc_Details a = new Acc_Details();
		a.display("Mauli", 101);
		a.give(5000, 50000);
		a.gett(35000, 1000);
		
	}
	
}
