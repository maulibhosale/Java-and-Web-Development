package exceptiondemo;

public class Demo {
	
	public static void main(String[] args) {
		//System.out.println("hello");
		//System.out.println("world");
		//System.out.println(10/0);            // runtime exception
		//System.out.println("welcome");
		
		System.out.println("Hello");
		System.out.println("World");
		try {
			System.out.println(10/0);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Welcome");
		System.out.println("Hello");
		System.out.println("World");
	}

}
