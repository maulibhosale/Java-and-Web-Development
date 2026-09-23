package Questions;

// Banking System 

public class BankAccount {

	String AccHolderName;
	int AccNo, Balance;
	
	public void display(String AccHolderName, int AccNo, int Balance) {
		this.AccNo = AccNo ;
		this.AccHolderName = AccHolderName ;
		this.Balance = Balance ;
		System.out.println("Account Details:- ");
		System.out.println("Account Holder Name: " +AccHolderName+ " , Account No: " +AccNo+ " , Balance: " +Balance);	
	}

}
