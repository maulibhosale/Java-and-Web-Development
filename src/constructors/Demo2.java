package constructors;

public class Demo2 {

	public Demo2(int a) {          //parameterized constructor
		System.out.println(a);
		System.out.println(a + 10);
	}
	
	public static void main(String[] args) {
		Demo2 d = new Demo2(4);
	}
	
}
