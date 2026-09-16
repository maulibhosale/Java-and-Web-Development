package thiskeyword;

// this keyword should be the 1st statement of the constructor
public class Demo3 {
	
	public Demo3() {
		System.out.println("I am constructor");
	}
	
	public Demo3(int a) {
		this();
		System.out.println(a);
	}
	
	public Demo3(String a) {
		this(53);
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		Demo3 d = new Demo3("Java");
	}
	
}
