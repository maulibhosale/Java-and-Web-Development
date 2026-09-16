package parameterizedconstructor;

public class BankAccount {

	public BankAccount(int acc_num, String acc_holder_name, int balance) {
		System.out.println(acc_holder_name + " ( Acc no: " + acc_num + " ) has balance of " + balance);
	}
	
	public static void main(String[] args) {
		BankAccount b = new BankAccount(101, "Mauli", 70000);
	}
	
}
