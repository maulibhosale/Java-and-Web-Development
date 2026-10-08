package exceptiondemo;

public class Demo4 {
	static String s;
	public static void main(String[] args) {
		
		System.out.println("Hello");
		try {
			System.out.println(s.length());
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("welcome");
		try {
			System.out.println(10/0);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("Hi");
	}
}
