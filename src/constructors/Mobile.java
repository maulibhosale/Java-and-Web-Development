package constructors;

public class Mobile {

	public Mobile() {
		System.out.println("Mobile constructor called");
	}
	
	public void display() {
		System.out.println("Display method called");
	}
	
	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.display();
	}
	
}
