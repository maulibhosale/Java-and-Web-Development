package constructors;

public class PiggieBank {
	
	int initial_amount = 50;
	int total_amount;
	
	public void AddAmount() {
		int amount = 50;
		System.out.println(total_amount);
	}
	
	public PiggieBank() {
		total_amount = initial_amount;
		System.out.println(total_amount);
	}
	
    public PiggieBank(int amount) {
		total_amount = initial_amount + amount;
		System.out.println(total_amount);
	}
    
	public static void main(String[] args) {
		PiggieBank p = new PiggieBank(10);
	}

}
