package staticmethod;

public class Demo3 {

	static {
		System.out.println("I am static block");
	}
	
	static {
		System.out.println("I am static block 2");
	}
	
	static {
		System.out.println("I am static block 3 it will print in the order you have written");
	}
	
	public static void main(String[] args) {
		System.out.println("hello");
	}
	
}
