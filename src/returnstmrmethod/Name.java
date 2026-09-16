package returnstmrmethod;

public class Name {
	
	public String display(String first, String last) {
		return "Full name is: " + first + " " + last;
	}

	public static void main(String[] args) {
		Name d = new Name();
		System.out.println(d.display("Mauli", "Bhosale"));
	}
}
