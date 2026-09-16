package returnstmrmethod;

public class Welcome {
	
	public String display(String name, String city) {
		return "Welcome " + name + " from " + city + "!";
	}

	public static void main(String[] args) {
		
		Welcome ad = new Welcome();
		System.out.println(ad.display("Mauli", "Pune"));
	}
}
