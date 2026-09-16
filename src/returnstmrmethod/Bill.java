package returnstmrmethod;

public class Bill {
	
	public String amount(int price, int quantity) {
		return "Total bill: " + price*quantity ;
	}

	public static void main(String[] args) {
		Bill b = new Bill();
		System.out.println(b.amount(500, 20));
		System.out.println(b.amount(1250, 33));
	}
}
