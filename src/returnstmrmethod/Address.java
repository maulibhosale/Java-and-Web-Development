package returnstmrmethod;

public class Address {
	
	public String display(int hno, String city, String state) {
		return "Full address: House No " + hno + ", City " + city + ", State " + state + ".";
	}

	public static void main(String[] args) {
		
		Address ad = new Address();
		System.out.println(ad.display(30, "Pune", "Maharashtra"));
	}
}
