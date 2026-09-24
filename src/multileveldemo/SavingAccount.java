package multileveldemo;

public class SavingAccount extends Account {
	
	public void give(int min_bal, int saving_bal) {
		System.out.println("Minimum balance is: " +min_bal);
		System.out.println("Saving Balance is: " +saving_bal);
	}

}
