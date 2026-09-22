package Questions;

public class ClientAccount extends FinancialAccount {

	String clientTier = "Gold" ;
	
	public void viewBalance() {
		System.out.println("Client " +accountHolder+ " has a current balance of " +balance );
	}
	
	public void updateTier(String newTier) {
		clientTier = newTier ;
		System.out.println("Clients account is " +clientTier+ " account");
	}
	
	public static void main(String[] args) {
		ClientAccount c = new ClientAccount();
		c.printHolder();
		c.viewBalance();
		c.updateTier("Platinum");
	}
	
}
