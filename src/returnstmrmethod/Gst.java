package returnstmrmethod;

public class Gst {
	
	public String amount(double price, int rate) {
		return "GST Amount: " + (price*rate)/100 ;
	}

	public static void main(String[] args) {
		Gst g = new Gst();
		System.out.println(g.amount(500, 5));
	}
}
