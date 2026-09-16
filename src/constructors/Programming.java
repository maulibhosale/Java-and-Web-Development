package constructors;

public class Programming {
	
	public Programming() {
		System.out.println("I love Programming languages.");
	}
	
	public Programming(String p) {
		System.out.println("I love " + p );
	}

	public static void main(String[] args) {
		Programming n = new Programming("Java");
	}
	
}
