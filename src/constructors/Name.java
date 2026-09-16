package constructors;

public class Name {
	
	public Name(String name) {
		if ("".equals(name)) {
			System.out.println("Unknown");
		}
		else {
			System.out.println(name);
		}
	}
	
	public static void main(String[] args) {
		Name n = new Name("");
	}

}
