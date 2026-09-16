package staticmethod;

public class Demo2 {
	
	int a = 100;       // instance variables
	static int x = 45;  // static variables
	
	public void display() {
		int b = 5;
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
	}
	
	public static void gett() {
		// System.out.println(a);
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		Demo2 d = new Demo2();
		d.display();
		gett();
	}

}
